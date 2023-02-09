package mx.qbits.ejemplo;

public class Principal {
    public void corre() {
        Papa p = new Papa();
        p.hola();
        invoca(p);
    }
    public void invoca(Abuelo p) {
        prn(p.hi());
    }
    public void prn(String s) {
        System.out.println(s);
    }
}
// Están de acuerdo en que un autobus es un transporte?
// Están de acierdo en que un autobus tiene motor?
// Están de acuerdo en que un Bocho es un transporte?
// Están de acuerdo en que a un Bocho le caben 5 personas?
// entonces a un autobus sólo le caben 5 personas ? FALSO