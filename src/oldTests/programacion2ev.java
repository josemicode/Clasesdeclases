package oldTests;

import java.util.Scanner;

public class programacion2ev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double counter = 0;

        System.out.println("Al crear una clase en Java, el método Getter sirve para:\n a. Retornar un atributo de la clase\n b. Modificar un atributo de la clase\n c. Eliminar un atributo de la clase\n d. Implementar una clase\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("La finalidad del método “toString()” es:\n a. Mostrar un resumen del contenido de las variables\n" +
                "acorde a un formato que le queramos dar\n" +
                "b. Obtiene el valor de los atributos que queramos\n" +
                "c. Convierte a tipo String las variables de la clase\n" +
                "d. Devuelve todos los métodos implementados en la clase\n" +
                "como un “System.out.println()”\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Los atributos estáticos:\n a. Dependen de Eclipse\n" +
                "b. Dependen de las variables de entorno\n" +
                "c. Dependen de los objetos\n" +
                "d. Dependen de las clases\n");
        if (sc.next().charAt(0)=='d'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("De los siguientes mencionados, las clases pueden contener:\n a. Una línea donde se declara todas las clases de la herencia\n" +
                "múltiple\n" +
                "b. Métodos\n" +
                "c. Un validador XSD\n" +
                "d. La declaración de una interfaz\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("En un constructor con parámetros…\n a. Se han de usar obligatoriamente todos los atributos de la\n" +
                "clase\n" +
                "b. No se ha de usar ninguno de los atributos de la clase\n" +
                "c. Se podrán usar solamente algunos o todos los atributos\n" +
                "de la clase\n" +
                "d. A y C son correctas\n");
        if (sc.next().charAt(0)=='c'){
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

        System.out.println("La herencia simple:\n a. Una clase puede heredar de varias clases\n" +
                "b. Una clase sólo puede heredar de otra\n" +
                "c. Una clase no puede heredar de ninguna otra\n" +
                "d. Ninguna es correcta\n");
        if (sc.next().charAt(0)=='b'){
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

        System.out.println("¿Qué es una biblioteca?\n a. Conjunto de interfaces que comparten una misma\n" +
                "funcionalidad, pudiendo ser encapsuladas en un mismo\n" +
                "paquete\n" +
                "b. Conjunto de interfaces que comparten una misma\n" +
                "funcionalidad, teniendo que estar en diferentes paquetes\n" +
                "c. Conjunto de clases que comparten una misma funcionalidad,\n" +
                "teniendo que estar en diferentes paquetes\n" +
                "d. Conjunto de clases que comparten una misma\n" +
                "funcionalidad, pudiendo ser encapsuladas en un mismo\n" +
                "paquete\n");
        if (sc.next().charAt(0)=='d'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cuál no es una característica de los objetos?\n a. Identidad\n b. Tipo\n c. Comportamiento\n d. Estado\n");
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

        System.out.println("¿Qué es un objeto?\n a. Son programas de Programación Orientada a Objetos\n" +
                "b. Son representaciones de entidades del mundo real en\n" +
                "nuestros programas\n" +
                "c. Es un tipo primitivo de Java\n" +
                "d. Es una representación de las variables de nuestro sistema\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Qué es el comportamiento?\n a. Es la representación de un objeto\n" +
                "b. Es la propiedad que define las acciones que un objeto\n" +
                "puede llevar a cabo\n" +
                "c. Es la secuencia que define las acciones de un objeto\n" +
                "d. Es la propiedad que define las variables que un objeto\n" +
                "puede usar\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Con qué sentencia sobreescribimos un método?\n a. #Override\n" +
                "b. $OverMethod\n" +
                "c. @Override\n" +
                "d. Ninguna es correcta\n");
        if (sc.next().charAt(0)=='c'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Qué consideramos una clase padre?\n a. Una clase de las que las otras heredan\n" +
                "b. Una clase que hereda de otras\n" +
                "c. Una clase que no hereda de ninguna clase y viceversa\n" +
                "d. Ninguna de las anteriores\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cuándo se dará una relación de composición?\n a. Cuando una clase necesite implementar toda la\n" +
                "funcionalidad de otra\n" +
                "b. Cuando una clase no tenga sentido sin la otra\n" +
                "c. Cuando una clase utilice a otra en el paso de parámetros de\n" +
                "los métodos\n" +
                "d. Cuando una clase defina a otra en su interior\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Tenemos una clase hija que hereda de una clase padre. ¿Qué ocurre con los constructores?\n a. Los constructores se heredan de forma directa desde la\n" +
                "clase hija a la clase padre\n" +
                "b. Los constructores se heredan de forma indirecta desde la\n" +
                "clase hija a la clase padre\n" +
                "c. Los constructores se heredan de forma indirecta desde\n" +
                "la clase padre a la clase hija\n" +
                "d. Los constructores no se pueden heredar\n");
        if (sc.next().charAt(0)=='c'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cuál es la palabra reservada en Java para indicar la Herencia?\n a. Import\n" +
                "b. Div\n" +
                "c. String\n" +
                "d. Extends\n");
        if (sc.next().charAt(0)=='d'){
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

        System.out.println("Una interfaz se define como:\n a. Un lenguaje de programación\n" +
                "b. Una clase privada de Java\n" +
                "c. Serie de acciones relacionadas entre sí, que podrán ser\n" +
                "ejecutadas por un objeto\n" +
                "d. B y C son correctas\n");
        if (sc.next().charAt(0)=='c'){
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

        System.out.println("Herencia. ¿Cómo se define?\n a. Son las relaciones existentes entre las clases\n b. Funcionalidad que proporciona a un objeto la posibilidad de tener diferentes comportamientos asociados a diferentes objetos\n c. Se basa en que cada objeto ha de estar aislado del exterior, es decir, externamente se desconoce la composición interna\n d. Ninguna de las anteriores\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("Inconvenientes de la POO, Indica la correcta:\na. La ejecución de estos programas es más lenta\n" +
                "b. Fiabilidad\n" +
                "c. Reutilización de Código\n" +
                "d. Mayor Seguridad\n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cuáles de estos estados del ciclo de vida de un objeto no es\n" +
                "correcto?\n a. Creación\n" +
                "b. Utilización\n" +
                "c. Reciclaje\n" +
                "d. Destrucción\n");
        if (sc.next().charAt(0)=='c'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Qué consideramos como las “acciones” que puede usar una\n" +
                "clase?\n a. Atributos\n" +
                "b. Métodos\n" +
                "c. Polimorfismo\n" +
                "d. Herencia\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Es posible hacer uso de una clase que no se encuentre en el\n" +
                "mismo paquete de clases con el que estamos trabajando?\n a. Sí, sin problema y sin requerir nada más\n" +
                "b. No, no es posible en ningún caso\n" +
                "c. Sí, pero haciendo uso de la instrucción “import”\n" +
                "d. Sí, pero solo podremos usar una única clase\n");
        if (sc.next().charAt(0)=='c'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("¿Cómo se define un bloque try?\n a. Fragmento de código que contiene todo lo que sea\n" +
                "susceptible de producir varios aciertos\n" +
                "b. Fragmento de código que contiene todo lo que sea\n" +
                "susceptible de producir varios errores\n" +
                "c. Fragmento de clases que contiene todo lo que sea\n" +
                "susceptible de producir varios aciertos\n" +
                "d. Fragmento de interfaces que contiene todo lo que sea\n" +
                "susceptible de producir varios errores\n");
        if (sc.next().charAt(0)=='b'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        System.out.println("En documentación de excepciones, ¿qué se debe documentar?\n a. Métodos\n" +
                "b. Clases\n" +
                "c. Código mediante comentarios\n" +
                "d. Todas son correctas");
        if (sc.next().charAt(0)=='d'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");

        double res = (double) (((counter-((35-counter)/3))*100)/35);

        System.out.println("Has acertado " +counter+ " preguntas de 35, \nun " +res+ "%");
    }
}
