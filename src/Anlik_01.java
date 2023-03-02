import java.util.Scanner;


public class Anlik_01 {
    public static void main(String[] args) {

/*
        Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
                input : JavaCAN'lara selam olsun
        output: maximumCounts occurring character is : a
                */

  //     Scanner input = new Scanner(System.in);
  //     System.out.print("Lütfen ters yazmak istediğiniz metni giriniz : ");
  //     String metin = input.nextLine();


        int sayi=1453;

        System.out.println(basamakTopla(sayi));
    }

    private static int basamakTopla(int x) {
        int toplam=0;

        while (x>0) {
         toplam+=x%10;
         x/=10;
        }
        return toplam;
    }
}