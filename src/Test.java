import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        MyArrayList ma = new MyArrayList(20);
        ma.add(1);
        ma.add(2);
        System.out.println();
        for(int i =0;i <ma.length();i++){
            Object obj = ma.get(i);
            System.out.println(obj);
        }

    }
}
