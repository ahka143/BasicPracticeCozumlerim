package interviewQuestions2;

import java.util.List;
import java.util.Scanner;

public class Q02_ArmstrongNumber_4Digits {
   /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        String numstr= scan.next();
        cokBasamakliArmstrongSayiBul(numstr);
    }

    private static void cokBasamakliArmstrongSayiBul(String numstr) {
        int toplam = 0;
        String numstr1[]=numstr.split("");
        for (int i = 0; i <numstr1.length ; i++) {
            toplam += (Math.pow(Integer.valueOf(numstr1[i]),numstr1.length));
        }
        if (toplam ==Integer.valueOf(numstr)){
            System.out.println(numstr+" sayisi armstrong sayidir");
        }else System.out.println(numstr+" sayisi armstrong sayi degildir");
    }


}
