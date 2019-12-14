package com.modernperfumes.main.service;

import com.modernperfumes.main.model.Perfume;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class SpreadsheetParser {
    public List<Perfume> parseExcel() throws IOException {
        String FILE_NAME = "src/main/resources/Nandansons.xls";
        try(InputStream stream = new FileInputStream(FILE_NAME)) {
//            CSVReader reader = new CSVReader(new InputStreamReader(stream, "UTF-8"));
//            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(new InputStreamReader(stream, "UTF-8"));
//            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(new InputStreamReader(stream, "UTF-16"));
//            for (CSVRecord record : records) {
//            String lastName = record.get("Last Name");
//            String firstName = record.get("First Name");
            }
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(FILE_NAME));
        HSSFSheet myExcelSheet = myExcelBook.getSheetAt(0);
        for (int i = 0; i < myExcelSheet.getLastRowNum(); i++) {
            HSSFRow row = myExcelSheet.getRow(i);
                System.out.print("hi");

            }
            Reader in = new FileReader(FILE_NAME);
            return null;
    }
}
