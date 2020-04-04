package perpus_utp;

public class Main {
    public static void main(String[] args) {
        // Register Penulis
        Penulis[] penulisArray = new Penulis[5];
        penulisArray[0] = new Penulis("A", 30, "Satu Hati");
        penulisArray[1] = new Penulis("B", 20, "Satu Jiwa");
        penulisArray[2] = new Penulis("C", 25, "Filkom");
        penulisArray[3] = new Penulis("D", 35, "Maju Bersama");
        penulisArray[4] = new Penulis("E", 40, "TI");

        // Register Buku
        Buku[] bukuArray = new Buku[10];
        Penulis[] penulisBukuA = { penulisArray[0], penulisArray[1] };
        bukuArray[0] = new Buku("A", "Andai Hidup", 3);
        bukuArray[0].setPenulis(penulisBukuA);

        Penulis[] penulisBukuDEF = { penulisArray[2] };
        bukuArray[1] = new Buku("D", "Desa", 3);
        bukuArray[1].setPenulis(penulisBukuDEF);
        bukuArray[2] = new Buku("E", "Enkapsulasi", 3);
        bukuArray[2].setPenulis(penulisBukuDEF);
        bukuArray[3] = new Buku("F", "Formasi", 3);
        bukuArray[3].setPenulis(penulisBukuDEF);

        Penulis[] penulisBukuI = { penulisArray[3] };
        bukuArray[4] = new Buku("I", "Implikasi", 1);
        bukuArray[4].setPenulis(penulisBukuI);

        Penulis[] penulisBukuJ = { penulisArray[4] };
        bukuArray[5] = new Buku("J", "Jagat", 1);
        bukuArray[5].setPenulis(penulisBukuJ);

        Penulis[] penulisBukuK = { penulisArray[0] };
        bukuArray[6] = new Buku("K", "Komplikasi", 2);
        bukuArray[6].setPenulis(penulisBukuK);

        Penulis[] penulisBukuLM = { penulisArray[1] };
        bukuArray[7] = new Buku("L", "Lokakarya", 2);
        bukuArray[7].setPenulis(penulisBukuLM);
        bukuArray[8] = new Buku("M", "Manifesto", 2);
        bukuArray[7].setPenulis(penulisBukuLM);

        Penulis[] penulisBukuO = { penulisArray[2], penulisArray[3] };
        bukuArray[9] = new Buku("O", "Orasi", 1);
        bukuArray[9].setPenulis(penulisBukuO);

        // Print buku penulis A,B,D
        penulisArray[0].printBuku();
        penulisArray[1].printBuku();
        penulisArray[3].printBuku();

        // Print penulis buku A D K
        bukuArray[0].printPenulis();
        bukuArray[1].printPenulis();
        bukuArray[6].printPenulis();

        // Peminjaman
        User[] user = new User[3];
        Buku [] user1Buku = {
            bukuArray[0],  // A
            bukuArray[3],  // F
            bukuArray[6]   // K
        };
        user[0] = new User("1", 1111);
        user[0].setBuku(user1Buku);

        user[1] = new User("2", 2222);
        Buku [] user2Buku = {
            bukuArray[1],  // D
            bukuArray[4],  // I
            bukuArray[6],  // K
            bukuArray[7],  // L
            bukuArray[9],  // O
            bukuArray[8],  // M
        };
        user[1].setBuku(user2Buku);

        user[2] = new User("3", 3333);
        Buku [] user3Buku = {
            bukuArray[1],  // D
            bukuArray[2],  // E
            bukuArray[3],  // F
            bukuArray[6]   // K
        };
        user[2].setBuku(user3Buku);

        // Info User Print
        System.out.println();
        for (int i = 0; i < user.length; i++) {
            user[i].printUser();
        }
    }
}