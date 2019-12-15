package com.modernperfumes.main.controller;

import com.modernperfumes.main.model.Perfume;
import com.modernperfumes.main.service.SpreadsheetParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/prices")
public class PriceController {

    @Autowired
    private SpreadsheetParser spreadsheetParser;

    @PostMapping("/parse")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Perfume>> parseExcel(@RequestBody MultipartFile file) throws IOException {

        List<Perfume> perfumes = new ArrayList<>();
            perfumes = spreadsheetParser.parseExcel(file);
        return ResponseEntity.ok().body(perfumes);
    }
}
