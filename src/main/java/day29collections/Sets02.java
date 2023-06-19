package day29collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Ornek : Ogrenci email adreslerini natural order a gore siralanmis olarak depolayiniz.

        long t1 = System.nanoTime();
        //1 Yol
        TreeSet<String> emails = new TreeSet<>();
        emails.add("z@gmail.com");
        emails.add("b@gmail.com");
        emails.add("k@gmail.com");
        emails.add("v@gmail.com");
        emails.add("h@gmail.com");
        emails.add("e@gmail.com");
        emails.add("a@gmail.com");
        emails.add("m@gmail.com");

        System.out.println(emails);//[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]

        long t2 = System.nanoTime();

        //2.yol Tavsiye edilir
        HashSet<String> emalisHs = new HashSet<>();
        emalisHs.add("z@gmail.com");
        emalisHs.add("b@gmail.com");
        emalisHs.add("k@gmail.com");
        emalisHs.add("v@gmail.com");
        emalisHs.add("h@gmail.com");
        emalisHs.add("e@gmail.com");
        emalisHs.add("a@gmail.com");
        emalisHs.add("m@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emalisHs);
        System.out.println(emailsHsTs);//[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]

        long t3 = System.nanoTime();
        System.out.println(t2-t1);//treeset
        System.out.println(t3-t2);//hashset

    }
}
