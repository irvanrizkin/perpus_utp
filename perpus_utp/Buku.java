package perpus_utp;

public class Buku{
    private String judul;
    private String sinopsis;
    private Penulis [] penulis;
    private int stok;

    /**
     * Constructor untuk mengatur judul, sinopsis, stok
     * 
     * @param judul -dalam {@code String}
     * @param sinopsis -dalam {@code String}
     * @param stok -dalam {@code int}
     */
    Buku(String judul, String sinopsis, int stok){
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.stok = stok;
    }

    /**
     * Method untuk mengatur penulis
     * 
     * @param penulis -dalam {@code Penulis[]}
     */
    public void setPenulis(Penulis [] penulis){
        this.penulis = penulis;
        for (int i = 0; i < penulis.length; i++) {
            penulis[i].addBukuDibuat(this); 
        }
    }

    /**
     * Accessor untuk judul
     * 
     * @return -judul dalam {@code String}
     */
    public String getJudul() {
        return judul;
    }

    /**
     * Accessor untuk sinopsis
     * 
     * @return -sinopsis dalam {@code String}
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * Accessor untuk array penulis
     * 
     * @return -penulis dalam {@code Penulis[]}
     */
    public Penulis[] getPenulis() {
        return penulis;
    }

    /**
     * Accessor untuk stok
     * 
     * @return -stok dalam {@code int}
     */
    public int getStok() {
        return stok;
    }

    /**
     * Accessor untuk status keberadaan buku
     * <p> {@code true} jika buku masih tersedia
     * <p> {@code false} jika buku habis
     * 
     * @return -mengembalikan nilai true/false
     */
    public boolean borrow(){
        if(stok <= 0){
            System.out.printf("Buku %s habis\n", judul);
            return false;
        } else {
            stok--;
            return true;
        }
    }

    /**
     * Output Informasi Buku mencakup judul, sinopsis, penulis, stok
     * 
     * 
     */
    public void printBookInfo(){
        System.out.println("Judul " + judul);
        System.out.println("Sinopsis " + sinopsis);
        System.out.println("Penulis");
        for (int i = 0; i < penulis.length; i++) {
            System.out.println(penulis[i].getNama());
        }
        System.out.println("Stok " + stok);
        System.out.println();
    }

    /**
     * Output Informasi penulis dengan method dari class Penulis
     * 
     * 
     */
    public void printPenulis(){
        System.out.println("Penulis Buku " + judul);
        for (int i = 0; i < penulis.length; i++) {
            penulis[i].printPenulis();
        }
        System.out.println();
    }
}