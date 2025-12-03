package com.test.unittest1;

import org.springframework.stereotype.Component;

@Component
public class MathLibrary {



    Integer add(Integer a,Integer b){
        return a+b;
    }

    Integer subtract(Integer a,Integer b){
        return a-b;
    }

    Integer multiply(Integer a,Integer b){
        return a*b;
    }
    Integer divide(Integer a,Integer b){

        if(b==0) throw new RuntimeException("Denominator cannot be zero");
        return a/b;
    }
}
