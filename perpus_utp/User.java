package perpus_utp;

public class User {
    private String nama;
    private int nomorPelanggan;
    private Buku [] listBuku = new Buku[99];
    private int banyakBuku = 0;
    private double biaya = 0;

    /**
     * Constructor untuk mengatur nama dan nomor pelanggan
     * 
     * @param nama -dalam {@code String}
     * @param nomorPelanggan -dalam {@code int}
     */
    User(String nama, int nomorPelanggan) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    /**
     * Mutator buku yang juga memanggil {@code addBuku} dari class ini
     * 
     * @param buku -dalam {@code buku[]}
     */
    public void setBuku(Buku[] buku){
        for (int i = 0; i < buku.length; i++) {
            addBuku(buku[i]);
        }
    }

    /**
     * Method untuk menambah buku
     * 
     * @param buku -dalam {@code Buku}
     */
    private void addBuku(Buku buku){
        if (buku.borrow()) {
            listBuku[banyakBuku] = buku;
            banyakBuku++;
            calculateBiaya(); 
        }
    }

    /**
     * Method untuk menghitung biaya sewa (1000) dengan banyakBuku dalam class
     * <p> Jika melebihi 3 akan ditambah 10%
     * 
     */
    private void calculateBiaya(){
        if(banyakBuku > 3){
            biaya += (100+1000);
        } else {
            biaya += 1000;
        }
    }


    /**
     * Accessor untuk nama user
     * 
     * @return -nama dalam {@code String}
     */
    public String getNama() {
        return nama;
    }

    /**
     * Accessor untuk nomor pelanggan
     * 
     * @return -nomorPelanggan dalam {@code int}
     */
    public int getNomorPelanggan() {
        return nomorPelanggan;
    }

    /**
     * Accessor untuk biaya
     * 
     * @return -biaya dalam {@code double}
     */
    public double getBiaya() {
        return biaya;
    }

    /**
     * Accessor untuk array list buku
     * 
     * @return -listBuku dalam {@code Buku[]}
     */
    public Buku[] getListBuku() {
        return listBuku;
    }

     /**
     * Output Informasi Buku mencakup nama user, nomor pelanggan, list buku, biaya
     * 
     * 
     */
    public void printUser(){
        System.out.println("Nama " + nama);
        System.out.println("Nomor Pelanggan " + nomorPelanggan);
        System.out.println("List Buku");
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] != null) {
                System.out.println(listBuku[i].getJudul());
            }
        }
        System.out.println("Biaya " + biaya);
        System.out.println();
    }
}