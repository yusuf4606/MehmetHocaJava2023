package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1)"StringBuilder" classi da string ureten bir classdir.
        2)"String" Class kullanarak string uretiriz, nicin "StringBuilder" class'i da var?
            String Class immutable (degistirilemez) String uretir,
            "StringBuilder" class mutable( degistirilebilir) String uretir
        3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir


         */
        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String i degistirdikten sonra ayni string assign ederseniz, java yine yeni bir container olusturur.
        //degismis degeri bu yeni container in icine koyar ve eski container i gosteren pointer yeni container a yonlendirir
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler

        String a = "Money";
        a = a + "More";


        //mutable
        //StringBuilder kullanarak string olusturmanin 1. yolu
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python
        sb1.append("!");
        System.out.println(sb1);//Python!

        //StringBuilder kullanarak string olusturmanin 2. yolu
        StringBuilder sb2= new StringBuilder();
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");

        //capacity() ve length arasindaki fark nedir?
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34

        //capacity() javanin size verdigi data depolama yer sayisidir
        // length ise size verilen zdata depolama yerinin kullanilan kismidir
        //Java baslangic olarak size capacity' i 16 olarak verir, eger siz verilen capacity asarsaniz
        // java yeni capactiy'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
        //16 ==> 16*2 +2            -     34 ==> 34*2+2

        //StringBuilder kullanarak string olusturmanin 3. yolu
        //default copacity i nasil degistirilebilriz?
        StringBuilder sb3= new StringBuilder(3);
        sb3.append("ali");

    }
}
