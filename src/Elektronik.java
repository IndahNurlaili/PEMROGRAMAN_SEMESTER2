public class Elektronik {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int harga;


    public Elektronik(String nama, int stok, int hargaSatuan){
        this.nama = nama;
        this.stok = stok;  
        this.hargaSatuan = hargaSatuan;
        this.harga = stok * hargaSatuan;
    }

    //setter untuk nama, stok harga serta harga satuan
    public void setInfo(String nama, int stok, int hargaSatuan){
        this.nama = nama ;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.harga = stok * hargaSatuan;
    }

    //Getter untuk nama, stok, harga serta harga satuan 
    public String getinfo(){
        return "Nama: " + nama + "\n" +
               "Stok: " + stok + "\n" +
               "Harga Satuan: Rp. " + hargaSatuan + "\n" +
               "Harga: Rp. " + harga;
    }

    //pemanggilan setter dan getter untuk total harga 
    public void setTotalHarga(int totalHarga){
        this.harga = totalHarga;
    }
    public int getTotalHarga(){
        return this.harga;
    }

    public static void main(String[]args){
        Elektronik tv = new Elektronik("Tv", 10, 7000000);
        Elektronik kulkas = new Elektronik("Kulkas", 10, 5000000);
        Elektronik ac = new Elektronik("Ac", 10, 3000000);
    
    System.out.println("Penjualan Elektronik: ");
    System.out.println(tv.getinfo());
    System.out.println();
    System.out.println(kulkas.getinfo());
    System.out.println();
    System.out.println(ac.getinfo());

    //menghitung total harga 
    int totalHarga = tv.getTotalHarga() + kulkas.getTotalHarga() + ac.getTotalHarga();

    System.out.println();
    System.out.println("Total uang yang diterima penjual jika semuanya terjual: Rp." + totalHarga);
    }


}
