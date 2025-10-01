# Concurrent_Programming
Holaa!! Soy Maximiliano.
Este repositorio contiene ejemplos simples que realizo mientras aprendo de programación paralela y concurrente en Java.
El objetivo es mostrar cómo se crean hilos, cómo se ejecutan en paralelo y cómo se intercalan sus salidas en la consola.

## Cómo ejecutar el programa

### 1. Clonar el repositorio
Clona el repositorio desde GitHub en tu computadora:

git clone https://github.com/MaxMz3943/Parallel-programming-and-concurrent.git
cd Parallel-programming-and-concurrent

### 2. Compilar el programa
Compila el archivo `.java` con el compilador de Java:

javac src/Hilos.java

### 3. Ejecutar el programa
Ejecuta la clase principal:

java -cp src Hilos

## Requisitos
- Tener instalado **Java JDK 8 o superior**  
- Verificar que los comandos `javac` y `java` funcionan en la terminal  
- (Opcional) Configurar la variable de entorno **JAVA_HOME**

## Qué hace el programa
- **Hilo 1** → pide al usuario un número de vueltas y las imprime en un bucle.  
- **Hilo 2** → espera unos segundos (`Thread.sleep`) y luego imprime un mensaje.  
- **Hilo 3** → imprime inmediatamente un mensaje.  

## Salida
Hola
Este es el hilo 1
Este es el hilo 3
Ingrese la cantidad de vueltas que quieres que los niños hagan:
5
Los niños están girando y esta es su 1 vuelta
Los niños están girando y esta es su 2 vuelta
Los niños están girando y esta es su 3 vuelta
Los niños están girando y esta es su 4 vuelta
Los niños están girando y esta es su 5 vuelta
Los niños ya terminaron las 5 vueltas y están bien mareados
Este es el hilo 2 
**************************************************************
Gracias por ver y espero que estos ejemplos sean de ayuda! ;)
-Max
