package com.modernperfumes.main.service;

import com.modernperfumes.main.model.Perfume;
import org.springframework.stereotype.Service;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PdfBoxParser {

    public List<Perfume> parsePdf() throws IOException {
        List<Perfume> perfumes = new ArrayList<>();
//        try (PDDocument document = PDDocument.load(new File("/home/etnova/modernperfumes/src/main/resources/tester_products.pdf"))) {
        try (PDDocument document = PDDocument.load(new File("src/main/resources/tester_products.pdf"))) {
//        try (PDDocument document = PDDocument.load(new File("./tester_products.pdf"))) {
            document.getClass();
            if (!document.isEncrypted()) {

                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
                //System.out.println("Text:" + st);

                // split by whitespace
                String lines[] = pdfFileInText.split("\\r?\\n");
                int linesInObject = 3;
                int objectPropertyCounter = 0;
                Map<Integer, String> propertyMapper = new HashMap<Integer, String>();
                propertyMapper.put(0, "sku");
                propertyMapper.put(1, "description");
                propertyMapper.put(2, "price");
                Perfume perfume = new Perfume();
                for (String line : lines) {
//                    if(!StringUtils.isEmpty(line) && objectPropertyCounter != 3 && (line.trim().length() > 0)) {
//                        String property = propertyMapper.get(objectPropertyCounter);
//                        perfume.setProperty(property, line);
//                        objectPropertyCounter++;
//                    } else if(objectPropertyCounter == 3) {
//                        perfumes.add(perfume);
//                        perfume = new Perfume();
//                        objectPropertyCounter = 0;
//                    }
                }
            }
            return perfumes;
        } catch (Exception e) {
            throw e;
        }
    }
}
