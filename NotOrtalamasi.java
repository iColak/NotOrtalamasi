package kosulluIfadeler;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        if (mat<0 || mat>100) mat = 0;

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if (fizik<0 || fizik>100) fizik = 0;

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        if (turkce<0 || turkce>100) turkce = 0;

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if (kimya<0 || kimya>100) kimya = 0;

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();
        if (muzik<0 || muzik>100) muzik = 0;

        double ortalama = (mat+fizik+turkce+kimya+muzik)/5;

        if (ortalama < 55) {
            System.out.println("Başarısız");
        }else {
            System.out.println("Başarılı");
        }


    }
}
