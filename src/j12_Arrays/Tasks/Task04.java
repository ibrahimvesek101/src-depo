package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("Agam kaç elemanlı array istirsen : ");
        int arrayBoyut = input.nextInt();
        int arr[] = new int[arrayBoyut];//girilen eleman kadar boş array create edildi

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.print(i + ". index array elemanınını giriniz : ");
            arr[i] = input.nextInt();
        }
        System.out.println("agam ahan da arrayin : " + Arrays.toString(arr));

        int arrToplam = 0;//arr elemanların toplanacagı boş kutu tanımlandı
        for (int i = 0; i < arrayBoyut; i++) {//bu loop arr elemanlrı toplayıp arrToplama ekler
            arrToplam += arr[i];

        }
        System.out.println("arr eleman ortalaması : " + (arrToplam / arrayBoyut));

        int counter = 0;//ortalamayu gecen arr elemananlarını sayan sayaç
        for (int i = 0; i < arrayBoyut; i++) {//bu loop arr elemanlarını arrOrtalamadan buykm olanlarını  saydırır
            if (arr[i] > arrToplam / arrayBoyut) {
                counter++;
            }
        }
        System.out.println("arr nin ortalamayı geçen eleman sayısı : " + counter);
    }


























}
