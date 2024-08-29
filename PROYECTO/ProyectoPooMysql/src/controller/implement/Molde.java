package controller.implement;
/**
 *
 * @author juan_
 */
public abstract class Molde {
    private String nombreObjeto;
    private double base;
    private double altura;
    private double profundidad; 

    public Molde(String nombreObjeto, double base, double altura, double profundidad) {
        this.nombreObjeto = nombreObjeto;
        this.base = base;
        this.altura = altura;
        this.profundidad = profundidad;
    }
    
    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String NombreObjeto) {
        this.nombreObjeto = NombreObjeto;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    public abstract void getArea(double x, double y);

    @Override
    public String toString() {
        return "RoomItems{" + "base=" + base + ", altura=" + altura + ", profundidad=" + profundidad + '}';
    }
}

