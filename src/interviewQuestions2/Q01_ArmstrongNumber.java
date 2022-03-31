package interviewQuestions2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o
        sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int num=scan.nextInt();



            armstrongSayiBul(num);
            girilenSayiyaKadarOlanArmstrongSayi(num);



    }



    private static void armstrongSayiBul(int num) {
        int toplam=0;
        int basamaktakiRakam=0;
        int sayi=num;

        while (sayi>0){
            basamaktakiRakam=sayi%10;
            toplam+=(basamaktakiRakam*basamaktakiRakam*basamaktakiRakam);
            sayi/=10;
        }
        if (toplam==num){
            System.out.println(num+" sayisi armstrong sayidir");
        }else System.out.println(num+" sayisi armstrong sayi degildir");

    }
    private static void girilenSayiyaKadarOlanArmstrongSayi(int num) {
        for (int i = 0; i <=num ; i++) {
            armstrongSayiBul(i);
        }

    }
}
