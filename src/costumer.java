public class costumer {
    //atributnya//

    String nama="utuh";
    String namabarang="sabun";
    int umur=20;
    int harga;
    int banyakbarang=2;
    int alamat;

    //contructor//

    costumer(){
        System.out.println("constraktor 1 ngak tau diisi apa pa");
    }

    costumer(String nama){
        System.out.println("construktor ke 2 ngak tau diisi apa pa");
    }

    costumer(String nama, int umur){
        System.out.println("constructor ke 3 ngak tau diisi apa pa");
    }

    //methodnya//

    void namapembelinya(){
        System.out.println("nama Pembeli = "+nama);
    }
    void alamat(){
        System.out.println("cempaka banjarbaru");
    }
    void banyakbarangnya(){
        System.out.println("Banyak barang di beli = "+banyakbarang);
    }
    void namabarangnya(){
        System.out.println("nama barang = "+ namabarang);
    }
    void umurnya(){
        System.out.println("Umur pembeli= "+umur);
    }

    //OverLoading//
    int totalbarang(int harga , int banyakbarang){

        int hasil = harga * banyakbarang;
        return hasil;
    }
    int totalbarang(int harga , int banyakbarang , int bonus){
        int hasil = harga * banyakbarang - bonus;
        return hasil;
    }
    double totalbarang(double harga , int banyakbarang){
        double hasil = harga * banyakbarang;
        return  hasil;
    }
}
