package hadiah5;
import java.util.Scanner;
public class Hadiah5 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Harga h = new Harga();
String tipe,nama,alamat;
char blok;
long bayar;
System.out.print("Nama : ");
nama = input.next();
System.out.print("Alamat : ");
alamat = input.next();
System.out.print("Tipe : ");
tipe = input.next();
System.out.print("Blok : ");
blok = input.next().charAt(0);
System.out.println("Harga rumah = "+h.getHarga(tipe, blok));
System.out.print("Bayar = ");
bayar = input.nextLong();
Keterangan konsumen = new Keterangan(nama,alamat,tipe,blok);
h.getHarga(tipe,blok);
konsumen.bayarRmh(bayar);
    }
    
}
