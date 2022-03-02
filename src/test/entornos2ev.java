package test;

import java.util.Scanner;

public class entornos2ev {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double correctas = 0;
        double falladas = 0;
        double numpreguntas = 0;

        System.out.println("1.Cuál es la definición de diagrama de casos de uso (Tema 8)\r\n\n"
                + "a. Tipo de diagrama que permite describir las diferentes interacciones que tienen los objetos de nuestros sistema a lo largo del tiempo\r\n"
                + "b. Tipo de diagrama que permite mostrar las diferentes operaciones que pueda\r\n"
                + "c. Tipo de diagrama que permite indicar los diferentes estados por los que va pasando un objeto dentro del flujo de ejecución de software\r\n"
                + "d. Ninguna de las anteriores \r\n");
        String pregunta1 = sc.next();
        numpreguntas++;
        if (pregunta1.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("2. Entre los tipos de relación existentes en los diagramas de casos de uso, podemos encontrar: (Tema 9)\r\n\n"
                + "a. Inclusividad\r\n"
                + "b. Exclusión\r\n"
                + "c. Exclusividad\r\n"
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

        System.out.println("3. Para poder elaborar un diagrama de secuencia, es importante... (Tema 10)\r\n\n"
                + "a. Ramificar para expresar diferentes situaciones\r\n"
                + "b. Definir el concepto de lifeline\r\n"
                + "c. Introducir diferentes condiciones como bucles, sentencias, etc.\r\n"
                + "d. Ninguna es correcta \r\n");
        String pregunta3 = sc.next();
        numpreguntas++;
        if (pregunta3.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("4. ¿Cuál no es un elemento de los diagramas de actividad? (Tema 11)\r\n\n"
                + "a. Estado inicial\r\n"
                + "b. Actividad\r\n"
                + "c. Acciones\r\n"
                + "d. Errores\r\n");

        String pregunta4 = sc.next();
        numpreguntas++;
        if (pregunta4.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("5. ¿Cuál es el primer paso para dibujar un diagrama de estado? (Tema 12)\r\n\n"
                + "a. Identificar los diferentes estados y los objetos que puedan existir en ellos\r\n"
                + "b. Etiquetar los eventos que puedan servir para lanzar la transición\r\n"
                + "c. Identificar el estado inicial y los estados de finalización\r\n"
                + "d. Ninguna de las anteriores es correcta \r\n");
        String pregunta5 = sc.next();
        numpreguntas++;
        if (pregunta5.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("6. ¿Qué comando de Git subiría los cambios al repositorio remoto? (Tema 19)\r\n\n"
                + "a. commit\r\n"
                + "b. push\r\n"
                + "c. pull\r\n"
                + "d. add\r\n");

        String pregunta6 = sc.next();
        numpreguntas++;
        if (pregunta6.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("7. GitLab se define por…(Tema 20)\r\n\n"
                + "a. Servicio web que implemente un sistema de control de versiones para facilitar el trabajo colaborativo mediante el uso de repositorios\r\n"
                + "b. Servicio web que implemente un sistema de control de versiones para facilitar el trabajo individual mediante el uso de repositorios\r\n"
                + "c. Servicio local que implemente un sistema de control de versiones para facilitar el trabajo colaborativo mediante el uso de repositorios\r\n"
                + "d. Servicio local que implemente un sistema de control de versiones para facilitar el trabajo individual mediante el uso de repositorios\r\n");

        String pregunta7 = sc.next();
        numpreguntas++;
        if (pregunta7.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("8. ¿Cuál de las siguientes operaciones no es un diagrama de comportamiento? (Tema 8)\r\n\n"
                + "a. Diagrama de casos de uso\r\n"
                + "b. Diagrama de estados\r\n"
                + "c. Diagrama de secuencia\r\n"
                + "d. Diagrama de emergencia\r\n");
        String pregunta8 = sc.next();
        numpreguntas++;
        if (pregunta8.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("9.  ¿Cuáles son los elementos que intervienen en un diagrama de casos de uso?(Tema 9)\r\n\n"
                + "a. Caso de relación - Actor - Sistema - Relaciones\r\n"
                + "b. Caso de uso - Actor - Sistema - Relaciones\r\n"
                + "c. Caso de uso - Esquema - Sistema - Relaciones\r\n"
                + "d. Caso de relación - Esquema - Sistema - Relaciones\r\n");
        String pregunta9 = sc.next();
        numpreguntas++;
        if (pregunta9.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("10. Identifique la opción correcta sobre los mensajes Síncronos: (Tema 10)\r\n\n"
                + "a. Mediante este tipo de mensajes, los objetos invocados quedan bloqueados hasta que finaliza la llamada al método de otro objeto\r\n"
                + "b. Se trata de mensajes cuya ejecución es inmediata y terminan rápidamente\r\n"
                + "c. Se trata de mensajes cuya ejecución es lenta y terminan lentamente una vez se ejecutan\r\n"
                + "d. A y B son correctas");
        String pregunta10 = sc.next();
        numpreguntas++;
        if (pregunta10.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("11. ¿Qué es un diagrama de Gantt? (Tema 11)\r\n\n"
                + "a. Permiten introducir una representación gráfica de las tareas sobre una escala de tiempo usando un diagrama de barras\r\n"
                + "b. Permiten introducir una representación gráfica de las tareas sobre una escala de tiempo usando un diagrama circular\r\n"
                + "c. Permiten introducir una representación gráfica de las tareas sobre una desescalada de tiempo usando un diagrama circular\r\n"
                + "d. No permiten introducir una representación gráfica de las tareas sobre una torre de tiempo usando un diagrama circular\r\n");

        String pregunta11 = sc.next();
        numpreguntas++;
        if (pregunta11.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("12. ¿Cuál de las siguientes metodologías están basadas en pruebas para poder avanzar correctamente en el desarrollo de software? (Tema 12)\r\n\n"
                + "a. SCRAM\r\n"
                + "b. TDO\r\n"
                + "c. TDD/SCRUM\r\n"
                + "d. GTA\r\n");

        String pregunta12 = sc.next();
        numpreguntas++;
        if (pregunta12.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("13. ¿Qué comando usamos para realizar una clonación de código remoto a nuestra máquina? (Tema 19)\r\n\n"
                + "a. Git clone\r\n"
                + "b. Git init\r\n"
                + "c. Git log\r\n"
                + "d. Git pull\r\n");
        String pregunta13 = sc.next();
        numpreguntas++;
        if (pregunta13.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("14. De las siguientes, ¿cuáles son opciones de repositorios Cloud? (Tema 20)\r\n\n"
                + "a. Bitbucket, SaaS, GNU, Gitea\r\n"
                + "b. Bitbucket, PaaS, SourceForge, GNU Savannah,Gitea\r\n"
                + "c. Bitbucket, SourceForge, GNU Savannah, Gitea\r\n"
                + "d. Gitea, Saas, PaaS, SourceForge \r\n");

        String pregunta14 = sc.next();
        numpreguntas++;
        if (pregunta14.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("15. ¿Cuáles de estos tipos de comportamientos se definen en el diagrama UML? (Tema 8)\r\n\n"
                + "a. Comportamientos de ejecución\r\n"
                + "b. Comportamientos emergentes\r\n"
                + "c. Comportamientos de sujeción\r\n"
                + "d. A y B son correctas\r\n");
        String pregunta15 = sc.next();
        numpreguntas++;
        if (pregunta15.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("16. Los diagramas de casos de uso permiten: (Tema 9)\r\n\n"
                + "a. Indicar cómo los diferentes actores pueden trabajar con el sistema\r\n"
                + "b. Indicar los datos de los diferentes actores\r\n"
                + "c. Indicar los actores del objeto\r\n"
                + "d. Hacer una representación gráfica del ejercicio \r\n");
        String pregunta16 = sc.next();
        numpreguntas++;
        if (pregunta16.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("17. En los diagramas de colaboración (Tema 10)\r\n\n"
                + "a. Se sigue el orden de intercambio de mensajes\r\n"
                + "b. No existen lifelines\r\n"
                + "c. Se especifican los diferentes casos que un usuario le puede dar al sistema\r\n"
                + "d. A y B son correctas\r\n");
        String pregunta17 = sc.next();
        numpreguntas++;
        if (pregunta17.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("18. Las siglas P.E.R.T significan… (Tema 11)\r\n\n"
                + "a. Program Evaluation & Review Tech\r\n"
                + "b. Program Elevation & Review Tech\r\n"
                + "c. Program Evaluation & Review Technique\r\n"
                + "d. Program Evaluation & Reply Technique \r\n");

        String pregunta18 = sc.next();
        numpreguntas++;
        if (pregunta18.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }
        System.out.println("19. ¿Qué requieren las pruebas de software? (Tema 12)\r\n\n"
                + "a. Tener conocimientos de HTML\r\n"
                + "b. Un buen conocimiento de la tecnología\r\n"
                + "c. Ninguna de las anteriores\r\n"
                + "d. Un mal conocimiento de la tecnología \r\n");

        String pregunta19 = sc.next();
        numpreguntas++;
        if (pregunta19.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("20. ¿Qué es Git? (Tema 19)\r\n\n"
                + "a. Es un sistema de control de versiones centralizado que permite que diferentes usuarios puedan gestionar el código de una manera sencilla\r\n"
                + "b. Es un sistema de control de versiones que permite que cada uno de los usuarios que trabaja en el proyecto posee una copia local de todo el repositorio\r\n"
                + "c. Es una clasificación de los sistemas de control de versiones\r\n"
                + "d. Ninguna es correcta\r\n");

        String pregunta20 = sc.next();
        numpreguntas++;
        if (pregunta20.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("21. La arquitectura SaaS se caracteriza por: (Tema 14)\r\n\n"
                + "a. Posible uso de software a través de aplicaciones con conexiones remotas\r\n"
                + "b. Conectar a sistemas remotos para acceder a todos los servicios que pueda ofrecer\r\n"
                + "c. Posible uso de hardware a través de aplicaciones con conexiones remotas\r\n"
                + "d. Ninguna es correcta\r\n");

        String pregunta21 = sc.next();
        numpreguntas++;
        if (pregunta21.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("22. ¿Qué tipo de diagrama describe las interacciones que tienen los objetos de un sistema a lo largo del tiempo? (Tema 8)\r\n\n"
                + "a. Diagrama de casos de uso\r\n"
                + "b. Diagramas de secuencia\r\n"
                + "c. Diagramas de estado\r\n"
                + "d. Diagramas de actividad \r\n");
        String pregunta22 = sc.next();
        numpreguntas++;
        if (pregunta22.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }
        System.out.println("23. ¿Para qué usamos el término “autor” en los diagramas de casos de uso? (Tema 9)\r\n\n"
                + "a. Para nombrar a los creadores de las relaciones\r\n"
                + "b. Para referirnos al creador del diagrama de caso de uso\r\n"
                + "c. Para referirnos a un tipo de rol de usuario del sistema\r\n"
                + "d. Ninguna de las anteriores\r\n");
        String pregunta23 = sc.next();
        numpreguntas++;
        if (pregunta23.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("24. ¿Qué diagramas permiten ilustrar el cómo los objetos interactúan siguiendo un formato gráfico? (Tema 10)\r\n\n"
                + "a. Diagramas de secuencia\r\n"
                + "b. Diagramas de colaboración\r\n"
                + "c. Diagramas sinópticos\r\n"
                + "d. Diagrama de fases \r\n");

        String pregunta24 = sc.next();
        numpreguntas++;
        if (pregunta24.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }
        System.out.println("25. ¿Cuál de estos no es un diagrama de tiempo? (Tema 11)\r\n\n"
                + "a. Red de Tareas\r\n"
                + "b. Método de Roy\r\n"
                + "c. Diagrama de barras\r\n"
                + "d. Diagrama de columnas\r\n");
        String pregunta25 = sc.next();
        numpreguntas++;
        if (pregunta25.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("26. ¿Qué tipos de estados especiales existen en los diagramas de estado? (Tema 12)\r\n\n"
                + "a. Síncrono y Asíncrono\r\n"
                + "b. Actualizado y Desactualizado\r\n"
                + "c. Inicial y Final\r\n"
                + "d. Ninguno de los anteriores\r\n");
        String pregunta26 = sc.next();
        numpreguntas++;
        if (pregunta26.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("27. ¿Qué ventajas ofrece SVN? (Tema 19)\r\n\n"
                + "a. Bloqueo de archivos y seguimiento efectivo de modificaciones realizadas\r\n"
                + "b. Creación de ramas y enlaces externos\r\n"
                + "c. Sólo bloqueo de archivos y creación de ramas/enlaces externos\r\n"
                + "d. A y B son correctas\r\n");

        String pregunta27 = sc.next();
        numpreguntas++;
        if (pregunta27.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("28. ¿Cuál de las siguientes no corresponde a una arquitectura Cloud? (Tema 20)\r\n\n"
                + "a. SaaS (Software as a Service)\r\n"
                + "b. IaaS (Infrastructure as a Service)\r\n"
                + "c. HaaS (Hardware as a Service)\r\n"
                + "d. PaaS (Platform as a Service) \r\n");

        String pregunta28 = sc.next();
        numpreguntas++;
        if (pregunta28.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("29. Señala el diagrama en el que interesan los estados de acción y las transiciones que ocurren al finalizar dicha actividad (Tema 8)\r\n\n"
                + "a. De uso\r\n"
                + "b. De secuencia\r\n"
                + "c. De actividad\r\n"
                + "d. De estados\r\n");
        String pregunta29 = sc.next();
        numpreguntas++;
        if (pregunta29.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("30. De las siguientes opciones, ¿con cuál de ellas podemos documentar los casos de uso? (Tema 9)\r\n\n"
                + "a. Creando un diagrama XML con los casos de uso indicados\r\n"
                + "b. Creando un diagrama CSS con los casos de uso indicados\r\n"
                + "c. Creando un diagrama .NET con los casos de uso indicados\r\n"
                + "d. Creando un diagrama UML con los casos de uso indicados \r\n");
        String pregunta30 = sc.next();
        numpreguntas++;
        if (pregunta30.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }
        System.out.println("31. ¿Cuál de los siguientes es un tipo de relación o mensajes? (Tema 10)\r\n\n"
                + "a. Abiertos\r\n"
                + "b. Cerrados\r\n"
                + "c. Síncronos\r\n"
                + "d. Asíncronos \r\n");
        String pregunta31 = sc.next();
        numpreguntas++;
        if (pregunta31.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("32. ¿Qué tipos de nodos de actividad pueden existir en las acciones de un diagrama de actividad? (Tema 11)\r\n\n"
                + "a. Nodos objetos, nodos control y nodos ejecutables\r\n"
                + "b. Nodos instancia, nodos control y nodos activos\r\n"
                + "c. Nodoso instancia, nodos marcador y nodos ejecutables\r\n"
                + "d. Nodos objetos, nodos marcador y nodos activos \r\n");

        String pregunta32 = sc.next();
        numpreguntas++;
        if (pregunta32.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("33. ¿Qué son las bifurcaciones en los diagramas de estado? (Tema 12)\r\n\n"
                + "a. Representa un punto en el que transitamos a diferentes estados dependiendo las condiciones de entrada\r\n"
                + "b. Permite pasar a un estado al venir de estados diferentes, es decir, un estado de convergencia\r\n"
                + "c. Se centra en representar diferentes actividades en su interior\r\n"
                + "d. A y B son correctas\r\n");
        String pregunta33 = sc.next();
        numpreguntas++;
        if (pregunta33.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("34. Seleccione la acción incorrecta:\r\n"
                + "Apache Subversion (SVN), ofrece algunas ventajas cómo: (Tema 19)\r\n\n"
                + "a. Bloqueo de archivos\r\n"
                + "b. Creación de ramas y enlaces externos\r\n"
                + "c. Es más complicado realizar las modificaciones del repositorio\r\n"
                + "d. Seguimiento efectivo de modificaciones realizadas\r\n");

        String pregunta34 = sc.next();
        numpreguntas++;
        if (pregunta34.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("35. Indique cuál de los siguientes no es un tipo de acceso a un sservicio Cloud (Tema 20)\r\n\n"
                + "a. Privado\r\n"
                + "b. Público\r\n"
                + "c. Híbrido\r\n"
                + "d. Protegido \r\n");

        String pregunta35 = sc.next();
        numpreguntas++;
        if (pregunta35.equalsIgnoreCase("D")) {
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