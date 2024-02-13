public class Rectangulo extends Forma{

    private double longitud;
    private double ancho;

    public Rectangulo(String nombre, double longitud, double ancho) {
        super(nombre);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "longitud=" + longitud +
                ", ancho=" + ancho +
                '}';
    }

    public double Area(){
        return longitud*ancho;
    }
}
