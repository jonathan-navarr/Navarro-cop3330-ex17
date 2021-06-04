package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class BloodAlcoholCalculator {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String gender;
        Double bac,gendernum;
        int totalAlcoholConsumedOZ, timeSinceDrink, weight;
        System.out.print("What is your weight? ");
        weight = scnr.nextInt();
        System.out.print("Are you Male or Female? ");
        gender = scnr.next();
        if (gender.equals("male") || gender.equals("Male")){
            gendernum =(0.73);
        }
        else{
            gendernum =(0.66);
        }
        System.out.print("What is the total alcohol you have consumed in Ounces? ");
        totalAlcoholConsumedOZ = scnr.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        timeSinceDrink = scnr.nextInt();

        bac = ((totalAlcoholConsumedOZ*5.14)/(weight*gendernum) - .015 * timeSinceDrink);
        String strBac = String.format("%.2f", bac);
        if(bac >= .08){
            System.out.print("Your BAC is "+ strBac + "\n It is not legal for you to drive.");
        }
        else{
            System.out.print("Your BAC is "+ strBac + "\n It is legal for you to drive.");
        }

    }
}
