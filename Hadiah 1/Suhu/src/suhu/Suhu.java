package suhu;
import java.util.Scanner;
public class Suhu {
    public static void main(String[] args) {
     double f,c;
     Scanner suhu = new Scanner(System.in);
     System.out.print("Masukkan suhu dalam Celcius : ");
     c = suhu.nextInt();
     f = c * 9/5 + 32;
     System.out.println("Nilai celcius setelah di konversi ke fahrenheit adalah "+f+" Fahrenheit");
     
     System.out.print("Masukkan suhu dalam fahrenheit : ");
     f = suhu.nextInt();
     c = (5.0/9) * (f - 32);
     System.out.println("Nilai fahrenheit setelah di konversi ke celcius adalah "+c);
     
     
    }
    
}
