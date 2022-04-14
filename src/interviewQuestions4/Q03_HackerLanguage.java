package interviewQuestions4;

import java.util.Scanner;

public class Q03_HackerLanguage {

// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine().toLowerCase();
        String yeniCumle = "";
        for (int i = 0; i < cumle.length(); i++) {
            switch (cumle.charAt(i)) {
                case 's':
                    yeniCumle += "5";
                    break;
                case 'a':
                    yeniCumle += "4";
                    break;
                case 'e':
                    yeniCumle += "3";
                    break;
                case 'i':
                    yeniCumle += "1";
                    break;
                case 'o':
                    yeniCumle += "0";
                    break;
                default:yeniCumle += cumle.charAt(i);
            }

        }
        System.out.println(yeniCumle);

    }
}
