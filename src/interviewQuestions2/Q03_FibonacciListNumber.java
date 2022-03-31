package interviewQuestions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber {

    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int num = scan.nextInt();
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int i = 1;

        if (num <= 1) {
            System.out.println("Lutfen daha buyuk bir sayi giriniz: ");
        } else {
            while (fibonacci.get(i) < num) {
                fibonacci.add(fibonacci.get(i)+ fibonacci.get(i-1));
                i++;
            }
            if (fibonacci.get(fibonacci.size()-1)>num){
                fibonacci.remove(fibonacci.size()-1);
                System.out.println(num+" fibonacci dizisinde degil");
            }


        }
        System.out.println(fibonacci);


    }

}
