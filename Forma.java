public class Forma {
    private String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public double Area(){
        return 0;
    }
}
