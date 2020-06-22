public class main {
    public static void main(String[] args) {

        // memanggil Consraktornya

        costumer pelanggan = new   costumer();
        costumer pelanggan1 = new   costumer("utuh");
        costumer pelanggan2 = new   costumer("utuh",21);

        //memanggil methodnya

        pelanggan.namapembelinya();
        pelanggan.alamat();
        pelanggan.namabarangnya();
        pelanggan.umurnya();
        pelanggan.banyakbarangnya();

        //Memanggil Overloading

        int totalbarang = pelanggan.totalbarang(200000,3);
        int totalbarang2 = pelanggan.totalbarang(200000,3,30000);
        double totalbarang3 = pelanggan.totalbarang(200000,10);
        System.out.println("Hasil harga dan banyak barang = "+totalbarang);
        System.out.println("hasil harga total dan bonus pembelian pertama = "+totalbarang2);
        System.out.println("hasil harga total barang dalam double= "+totalbarang3);
    }
}
