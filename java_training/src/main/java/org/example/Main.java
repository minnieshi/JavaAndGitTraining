package org.example;


import java.util.Arrays;
import java.util.List;

import static java.util.Calendar.*;

public class Main {
    public static void main(String[] args) {
        String[] numbers={"1,2,3,4,5", "abc"};
/* OMG: array is not Collection !!!
notice, the page "collection framework":
It was critical that all reasonable representations of collections interoperate well.
This included arrays, which cannot be made to implement the Collection interface directly without changing the language.
Thus, the framework includes methods to enable collections to be moved into arrays,
arrays to be viewed as collections,
and maps to be viewed as collections.
*/
/*
forEach:
Any iterable of type Collection — list, set, queue etc. — has the same syntax for using forEach.
Maps are not Iterable, but they do provide their own variant of forEach that accepts a BiConsumer.
https://stackoverflow.com/questions/13361489/differences-between-an-array-and-any-collection-from-the-java-collection-framewo
        */
        List<String> names = Arrays.asList("Larry", "Steve", "James");
        System.out.println("Hello world!");
        names.forEach(System.out::println);

        System.out.println("hello again");
        names.forEach(name -> System.out.println(name));

/*
* switch expression
* */
        int monthInSwitchExpression=9;
        var result = switch(monthInSwitchExpression) {
            case JANUARY, JUNE, JULY -> 3;
            case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
            case MARCH, MAY, APRIL, AUGUST -> 2;
            default -> 0;
        };
        System.out.println(result);
/*
* switch statement
* */
        int month = 2;
        int year = 2000;
        int numDaysForTheMonth = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDaysForTheMonth = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDaysForTheMonth = 30;
                break;
            case 2:
                /*
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDaysForTheMonth = 29;
                else
                    numDaysForTheMonth = 28;
                */
                numDaysForTheMonth=-1;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = " + numDaysForTheMonth);


    }
}
