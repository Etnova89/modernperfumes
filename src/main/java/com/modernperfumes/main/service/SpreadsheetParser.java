package com.modernperfumes.main.service;

import com.modernperfumes.main.model.Perfume;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpreadsheetParser {
    public List<Perfume> parseExcel() throws IOException {
        List<Perfume> perfumes = new ArrayList<>();
        String FILE_NAME = "src/main/resources/Nandansons.xls";
        try(InputStream stream = new FileInputStream(FILE_NAME)) {
            HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(FILE_NAME));
            HSSFSheet myExcelSheet = myExcelBook.getSheetAt(0);
            Map<Integer, String> columnMapper = new HashMap<Integer, String>();
            for (int i = 0; i < myExcelSheet.getLastRowNum(); i++) {
                HSSFRow row = myExcelSheet.getRow(i);
                Perfume perfume = new Perfume();
                if(i == 0 ) {
                    setColumnHeaders(columnMapper, row);
                } else {
                    for(int x = 0; x < row.getLastCellNum(); x++) {
                        if(columnMapper.get(x) != null && !StringUtils.isEmpty(columnMapper.get(x))) {
                            if(HSSFCell.CELL_TYPE_NUMERIC == row.getCell(x).getCellType()) {
                                perfume.setProperty(columnMapper.get(x), row.getCell(x).getNumericCellValue());
                            } else {
                                if(!StringUtils.isEmpty(row.getCell(x).getStringCellValue())) {
                                    perfume.setProperty(columnMapper.get(x), row.getCell(x).getStringCellValue());
                                }
                            }
                        }
                    }
                    perfumes.add(perfume);
                }
            }
            return perfumes;
        }
    }

    private void setColumnHeaders(Map<Integer, String> columnMapper, HSSFRow row) {
        for (int r=0; r < row.getLastCellNum(); r++) {
            if(Perfume.isPriceAlias(row.getCell(r).getStringCellValue())) {
                columnMapper.put(r, "price");
            } else if(Perfume.isDescriptionAlias((row.getCell(r).getStringCellValue()))) {
                columnMapper.put(r, "description");
            } else if(Perfume.isSkuAlias((row.getCell(r).getStringCellValue()))) {
                columnMapper.put(r, "sku");
            } else if(Perfume.isQuantityAlias((row.getCell(r).getStringCellValue()))) {
                columnMapper.put(r, "quantity");
            }
        }
    }
}
