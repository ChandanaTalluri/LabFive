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
public class MainTestScore {
    public static void main(String[] args) {
        try{
            double[] testscores = {90,80 , -50, 100};
            TestScores objTestScores = new TestScores(testscores);
            
            if(null != testscores && testscores.length>0){
            System.out.println("Testscores are :");
                for(int iCount=0;iCount<testscores.length;iCount++){
                   System.out.println(testscores[iCount]);
                }  
            }
            objTestScores.averageTestScore(testscores);
            
        }catch(Exception e){
            System.out.println("Test score can't be less than zero or more than 100");
        }
    }
}
