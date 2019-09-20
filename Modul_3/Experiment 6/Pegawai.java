public class Pegawai {
    String nama;
    int nip;
    double gaji;
    public void setPegawai(String nama, int nip, double gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
        System.out.println("Nama : " + nama + "\n" +
                            "NIP : " + nip + "\n" +
                            "Gaji : " + gaji + "\n");
    }
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();
        pegawai1.setPegawai("Ganno",71199,3000000);
        pegawai2.setPegawai("Ganang",280390,3500000);
        pegawai3.setPegawai("Galan",151091,4000000);
        pegawai4.setPegawai("Sri",51064,4500000);
        pegawai5.setPegawai("Agus",150860,5000000);
    }
}
