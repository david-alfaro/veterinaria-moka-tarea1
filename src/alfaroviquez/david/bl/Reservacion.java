package alfaroviquez.david.bl;

public class Reservacion {

    String NombreMascota;
    String FechaEntrada;
    String FechaSalida;

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(String FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    @Override
    public String toString() {
        return "Reservacion: [Nombre de Mascota: " + this.NombreMascota + ", Fecha Entrada: " + this.FechaEntrada + ", Fecha Salida: " + this.FechaSalida + "]";
    }

    public Reservacion(String NombreMascota, String FechaEntrada, String FechaSalida) {
        this.NombreMascota = NombreMascota;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
    }

    public Reservacion() {
    }
}
