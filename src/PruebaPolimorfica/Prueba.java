package PruebaPolimorfica;

import java.util.ArrayList;

public class Prueba {

//    public static void main(String[] args) {
//
//        ArrayList<Material> materiales = new ArrayList<>();
//        Borrador borradorGenerado = new Borrador(Borrador.generarCodigoMaterial(), "BorradorPatito");
//        materiales.add(borradorGenerado);
//
//        Lapiz lapizGenerado;
//        Material materialAbstractoGenerado;
//        boolean generarOtraVez;
//        do {
//            generarOtraVez = false;
//            lapizGenerado = new Lapiz(Lapiz.generarCodigoMaterial(), "LapizPatito");
//            materialAbstractoGenerado = new Material(Material.generarCodigoMaterial());
//            for(Material e: materiales){
//                if(lapizGenerado.getCodigoMaterial() == e.getCodigoMaterial() ||
//                materialAbstractoGenerado.getCodigoMaterial() == e.getCodigoMaterial()) {
//                    generarOtraVez = true;
//                    break;
//                }
//            }
//        }while(generarOtraVez);
//        materiales.add(lapizGenerado);
//        materiales.add(materialAbstractoGenerado);
//
//        for(int x = 0; x < materiales.size(); x++){
//            System.out.println(materiales.get(x).obtenerDatos());
//        }
//    }


}

class Material{
    private String codigoMaterial;

    public Material(String codigoMaterial){
        this.codigoMaterial = codigoMaterial;
    }


    public void setCodigoMaterial(String codigoMaterial){
        this.codigoMaterial = codigoMaterial;
    }

    public static String generarCodigoMaterial(){
        int numeroGenerado = 0;
        do {
             numeroGenerado = (int) Math.floor(Math.random() * 101);
        }while(numeroGenerado == 0);
        return String.valueOf(numeroGenerado);
    }

    public String getCodigoMaterial(){
        return this.codigoMaterial;
    }
    public String obtenerDatos(){
        return "PruebaPolimorfica.Material Abstracto " + "| Código : " + this.codigoMaterial;
    }

}

class Lapiz extends Material{

    public Lapiz(String codigoMaterial, String marcaLapiz) {
        super(codigoMaterial);
        this.marcaLapiz = marcaLapiz;
    }
    @Override
    public String obtenerDatos(){
        return "PruebaPolimorfica.Material Contreto " + "\nCódigo : " + super.getCodigoMaterial() + "\nTipo PruebaPolimorfica.Material : " + TIPO_MATERIAL + "\nMarca PruebaPolimorfica.Material : " + this.marcaLapiz;
    }

    public String marcaLapiz;
    private static final String TIPO_MATERIAL = "PruebaPolimorfica.Lapiz";
}

class Borrador extends Material{

    public Borrador(String codigoMaterial, String marcaBorrador) {
        super(codigoMaterial);
        this.marcaBorrador = marcaBorrador;
    }

    @Override
    public String obtenerDatos(){
        return "PruebaPolimorfica.Material Contreto " + "\nCódigo : " + super.getCodigoMaterial() + "\nTipo PruebaPolimorfica.Material : " + TIPO_MATERIAL + "\nMarca PruebaPolimorfica.Material : " + this.marcaBorrador;
    }

    public String marcaBorrador;
    private static final String TIPO_MATERIAL = "PruebaPolimorfica.Borrador";
}
