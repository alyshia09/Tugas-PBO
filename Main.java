public class Main {

    public static void main(String[] args) {
        //membuat array atau list dri handphone
        Handphone[] daftarHandphone = new Handphone[2];

        //mengisi array dgn objek Smartphone dan Featurephone
        daftarHandphone[0] = new Smartphone("Samsung", "Galaxy S21");
        daftarHandphone[1] = new Featurephone("Nokia", "3310");

        //menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).aksesInternet();
            } else if (hp instanceof Featurephone) {
                ((Featurephone) hp).mainGameSnake();
            }
        }
    }
}