package com.modernperfumes.main.controller;

import com.modernperfumes.main.dao.PerfumeDao;
import com.modernperfumes.main.model.Perfume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/perfumes")
public class PerfumeController {

    @Autowired
    private PerfumeDao perfumeDao;

    @RequestMapping(value = "/list")
    public List<Perfume> getPerfumes() {
        List<Perfume> perfumeList = perfumeDao.selectPerfumes();
        return perfumeList;
    }
}
