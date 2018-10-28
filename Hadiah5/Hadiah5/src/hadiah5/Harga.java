package hadiah5;
public class Harga {
long harga;
public long getHarga(String tipe,char blok){
    if ("36".equals(tipe)&&blok=='a'){
        harga=500000;
    }else if("36".equals(tipe)&& blok=='b'){
        harga=300000;
    }else if("37".equals(tipe)&& blok=='a') {
        harga=800000;
    }else if("37".equals(tipe)&& blok=='b'){
        harga=600000;
    }else{
        System.out.println("pilihan tidak sesuai");
    }
    return harga;
        
}
}
