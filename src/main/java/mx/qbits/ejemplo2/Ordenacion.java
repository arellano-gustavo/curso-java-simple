package mx.qbits.ejemplo2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ordenacion {
    public static void main(String[] gustavo) {
        Pba p = new Pba();
//        int r = p.suma(123, 3);
//        if(r==126) 
//            System.out.println("si jaló este caso");
//        else
//            System.out.println("no salió el valor esperado. lo que salió fue:" + r);
        int r = p.divide(0, 36768);
        if(r==0)
            System.out.println("si jaló este caso");
        else
            System.out.println("no salió el valor esperado. lo que salió fue:" + r);
    }
    
    public void corre() {
        Producto q1 = new Producto(1, "plato",   123.32f, false, 350, "blanco");
        Producto q2 = new Producto(2, "vaso",    234.76f, true,  250, "rojo");
        Producto q3 = new Producto(3, "escoba",  111.11f, false, 355, "verde");
        Producto q4 = new Producto(4, "tenedor", 276.54f, true,  150, "amarillo");
        
        Producto q5 = new Producto(5, "cuchara2", 444.45f, false, 256, "blanco");
        Producto q6 = new Producto(6, "cuchara2", 444.45f, false, 355, "blanco");
        
        SortedSet<Producto> caja = new TreeSet<Producto>((a,b) -> ordena(a,b));
        
        caja.add(q1);
        caja.add(q2);
        caja.add(q3);
        caja.add(q4);
        caja.add(q5);
        caja.add(q6);
        
        System.out.println(caja);
    }
    
    public int ordena(Producto p, Producto q) {
        float r = p.getPrecio() - q.getPrecio();
        if(r>0) return -1;
        if(r<0) return 1;
        return p.getNombre().compareTo(q.getNombre());
    }
}
