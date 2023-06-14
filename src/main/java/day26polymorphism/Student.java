package day26polymorphism;

public class Student {

    //Encapsulation ==> kapsulleme
    /*
    Encapsulation nedir? Data Hiding (veri saklama)
    Data nasil saklanir ?
    Access modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm.Boylece datayi saklarim
    Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    Nasil okuruz?
    getmethod olusturarak encapsulate edilmis datanin degerini okuyabiliriz
    1)get methodlar public olur
    2)get methodun return type i okudugu variable in return type i ile ayni olur
    3)get method bir boolean variable icin olusturulduysa ismi is ile baslar
    ornek=>isSuccessful()

     */
    private String stdId ="AC202306014";
    public  String stdName="Ali Can";
    public int age =13;
    private double notOrt=3.13;
    private boolean successful=false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessful() {
        return successful;
    }
}
