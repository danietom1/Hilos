package model;

public class Proceso2 extends Thread{

    String Nombre;

    @Override
    public void run() {
        for (int i = 0; i<=5;i++){
            System.out.println("Hilo "+Nombre+" iteracion "+i);
        }
        //super.run();
    }

    public Proceso2(String nombre) {
        Nombre = nombre;
    }
}
