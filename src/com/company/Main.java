package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kbReaderInt = new Scanner(System.in);

        System.out.println("Enter a Number.");
        int intRead = kbReaderInt.nextInt();
        if (intRead % 2 == 0){
            System.out.println("The integer " + intRead + " is even.");
        }
        else {
            System.out.println("The integer " + intRead + " is odd.");
        }
    }
}
