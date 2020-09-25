package alfaroviquez.david.bl;

public class Usuario {

    String Nombre;
    String Apellido1;
    String Apellido2;
    int Cedula;
    int Telefono;
    String Direccion;
    String Estado;
    String Rol;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
    @Override
    public String toString(){
        return "Usuario: [Nombre: "+this.Nombre+" "+this.Apellido1+" "+this.Apellido2+", Cedula: "+this.Cedula+", Telefono: "+this.Telefono+", Direccion: "+this.Direccion+", Estado: "+this.Estado+", Rol: "+this.Rol+"]";
    }
    
    public Usuario(String Nombre, String Apellido1, String Apellido2, int Cedula, int Telefono, String Direccion, String Estado, String Rol){
        this.Nombre=Nombre;
        this.Apellido1=Apellido1;
        this.Apellido2=Apellido2;
        this.Cedula=Cedula;
        this.Telefono=Telefono;
        this.Direccion=Direccion;
        this.Estado=Estado;
        this.Rol=Rol;
    }
    
    public Usuario(){}

}
