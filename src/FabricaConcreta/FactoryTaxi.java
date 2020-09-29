package FabricaConcreta;

import FabricaAbstracta.FactoryVehiculos;
import ProductoAbstracto.Vehiculo;
import ProductoConcreto.Taxi;

public class FactoryTaxi implements FactoryVehiculos {
    @Override
    public Vehiculo crearVehiculo() {
        Taxi taxiGenerado = new Taxi();
        taxiGenerado.setCodigo(taxiGenerado.generarCodigoVehiculo());
        return taxiGenerado;
    }
}