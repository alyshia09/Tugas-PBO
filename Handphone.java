public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan  " + pesan + "dengan nomor tujuab" + nomorTujuan);
    }

    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan) {
       System.out.println("Memanggil nomor " + nomorTujuan1);
       System.out.println("Memanggil nomor " + nomorTujuan2);
       System.out.println("Mengirim pesan " + pesan);
    }

    public void kirimPesan(String[] daftarnomor, String pesan) {
        System.out.println("Mengirimi pesan " + pesan + " dengan daftar nomor" + daftarnomor); 
    }
}