public class Main {
    public static void main(String[] args) {
 
        Buku buku1 = new Buku("B001", "Pemrograman Java");
        Buku buku2 = new Buku("B002", "Pemrograman C++");
        BukuLuar buku3 = new BukuLuar("B003", "Harry Potter");
 
        Petugas petugas1 = new Petugas("Utomo", "P001");
        Peminjam peminjam1 = new Mahasiswa();
        Peminjam peminjam2 = new Mahasiswa();
        peminjam1.setNamaPeminjam("Nova");
        peminjam1.setKodePeminjam("M001");
        peminjam2.setNamaPeminjam("Alvin");
        peminjam2.setKodePeminjam("M002");
        
        peminjam1.doLogin();
        peminjam2.doLogin();
        
        try{
        Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku1);
        Peminjaman peminjaman2 = new Peminjaman(peminjam2, petugas1, buku3);
 
        System.out.println("Peminjaman: " + peminjaman1.getPeminjam().getNamaPeminjam());
        System.out.println("Petugas: " + peminjaman1.getPetugas().getNamaPetugas());
        System.out.println("Buku: " + peminjaman1.getBuku().getNamaBuku());
        System.out.println("Nama Buku: " + peminjaman1.getBuku().getNamaBuku() );
        Denda denda1 = new Denda(peminjaman1, 7);
        System.out.println("Tagihan denda: " + denda1.getTagihan());

        System.out.println("===================================>");

        System.out.println("Peminjaman: " + peminjaman2.getPeminjam().getNamaPeminjam());
        System.out.println("Petugas: " + peminjaman2.getPetugas().getNamaPetugas());
        System.out.println("Buku: " + peminjaman2.getBuku().getNamaBuku());
        System.out.println("Nama Buku: " + peminjaman2.getBuku().getNamaBuku() );
        Denda denda2 = new Denda(peminjaman2, 7);
        System.out.println("Tagihan denda: " + denda2.getTagihan());
        
        System.out.println("=== Denda dihapuskan ! ===");

        peminjam2.addAntiDenda();

        System.out.println("Tagihan denda: " + denda2.getTagihan());

        System.out.println("=== Denda ditambahkan ! ===");

        peminjam2.removeAntiDenda();

        System.out.println("Tagihan denda: " + denda2.getTagihan());

    } catch (Exception e) {
        System.out.println("terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Pemograman Telah Selesai");
 }
 
 }
}