/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labfive;

import java.util.ArrayList;

/**
 *
 * @author Chandana
 */
public class QuestionFive {
    
   
    public static ArrayList greatestValue(int[] arrNumbers ,  int number){
        ArrayList arrGreaterNum = new ArrayList();
        try{
            if(null != arrNumbers && arrNumbers.length>0){
                for(int iCount=0;iCount<arrNumbers.length;iCount++){
                    if(arrNumbers[iCount]>number){
                    arrGreaterNum.add(arrNumbers[iCount]);
                    }
                }  
            }    
        }catch(Exception e){
             System.out.println("Array list of numbers is empty");
        }
        return arrGreaterNum;
    }
   
    public static void main(String[] args) {
       
        int[] arrNumbers ={50,20,34,65,91};
        int number = 35;
        ArrayList arrGreaterNum = greatestValue(arrNumbers,number);
        if(null != arrGreaterNum && arrGreaterNum.size()>0){
            System.out.println("Numbers that are greater than "+ number + "are :");
                for(int iCount=0;iCount<arrGreaterNum.size();iCount++){
                   System.out.println(arrGreaterNum.get(iCount));
                }  
            }  
       
    }

}
