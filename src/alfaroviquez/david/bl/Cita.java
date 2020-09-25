package alfaroviquez.david.bl;

public class Cita {

    private String NombreMascota;
    private String FechaCita;
    private String HoraCita;
    private String Observaciones;

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public String getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(String FechaCita) {
        this.FechaCita = FechaCita;
    }

    public String getHoraCita() {
        return HoraCita;
    }

    public void setHoraCita(String HoraCita) {
        this.HoraCita = HoraCita;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
    @Override
    public String toString(){
        return "Cita:[Nombre de Mascota: "+this.NombreMascota+", Fecha de Cita: "+this.FechaCita+", Hora de Cita: "+this.HoraCita+", Observaciones: "+this.Observaciones+" ]";
    }
    
    public Cita(String NombreMascota, String FechaCita, String HoraCita, String Observaciones){
        this.NombreMascota=NombreMascota;
        this.FechaCita=FechaCita;
        this.HoraCita=HoraCita;
        this.Observaciones=Observaciones;
                
    }
    
    public Cita(){}

}
