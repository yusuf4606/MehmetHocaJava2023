package day33exceptionsenumsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        /*
        1) Iterator' lar looplarin yaptigi ayni isi yapar
        2) Iterator'larda sonsus loop olusma ihtimali yoktur
        3) Iterator'lar ile loop'lar arasinda performans farki yoktur.
        4) Iterator'lar bir collection'dan eleman silme ve bir collection daki elemani degistirme konusunda daha basarilidir
        5) Iki tip iterator vardir;
            a) Iterator : Bu sadece eleman silmede kullanilir
                          Eleman eklemek veya elemani degistirmek mumkun degildir

            b) ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.

            Note: "Iterator" sadece soldan saga (ilk elemandan son elemana) calisir
                   "ListIterator" ise iki yonlu calisabilir
         */

        List<String> myList = new ArrayList<>();
        myList.add("Emin");
        myList.add("Bugra");
        myList.add("Hasan");
        myList.add("Benna");
        myList.add("Ali");
        System.out.println(myList);//[Emin, Bugra, Hasan, Benna, Ali]


        //itarator kullanarak specific bir eleman nasil silinir?
        Iterator<String> myItr = myList.iterator();//[  Emin,     Bugra,   Hasan,     Benna,   Ali  ]

        while (myItr.hasNext()) {//hasNext() pointer a senden sonra eleman var mi? diye sorar.

            //Elemean varsa true yoksa false return eder
            String el = myItr.next();   //next() pointer i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder

            if (el.equals("Ali")) {
                myItr.remove(); //next() methodunun return ettigi elemani siler
            }

        }
        System.out.println(myList);//[]

        //ListIterator kullanimi
        List<String> yourList = new ArrayList<>();
        yourList.add("Hasan");
        yourList.add("Benna");
        yourList.add("Ali");
        System.out.println(yourList);//[Hasan, Benna, Ali]

        ListIterator<String> yourListItr = yourList.listIterator();//[  Hasan,     Benna,    Ali ]

        while (yourListItr.hasNext()) {
            String el = yourListItr.next();
            yourListItr.set(el + "*");//set () methodu listi update etmeye yarar
        }
        System.out.println(yourList);


        //previous method kullanimi
        List<String> list3 = new ArrayList<>();
        list3.add("Hasan");
        list3.add("Benna");
        list3.add("Ali");
        System.out.println(list3);//[ Hasan, Benna, Ali]

        ListIterator<String> listItr = list3.listIterator();//[ Hasan, Benna, Ali]

        //pointer i en saga almak icin
        while (listItr.hasNext()){
            listItr.next();
        }
        //pointeri yukaridaki kod ile ensonda biraktigimiz icin
        // elemanlari en sondan basa dogru yazdirabiliriz


        while (listItr.hasPrevious()){

           String el= listItr.previous();







            System.out.println(el+ "<===");


        }






    }
}
