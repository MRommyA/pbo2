package Tugas6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Syntaks syntaks = new Syntaks();
        syntaks.output();
        
        Replace mobil = new Replace();
        mobil.output();
        
        DataArray da = new DataArray();
        da.inout();

        Kelulusan kelulusan = new Kelulusan();
        kelulusan.inout();

        Matriks matrix = new Matriks();
        matrix.inout();
        
        Exception exception = new Exception();
        exception.inout();
        
        System.out.print("\nNo. 9: ");
        LoopArray loop = new LoopArray();
        loop.output();
        
        System.out.print("\n\nNo. 10: ");
        ArrayObject objek = new ArrayObject();
        objek.output();

        MThread bomb = new MThread();
        bomb.start();
        System.out.println("\nTekan ENTER untuk menghentikan game...");
        input.nextLine();
        bomb.stopBombing();
        System.out.println("Game berhenti.");
        
        SlaveTeleport teleport = new SlaveTeleport();
        System.out.println("\nTekan ENTER untuk menghentikan game...");
        teleport.start(); 
        SlaveKamikaze boom = new SlaveKamikaze();
        boom.start();
        
        input.nextLine();
        teleport.stopTeleport();
        boom.stopKamikaze();
        
        
        
    }
}

class SlaveTeleport extends Thread {

    private boolean teleport = true;

    public void stopTeleport() {
        teleport = false;
    }

    @Override
    public void run() {
        try {
            long i = 1;
            while (teleport) {
                Thread.sleep(5000);
                System.out.println("Slave" + i + " diteleport di tengah negara ke-" + i);
                i++;
            }
        } catch (InterruptedException e) {}

        System.out.println("Slave telah diteleportkan.");
    }
}

class SlaveKamikaze extends Thread {

    private boolean kamikaze = true;

    public void stopKamikaze() {
        kamikaze = false;
    }

    @Override
    public void run() {
        try {
            long i = 1;
            while (kamikaze) {
                Thread.sleep(6000);
                System.out.println("Slave meledak");
                System.out.println("Negara " + i + " hancur");
                i++;
            }
        } catch (InterruptedException e) {}

        System.out.println("Mission Accomplish.");
        System.out.println("Game berhenti.");
        
    }
}
