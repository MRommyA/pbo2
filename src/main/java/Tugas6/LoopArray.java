package Tugas6;

public class LoopArray {
    public void output(){
        int[] age = {12, 4, 5, 2, 6};
        System.out.print("\nLooping pertama: ");
        for(int i = 0; i < age.length; i++){
            System.out.print(age[i] + " ");
        }
        System.out.print("\nLooping kedua: ");
        for(int x: age){
            System.out.print(x + " ");
        }
    }
    
}
