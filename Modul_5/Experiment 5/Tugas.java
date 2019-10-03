public class Tugas {
    String nama;
    String tanggalLahir;

    public Tugas() {
        nama = "Ganno Tribuana Kurniaji";
        tanggalLahir = "7 November 1999";
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println();
    }

    public Tugas(String nama, String tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println();
    }
}
