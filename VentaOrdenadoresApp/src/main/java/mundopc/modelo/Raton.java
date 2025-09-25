package mundopc.modelo;

public class Raton  extends DispositivoEntrada{

    private final int idRaton;
    private static int contarRatones;

    public Raton(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);

        idRaton= ++contarRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                "}" + super.toString();
    }
}
