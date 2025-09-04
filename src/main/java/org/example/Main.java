package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        isPerfectNumber(28);

    }

    public static boolean isPalindrome(int sayi){

        // negatif sayıysa işareti yok say
        sayi = Math.abs(sayi);

        int originalSayi = sayi;
        int ters = 0;

        while (sayi != 0){
            int rakam = sayi % 10;
            ters = ters * 10 + rakam;
            sayi = sayi / 10;
        }
        return originalSayi == ters;
    }

    public static boolean isPerfectNumber(int sayi){

        if(sayi<=0){
            return false;
        }

        int bolum = 0;

        for(int i=2; i<=sayi;i++){
            if(sayi % i == 0){
                bolum = bolum + sayi/i;
            }
        }

        return bolum == sayi;
    }

    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        String numStr = String.valueOf(number);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            switch (numStr.charAt(i)) {
                case '0': result.append("Zero"); break;
                case '1': result.append("One"); break;
                case '2': result.append("Two"); break;
                case '3': result.append("Three"); break;
                case '4': result.append("Four"); break;
                case '5': result.append("Five"); break;
                case '6': result.append("Six"); break;
                case '7': result.append("Seven"); break;
                case '8': result.append("Eight"); break;
                case '9': result.append("Nine"); break;
            }
            if (i != numStr.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

}
