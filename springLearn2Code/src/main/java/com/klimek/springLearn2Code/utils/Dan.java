package com.klimek.springLearn2Code.utils;

import java.math.*;

public class Dan {

    private static final int aktualnaDan = 20;

    public static BigDecimal pripocitajDan(BigDecimal suma){
        return  suma.add(BigDecimal.valueOf(aktualnaDan)) ;
    }

}
