package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0201{
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input some words separated by space"); //or use a for loop to read them 1 by 1;
        String input = keyboard.nextLine();

        Boolean result = warAndPeace(input);
        System.out.println("Output: " + result);
    }


    public static boolean warAndPeace(String text) {
/*Write a Java method that given a string text,
 returns true if the string "war" and "peace" appear the same number of times in text.
 All input letters are in lowercase.
Test cases :
warAndPeace("there was never a good war, or a bad peace") → true
warAndPeace("war what is it good for") → false

Q: should the 'word' be defined as separated by space - normally it is....
test cases:
    warAndPeace("there was never a good warandpeace") 0 and 0, so equal
    warAndPeace("war what is it good for") 1 and 0, not equal
    warAndPeace("what is it good for") 0 and 0, equal
    warAndPeace("there was never a good war or a bad peace") 1 and 1, equal
 */

/*
The regex means that the delimiters will be anything that is not a word [\W],
in groups of at least one [+]. 
Because [+] is greedy, it will take 
for instance ';' and ' ' together as one delimiter.
*/
        String[] words = text.split("\\W+");
        String wordForWar = "war";
        String wordForPeace = "peace";
        int occurrencesForWar = 0;
        int occurrencesForPeace = 0;
        for (int i=0; i<words.length; i++){
            if (words[i].equals(wordForWar))
                occurrencesForWar++;
            if (words[i].equals(wordForPeace))
                occurrencesForPeace++;
        }

        return (occurrencesForWar == occurrencesForPeace);

        /*
        String war = "war"; //test comment changes
        String temp[] = text.split("[ ,]"); // WRONG: you should NOT to split by a DELIMITER such as comma
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (war.equals(temp[i]))
                count++;
        }
        String peace = "peace";
        int count2 = 0;
        for (int i = 0; i < temp.length; i++) {
            if (peace.equals(temp[i]))
                count2++;
        }
        if (count == count2) return true;
        else return false;
        */

    }
}
