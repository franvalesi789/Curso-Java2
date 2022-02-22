package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Operaciones_ClasePadre mensajero_suma = new Suma_ClaseHija();
        mensajero_suma.PedirDatos();
        mensajero_suma.Operaciones();
        mensajero_suma.MostrarResultado();
        
        System.out.println("");

    }

}
