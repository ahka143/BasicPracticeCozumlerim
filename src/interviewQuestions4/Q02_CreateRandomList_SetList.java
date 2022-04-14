package interviewQuestions4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        randomEkle(sayilar);
    }

    private static void randomEkle(List<Integer> sayilar) {

        for (int i = 0; i < 10 ; i++) {

            sayilar.add((int)(Math.random()*20));

        }
        System.out.println(sayilar);

        for (int i = 0; i <sayilar.size() ; i++) {
            if (sayilar.get(i)%2==0){
                sayilar.set(i,111);
            }

        }
        System.out.println(sayilar);



    }


}
