/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.commandexample;

import com.leapfrog.commandexample.command.MathCommand;
import com.leapfrog.commandexample.command.MathFactory;

/**
 *
 * @author Saroj
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MathFactory mfactory=new MathFactory();
        MathCommand mc=mfactory.get("mulq");
        if(mc!=null){
        System.out.println(mc.calculate(10, 5));
        }else
        {
            System.out.println("current request is not available");
        }
    }
    
}
