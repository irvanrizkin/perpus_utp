package perpus_utp;

public class Penulis {
    private String nama;
    private int umur;
    private String kataMotivasi;
    private Buku[] bukuDibuat = new Buku[99];
    private int jumlahBuku = 0;

    /**
     * Constructor untuk mengatur nama, umur, kata motivasi
     * 
     * @param nama -dalam {@code String}
     * @param umur -dalam {@code int}
     * @param kataMotivasi -dalam {@code String}
     */
    Penulis(String nama, int umur, String kataMotivasi) {
        this.nama = nama;
        this.umur = umur;
        this.kataMotivasi = kataMotivasi;
    }

    /**
     * Method untuk menambah buku menurut penulis
     * 
     * @param buku -dalam {@code Buku}
     */
    public void addBukuDibuat(Buku buku){
        bukuDibuat[jumlahBuku] = buku;
        jumlahBuku++;
    }

    
    /**
     * Accessor untuk nama
     * 
     * @return -nama dalam {@code String}
     */
    public String getNama() {
        return nama;
    }

    /**
     * Accessor untuk umur
     * 
     * @return -umur dalam {@code umur}
     */
    public int getUmur() {
        return umur;
    }

    /**
     * Accessor untuk kata motivasi
     * 
     * @return -kataMotivasi dalam {@code String}
     */
    public String getKataMotivasi() {
        return kataMotivasi;
    }

    /**
     * Output Informasi Penulis mencakup nama penulis, umur, kata motivasi
     * 
     * 
     */
    public void printPenulis(){
        System.out.println("Nama " + nama);
        System.out.println("Umur " + umur);
        System.out.println("Kata motivasi " + kataMotivasi);
        System.out.println("-");
    }

    /**
     * Output Informasi Penulis mencakup daftar buku yang dibuat penulis
     * 
     * 
     */
    public void printBuku(){
        System.out.println("Buku oleh " + nama);
        for (int i = 0; i < bukuDibuat.length; i++) {
            if (bukuDibuat[i] != null) {
                bukuDibuat[i].printBookInfo();
            }
        }
    }


}