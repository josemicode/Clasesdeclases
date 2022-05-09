package oldTests;

import java.util.Scanner;

public class bbdd2ev {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double correctas = 0;
        double falladas = 0;
        double numpreguntas = 0;

        System.out.println("1. ¿Qué cláusula determina la tabla sobre la que se ejecutará la consulta? (Tema 8)\r\n\n"
                + "a. FROM\r\n"
                + "b. WHERE\r\n"
                + "c. HAVING\r\n"
                + "d. ORDER BY");
        String pregunta1 = sc.next();
        numpreguntas++;
        if (pregunta1.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("2.  Seleccione el orden en el que debemos escribir una sentencia select para que sea válida (Tema 9)\r\n\n"
                + "a. Select, where, from, order by\r\n"
                + "b. Select, from, order by, having\r\n"
                + "c. A y B son correctas\r\n"
                + "d. Ninguna de las anteriores \r\n");
        String pregunta2 = sc.next();
        numpreguntas++;
        if (pregunta2.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("Los operadores de comparación se usan para: (Tema 10)\r\n\n"
                + "a. Realizar comparaciones entre tablas\r\n"
                + "b. Realizar comparaciones entre datos numéricos\r\n"
                + "c. Realizar comparaciones entre datos, sin importar el tipo\r\n"
                + "d. Ninguna es correcta \r\n");
        String pregunta3 = sc.next();
        numpreguntas++;
        if (pregunta3.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("4.  En los productos cartesianos para relacionar tablas con la cláusula “WHERE”, indique cuál de las siguientes no es una regla:(Tema 11)\r\n\n"
                + "a. Se pueden usar más de dos columnas como columnas de emparejamiento\r\n"
                + "b. En caso de que existan columnas con el mismo nombre en ambas tablas, es necesario identificarlas indicando la tabla de procedencia\r\n"
                + "c. Solo se pueden combinar dos tablas entre sí\r\n"
                + "d. Se permite usar varias columnas en la consulta, sean o no de emparejamiento");

        String pregunta4 = sc.next();
        numpreguntas++;
        if (pregunta4.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("5. ¿Se puede usar una subconsulta dentro de una instrucción “delete”? (Tema 12)\r\n\n"
                + "a. No\r\n"
                + "b. Sí\r\n"
                + "c. Solo si se usa con un join\r\n"
                + "d. La instrucción delete no existe \r\n");
        String pregunta5 = sc.next();
        numpreguntas++;
        if (pregunta5.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("6. Señala la respuesta incorrecta. Copias de seguridad: (Tema 13)\r\n\n"
                + "a. En frío\r\n"
                + "b. En caliente\r\n"
                + "c. Completa\r\n"
                + "d. Incompleta\r\n");

        String pregunta6 = sc.next();
        numpreguntas++;
        if (pregunta6.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("7.La instrucción “Rollback”...(Tema 14)\r\n\n"
                + "a. Provoca que todos los cambios realizados sean definitivos\r\n"
                + "b. Anula todas las instrucciones de la transacción\r\n"
                + "c. Es similar al commit y su función es aceptar la transacción\r\n"
                + "d. Provoca que solo un cambio realizado sea definitivo\r\n");

        String pregunta7 = sc.next();
        numpreguntas++;
        if (pregunta7.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("8. ¿Qué cláusula agrupa la información seleccionada? (Tema 8)\r\n\n"
                + "a. WHERE\r\n"
                + "b. FROM\r\n"
                + "c. ORDER BY\r\n"
                + "d. COUNT");
        String pregunta8 = sc.next();
        numpreguntas++;
        if (pregunta8.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("9.  De las siguientes opciones, ¿con cuál de ellas podemos ordenar los resultados de forma descendente con la cláusula “Order By”? (Tema 9)\r\n\n"
                + "a. Añadiendo un signo - al campo que deseamos ordenar\r\n"
                + "b. Añadiendo un signo + al campo que deseamos ordenar\r\n"
                + "c. Añadiendo la palabra “asc” después del campo a ordenar\r\n"
                + "d. Añadiendo la palabra “reverse” después del campo a ordenar\r\n");
        String pregunta9 = sc.next();
        numpreguntas++;
        if (pregunta9.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }


        System.out.println("10. Los operadores lógicos (Tema 10)\r\n\n"
                + "a. Sirven para evaluar múltiples condiciones en una sola sentencia\r\n"
                + "b. Indican el orden en el que se evaluarán las condiciones\r\n"
                + "c. Permiten mostrar múltiples elementos en una sola columna\r\n"
                + "d. Ninguna es correcta");
        String pregunta10 = sc.next();
        numpreguntas++;
        if (pregunta10.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("11. ¿Qué tipo de “Join” no es correcto? (Tema 11)\r\n\n"
                + "a. Full\r\n"
                + "b. Full Outer\r\n"
                + "c. Left Join\r\n"
                + "d. Center Join\r\n");

        String pregunta11 = sc.next();
        numpreguntas++;
        if (pregunta11.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("12.¿Con qué instrucción indicamos que se actualice en cascada los datos de una columna en caso de que estén asociados de alguna forma con otra tabla? (Tema 12)\r\n\n"
                + "a. On delete cascade\r\n"
                + "b. On update restrict\r\n"
                + "c. On update cascade\r\n"
                + "d. Ninguna es correcta\r\n");

        String pregunta12 = sc.next();
        numpreguntas++;
        if (pregunta12.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("13. ¿Cuál de estas opciones no es una restricción sobre campos de una tabla? (Tema 13)\r\n\n"
                + "a. DEFAULT\r\n"
                + "b. UNIQUE\r\n"
                + "c. SSD\r\n"
                + "d. CHECK\r\n");
        String pregunta13 = sc.next();
        numpreguntas++;
        if (pregunta13.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }
        System.out.println("14. Los bloqueos automáticos son: (Tema 14)\r\n\n"
                + "a. DDL, DML y DTD\r\n"
                + "b. DML, DDL y de software\r\n"
                + "c. De Sistema, DDL y DML\r\n"
                + "d. Exclusivo, DML y DDL \r\n");

        String pregunta14 = sc.next();
        numpreguntas++;
        if (pregunta14.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("15. ¿Qué restricción o constraint indica que no se puede repetir valores en la misma columna? (Tema 8)\r\n\n"
                + "a. NOT NULL\r\n"
                + "b. UNIQUE\r\n"
                + "c. PRIMARY KEY\r\n"
                + "d. CHECK\r\n");
        String pregunta15 = sc.next();
        numpreguntas++;
        if (pregunta15.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("16.  ¿Con qué comando actualizamos unos datos ya introducidos en una tabla? (Tema 9)\r\n\n"
                + "a. ALTER\r\n"
                + "b. UPDATE\r\n"
                + "c. INSERT INTO\r\n"
                + "d. MODIFY \r\n");
        String pregunta16 = sc.next();
        numpreguntas++;
        if (pregunta16.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }


        System.out.println("17. El operador AND… (Tema 10)\r\n\n"
                + "a. Devuelve TRUE si todas las condiciones se cumplen\r\n"
                + "b. Devuelve TRUE si alguna de las condiciones se cumplen\r\n"
                + "c. Si la expresión es TRUE, devuelve FALSE y viceversa\r\n"
                + "d. Ninguna de las anteriores\r\n");
        String pregunta17 = sc.next();
        numpreguntas++;
        if (pregunta17.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("18. ¿Qué tipo de valores puede obtener la cláusula “exist” en una subconsulta? (Tema 11)\r\n\n"
                + "a. Boolean\r\n"
                + "b. String\r\n"
                + "c. Integer\r\n"
                + "d. Char\r\n");

        String pregunta18 = sc.next();
        numpreguntas++;
        if (pregunta18.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("19. Las diferentes opciones para la inserción, modificación o borrado de datos son: (Tema 12)\r\n\n"
                + "a. Uso de herramientas gráficas propias de cada SGBD\r\n"
                + "b. A y C son correctas\r\n"
                + "c. Comandos SQL\r\n"
                + "d. Ninguna es correcta \r\n");
        String pregunta19 = sc.next();
        numpreguntas++;
        if (pregunta19.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("20.  ¿Para qué sirve la restricción “Unique”? (Tema 13)\r\n\n"
                + "a. No se permiten valores duplicados, todos deben ser únicos\r\n"
                + "b. Establece prohibición\r\n"
                + "c. Establece una condición que deben cumplir los campos que posean dicha restricción\r\n"
                + "d. En el caso de que un campo no tenga un valor especificado, se le proporcionará uno por defecto\r\n");

        String pregunta20 = sc.next();
        numpreguntas++;
        if (pregunta20.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("21. ¿Qué es un “Savepoint”? (Tema 14)\r\n\n"
                + "a. Punto de ejecución\r\n"
                + "b. Punto de alteración\r\n"
                + "c. Punto de creación\r\n"
                + "d. Punto de restauración \r\n");

        String pregunta21 = sc.next();
        numpreguntas++;
        if (pregunta21.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("22. ¿Cómo indicamos que queremos seleccionar todos los valores de una tabla? (Tema 8)\r\n\n"
                + "a. SELECT ALL FROM TABLA\r\n"
                + "b. SELECT TABLA\r\n"
                + "c. SELECT TABLES FROM TABLA\r\n"
                + "d. SELECT * FROM TABLA\r\n");
        String pregunta22 = sc.next();
        numpreguntas++;
        if (pregunta22.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }
        System.out.println("23. La sentencia “Where” es aquella que: (Tema 9)\r\n\n"
                + "a. Por sí misma proporciona la capacidad de acceder a los datos de todas las columnas de una o varias tablas\r\n"
                + "b. Especifica el lugar del que se obtiene la información\r\n"
                + "c. Indica los datos que se quieren comprobar\r\n"
                + "d. Ejecuta una instrucción DML \r\n");
        String pregunta23 = sc.next();
        numpreguntas++;
        if (pregunta23.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("24. La función SQRT(num): (Tema 10)\r\n\n"
                + "a. Devuelve el valor absoluto de num\r\n"
                + "b. Devuelve el exponente en base 10 de num\r\n"
                + "c. Devuelve la tangente de num, siendo este tomado en radianes\r\n"
                + "d. Devuelve la raíz cuadrada de num \r\n");

        String pregunta24 = sc.next();
        numpreguntas++;
        if (pregunta24.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }
        System.out.println("25. ¿Qué hace la cláusula “Intersect”? (Tema 12)\r\n\n"
                + "a. Se analizan las filas de dos select, devolviendo únicamente aquellas filas que estén en ambas tablas\r\n"
                + "b. Se analiza la fila de un select, devolviendo aquellas filas que aparezcan solo una vez\r\n"
                + "c. Se analizan las filas de dos select, devolviendo aquellas filas que no estén en ambas tablas\r\n"
                + "d. Se analiza la fila de un select, devolviendo aquellas filas que aparezcan más de una vez\r\n");
        String pregunta25 = sc.next();
        numpreguntas++;
        if (pregunta25.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("26. ¿Qué comando sirve para insertar datos a la tabla mediante una subconsulta?(Tema 12)\r\n\n"
                + "a. Insert\r\n"
                + "b. Insert into\r\n"
                + "c. Select\r\n"
                + "d. Ninguna de las anteriores\r\n");
        String pregunta26 = sc.next();
        numpreguntas++;
        if (pregunta26.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("27.  Podemos distinguir entre claves de diferentes tipos. Cuál o cuáles de los siguientes serían tipos de clave válidos: (Tema 13)\r\n\n"
                + "a. Candidatas\r\n"
                + "b. Primarias\r\n"
                + "c. Ajenas\r\n"
                + "d. Todas son correctas\r\n");

        String pregunta27 = sc.next();
        numpreguntas++;
        if (pregunta27.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("28. En cuanto a los protocolos de seguridad para evitar conflictos entre transacciones, ¿cuál o cuáles son correctas? (Tema 14)\r\n\n"
                + "a. Wait - die\r\n"
                + "b. Wount - Wait\r\n"
                + "c. Wount - die\r\n"
                + "d. A y B son correctas \r\n");

        String pregunta28 = sc.next();
        numpreguntas++;
        if (pregunta28.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("29. Señala la norma incorrecta de construcción de una sentencia SQL (Tema 8)\r\n\n"
                + "a. Se distingue entre mayúsculas y minúsculas\r\n"
                + "b. Se debe colocar “;” al final de la instrucción\r\n"
                + "c. Se permite la inserción de espacios o saltos de línea en el comando para facilitar su compresión\r\n"
                + "d. Se incluyen los comentarios entre “/* */”\r\n");
        String pregunta29 = sc.next();
        numpreguntas++;
        if (pregunta29.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("30. En un “Order By”, si no se indica el criterio de ordenación,¿qué sucede? (Tema 9)\r\n\n"
                + "a. Se ordena automáticamente en orden descendente\r\n"
                + "b. Se ordena automáticamente en orden ascendente\r\n"
                + "c. No se ejecuta puesto que siempre tiene que indicarse el criterio de ordenación\r\n"
                + "d. Ninguna de las anteriores es correcta \r\n");
        String pregunta30 = sc.next();
        numpreguntas++;
        if (pregunta30.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }
        System.out.println("31. Seleccione cuál o cuáles de los siguientes operadores son de concatenación: (Tema 10)\r\n\n"
                + "a. ||\r\n"
                + "b. AND\r\n"
                + "c. OR\r\n"
                + "d. A y B son correctas \r\n");
        String pregunta31 = sc.next();
        numpreguntas++;
        if (pregunta31.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("32. ¿Qué significan las siglas de las normas ACID? (Tema 11)\r\n\n"
                + "a. Atomicidad, Consolidación, Aislamiento y Durabilidad\r\n"
                + "b. Atomicidad, Consistencia, Aislamiento y Desgaste\r\n"
                + "c. Atomicidad, Consistencia, Aislamiento y Durabilidad\r\n"
                + "d. Atomicidad, Celiaquía, Aislamiento y Desgaste \r\n");

        String pregunta32 = sc.next();
        numpreguntas++;
        if (pregunta32.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("33. ¿Con qué comando borramos los registros de una tabla? (Tema 12)\r\n\n"
                + "a. Update\r\n"
                + "b. Delete\r\n"
                + "c. Select\r\n"
                + "d. Ninguna de las anteriores \r\n");
        String pregunta33 = sc.next();
        numpreguntas++;
        if (pregunta33.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("34. ¿Cuál de las siguientes no es una restricción aplicable sobre los campos de una tabla? (Tema 13)\r\n\n"
                + "a. UNIQUE\r\n"
                + "b. NOT NULL\r\n"
                + "c. NULL\r\n"
                + "d. CHECK\r\n");

        String pregunta34 = sc.next();
        numpreguntas++;
        if (pregunta34.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("35.  ¿Qué es una transacción? (Tema 14)\r\n\n"
                + "a. Agrupación de sentencias SQL de tipo DML\r\n"
                + "b. Agrupación de sentencias SQL de tipo DDL\r\n"
                + "c. Agrupación de sentencias SQL de tipo UML\r\n"
                + "d. Agrupación de resultados SQL de tipo DML \r\n");

        String pregunta35 = sc.next();
        numpreguntas++;
        if (pregunta35.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        int fallaux =(int) falladas;
        int acertaux =(int) correctas;
        System.out.println("Has acertado " + acertaux + " preguntas. \n"
                + "Has fallado " + fallaux + " preguntas. \n");

        double nota = (correctas/numpreguntas)*10;
        double resta = ((falladas/numpreguntas)/3)*10;
        double notafinal = (nota-resta);

        System.out.println("Has sacado un "+notafinal);
        sc.close();

    }
}