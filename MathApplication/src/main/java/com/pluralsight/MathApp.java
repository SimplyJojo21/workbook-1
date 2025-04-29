package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
        { //Question 1
            //declare variables here
            double bobSalary = 96251.89;
            double garySalary = 79482.3;

            // code solution
            double highestSalary = Math.max(bobSalary, garySalary);

            //print line to display results
            System.out.println("Question 1:");
            System.out.println("The highest salary is " + highestSalary);

        }
        {//Question 2
            //declare variables
            int carPrice = 9740;
            int truckPrice = 12350;

            //code solution
            int lowestPrice = Math.min(carPrice, truckPrice);

            //print results
            System.out.println("Question 2:");
            System.out.println("The lowest price between the two is " + lowestPrice);
        }
        {//Question 7
            System.out.println("A random number between 0 and 1 is " + Math.random());
        }











    }
}
