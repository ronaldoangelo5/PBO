package prak3lat4;
import java.util.Scanner;
public class Prak3Lat4MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e,max,min;
        
        System.out.print("Masukkan nilai a = ");
        a = input.nextInt();
        
         System.out.print("Masukkan nilai b = ");
        b = input.nextInt();
        
         System.out.print("Masukkan nilai c = ");
        c = input.nextInt();
        
         System.out.print("Masukkan nilai d = ");
        d = input.nextInt();
        
         System.out.print("Masukkan nilai e = ");
        e = input.nextInt();
        
    max = a;
    min = a;
    
    if (b > max)
        max = b;
    else if (b < min)
        min = b;
    if (c > max)
        max = c;
    else if (c < min)
        min = c;
    if (d > max)
        max = d;
    else if (d < min)
        min = d;
    if (e > max)
        max = e;
    else if (e < min)
        min = e;
    
    System.out.println("Nilai max = "+max+"\nNilai min = "+min);
    }
    
}
