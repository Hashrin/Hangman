/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author HASHRIN
 */
public class RandomDemo {

    /**
     *
     * @return
     */
    public int randomize(){
       Random randomno = new Random();
       return (randomno.nextInt(61));
   }

    /**
     *
     * @param args
     */
    public static void main( String args[] ){
     
   
   }    
}
