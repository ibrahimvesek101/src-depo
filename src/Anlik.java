import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anlik {
    public static void main(String[] args) {

/*
        Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
                input : JavaCAN'lara selam olsun
        output: maximumCounts occurring character is : a
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ters yazmak istediğiniz metni giriniz : ");
        String metin = input.nextLine();

        tersineCevir(metin);


    }

    private static void tersineCevir(String str) {
        String tersStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            tersStr += str.charAt(i);

        }
        System.out.println(tersStr);
    }
}