package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.print("Agam kaç elemanlı array istirsen : ");
        int arrayBoyut = input.nextInt();
        int arr[] = new int[arrayBoyut];//girilen eleman kadar boş array create edildi

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.print(i + ". index array elemanınını giriniz : ");
            arr[i] = input.nextInt();
        }
        System.out.println("agam ahan da arrayin : " + Arrays.toString(arr));

        int toplam = 0;//arr elemanları toplnacagı boş kutu tanımlandı
        for (int i = 0; i < arrayBoyut; i++) {
            toplam += arr[i];
        }
        System.out.println("toplam = " + toplam);

    }
}
