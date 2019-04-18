package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String word;
	    int index;
	    String subString;

        Scanner input = new Scanner(System.in);

	    System.out.print("Enter a word: ");
	    word = input.nextLine();
	    System.out.print("Enter a number as an index: ");
	    index = input.nextInt();
	    System.out.println();

	    System.out.printf("The length of %s is: %d \n", word, word.length());
	    System.out.printf("The substring from 0 to %d is: %s",index, word.substring(0,index));

    }
}
