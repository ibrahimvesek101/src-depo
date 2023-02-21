package j12_Arrays.Tasks;

public class Task15 {
    public static void main(String[] args) {
        //task-> arr  tum elemalarının çarpımını print eden code create edinz
        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int crpm=1; // çarpım için boş kutu.
        for (int kat = 0; kat <arr.length ; kat++) {
            for (int daire = 0; daire <arr[kat].length ; daire++) {
                crpm*=arr[kat][daire];
            }
        }
        System.out.println("crpm = " + crpm);
    }
}
