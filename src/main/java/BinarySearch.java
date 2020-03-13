import java.util.*;

public class BinarySearch {


    //    static LinkedList <Double> list;
    Random r = new Random();
    List<Integer> lista = new ArrayList<Integer>();
    int[] array = new int[20];


    void randomArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(21);
            array.toString();
        }
    }


    void randomList(){
        for (int i = 0; i < 21; i++){
            lista.add(r.nextInt(21));
        }
    }






    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.randomArray();
        System.out.println(Arrays.toString(binarySearch.array));

    }
}
