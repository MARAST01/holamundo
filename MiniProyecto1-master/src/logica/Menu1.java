package logica;
import	logica.FuncionesMenu1;
import java.util.Scanner;

public class Menu1 {
    public static void main(String[] args) {
        
        int resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su opcion:\n1. Insertar mascota.\n2.Actualizar mascota.\n3.Eliminar mascota.\n4.Buscar mascota por nombre\n5.Listar todas las mascotas\n");
        resultado = entrada.nextInt();
        
        
        switch (resultado) {
            case 1:
                    FuncionesMenu1();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:
                System.out.println("El valor ingresado no es el correcto");
                
        }
    
}
}