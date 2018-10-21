package pln;
import java.util.Scanner;
class bayar {
    int harga = 0;
    int bayar;
    String nama,blok,alamat,tipe;
}
public class PLN {    
    public static void main(String[] args) {
    int kembalian = 0;
    bayar b = new bayar();
    Scanner i = new Scanner(System.in);
    
    System.out.print("Nama : ");
    String nama = i.next();
    System.out.print("Alamat : ");
    String alamat = i.next();
    System.out.print("Tipe : ");
    String tipe = i.next();
    System.out.print("Blok : ");
    String blok = i.next();
    System.out.print("Bayar : ");
    int bayar = i.nextInt();
    
    if ("36".equals(tipe)&&"a".equals(blok)){
        b.harga = 500000;
    }else if("36".equals(tipe)||"b".equals(blok)){
        b.harga = 300000;
    }else if("37".equals(tipe)||"a".equals(blok)){
        b.harga = 800000;
    }else if("37".equals(tipe)||"b".equals(blok)){
        b.harga = 600000;
    }else {
            System.out.print("Tidak ada pilihan");
            }
    kembalian = (bayar-b.harga);
    
    System.out.println("");
    System.out.println("Nama : "+nama);
    System.out.println("Alamat : "+alamat);
    System.out.println("Harga : "+b.harga);
    System.out.println("Bayar : "+bayar);
    
    System.out.println("");
    System.out.println("Kemablian : "+kembalian);
    
    }
    
}
