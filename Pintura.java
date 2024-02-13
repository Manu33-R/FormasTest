public class Pintura {
    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double Pintar(Forma f1){
        return f1.Area()/cobertura;
    }
}
