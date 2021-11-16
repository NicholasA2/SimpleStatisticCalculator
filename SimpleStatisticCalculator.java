/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplestatisticcalculator;
import java.util.Scanner;
/**
 *
 * @author Nicholas Adiohos
 */
public class SimpleStatisticCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Get input
        Scanner fiveNumbers = new Scanner(System.in);
        System.out.print("Please input 5 numbers separated by space: ");
        String numbersGot = fiveNumbers.nextLine();
        
        //Seperate the numbers and convert to double
        char numberOneChar = numbersGot.charAt(0);
        double numberOne = (double) (numberOneChar - '0');
        
        char numberTwoChar = numbersGot.charAt(2);
        double numberTwo = (double) (numberTwoChar - '0');
        
        char numberThreeChar = numbersGot.charAt(4);
        double numberThree = (double) (numberThreeChar - '0');
        
        char numberFourChar = numbersGot.charAt(6);
        double numberFour = (double) (numberFourChar - '0');
        
        char numberFiveChar = numbersGot.charAt(8);
        double numberFive = (double) (numberFiveChar - '0');
        
        //Print the numbers
        System.out.printf("Numbers \t\t:%.2f, %.2f, %.2f, %.2f, %.2f\n", numberOne, numberTwo, numberThree, numberFour, numberFive);
        
        //Calculate the mean
        double meanStepOne = numberOne + numberTwo + numberThree + numberFour + numberFive;
        double meanComplete = meanStepOne / 5;
        System.out.printf("Mean \t\t\t:%.2f\n", meanComplete);
        
        //Find the minimum
        double min = Math.min(numberOne, Math.min(numberTwo, Math.min(numberThree, Math.min(numberFour, numberFive))));
        System.out.printf("Minimum \t\t:%.2f\n", min);
        
        //Find the maximimum
        double max = Math.max(numberOne, Math.max(numberTwo, Math.max(numberThree, Math.max(numberFour, numberFive))));
        System.out.printf("Maximum \t\t:%.2f\n", max);
        
        //Find Standard deviation
        //Get sum - mean squared for each number
        double stepOne = Math.pow(numberOne - meanComplete, 2);
        double stepTwo = Math.pow(numberTwo - meanComplete, 2);
        double stepThree = Math.pow(numberThree - meanComplete, 2);
        double stepFour = Math.pow(numberFour - meanComplete, 2);
        double stepFive = Math.pow(numberFive - meanComplete, 2);
        //Find the new mean of these answers
        double stepSix = stepOne + stepTwo + stepThree + stepFour + stepFive;
        double stepSeven = stepSix / 5;
        //Get the square root
        double lastStep = Math.sqrt(stepSeven);
        //Print answer
        System.out.printf("Standard deviation \t:%.2f\n", lastStep);
        
    }
    
}
