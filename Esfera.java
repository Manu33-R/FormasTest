public class Esfera extends Forma{


    private double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public double Area() {
        return (4*Math.PI*Math.pow(radio,2));
    }
}
