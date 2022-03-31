package interviewQuestions2;

import java.util.Scanner;

public class Q04_PerfectNumber {
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int num=scan.nextInt();
        perfectNumber(num);
        girilenSayiyaKadarMukemmelSayi(num);
    }

    private static void girilenSayiyaKadarMukemmelSayi(int num) {
        for (int i = 1; i <num ; i++) {
           perfectNumber(i);

        }

    }

    private static void perfectNumber(int num) {

        int i=1;
        int toplam = 0;

        while (i<num){
            if (num%i==0){
              toplam+=i;
            }
        i++;
        }
        if (toplam==num){
            System.out.println(num+" sayisi mukemmel sayidir");
        }else System.out.println(num+" sayisi mukemmel sayi degildir");

    }

}