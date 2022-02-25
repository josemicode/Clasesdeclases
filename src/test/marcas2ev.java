package test;

import java.util.Scanner;

public class marcas2ev {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double correctas = 0;
        double falladas = 0;
        double numpreguntas = 0;

        System.out.println("1. Indica qué hace la propiedad de texto “text-decoration” (Tema 8)\r\n\n"
                + "A - Efectos de tachado, subrayado, etc\r\n"
                + "B - Mayúsculas y minúsculas \r\n"
                + "C - Le añade color \r\n"
                + "D - Cambia la fuente del texto");
        String pregunta1 = sc.next();
        numpreguntas++;
        if (pregunta1.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("2. La propiedad “position” nos permitirá cambiar la posición de los elementos HTML a lo largo de la página. Los valores que puede tener esta propiedad son: (Tema 9)\r\n\n"
                + "A - relative, absolute, fixed y float \r\n"
                + "B - static, relative, absolute y fixed\r\n"
                + "C - static, relative, fixed y float \r\n"
                + "D - static, relative, absolute y float\r\n");
        String pregunta2 = sc.next();
        numpreguntas++;
        if (pregunta2.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        }else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }


        System.out.println("3. Marque la afirmación incorrecta sobre XML: (Tema 10)\r\n\n"
                + "A - Sustituye a HTML \r\n"
                + "B - No es un estándar de comunicación\r\n"
                + "C - No es un gestor de bases de datos\r\n"
                + "D - No es un lenguaje de programación \r\n");
        String pregunta3 = sc.next();
        numpreguntas++;
        if (pregunta3.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("4.¿Cuál de estas sintaxis para elementos XSD es incorrecta? (Tema 11)\r\n\n"
                + "A. name\r\n"
                + "B. type\r\n"
                + "C. min/max Occurs\r\n"
                + "D. use");

        String pregunta4 = sc.next();
        numpreguntas++;
        if (pregunta4.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("5. ¿Qué es un nodo descendente? (Tema 12)\r\n\n"
                + "a. Todos aquellos que descienden de él\r\n"
                + "b. Todos aquellos que son ascendentes a él\r\n"
                + "c. Ninguna de las dos\r\n"
                + "d. Todo nodo que tenga un atributo asociado");
        String pregunta5 = sc.next();
        numpreguntas++;
        if (pregunta5.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("6.¿Qué utiliza XSLT para indicar sobre qué partes del documento quiere actuar XML?(Tema 13)\r\n\n"
                + "a. XSL\r\n"
                + "b. XPath\r\n"
                + "c. CSS\r\n"
                + "d. HTML\r\n");

        String pregunta6 = sc.next();
        numpreguntas++;
        if (pregunta6.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("7.  Atributos del elemento “<xsl:sort>” (Tema 14)\r\n\n"
                + "a. Select, order, case-order\r\n"
                + "b. Select, order\r\n"
                + "c. Order, case-order\r\n"
                + "d. Select, case-order\r\n");

        String pregunta7 = sc.next();
        numpreguntas++;
        if (pregunta7.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("8. ¿Qué propiedad modifica el estilo de la viñeta? (Tema 8)\r\n\n"
                + "a. font-family\r\n"
                + "b. text-align\r\n"
                + "c. text-decoration\r\n"
                + "d. list-style-type\r\n");
        String pregunta8 = sc.next();
        numpreguntas++;
        if (pregunta8.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("9. A la hora de diferenciar entre box-shadow y text-shadow, hay una propiedad que no usamos en la segunda. ¿Cuál de las siguientes? (Tema 9)\r\n\n"
                + "a. Separación horizontal de la sombra\r\n"
                + "b. Distancia de propagación\r\n"
                + "c. Radio de desenfoque\r\n"
                + "d. Ninguna de las anteriores");
        String pregunta9 = sc.next();
        numpreguntas++;
        if (pregunta9.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("10. Seleccione la opción correcta (Tema 10)\r\n\n"
                + "a. XML es un lenguaje estructural libre en la creación de etiquetas derivado de HTML\r\n"
                + "b. XML es un lenguaje estructura restringido en la creación de etiquetas derivado de SGM\r\n"
                + "c. XML es un lenguaje estructural libre en la creación de etiquetas derivado de SGML\r\n"
                + "d. XML no es un lenguaje estructural libre en la creación de de etiquetas derivado de SGML \r\n");
        String pregunta10 = sc.next();
        numpreguntas++;
        if (pregunta10.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("11. ¿Qué tipo de dato es incorrecto? (Tema 11)\r\n\n"
                + "a. String\r\n"
                + "b. boolean\r\n"
                + "c. int\r\n"
                + "d. integer\r\n");

        String pregunta11 = sc.next();
        numpreguntas++;
        if (pregunta11.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("12.  ¿Qué herramientas podemos usar para la validación de expresiones XPath? (Tema 12)\r\n\n"
                + "a. Visual Paradigm y VS Code\r\n"
                + "b. Eclipse y NetBeans\r\n"
                + "c. XSD Copy Editor y XPath Beautift\r\n"
                + "d. XML Copy Editor, Notepad ++ y Codebeautify.org\r\n");
        String pregunta12 = sc.next();
        numpreguntas++;
        if (pregunta12.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("13. ¿Qué realiza la función “Elemento <xsl:output>”? (Tema 13)\r\n\n"
                + "a. Indica el formato del documento resultado\r\n"
                + "b. Permite extraer el contenido del nodo que se haya seleccionado o también un atributo asociado\r\n"
                + "c. Se pueden incluir comentarios en el documento resultado\r\n"
                + "d. Nos permite insertar espacios en blanco o cualquier carácter que no se pueda insertar de manera directa\r\n");

        String pregunta13 = sc.next();
        numpreguntas++;
        if (pregunta13.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("14.  Atributos del elemento “<xsl:sort>” (Tema 14)\r\n\n"
                + "a. Select, order, case-order\r\n"
                + "b. Select, order\r\n"
                + "c. Order, case-order\r\n"
                + "d. Select, case-order \r\n");

        String pregunta14 = sc.next();
        numpreguntas++;
        if (pregunta14.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("15. ¿Qué propiedad indica la ubicación del título? (Tema 8)\r\n\n"
                + "a. width\r\n"
                + "b. vertical-align\r\n"
                + "c. caption-side\r\n"
                + "d. border-collapse\r\n");
        String pregunta15 = sc.next();
        numpreguntas++;
        if (pregunta15.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("16. Entre las principales novedades de CSS3, no podemos destacar la siguiente opción: (Tema 9)\r\n\n"
                + "a. Varias columnas en el contenido\r\n"
                + "b. Nuevos posicionamientos de cajas\r\n"
                + "c. Nuevos selectores\r\n"
                + "d. Nuevo tipo de negrita \r\n");
        String pregunta16 = sc.next();
        numpreguntas++;
        if (pregunta16.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas +=1;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("17. Indique qué tipo de atributo es incorrecto (Tema 10)\r\n\n"
                + "a. CDATA: Cadena de texto; valor alfanumérico\r\n"
                + "b. ENTITY: Entidad definida previamente\r\n"
                + "c. ID: Un nombre sin espacios en blancO\r\n"
                + "d. ENTITIES: Conjunto de entidades\r\n");
        String pregunta17 = sc.next();
        numpreguntas++;
        if (pregunta17.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("18. ¿Cómo se indica qué esquema .xsd queremos usar para la validación del documento? (Tema 11)\r\n\n"
                + "a. xsi:noNamespaceSchemaLocation\r\n"
                + "b. xsi:NamespaceSchemaLocation\r\n"
                + "c. xsd:add\r\n"
                + "d. xsi:Schema");

        String pregunta18 = sc.next();
        numpreguntas++;
        if (pregunta18.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("19. ¿Qué contiene un fichero XML? (Tema 12)\r\n\n"
                + "a. Información no estructurada\r\n"
                + "b. Información estructurada\r\n"
                + "c. A y B son correctas\r\n"
                + "d. Las etiquetas <body> y <head> \r\n");
        String pregunta19 = sc.next();
        numpreguntas++;
        if (pregunta19.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("20.  ¿Qué elemento pueden invocar otras plantillas dentro de una plantilla origen? (Tema 13)\r\n\n"
                + "a. xsl:text\r\n"
                + "b. xsl:templates\r\n"
                + "c. xsl:template match\r\n"
                + "d. xsl:apply templates\r\n");

        String pregunta20 = sc.next();
        numpreguntas++;
        if (pregunta20.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("21. Marque la correcta (Tema 14)\r\n\n"
                + "a. Los depuradores son muy útiles de cara a poder localizar posibles errores en nuestras instrucciones XML\r\n"
                + "b. No permite acciones como ejecutar el código paso a paso\r\n"
                + "c. Permite seguir la generación del documento de salida a partir del documento XML aplicando la hoja de estilo XSLT\r\n"
                + "d. Todas son correctas \r\n");

        String pregunta21 = sc.next();
        numpreguntas++;
        if (pregunta21.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("22. ¿Qué propiedad usamos para indicar el espacio que va a existir entre cajas? (Tema 8)\r\n\n"
                + "a. content\r\n"
                + "b. margin\r\n"
                + "c. border\r\n"
                + "d. background\r\n");
        String pregunta22 = sc.next();
        numpreguntas++;
        if (pregunta22.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("23. Indique con cuál de las siguientes propiedades indicamos el orden de apilamiento (Tema 9)\r\n\n"
                + "a. top\r\n"
                + "b. z-index\r\n"
                + "c. y-index\r\n"
                + "d. pila de hanoi \r\n");
        String pregunta23 = sc.next();
        numpreguntas++;
        if (pregunta23.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("24.Un documento “.DTD”: (Tema 10)\r\n\n"
                + "a. Sirve para definir una estructura para documentos XML\r\n"
                + "b. Es siempre externo y privado\r\n"
                + "c. Es un tipo de XML\r\n"
                + "d. Ninguna es correcta \r\n");
        String pregunta24 = sc.next();
        numpreguntas++;
        if (pregunta24.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("25.  ¿Cómo se declara que un atributo no puede aparecer en el XML? (Tema 11)\r\n\n"
                + "a. use=”hidden”\r\n"
                + "b. use=”required”\r\n"
                + "c. use=”prohibited”\r\n"
                + "d. use=”nonshowdable” \r\n");

        String pregunta25 = sc.next();
        numpreguntas++;
        if (pregunta25.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("26. ¿De qué consta un documento XML? (Tema 12)\r\n\n"
                + "a. Nodos descendentes\r\n"
                + "b. Nodos ascendentes\r\n"
                + "c. Consta de nodos y ramas que están interconectados\r\n"
                + "d. De una cabecera <head> y un cuerpo <body>\r\n");
        String pregunta26 = sc.next();
        numpreguntas++;
        if (pregunta26.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("27.  ¿Cuál es considerada la parte más importante de XSL? (Tema 13)\r\n\n"
                + "a. XSLT\r\n"
                + "b. XPath\r\n"
                + "c. XSLD\r\n"
                + "d. XML \r\n");

        String pregunta27 = sc.next();
        numpreguntas++;
        if (pregunta27.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("28. ¿Cómo se define un bloque try? (Tema 14)\r\n\n"
                + "a. Seguir la generación del documento de salida a partir del documento XML\r\n"
                + "b. Es útil de cara a poder localizar posibles errores\r\n"
                + "c. Van eliminando el código erróneo\r\n"
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

        System.out.println("29.  ¿Con qué propiedad modificamos el espacio entre caracteres de una palabra? (Tema 8)\r\n\n"
                + "a. letter-spacing\r\n"
                + "b. word-spacing\r\n"
                + "c. text-decoration\r\n"
                + "d. line-height\r\n ");
        String pregunta29 = sc.next();
        numpreguntas++;
        if (pregunta29.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("30. ¿Qué permite hacer la propiedad “clear”? (Tema 9)\r\n\n"
                + "a. Permite que los elementos floten en la orientación que le indiquemos\r\n"
                + "b. Permite que los elementos floten en la orientación que ellos consideren\r\n"
                + "c. No permite que los elementos floten en la orientación que indiquemos\r\n"
                + "d. No permite que los elementos floten en la orientación que se indique en el elemento <head> \r\n");
        String pregunta30 = sc.next();
        numpreguntas++;
        if (pregunta30.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("31. Un documento “.XML”: (Tema 10)\r\n\n"
                + "a. está bien formado cuando no cumple las reglas sintácticas definidas en la recomendación W3C\r\n"
                + "b. está bien formado cuando cumple las reglas sintácticas definidas en la recomendación W2C\r\n"
                + "c. está mal formado cuando cumple las reglas sintácticas definidas en la recomendación W3C\r\n"
                + "d. está bien formado cuando cumple las reglas sintácticas definidas en la recomendación W3C \r\n");
        String pregunta31 = sc.next();
        numpreguntas++;
        if (pregunta31.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("32.  ¿Cómo empieza la estructura de un esquema? (Tema 11)\r\n\n"
                + "a. Es un documento XML, por lo que la primera línea que debe aparecer es la declaración HTML\r\n"
                + "b. Se definen los elementos que van a formar parte de las reglas que se tienen que cumplir\r\n"
                + "c. Es un documento XML, por lo que la primera línea que debe aparecer es la declaración XML\r\n"
                + "d. Se definen los elementos que van a formar parte de las reglas que se tienen que cumplir en el esquema \r\n");

        String pregunta32 = sc.next();
        numpreguntas++;
        if (pregunta32.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("33. ¿Cómo es la sintaxis XPath predicado y qué nos permite? (Tema 12)\r\n\n"
                + "a. Es con () y nos permite hacer una referencia completa\r\n"
                + "b. Es con [] y nos permite afinar la búsqueda aplicando condiciones\r\n"
                + "c. Es con // y nos permite escribir la continuación del eje\r\n"
                + "d. Es con @@ y nos permite hacer una restricción\r\n");
        String pregunta33 = sc.next();
        numpreguntas++;
        if (pregunta33.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("34.  ¿Qué atributos contiene el elemento “<stylesheet>”? (Tema 13)\r\n\n"
                + "a. tipo y versión\r\n"
                + "b. versión y espacio de nombre\r\n"
                + "c. nombre y documento CSS\r\n"
                + "d. solo la versión\r\n");

        String pregunta34 = sc.next();
        numpreguntas++;
        if (pregunta34.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("35. ¿Para qué sirve el elemento “<xsl:if>”? (Tema 14)\r\n\n"
                + "a. Instrucción condicional\r\n"
                + "b. Elegir entre varias condiciones para realizar diferentes transformaciones\r\n"
                + "c. Ordenar los resultados obtenidos en la salida\r\n"
                + "d. Recorrer de manera iterativa diversos nodos del documento origen \r\n");

        String pregunta35 = sc.next();
        numpreguntas++;
        if (pregunta35.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("36.¿Con cuál de las siguientes pseudoclases accedemos al enésimo hijo? (Tema 8)\r\n\n"
                + "a. :last-child\r\n"
                + "b. :nth-child(n)\r\n"
                + "c. :hover\r\n"
                + "d. :child-nth(n) ");
        String pregunta36 = sc.next();
        numpreguntas++;
        if (pregunta36.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("37.  Los atributos estaticos: (Tema 9)\r\n\n"
                + "a. rotate(x)\r\n"
                + "b. translate(x,y)\r\n"
                + "c. scale(x,y)\r\n"
                + "d. flip(x) \r\n");
        String pregunta37 = sc.next();
        numpreguntas++;
        if (pregunta37.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("38. Señale la respuesta correcta: (Tema 10)\r\n\n"
                + "a. XML no es un lenguaje de programación\r\n"
                + "b. XML es un lenguaje de programación\r\n"
                + "c. XML necesita de licencia de pago para su uso\r\n"
                + "d. XML significa “Lenguaje de Marcado Inmutable” \r\n");
        String pregunta38 = sc.next();
        numpreguntas++;
        if (pregunta38.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }


        System.out.println("39. ¿Cuál de las siguientes opciones no es una restricción en los tipos de datos simples personalizados? (Tema 11)\r\n\n"
                + "a. totalDigits\r\n"
                + "b. String\r\n"
                + "c. minLength\r\n"
                + "d. pattern \r\n");

        String pregunta39 = sc.next();
        numpreguntas++;
        if (pregunta39.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("40. ¿Qué seleccionamos con el @*? (Tema 12)\r\n\n"
                + "a. Todos los hijos (solo los elementos)\r\n"
                + "b. Selecciona únicamente el texto contenido y no muestra las etiquetas\r\n"
                + "c. A y B son correctas\r\n"
                + "d. Selecciona todos los atributos del nodo\r\n");
        String pregunta40 = sc.next();
        numpreguntas++;
        if (pregunta40.equalsIgnoreCase("D")) {
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

        double nota =(correctas/numpreguntas)*10;
        double resta = ((falladas/numpreguntas)/3)*10;
        double notafinal = (nota-resta);

        System.out.println("Has sacado un "+notafinal);
        sc.close();
    }

}
