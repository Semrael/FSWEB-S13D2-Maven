package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));


        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1
        ));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }


    //Palindrom Sayıyı bulma
    public static boolean isPalindrome(int sayi) { ///987789
        sayi = Math.abs(sayi);
        String sayiString = String.valueOf(sayi);  ///"987789"
        int uzunluk = sayiString.length();
        for (int i = 0; i < uzunluk / 2; i++) {
            if (sayiString.charAt(i) != sayiString.charAt(uzunluk - i - 1)) {
                return false;
            }
        }
        return true;

    }


    //Mükemmle Sayıyı Bulma------------------------------------------------------------------------------------------------------
    public static boolean isPerfectNumber(int sayi) {
        if (sayi < 0)
            return false;

        int toplam = 0;
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam == sayi;
    }


    // Sayıları kelimelere dök--------------------------------------------------------------------------------------------------
    public static String numberToWords(int sayi) {
        if (sayi < 0) {
          return  "Invalid Value";
        }
        char[] digits = String.valueOf(sayi).toCharArray();
        String numToText = "";

        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;



            }

        }
        return numToText.trim();

    }


}


