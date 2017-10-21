package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("В каком году была основана Одесса? ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number== 1974) System.out.println(" От души братка, ты прав. ");
        else
        System.out.println(" Вы ввели " + number + " но, Одесса была основана в 1974 году.");


    }
}
