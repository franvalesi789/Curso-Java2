package operaciones;

import java.util.Scanner;

public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
    
    //este metodo pide los valores al usuario
    public void PedirDatos(){
        System.out.print("Dame el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
    }
    
    //este metodo muestra el resultado de la operacion
    public void MostrarResultado(){
        System.out.println(resultado);
    }

}
