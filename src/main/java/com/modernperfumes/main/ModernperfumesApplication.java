package com.modernperfumes.main;

import com.modernperfumes.main.service.PdfBoxParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ModernperfumesApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ModernperfumesApplication.class, args);
		PdfBoxParser parser = new PdfBoxParser();
		parser.parsePdf();
	}

}
