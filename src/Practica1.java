import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args ){
        //Variables
        int edad = 0, parametro = 0;
        double num1 = 0, num2 = 0;
        String nombre = "", parametroString = "";

        Scanner entrada = new Scanner(System.in);
        do{
        System.out.printf("%n******************** MENU DE OPCIONES ********************%n1.IMPRESION EN PANTALLA%n2.EDAD Y SALUDO%n3.CALCULADORA%n4.PRUEBA DE OPERADORES%n5.EJEMPLO CICLO FOR%n6.EJEMPLO WHILE%n%nINGRESE LA OPCION A ELEGIR: ");
        parametro = entrada.nextInt();
        switch(parametro){
            case 1: //Impresion en pantalla
            System.out.println("El pochoclooo");
                break;

            case 2: //Edad y saludo
                System.out.print("Ingrese su edad: ");
                edad = entrada.nextInt();
                if(edad > 0 && edad < 122){
                    System.out.print("Ahora ingrese su nombre: ");
                    nombre = entrada.next();
                    System.out.println("Hola " + nombre);
                    System.out.println("Su edad es " + edad + " años siendo puto");
                } else{
                    System.out.println("Ingrese un valor valido o me lo violo");
                }
                break;

            case 3: //Calculadora
                System.out.println("Ahora una calculadoraaa!");
                System.out.print("Ingrese el primer numero: ");
                num1 = entrada.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                num2 = entrada.nextDouble();
                System.out.println("La suma es: " + (num1 + num2));
                System.out.println("La resta es: " + (num1 - num2));
                System.out.println("La multiplicacion es: " + (num1 * num2));
                if(num2 != 0){
                    System.out.printf("La division es: %.2f%n",(double) num1/num2);
                } else{
                    System.out.println("Ingrese un numero valido");
                }
                System.out.println("La potencia es: " + Math.pow(num1, num2));
                break;
            case 4: //Prueba de operadores
                System.out.println("Ingrese el primer numero");
                num1 = entrada.nextDouble();
                System.out.println("Ingrese el segundo numero");
                num2 = entrada.nextDouble();
                System.out.println("El resultado es: " + (num1*(num2/num1)));
                break;

            case 5: //Cilo for
                int cant_vueltas;
                System.out.println("Ingrese la cantidad de vueltas que quieres que los niños hagan: ");
                cant_vueltas = entrada.nextInt();
                for(int i = 0; i<cant_vueltas; i++){
                    System.out.println("Los niños estan girando y esta es su " + (i+1) + " vuelta");

                }
                System.out.println("Los niños ya terminaron las " + (cant_vueltas) + " vueltas y estan bien perros mareados");
                break;

            case 6: //Ejemplo while - niños
                int i=0, vueltas;
                System.out.println("Ingrese las vueltas que quieres que de el regilete");
                vueltas = entrada.nextInt();
                System.out.println(vueltas);
                while(i<vueltas){
                    System.out.println("Esta es la vuelta numero " + (i+1) +" del regilete");
                i=i+1;
                }
                System.out.println("Las " + vueltas + " vueltas han terminado.");
                break;
                
            default:
                System.out.println("Ingrese un numero valido.");
                break;
        }
        do{
        System.out.printf("%n¿Quieres repetir el prograna: ");
        parametroString = entrada.next();
        if(parametroString.equals("YES") || parametroString.equals("Y") || parametroString.equals("S") || parametroString.equals("Yes") || parametroString.equals("yes") || parametroString.equals("y") || parametroString.equals("SI") || parametroString.equals("Si") || parametroString.equals("si") || parametroString.equals("s")){
            parametro = 1;
        }else if(parametroString.equals("NO") || parametroString.equals("N") || parametroString.equals("No") || parametroString.equals("no") || parametroString.equals("n")){
            parametro = 0;
            System.out.printf("%n¡Usted ha salido del programa exitosamente!%n");
        }else{
            System.out.printf("%nIngrese una entrada valida%n");
            parametro = 3;
        }
    }while(parametro == 3);
    }while(parametro == 1);
    entrada.close();
    }
}