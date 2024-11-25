package Modelo;

public class LenguajeProgramacion {

    private int AñoCreacion;
    private String CaracteristicaPrincipal;
    private String Nombre;
    private String Utilizacion;

    public int getAñoCreacion() {
        return AñoCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        AñoCreacion = añoCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return CaracteristicaPrincipal;
    }

    public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
        CaracteristicaPrincipal = caracteristicaPrincipal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUtilizacion() {
        return Utilizacion;
    }

    public void setUtilizacion(String utilizacion) {
        Utilizacion = utilizacion;
    }

    public LenguajeProgramacion (int AñoCreacion, String CaracteristicaPrincipal, String Nombre, String Utilizacion) {
        this.AñoCreacion = AñoCreacion;
        this.CaracteristicaPrincipal = CaracteristicaPrincipal;
        this.Nombre = Nombre;
        this.Utilizacion = Utilizacion;
    }

    @Override
    public String toString() {
        return "LenguajeProgramacion{" +
                "AñoCreacion=" + AñoCreacion +
                ", CaracteristicaPrincipal='" + CaracteristicaPrincipal + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Utilizacion='" + Utilizacion + '\'' +
                '}';
    }
}

