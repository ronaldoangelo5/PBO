package lingkaran;
import java.util.Scanner;
public class Lingkaran {
    public static void main(String[] args) {
    double luas,jari;
    Scanner input=new Scanner(System.in);
    System.out.print("Masukkan jari-jari lingkaran : ");
    jari = input.nextInt();
    luas = 3.14 * (jari + jari);
    System.out.println("Luas lingkarannya adalah "+luas);
    
    
    }
    
}
