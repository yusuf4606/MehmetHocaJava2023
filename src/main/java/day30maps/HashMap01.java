package day30maps;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

        /*
        1)  Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2)  key kismi tekrarsiz, value kismi tekrarli olabilir
        3)  Map lerdeki her bir elemana Entry denir, tamamina ise EntrySet denir
        4)  Entry ler tekrarsiz oldugu icin EntrySet  denilir
        5)  Key ve value lar ayri ayri data typelarinda olabilirler
        6)  Map ler collection degildir, farkli bir yapidir
         */

        //Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}

        //get() methodu key ile calisir ve value kismini verir.
        int usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        //Butun keyleri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]


        //Butun value lari nasil alabiliriz?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[18000000, 400000000, 83000000, 83000000, 3000000]

        //Ornek 1: countryPopulation map indeki ulkelerin nufuslarinin ortalamasi kactir?
        Collection<Integer> value = countryPopulation.values();

        int sum = 0;

        for (Integer w : value) {
            sum = sum + w;
        }
        System.out.println(sum / value.size());//117400000

        //entrySet() mapteki entry leri kalip halinde alip bize Set in icine koyarak verir
        //Loop lar mapler ile kullanilamaz. bunun icin entryset methodunu kullaniriz.
        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);//[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]


        //Ornek 2: countryPopulation Mapindeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunz

        int toplam =0;
        for ( Map.Entry<String, Integer>   w :   entries  ) {
            toplam= toplam+ w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);//587000033

    }
}
