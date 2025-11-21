package Tugas6;

public class MThread extends Thread{
    private boolean bombing = true;

    public void stopBombing() {
        bombing = false;
    }

    @Override
    public void run() {
        try {
            while(bombing){
                System.out.println("Pemain meledakkan negara");
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e){}
        
    }
}

