package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }

    public static void oneMonthCalendar(int numberDay, int startingDay) {

        int line = 0;
        int row = 0;

        for (int j = 1; j <= 7; j++){
            if (j == startingDay){
                for (int i = 1; i <= numberDay; i++){
                    if (i <= 9){
                        System.out.print(" " + i + " ");
                    } else {
                        System.out.print(i + " ");
                    }
                    line++;
                    if (line % 7 == 0){
                        if (row <= 4){
                            System.out.println("");}
                        row++;
                    }
                }
            } else if (line < startingDay){
                System.out.print("   ");
                line++;
            }
            if (numberDay <= 2){
                System.out.print("");}
        }
        if (line % 7 != 0){
            System.out.println();}
    }

    public static long [] lcg(long seed){

        seed = 12345;
        long[] randomNumbers = new long[10];

        randomNumbers[0] = seed;

        for (int i = 1; i < 10; i++){
            randomNumbers[i] = nextRandomNumber(randomNumbers[i - 1]);
        }
        return randomNumbers;
    }

    public static long nextRandomNumber(long seed){
        long a = 1103515245;
        long c = 12345;
        long m = 2147483648L;

        return ((a * seed) + c) % m;
    }




}