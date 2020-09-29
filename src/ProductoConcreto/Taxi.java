package ProductoConcreto;

import ProductoAbstracto.Vehiculo;

public class Taxi implements Vehiculo {
    /* Properties */
    private int codigo;
    private static final String TIPO_VEHICULO = "Taxi";

    /* Getters */
    public int getCodigo(){
        return this.codigo;
    }

    public String getTipoVehiculo(){
        return TIPO_VEHICULO;
    }

    /* Setters */
    public void setCodigo(int codigo){
        this.codigo = 100000 + codigo;
    }

    /* Interface Methods */
    @Override
    public String obtenerCodigoVehiculo() {
        return "El código es: " + getCodigo();
    }

    @Override
    public int generarCodigoVehiculo() {
        return (int) Math.floor(Math.random() * 9999);
    }

    @Override
    public String obtenerInformacionVehiculo() {
        StringBuilder str = new StringBuilder();
        str.append("Nombre del Vehículo:\t").append(this.getTipoVehiculo()).append("\t\t");;
        str.append("Código del Vehículo:\t").append(this.getCodigo());
        return str.toString();
    }
}
