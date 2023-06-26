package day33exceptionsenumsiterator;

public class EnumRunner {
    public static void main(String[] args) {

        //Enum daki bir sabite nasil ulasabiliriz?
        Cities hatay = Cities.HATAY;
        System.out.println(hatay);//HATAY

        //Adana sabinitinn ismine ulusalim
        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);//Adana

        //Istanbul plaka koduna ulasalim
        int istanbulPlateCode = Cities.İSTANBUL.getPlateCode();
        System.out.println(istanbulPlateCode);//34

        //Ankaranin posta koduna ulasalim
        String ankaraPostalCode = Cities.ANKARA.getPostalCode();
        System.out.println(ankaraPostalCode);//06000


    }
}
