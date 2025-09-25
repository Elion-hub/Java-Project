package mundopc;


import mundopc.modelo.Monitor;
import mundopc.modelo.Ordenador;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaOrdenadoresApp {
    public static void main(String[] args) {

        Raton ratonLenovo = new Raton("usb","lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("usb","lenovo");
       //System.out.println(tecladoLenovo);
        Monitor monitorSamsung= new Monitor("samsung",49.0);
        //System.out.println(monitorSamsung);
        Ordenador nuevoOrdenador = new Ordenador("ordenadorlenovo",
                monitorSamsung,
                tecladoLenovo,
                ratonLenovo);

        Monitor monitorDell= new Monitor("Dell",28);
        Teclado tecladoDell=new Teclado("usb","Dell");
        Raton ratonDell = new Raton("Usb","Dell");
        Ordenador ordenadorDell= new Ordenador("OrdenadorDell",
                monitorDell,
                tecladoDell,
                ratonDell);




        Orden orden1 = new Orden();
        orden1.agregarOrdenador(nuevoOrdenador);
        orden1.agregarOrdenador(ordenadorDell);
        System.out.println();
        orden1.mostrarOrden();
    }
}