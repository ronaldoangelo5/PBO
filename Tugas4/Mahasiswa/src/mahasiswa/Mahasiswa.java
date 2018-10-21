package mahasiswa;
import java.util.Scanner;
class siswa{
    String nama,jurusan,nim;
    void setnama(String namamhs){
        nama = namamhs;
    }
    void setjurusan(String jurusanmhs){
        jurusan = jurusanmhs;
    }
    void setnim(String nimmhs){
        nim = nimmhs;
    }
    void cetak(){
        System.out.println("Nama saya adalah "+nama+" Jurusan "+jurusan+" dan NIM saya adalah "+nim);
        
    }
}
public class Mahasiswa {
    public static void main(String[] args) {
       siswa a = new siswa();
       Scanner input = new Scanner(System.in);
       
       System.out.print("Nama : ");
       String nama = input.next();
       System.out.print("Jurusan : ");
       String jurusan = input.next();
       System.out.print("NIM : ");
       String nim = input.next();
       System.out.println("");
       
       System.out.println("Nama : "+nama);
       System.out.println("Jurusan : "+jurusan);
       System.out.println("NIM : "+nim);
    }
    
}
