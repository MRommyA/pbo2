package Tugas6;

import java.util.ArrayList;

public class ArrayObject {
    public void output(){
        ArrayList<Object> objek = new ArrayList<>();
        objek.add(19);
        objek.add(0.2);
        objek.add('C');
        objek.add("Java");
        objek.add(true);
        System.out.println("\n" + objek);
    }
}
