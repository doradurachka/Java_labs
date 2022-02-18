package com.company;

public class Primes {
            public static void main(String[] args) {
                for(int n = 2; n <=100; n++) {
                    if (isPrime(n))
                        System.out.println(n); // вывод простого числа в консоль
                }
            }
            public static boolean isPrime(int n) {
                boolean Prime = true; // объявляем перменную условия
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) // проверка на то, является ли число простым
                        Prime = false;
                }
                return Prime; // возвращение перменной условия данной функции
            }
}
