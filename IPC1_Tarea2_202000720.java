
package ipc1_tarea2_202000720;
import java.util.Scanner;

public class IPC1_Tarea2_202000720 {

    public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);    
    int opcion;
    double num1, num2;
    double suma,resta, multiplicacion,division;
    boolean salir;
        do {
          System.out.println("=================");
          System.out.println(" Menu " );
          System.out.println(" 1. Hacer una suma");
          System.out.println(" 2. Hacer una resta");
          System.out.println(" 3. Hacer una multiplicación");
          System.out.println(" 4. Hacer una división");
          System.out.println(" 5. salir");
          System.out.println("=================");
          System.out.println("Por favor, ingrese el numero de la operacion que desea realizar: ");
          opcion=numeros.nextInt();
          
            switch (opcion){
                case 1:
                    System.out.println("Ingrese primer numero: ");
                    num1= numeros.nextInt();
                    System.out.println("Ingrese segundo numero:");
                    num2= numeros.nextInt();
                    suma=num1+num2;
                    System.out.println("El resultado de la suma es: "+suma);
                    break;
                case 2:
                    System.out.println("Ingrese primer numero: ");
                    num1=numeros.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2= numeros.nextInt();
                    resta=num1-num2;
                    System.out.println("El resultado de la resta es: "+resta);
                    break;
                case 3:
                    System.out.println("Ingrese primer numero: ");
                    num1= numeros.nextInt();
                    System.out.println("Ingrese segundo numero: ");
                    num2= numeros.nextInt();
                    multiplicacion=num1*num2;
                    System.out.println("El resultado de la multiplicación es: "+multiplicacion);
                    break;
                case 4:
                    System.out.println("Ingrese primer numero: ");
                    num1= numeros.nextInt();
                    System.out.println("Ingrese segundo numero: ");
                    num2= numeros.nextInt();
                    division= num1/num2;
                    if (num2==0){
                        System.out.println("No es posible dividir por cero.");
                    }else 
                        System.out.println("El resultado de la division es: "+division);
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("Elija una opción que este en el menu.");
            }
       }while(opcion!=5);
    }
    
}
