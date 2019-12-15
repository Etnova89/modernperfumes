package com.modernperfumes.main.controller;

import com.modernperfumes.main.model.Perfume;
import com.modernperfumes.main.service.SpreadsheetParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/prices")
public class PriceController {

    @Autowired
    private SpreadsheetParser spreadsheetParser;

    @PostMapping("/parse")
    @CrossOrigin(origins = "http://localhost:3001")
    public ResponseEntity<List<Perfume>> parseExcel() {

        List<Perfume> perfumes = new ArrayList<>();
        try {
            perfumes = spreadsheetParser.parseExcel();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return ResponseEntity.ok().body(perfumes);
    }
}
