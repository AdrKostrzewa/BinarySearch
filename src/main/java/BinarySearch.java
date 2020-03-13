import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BinarySearch {

    static int [] array ;
//    static LinkedList <Double> list;



//



    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 21; i++){
            lista.add(r.nextInt(21));
        }
        System.out.println(lista);
    }
}
