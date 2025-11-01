package com.Dhruve;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    //    public Laptop(){
//      System.out.println("Laptop object Created");
//   }
    @Override
    public void compile(){
        System.out.println("compiling from Desktop ");
    }

}