package dam.programacion;

import libreriaCOD.*;

public class Main {

    public static void main(String[] args) {
      /*
       Consola objetoConsloa = new Consola();
       objetoConsloa.visualizar("Hola");
       Ventana objetoVentana = new Ventana();
       objetoVentana.visualizar("Adios");
    */
        InterfaceMetodosComunes miSalida,misalida2,misalida3,miEntrada1,miEntrada2;
        miSalida=FactoriaDeSalidas.getProductoSalida(FactoriaDeSalidas.CONSOLA);
        miSalida.visualizar("Hola");
        misalida2=FactoriaDeSalidas.getProductoSalida(FactoriaDeSalidas.VENTANA);
        misalida2.visualizar("Adios");
        misalida3=FactoriaDeSalidas.getProductoSalida(FactoriaDeSalidas.IMPRESORA);
        misalida3.visualizar("Imprimiendo por impresora");
        miEntrada1= FactoriaDeEntradas.getProductoEntrada(FactoriaDeEntradas.CONSOLA);
        miEntrada1.introducirDatos();
        miEntrada2=FactoriaDeEntradas.getProductoEntrada(FactoriaDeEntradas.VENTANA);
        miEntrada2.introducirDatos();

    }

}
