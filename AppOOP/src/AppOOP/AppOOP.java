package AppOOP;

import java.util.ArrayList;
import java.util.List;

public class AppOOP {

    public static void main(String[] args) {

        List<Artysta> artysci=new ArrayList<Artysta>();
        artysci.add(new Piosenkarz("Phil","Collins","In the air tonight"));
        artysci.add(new Aktor("Al","Pacino","Ojciec chrzestny"));
        artysci.add(new Piosenkarz("Freddy","Mercury","The Show Must Go On"));
        artysci.add(new Pisarka("J.K.","Rowling","Harry Potter"));

    }
}
