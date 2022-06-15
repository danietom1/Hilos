import model.Proceso1;
import model.Proceso2;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException

    {
        String Nombre1;
        String Nombre2;

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Ingrese el nombre del primer hilo");
        Nombre1 = reader.readLine();
        System.out.println("Ingrese el nombre del segundo hilo");
        Nombre2 = reader.readLine();

        Proceso1 hilo1 = new Proceso1(Nombre1);
        Proceso2 hilo2 = new Proceso2(Nombre2);

        hilo1.start();
        hilo2.start();

    }
}