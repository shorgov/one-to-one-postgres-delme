package com.shorgov.dbtest.testpostgres;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestCaseController {

    @Autowired
    TheService theService;

    @GetMapping("/dotest")
    public String doTest(){
        theService.doTheActualInsert();
        return "Done";
    }
}
