package lingkaran;
import java.util.Scanner;
class lingkaran{
    int jari;
}
public class Lingkaran {
    public static void main(String[] args) {
    int luas;
    lingkaran l = new lingkaran();
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jari-jari lingkaran : ");
    int jari = input.nextInt();
    
    luas = (int)(3.14*(jari*jari));
    System.out.println("luas lingkaran : "+luas);
    }
    
}
