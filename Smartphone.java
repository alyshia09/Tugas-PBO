public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan + " dengan pesan " + pesan);
    }

    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirim email ke " + emailTujuan + " dengan subjek " + subjek + "dengan pesan " + pesan);
    }

    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}