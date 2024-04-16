public class Mebel {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int harga;


    public Mebel(String nama, int stok, int hargaSatuan){
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
        Mebel lemari = new Mebel("Lemari", 10, 1000000);
        Mebel meja = new Mebel("Meja", 10, 1500000);
        Mebel kursi = new Mebel("Kursi", 10, 500000);
    
    System.out.println("Penjualan Mebel: ");
    System.out.println(lemari.getinfo());
    System.out.println();
    System.out.println(meja.getinfo());
    System.out.println();
    System.out.println(kursi.getinfo());

    //menghitung total harga 
    int totalHarga = lemari.getTotalHarga() + meja.getTotalHarga() + kursi.getTotalHarga();

    System.out.println();
    System.out.println("Total uang yang diterima penjual jika semuanya terjual: Rp." + totalHarga);
    }


}
