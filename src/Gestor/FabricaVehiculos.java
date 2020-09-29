package Gestor;

import FabricaAbstracta.FactoryVehiculos;
import FabricaConcreta.FactoryBus;
import FabricaConcreta.FactoryMicrobus;
import FabricaConcreta.FactoryTaxi;
import ProductoAbstracto.Vehiculo;

import java.util.ArrayList;

public class FabricaVehiculos {

    private ArrayList<Vehiculo> vehiculos = null;

    public FabricaVehiculos(){
        vehiculos = new ArrayList<>();
    }

    public boolean generarFabricaVehiculo(int tipoFabrica){

        FactoryVehiculos factorySeleccionado;
        switch(tipoFabrica){
            case 1:
                factorySeleccionado = new FactoryTaxi();
                break;
            case 2:
                factorySeleccionado = new FactoryBus();
                break;
            case 3:
                factorySeleccionado = new FactoryMicrobus();
                break;
            default:
                throw new IllegalArgumentException("El valor ingresado para el tipo de fábrica es incorrecto.");
        }
        Vehiculo vehiculoGenerado = generarVehiculo(factorySeleccionado);
        this.agregarVehiculo(vehiculoGenerado);
        if(vehiculoGenerado != null) return true;
        else{
            throw new NullPointerException("No se pudo generar un vehículo de tipo null");
        }
    }

    private Vehiculo generarVehiculo(FactoryVehiculos factoryVehiculo){
        Vehiculo vehiculoPorGenerar = factoryVehiculo.crearVehiculo();
        return vehiculoPorGenerar;
    }

    private boolean agregarVehiculo(Vehiculo vehiculoPorAgregar){
        boolean vehiculoAgregado = this.vehiculos.add(vehiculoPorAgregar);
        if(vehiculoAgregado) return true;
        return false;
    }

    public String obtenerVehiculos(){
        StringBuilder str = new StringBuilder();
        for(Vehiculo e : vehiculos){
            str.append(e.obtenerInformacionVehiculo()).append("\n");
        }
        return str.toString();
    }

}
