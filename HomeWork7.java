package Lesson7;

import Lesson7.Cat;
import Lesson7.Titan;

import java.util.Scanner;


public class HomeWork7 extends Object {


    public static void main(String[] args) {

        String exampleString = "Example"; //String exampleString = new String ("Example");
        StringBuilder stringBuilder = new StringBuilder("Example");

        long startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            exampleString += i; //Example0123456
        }

        float deltaTime = System.nanoTime() - startTime;
        System.out.println(exampleString);
        System.out.println("Work for-cycle for String = " + deltaTime * 0.000001f + " millisec.");

        startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(i);//Example0123456
        }

        deltaTime = System.nanoTime() - startTime;

        System.out.println(stringBuilder.toString());
        System.out.println("Work for-cycle for StringBuilder = " + deltaTime * 0.000001f + " millisec.");
        System.out.println(exampleString.equals(stringBuilder.toString()));

    }
}
//
