package com.modernperfumes.main.service;

import com.modernperfumes.main.model.Perfume;
import org.springframework.stereotype.Service;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PdfBoxParser {

    public List<Perfume> parsePdf() throws IOException {
        List<Perfume> perfumes = new ArrayList<>();
        try (PDDocument document = PDDocument.load(new File("/home/etnova/modernperfumes/src/main/resources/tester_products.pdf"))) {
            document.getClass();
            if (!document.isEncrypted()) {

                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
                //System.out.println("Text:" + st);

                // split by whitespace
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    System.out.println(line);
                }
                return perfumes;
            }
            return null;
        } catch (Exception e) {
            throw e;
        }
    }
}
