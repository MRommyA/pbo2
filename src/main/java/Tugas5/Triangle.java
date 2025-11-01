package Tugas5;

public class Triangle {
    public void output(){
        System.out.println();
        for(int i = 0; i < 5; i++){
            for(int j = 4; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < (i*2 + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 2; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < (i*2 + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 3; k >= (i*2 + 1); k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
