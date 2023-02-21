package j12_Arrays.Tasks;

public class Task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...


        int arr[][] = {
                {3, 5},//0. kat
                {2, 4, 1},//1. kat
                {6, 1, 2, 2},//2. kat
        };
        int crpm=1; // çarpım için boş kutu.

        for (int kat = 0; kat <arr.length ; kat++) {

            crpm*=arr[kat][arr[kat].length-1];
        }
        System.out.println("crpm = " + crpm);  // son elemanlar.

    }
          }