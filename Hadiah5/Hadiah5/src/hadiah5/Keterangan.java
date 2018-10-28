package hadiah5;

public class Keterangan extends Harga{
    protected String nama,alamat;
    protected long bayar,kembalian,Harga;
    
    public Keterangan(String nama,String alamat,String tipe,char blok){
        this.nama=nama;
        this.alamat=alamat;
        this.Harga=getHarga(tipe,blok);
    }
   public void Kembalian(long bayar){
       kembalian = bayar - harga;
       System.out.println("Kembalian = "+kembalian);
   } 
   
   public void bayarRmh(long bayar){
       if (bayar<harga){
           System.out.println("Uang anda kurang");
       }else{
           Kembalian(bayar);
       }
   }
}
