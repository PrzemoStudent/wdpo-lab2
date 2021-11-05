package pl.edu.wszib.wdpolab2;

import java.math.BigInteger;

public class Zad1 {
    public static void main(String[] args) {
        BigInteger liczba1 = new BigInteger("99999999999999999999999");
        BigInteger liczba2 = new BigInteger("99999999999999999999999");
        BigInteger sum = liczba1.add(liczba2);
        BigInteger diff = liczba1.min(liczba2);
        BigInteger multiplied = liczba1.multiply(liczba2);
        BigInteger divided = liczba1.divide(liczba2);
        System.out.println("Sum "+ sum);
        System.out.println("Diff " + diff);
        System.out.println("Multiplied " + multiplied);
        System.out.println("Divided " + divided);
        System.out.println("Pow8 " + liczba1.pow(8));
        Class<Zad1> zad1Class = Zad1.class;
    }
}
