package model;

public class Proceso1 extends Thread {

    String Nombre;

    @Override
    public void run() {
        for (int i = 0; i<=5;i++){
            System.out.println("Hilo "+Nombre+" iteracion "+i);
        }
        //super.run();
    }

    public Proceso1(String nombre) {
        Nombre = nombre;
    }
}
