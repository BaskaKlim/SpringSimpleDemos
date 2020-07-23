package com.klimek.springLearn2Code.utils;

import java.math.*;
import org.junit.jupiter.api.*;
import org.junit.runner.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)

@SpringBootTest

class DanTest {

    @Test
    public void suma100PlusDanJe120(){
       BigDecimal pripocitane =  Dan.pripocitajDan(BigDecimal.valueOf(100L));
       assertEquals(BigDecimal.valueOf(120),pripocitane);
                                                         
    }
}