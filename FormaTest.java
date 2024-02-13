import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {

    @Test
    void testToString() {
        Forma f = new Forma("f1");
        String SalidaForm = "Forma{nombre='f1'}";
        assertEquals(SalidaForm,f.toString());

        Esfera e = new Esfera("e1",3.5);
        String SalidaEsf = "Esfera{radio=3.5}";
        assertEquals(SalidaEsf,e.toString());

        Rectangulo r = new Rectangulo("r1",4,5);
        String SalidaRec = "Rectangulo{longitud=4.0, ancho=5.0}";
        assertEquals(SalidaRec,r.toString());

        Cilindro c = new Cilindro("c1",3.5,5);
        String SalidaCil = "Cilindro{radio=3.5, altura=5.0}";
        assertEquals(SalidaCil,c.toString());
    }

    @Test
    void testArea() {
        Forma f1 = new Forma("f1");
        assertEquals(0,f1.Area());

        Esfera e1 = new Esfera("e1",3.5);
        double SalidaEsperadaEsf = 153.93804002589985;
        assertEquals(SalidaEsperadaEsf,e1.Area());

        Rectangulo r1 = new Rectangulo("r1",4,5);
        double SalidaEsperadaRec = 20;
        assertEquals(SalidaEsperadaRec,r1.Area());

        Cilindro c1 = new Cilindro("c1",3.5,5);
        double SalidaEsperadaCil = 192.42255003237483;
        assertEquals(SalidaEsperadaCil,c1.Area());
    }

    @Test
    void Pintar(){
        Pintura p1 = new Pintura(250);
        Esfera e = new Esfera("e1",3.5);
        double SalidaPintEsf = 0.6157521601035995;
        assertEquals(SalidaPintEsf,p1.Pintar(e));
    }
}