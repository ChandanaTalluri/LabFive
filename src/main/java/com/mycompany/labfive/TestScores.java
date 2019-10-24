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
public class TestScores {
    
    private double[] testscore;

    public double[] getTestscore() {
        return testscore;
    }

    public void setTestscore(double[] testscore) {
        this.testscore = testscore;
    }
    
    public TestScores(double[] testscore){
        this.testscore = testscore;
    }
    public static double averageTestScore(double[] testscore){
        double averagescore = 0 ;
        try{
           if(null!= testscore){
               double sum = 0;
                for(int iCount = 0; iCount< testscore.length ; iCount++){
                    if(testscore[iCount]<0 || testscore[iCount]>100){
                        throw new InvaildTestScoreException("Test score can't be less than zero or more than 100");
                    }
                    else{
                        sum = sum+testscore[iCount];
                    }
                }
                averagescore = sum/testscore.length;
                System.out.println("Average Score is :"+averagescore);
                
            }
        }catch(InvaildTestScoreException e){
            System.out.println("Test score can't be less than zero or more than 100");
        }
        return averagescore;
    }
    
    
}
