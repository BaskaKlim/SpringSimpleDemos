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

    //TODO: positive scenario
    @Test
    public void suma100PlusDanJe120(){
        
       assertEquals(BigDecimal.valueOf(120L).setScale(2),
               Dan.pripocitajDan(BigDecimal.valueOf(100L).setScale(2)));
                                                         
    }


    @Test
    public void suma141PlusDanJe169Cela2(){
        assertEquals(BigDecimal.valueOf(169.20).setScale(2),
                Dan.pripocitajDan(BigDecimal.valueOf(141L).setScale(2)));

    }
    //TODO: negative scenario

    @Test
    public void suma10PlusDanNieJe100(){
        assertNotEquals(BigDecimal.valueOf(1000L).setScale(2),Dan.pripocitajDan(BigDecimal.valueOf(10).setScale(2)));

    }
}