/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labfive;

/**
 *
 * @author Chandana
 */
public class QuestionEleven {
    
    public static int getTotal(int[] arrNumbers){
        int total = 0;
        try{
            if(null != arrNumbers && arrNumbers.length>0){
                for(int i =0; i<arrNumbers.length;i++){
                    total = total+arrNumbers[i];
                }
            }
        }catch(Exception e){
            
        }
        return total;
    }
     public static int getAverage(int[] arrNumbers){
        int average = 0;
        try{
            if(null != arrNumbers && arrNumbers.length>0){
                int sum = 0;
                for(int i =0; i<arrNumbers.length;i++){
                    sum = sum+arrNumbers[i];
                }
                average = sum/arrNumbers.length;
            }
        }catch(Exception e){
            
        }
        return average;
    }
      public static int getHighest(int[] arrNumbers){
        int highestNumber = 0;
        try{
            if(null != arrNumbers && arrNumbers.length>0){
                highestNumber = arrNumbers[0];
                for(int i =0; i<arrNumbers.length;i++){
                   if(highestNumber < arrNumbers[i]){
                       highestNumber = arrNumbers[i];
                   }
                }
                
            }
        }catch(Exception e){
            
        }
        return highestNumber;
    }
      public static int getlowestNumber(int[] arrNumbers){
        int lowestNumber = 0;
        try{
            if(null != arrNumbers && arrNumbers.length>0){
                lowestNumber = arrNumbers[0];
                for(int i =0; i<arrNumbers.length;i++){
                   if(lowestNumber > arrNumbers[i]){
                       lowestNumber = arrNumbers[i];
                   }
                }
                
            }
        }catch(Exception e){
            
        }
        return lowestNumber;
    }  
    public static void main(String[] args) {
        
        int[] arrNumbers ={10,2,96,5,45,71,21};
        int total = getTotal(arrNumbers);
        int average = getAverage(arrNumbers);
        int highestNumber = getHighest(arrNumbers);
        int lowestNumber = getlowestNumber(arrNumbers);
        if(null != arrNumbers && arrNumbers.length>0){
            System.out.println("Numbers of the array are :");
                for(int iCount=0;iCount<arrNumbers.length;iCount++){
                   System.out.println(arrNumbers[iCount]);
                }  
        }
        System.out.println("Total value :"+total);
        System.out.println("Average value :"+average);
        System.out.println("Highest value :"+highestNumber);
        System.out.println("Lowest value :"+lowestNumber);
    }
}
