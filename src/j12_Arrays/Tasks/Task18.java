package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int arr[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        int yeniArr[] = new int[arr.length];

        for (int kat = 0; kat < arr.length; kat++) {//kat elamanlarına ulaşan tekrar
            for (int daire = 0; daire < arr[kat].length; daire++) {//dire elamanlarına ulaşan tekrar

                yeniArr[kat] += arr[kat][daire];//herkatın daireler toplamı yeniArr katına atandı


            }
        }
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));// [6, 11, -7]
    }
}