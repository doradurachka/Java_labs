package com.company;



public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(Palindrome.reverseString(s)); // вывод слова задом наперёд в консоль
            System.out.println(Palindrome.isPalindrome(s)); // вывод ответа на вопрос  является ли слово палиндромом
        }
    }
    public static String reverseString(String s) {
        String s1 = ""; // объявления переменной для записи слова задом наперёд
        for (int length = s.length()-1; length >=0; length--)
           s1 += s.charAt(length);
        return s1; // возвращаемое слово при вызове фукции
    }
    public static boolean isPalindrome(String s) {
        String s1 = reverseString(s);
        boolean palindrome = s.equals(s1); // проверка слова на палиндромность
        return palindrome; // возвращение условия
    }
}
