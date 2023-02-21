package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.print("Agam kaç elemanlı array istirsen : ");
        int arrayBoyut = input.nextInt();
        int arr[] = new int[arrayBoyut];//girilen eleman kadar boş array create edildi

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.print(i + ". index array elemanınını giriniz : ");
            arr[i] = input.nextInt();
        }
        System.out.println("agam ahan da arrayin : " + Arrays.toString(arr));


        Arrays.sort(arr);//array elemanları k->b sortingen  -> [1,2,21,27,44]

        for (int i = arr.length-1; i >= 0; i--) {

            System.out.print(arr[i]+" ");//58 44 38 23 11
        }



    }
}
