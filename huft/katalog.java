package Coding.Showroom;

public class katalog {   

    String merek;
    String tipe;
    int harga;
    String warna;
    String bensin;

    public katalog(String merek, String tipe, int  harga, String warna, String bensin){
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
        this.warna = warna;
        this.bensin = bensin;
        }
    
    public void tampilkanidentitasmobil (){
        System.out.printf("Merek Mobil: %s\n", merek);
        System.out.println("----Berikut Rinciannya----");
        System.out.printf("Tipe Mobil: %s\n", tipe);
        System.out.printf("Harga Mobil: %s\n", harga);
        System.out.printf("Warna Mobil: %s\n", warna);
        System.out.printf("Bahan Bakar (bensin/solar): %s\n", bensin);
        System.out.println("                                         ");
    }
}

