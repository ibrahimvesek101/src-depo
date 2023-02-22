package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' ve 'A' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String> isimList=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aOlmayanİsimList = new ArrayList<>();
        for (int i = 0; i < isimList.size(); i++) {
            if(!isimList.get(i).toLowerCase().contains("a")){
                aOlmayanİsimList.add(isimList.get(i));
            }
        }
        System.out.println(aOlmayanİsimList);

        isimList.clear(); //isimleri temizle
        isimList.addAll(aOlmayanİsimList);

        System.out.println(isimList);
    }
}
