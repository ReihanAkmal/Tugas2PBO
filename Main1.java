import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Buku> Buku = new ArrayList<Buku>();

        Buku.add(new Buku("1909","Kerja Mapan","2011","Akmal",750000,1));
        Buku.add(new Buku("0901","Hujan","2016","Aisyah",1500000,2));
        Buku.add(new Buku("2001","Pohon Beringin","2009","Aca",120000,3));

        Buku.get(0).setjudulbuku("Kerja Mapan");
        Buku.get(0).settahunterbit("2011");
        Buku.get(0).setPrice(75000);
        Buku.get(0).setRating(5);

        for (Buku buku:Buku){
            buku.searchisbn("1909");
        }

        Buku.remove(0);

        for (Buku buku:Buku){
            System.out.println(buku);

        }
    }
}

