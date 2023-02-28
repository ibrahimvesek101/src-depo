import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anlik {
    public static void main(String[] args) {


        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyenEleman=3;

        istenmeyenSil(arr,istenmeyenEleman);
    }

    private static void istenmeyenSil(int arr[], int istenmeyenEleman) {
        List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=istenmeyenEleman){
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}