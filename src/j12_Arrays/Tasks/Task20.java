package j12_Arrays.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};

        int istenmeyenSayi = 3;

        istenmeyenSil(arr, istenmeyenSayi);
    }

    private static void istenmeyenSil(int[] arr, int istenmeyenSayi) {

        List<Integer> yeniList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != istenmeyenSayi) {

                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}
