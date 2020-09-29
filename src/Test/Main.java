package Test;

import Gestor.FabricaVehiculos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        accionarFlujoGeneral();
    }

    public static void accionarFlujoGeneral(){
        String mensajeBienvenida = generarMensajeBienvenida();
        System.out.println(mensajeBienvenida);

        String panelComandos = generarMenu();
        System.out.println(panelComandos);
        boolean continuarFlujo = true;
        do {
            int seleccionUsuario = obtenerOpcionMenu();
            if (seleccionUsuario == 4) {
                System.out.println(panelComandos);
            }else if(seleccionUsuario == 5){
                continuarFlujo = false;
            }else {
                procesarOpcionMenu(seleccionUsuario);
                System.out.println(panelComandos);
            }

        }while(continuarFlujo);
    }

    public static int obtenerOpcionMenu(){
        int seleccionUsuario = -1;
        boolean seleccionInvalida = false;
        do{
            System.out.print(">>> ");
            seleccionUsuario = Integer.parseInt(leer.next());
            if(seleccionUsuario < 1 || seleccionUsuario > 5) {
                seleccionInvalida = true;
                System.out.println("La opción no es correcta, el valor es de 1 a 5 XD");
            }
        }while(seleccionInvalida);
        return seleccionUsuario;
    }
    public static String generarMensajeBienvenida(){
        String mensaje = "";

        mensaje += "Hola, esto es un ejemplo del patrón Abstract Factory,\n";
        mensaje += "así con un conjunto de naves aleatorias en un videojuego.\n";
        mensaje += "Los Factorys Abstractos permiten generar objetos aleatorios.\n";
        mensaje += "La idea de este programa es que usted vea en tiempo real lo que\n";
        mensaje += "se puede hacer con este tipo de Patrón.\n";
        mensaje += "\n";
        mensaje += "Del siguiente menú ingrese el número de la opción que gustaría ejecutar...\n";

        return mensaje;
    }
    public static String generarMenu(){
        String menu = "";
        menu += "********************************************\n";
        menu += "1. Generar Taxis.\n";
        menu += "2. Generar Microbuses.\n";
        menu += "3. Generar Buses.\n";
        menu += "4. Imprimir Este Panel de Ayuda.\n";
        menu += "5. Salir.\n";
        menu += "********************************************\n";
        return menu;
    }

    public static void procesarOpcionMenu(int opcion){
        if(opcion >= 1 && opcion <= 3){
            System.out.println("Súper, ahora necesito saber cuántos vehículos le gustaría generar:");
            System.out.println("Recomiendo 300 vehículos para más acción");
            System.out.print(">>> ");
            int seleccionUsuario = Integer.parseInt(leer.next());
            FabricaVehiculos fabrica = new FabricaVehiculos();
            for(int x = 0; x < seleccionUsuario; x++) {
                boolean vehiculoGenerado = fabrica.generarFabricaVehiculo(opcion);
                if (vehiculoGenerado) {
                    System.out.println("Vehículo aleatorio " + (x + 1) + " generado...");
                }
            }
            System.out.println("Listo! Ahora presione la tecla Y para imprimir los vehículos generados");
            leer.next();
            String informacionVehiculos = fabrica.obtenerVehiculos();
            System.out.println(informacionVehiculos);
        }

    }
}
