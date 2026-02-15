package Coding.Showroom;

public class showroom {
    
    public static void main(String[] args) {
        
        katalog BMW = new katalog("BMW","G20 330i M Sport",22500000,"biru","bensin");
        BMW.tampilkanidentitasmobil();

        katalog porsche = new katalog("porsche","GT3 RS ", 30525000, "putih", "solar");
        porsche.tampilkanidentitasmobil();

        katalog mercy = new katalog("Mercedes Benz","C300 AMG", 25900500, "merah", "bensin");
        mercy.tampilkanidentitasmobil();

        katalog mico = new katalog("Subaru", "WRX", 27000990, "silver", "bensin");
        mico.tampilkanidentitasmobil();
        
        katalog mazda = new katalog("Mazda","Hatchback", 25000000, "merah marun", "solar");
        mazda.tampilkanidentitasmobil();

        katalog audi = new katalog("Audi","A7", 29050090, "hitama", "bensin");
        audi.tampilkanidentitasmobil();

        katalog ferrari = new katalog("Ferrari", "SF90 Stradale", 89540999, "merah", "solar");
        ferrari.tampilkanidentitasmobil();

        katalog koenigsegg = new katalog("Koenigsegg", "Jesko", 19720096, "hitam", "solar");
        koenigsegg.tampilkanidentitasmobil();

        katalog toyota = new katalog("Toyota", "GR Supra ", 230000000, "oranye", "bensin");
        toyota.tampilkanidentitasmobil();

        katalog astonmartin = new katalog("Aston Martin", "Vantage Gt4", 32800000, "abu-abu tua", "solar");
        astonmartin.tampilkanidentitasmobil();
    }
}
