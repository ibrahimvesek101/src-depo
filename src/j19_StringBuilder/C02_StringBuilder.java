package j19_StringBuilder;
public class C02_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder create etme...

        //1. yol
        StringBuilder sb1 = new StringBuilder();//default 16 capacity boş sb
        System.out.println("sb1 = " + sb1);//
        System.out.println("sb1.length() = " + sb1.length());//0
        System.out.println("sb1.capacity() = " + sb1.capacity());// 16

        sb1.append("Murat");//sb1' e Murat value eklendi
        System.out.println("sb1 = " + sb1);//Murat
        System.out.println("sb1.capacity() = " + sb1.capacity());// 16
        System.out.println("sb1.length() = " + sb1.length());// 5

        sb1.append(" Qa tester team lead");

        System.out.println("sb1 = " + sb1);
        System.out.println("sb1. capacity() = " + sb1.capacity());// 34

        sb1.append(" çoooğğğ  zengin olasan").append(1453).append(true);
        System.out.println("sb1 = " + sb1);// Murat Qa tester team lead çoooğğğ  zengin olasan1453true

        System.out.println("sb1.capacity() = " + sb1.capacity());// 70->capacity aşımında yeniCapacity=eskiCapacity*2+2 olarak atanır

        // 2. yol
        StringBuilder sb2 = new StringBuilder("Aydın beye hızlıcana offer");//initial ilk değer atanmış sb2
        System.out.println("sb2 = " + sb2);//Aydın beye hızlıcana offer
        System.out.println("sb2.length() = " + sb2.length()); // 26
        System.out.println("sb2.capacity() = " + sb2.capacity());// 42
        /*
         inital edilen sb capacity=16+ ilk değer length  olarak  atanır
         */

        //trimToSize()-> capacity de length fazlası character siler.
        sb2.trimToSize();
        System.out.println("trimToSize sonrası sb2.capacity() = " + sb2.capacity());// 26

        //3. yol
        StringBuilder sb3=new StringBuilder(17);//initial edilmemiş ama capacity değeri atanmış sb.
        System.out.println("sb3 = " + sb3);//
        System.out.println("sb3.length() = " + sb3.length());// 0
        System.out.println("sb3.capacity() = " + sb3.capacity()); // 17
        sb3.append("Taha Bey'e senior offer çekkk ...");
        System.out.println("sb3.capacity() = " + sb3.capacity());// 17*2+2=36

        // Sb2deki istenen index characteri alma..
        System.out.println("sb3.charAt(16) = " + sb3.charAt(16));//r
        StringBuilder sb4=new StringBuilder("Murat İnci");//initial
        StringBuilder sb5=new StringBuilder("Murat İnci");//initial

        System.out.println("sb4.equals(sb5 ) = " + sb4.equals(sb5));//

        System.out.println(sb4 == sb5);//false

    }
}
