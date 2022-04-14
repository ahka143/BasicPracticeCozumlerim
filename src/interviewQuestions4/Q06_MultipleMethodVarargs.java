package interviewQuestions4;

public class Q06_MultipleMethodVarargs {
    /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */

    public static void main(String[] args) {
        ortalamaBul("ali", 55, 60, 71, 82, 75, 69);
        ortalamaBul("ayse", 55, 60, 75, 69);
        ortalamaBul("ahmet", 55, 60, 71);
        ortalamaBul("yusuf", 55, 60, 71, 82, 69);
    }

    private static void ortalamaBul(String ogrenci, int... i) {
        int toplam = 0;
        for (int each : i
        ) {
            toplam +=each;
        }
        System.out.println(ogrenci+ "- not ortalamasi = "+ toplam/i.length);
    }


}


