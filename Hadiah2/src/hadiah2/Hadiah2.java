package hadiah2;
import java.util.Scanner;
public class Hadiah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,alamat;
        char tipe;
        int bayar,harga = 0,kembalian;
        System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan alamat anda : ");
        alamat = input.nextLine();
        System.out.print("Masukkan tipe pesawat : ");
        tipe = input.next().charAt(0);
        
        switch (tipe) {
            case 'a':
                harga = 5000000;
                break;
            case 'b':
                harga = 2000000;
                break;
            case 'c':
                harga = 1000000;
                break;
            default:
                System.out.print("Pilihan tidak ada!");
                break;
        }
        
        System.out.println("Tipe pesawat yang dipilih adalah "+tipe+",dengan harga Rp."+harga);
        System.out.print("Bayar : ");
        bayar = input.nextInt();
        
        kembalian=bayar-harga;
        System.out.println("");
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Total kembalian : "+kembalian);
    }
    
}
