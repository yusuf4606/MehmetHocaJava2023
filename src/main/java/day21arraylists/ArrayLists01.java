package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
        1) Ayni data type indaki coklu datalari depolamak icin Array kullaniriz
        2) Arraylerin negatif bir yonu var, icine koyacağınız eleman sayisini en basta belirlemek zorundasiniz
        3) Arrayler eleman sayisinda esnek degildirler, bu yuzden java Arraylist adli yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnekdir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
        1000 eleman koyarsaniz eleman sayisni 1000 olarak ayarlar
        4) Arraylist yerine sadece List de diyebilirsiniz
        5) Java Arraylistleri olusturduktan sonra Array leri iptal etmedi cunku;
            a)Array ler super hizlidir.
            b)Array ler memory de cok az yer kaplar.
            c)Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir
        6) Arrayler pirimitive data type lari ve "reference" lari depolayabilir.
           Ama ArrayList ler non-primitive data type lari depolar, bu nedenle Arraylistler Arraylerden daha fazla yer kaplarlar
         */

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //Arraylist console a nasil yazdirilir?
        System.out.println(ages);

        //Arraylist lere eleman nasil eklenir?
        //Arraylist lere eleman eklemek icin add()methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada "list"e ekler (insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        //Bir list e coklu eleman eklemek icin o elemanlari oncelikle bir listin icine koymalisiniz
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2, newAges);
        System.out.println(ages);

        //ArrayList te eleman sayisi nasil bulunur?
        //size() methodu bir list teki eleman sayisini verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //ArrayList te specific bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //Arraylist te specific bir elemani nasil degisitirebilir?
        ages.set(6,111);
        ages.set(4,313);
        System.out.println(ages);

        //Bir listte tum elemanlari nasil silebiliriz?
//        ages.clear();
//        System.out.println(ages);

        //Arraylistte specific bir elemanin var olup olmadigni nasil anlariz?
        boolean r =ages.contains(313);
        System.out.println(r);

        //Bir Arraylist'in bos olup olmadigini nasil kontrol ederiz?
        //isEmpty() methodu Arraylist bos ise true bos degilse false return eder.
        boolean r2= ages.isEmpty();
        System.out.println(r2);

        //Ornek 1: Size verilen bir listin bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> names = new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Rıdvan");
        names.add("Enes");

        //1 . way
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        names.clear();

        //2. yol Recommended

        if(names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }


        /*
        Bir method u ogrenirken asagidaki 3 seyi ogrenin
        1) o method ne is yapar?
        2) o method nasil kullanilir?
        3) o method size neyi verir?
         */

    }
}
