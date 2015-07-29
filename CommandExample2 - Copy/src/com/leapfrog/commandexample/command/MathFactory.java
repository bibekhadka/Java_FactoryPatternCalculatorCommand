/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.commandexample.command;

/**
 *
 * @author Saroj
 */
public class MathFactory {
    
    public MathCommand get(String name){
        if(name.equalsIgnoreCase("add")){
            return new AddCommand();
        }
        else if( name.equalsIgnoreCase("sub")){
            return new SubCommand();
        }/*else if( name.equalsIgnoreCase("mul")){
            return new MulCommand();
        }*/
        
        

        return null;
    }
    
}
