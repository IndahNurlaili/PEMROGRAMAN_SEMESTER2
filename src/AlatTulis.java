public class AlatTulis {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int harga;


    public AlatTulis(String nama, int stok, int hargaSatuan){
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
        AlatTulis bolpoint = new AlatTulis("Bolpoint", 10, 2000);
        AlatTulis pensil = new AlatTulis("Pensil", 10, 1000);
        AlatTulis penghapus = new AlatTulis("Penghapus", 10, 500);
    
    System.out.println("Penjualan AlatTulis: ");
    System.out.println(bolpoint.getinfo());
    System.out.println();
    System.out.println(pensil.getinfo());
    System.out.println();
    System.out.println(penghapus.getinfo());

    //menghitung total harga 
    int totalHarga = bolpoint.getTotalHarga() + pensil.getTotalHarga() + penghapus.getTotalHarga();

    System.out.println();
    System.out.println("Total uang yang diterima penjual jika semuanya terjual: Rp." + totalHarga);
    }


}
