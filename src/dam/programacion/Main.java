package dam.programacion;

import libreriaCOD.Consola;
import libreriaCOD.MostrarMensajes;
import libreriaCOD.Ventana;

public class Main {

    public static void main(String[] args) {
        Ventana objetoVentana = new Ventana();
        objetoVentana.MostrarErrorJoptionPane("Deseas continuar");
        Consola objetoConsola = new Consola();
        objetoConsola.mostrarMensajeSout("Mensaje por consola");
    }
}
