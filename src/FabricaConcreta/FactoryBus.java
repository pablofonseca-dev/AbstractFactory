package FabricaConcreta;

import FabricaAbstracta.FactoryVehiculos;
import ProductoAbstracto.Vehiculo;
import ProductoConcreto.Bus;

public class FactoryBus implements FactoryVehiculos {
    @Override
    public Vehiculo crearVehiculo() {
        Bus busGenerado = new Bus();
        busGenerado.setCodigo(busGenerado.generarCodigoVehiculo());
        return busGenerado;
    }
}
