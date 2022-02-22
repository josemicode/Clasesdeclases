package test;

import java.util.Scanner;

public class programacion2ev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;

        System.out.println("Al crear una clase en Java, el método Getter sirve para:\n a. Retornar un atributo de la clase\n b. Modificar un atributo de la clase\n c. Eliminar un atributo de la clase\n d. Implementar una clase\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Indique cuál de las siguientes reglas de los constructores es falsa:\n a. No devuelven ningún tipo de dato, ni siquiera void\n b. Tienen que ser privados para poder ser utilizados\n c. Tienen que llamarse exactamente igual que la clase a la que pertenecen\n d. Ninguna es falsa\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("La herencia múltiple:\n a. Discierne de la simple en el número de clases de las que una clase puede heredar\n b. Discierne de la simple en el número de clases que pueden heredar de una clase\n c. Es el tipo de herencia utilizado por lenguajes como Java o C#\n d. Ninguna es correcta\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Indica la correcta:\n a. En programación el concepto de herencia es la capacidad de una clase de heredar de otra todo su comportamiento\n b. En programación el concepto de herencia es la capacidad de una clase de intercambiar con otra todo su comportamiento\n c. En programación el concepto de herencia no se parece al biológico\n d. En programación el concepto de constructor es la capacidad de una clase de heredar de otra todo su comportamiento\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Los tipos de herencia son:\n a. Simple y múltiple\n b. Rápidas y lentas\n c. Altas y bajas\n d. Hereditarias y no hereditarias\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cuál no es una característica de los objetos?\n a. Identidad\n b. Desestado\n c. Comportamiento\n d. Estado\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cómo se hace un bloque estático?\n a. static{ //código}\n b. Nombre static {código}\n c. Static void {código}\n d. Static tipo {código}\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cuál de estos métodos para leer entrada, sólo permite números sin decimales?\n a. nextInt()\n b. nextDouble()\n c. nextBoolean()\n d. nextLine()\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Qué método usamos para imprimir valores por pantalla?\n a. System.out.print()\n b. System.out.println()\n c. System.println()\n d. Out.println()\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cuál es la forma correcta de declarar e instanciar un objeto?\n a. NombreClase nombreobjeto = NombreClase (parametros);\n b. NombreClase nombreobjeto = NombreClase (parametros);\n c. NombreClase nombreobjeto = new NombreClase (parametros);\n d. new NombreClase nombreobjeto = NombreClase (parametros);\n");
        if (sc.next().charAt(0)=='c'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("(Selecciona la respuesta INCORRECTA) Los métodos abstractos:\n a. No se implementan\n b. Pueden existir en cualquier clase\n c. Los métodos abstractos tendrán que ser sobrescritos obligatoriamente por las clases que hereden de ellas\n d. Solo pueden existir dentro de una clase abstracta\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Qué tipo de polimorfismos son los correctos?\n a. Estático y dinámico\n b. Sólo dinámico\n c. Sólo estático\n d. Ninguna de las anteriores\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Una interfaz es:\n a. Una serie de acciones relacionadas entre sí, que va a poder ejecutar un objeto\n b. Un lenguaje de programación\n c. Una clase privada de java\n d. Ninguna de las anteriores\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Una interfaz se diferencia de una clase abstracta en:\n a. Todos los métodos que tenga una interfaz se van a declarar de forma automática e implícita como abstractos y públicos\n b. En las clases abstractas, podemos implementar métodos no abstractos\n c. La interfaz no pertenece a la jerarquía de clases de la herencia\n d. Todas son correctas\n");
        if (sc.next().charAt(0)=='d'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Para declarar una clase abstracta en Java, lo hacemos mediante la palabra reservada:\n a. implements\n b. add\n c. abstract\n d. A y B\n");
        if (sc.next().charAt(0)=='c'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Qué  operaciones nos permite realizar un depurador?\n a. Rastreo, punto de ruptura, ventanas de seguimiento, reinicialización y modificación del valor de las variables\n b. Rastreo, punto de captura, reinicialización y modificación del valor de las variables\n c. Punto de captura, reinicialización, ventanas de seguimiento, reinicialización y modificación del valor de las variables\n d. Rastreo, punto de ruptura, ventanas de seguimiento y modificación de las variables\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Señala la correcta:\n a. Un try puede tener uno o varios catch, pero un catch si puede estar con  un try\n b. Un try puede tener solo un catch, pero un catch puede tener uno o varios try\n c. Un try no  puede tener varios catch, pero un catch puede estar sin un try\n d. Un try puede tener uno o varios catch, pero un catch no puede estar sin un try\n");
        if (sc.next().charAt(0)=='d'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cuál de estas no es un tipo de prueba de código?\n a. Exhaustiva\n b. Eliminación\n c. Caja negra\n d. Cubrimiento\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Has acertado " +counter+ " preguntas de 18");
    }
}
