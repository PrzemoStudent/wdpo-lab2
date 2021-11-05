package pl.edu.wszib.wdpolab2;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short exampleShort=1;
        byte exampleByte = 1;
        int exampleInt = 1;
        long exampleLong =1L;
        long sum = exampleInt + exampleLong;
        int twoTimesMaxInt = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println("Sum: "+ twoTimesMaxInt);
        System.out.println(("Div zero " + 10/1));
        BigInteger first= BigInteger.TEN;
        BigInteger second= BigInteger.TEN;
        BigInteger bigsum = first.add(second);
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }
}
