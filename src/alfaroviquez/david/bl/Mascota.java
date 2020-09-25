package alfaroviquez.david.bl;

public class Mascota {

    String NombreMascota;
    String NombreDuenno;
    String Apellido1Duenno;
    String Apellido2Duenno;
    int CedulaDuenno;
    int TelefonoDuenno;
    String DireccionDuenno;
    String FotoMascota;
    String Observaciones;
    int Ranking;

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public String getNombreDuenno() {
        return NombreDuenno;
    }

    public void setNombreDuenno(String NombreDuenno) {
        this.NombreDuenno = NombreDuenno;
    }

    public String getApellido1Duenno() {
        return Apellido1Duenno;
    }

    public void setApellido1Duenno(String Apellido1Duenno) {
        this.Apellido1Duenno = Apellido1Duenno;
    }

    public String getApellido2Duenno() {
        return Apellido2Duenno;
    }

    public void setApellido2Duenno(String Apellido2Duenno) {
        this.Apellido2Duenno = Apellido2Duenno;
    }

    public int getCedulaDuenno() {
        return CedulaDuenno;
    }

    public void setCedulaDuenno(int CedulaDuenno) {
        this.CedulaDuenno = CedulaDuenno;
    }

    public int getTelefonoDuenno() {
        return TelefonoDuenno;
    }

    public void setTelefonoDuenno(int TelefonoDuenno) {
        this.TelefonoDuenno = TelefonoDuenno;
    }

    public String getDireccionDuenno() {
        return DireccionDuenno;
    }

    public void setDireccionDuenno(String DireccionDuenno) {
        this.DireccionDuenno = DireccionDuenno;
    }

    public String getFotoMascota() {
        return FotoMascota;
    }

    public void setFotoMascota(String FotoMascota) {
        this.FotoMascota = FotoMascota;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public int getRanking() {
        return Ranking;
    }

    public void setRanking(int Ranking) {
        this.Ranking = Ranking;
    }

    @Override
    public String toString() {
        return "Mascota: [Nombre: " + this.NombreMascota + ", Dueño: " + this.NombreDuenno + " " + this.Apellido1Duenno + " " + this.Apellido2Duenno + ", Cedula:" + this.CedulaDuenno + ", Direccion: " + this.DireccionDuenno + ", Telefono: " + this.TelefonoDuenno + ", Foto: " + this.FotoMascota + ", Observaciones: " + this.Observaciones + ", Ranking: " + this.Ranking + " estrellas ]";
    }

    public Mascota(String NombreMascota, String NombreDuenno, String Apellido1, String Apellido2, int Cedula, int Telefono, String Direccion, String Foto, String Observaciones, int Ranking) {
        this.NombreMascota = NombreMascota;
        this.NombreDuenno = NombreDuenno;
        this.Apellido1Duenno = Apellido1;
        this.Apellido2Duenno = Apellido2;
        this.CedulaDuenno = Cedula;
        this.TelefonoDuenno = Telefono;
        this.DireccionDuenno = Direccion;
        this.FotoMascota = Foto;
        this.Observaciones = Observaciones;
        this.Ranking = Ranking;
    }

    public Mascota() {
    }

}
