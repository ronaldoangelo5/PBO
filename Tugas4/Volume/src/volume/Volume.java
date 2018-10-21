package volume;
import java.util.Scanner;
class volume{
    int sisi;
}

public class Volume {
    public static void main(String[] args) {
        int volume;
        volume a;
        a = new volume();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sisi kubus : ");
        int sisi = input.nextInt();
        
        volume = (sisi*sisi*sisi);
        System.out.println("Hasil : "+volume);
    }
    
}
