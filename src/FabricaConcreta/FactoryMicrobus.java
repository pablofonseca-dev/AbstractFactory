package FabricaConcreta;

import FabricaAbstracta.FactoryVehiculos;
import ProductoAbstracto.Vehiculo;
import ProductoConcreto.Microbus;

public class FactoryMicrobus implements FactoryVehiculos {
    @Override
    public Vehiculo crearVehiculo() {
        Microbus microbusGenerado = new Microbus();
        microbusGenerado.setCodigo(microbusGenerado.generarCodigoVehiculo());
        return microbusGenerado;
    }
}
