import java.util.Scanner;

class Hilos1 implements Runnable{
    public void run(){
        System.out.println("Este es el hilo 1");
        Scanner entrada = new Scanner(System.in);
        int vueltas;
            System.out.println("Ingrese la cantidad de vueltas que quieres que los niños hagan: ");
            vueltas = entrada.nextInt();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            if(vueltas <= 0){
                System.out.println("Ingresa un numero valido de vueltas");
            }
            else if (vueltas == 1) {
                System.out.println("Los niños solo dieron una vuelta, estan bien!");
            }
            else{
            for(int i = 0; i<vueltas; i++){
                System.out.println("Los niños estan girando y esta es su " + (i+1) + " vuelta");
            }
            System.out.println("Los niños ya terminaron las " + (vueltas) + " vueltas y estan bien mareados");
        }
        entrada.close();
    }
    }

class Hilo2 implements Runnable{ 
    public void run(){
        try {
             Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println("Este es el hilo 2");
    }
}

class Hilo3 implements Runnable{
    public void run(){
        System.out.println("Este es el hilo 3");
    }
}
public class Controlled_Chaos_Threads{
    public static void main(String [] args){
        System.out.println("Hola");

        Thread hilo1 = new Thread(new Hilos1());
        Thread hilo2 = new Thread(new Hilo2());
        Thread hilo3 = new Thread(new Hilo3());
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
