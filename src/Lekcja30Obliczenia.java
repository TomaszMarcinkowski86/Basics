public class Lekcja30Obliczenia extends Thread{


    // jednym ze sposobów jest rozszerzenie klasy Thread
    //i tu musimy nadpisać metodę run

    @Override
    public void run() {
        for(int i=0; i<=100; i++){
            System.out.println(i+ " ID: "+ Thread.currentThread().getId());
        }
    }
}
