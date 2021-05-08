package com.child.sale.controller;

import com.child.sale.service.SaleService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class SaleControllerTest {

    @Autowired
    private SaleService saleService;

    @Test
    void selectOne() {
    }

    @Test
    void selectByPage() {
    }

    @Test
    void selectByLimit() {
    }

    @Test
    void test1() {
        System.out.println(saleService.test());
    }
}