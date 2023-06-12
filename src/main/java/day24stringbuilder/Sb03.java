package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {
        /*
        1) StringBuffer java da string ureten bir diger classtir.
            StringBuffer java nin string uretmek icin olusturdugu ilk classtir
        2) StringBuffer, StringBuilder'a cok benzer, yani ikisi de "mutable" string uretir.
        3) StringBuffer "multi-thread"dir ama StringBuilder "multi-thread" degildir.
        4) StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hisli calisir
        5) "multi-thread" yapilirken yapilan islerin siralamasi  onem arzeder,
         yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilr
         StringBuffer multi-thread oldugu icin ayni zamanda "synchronized"dir.

        3 tane String olusturan Class ogrendik;
            1)immutable string lazimsa; String Class
            2)mutable string lazimsa; StringBuilder veya  StringBuffer
                        a)StringBuilderi "multi-thread" gerekmezse kullaniriz
                        b)StringBufferi "multi-thread" gerekirse kullaniriz         */

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java

        System.out.println(sbf.capacity());


    }
}
