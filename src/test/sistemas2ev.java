package test;

import java.util.Scanner;

public class sistemas2ev {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double correctas = 0;
        double falladas = 0;
        double numpreguntas = 0;

        System.out.println("1. ¿Cuál o cuáles de estos formatos son de particiones? (Tema 8)\r\n\n"
                + "a. GPT\r\n"
                + "b. MBR\r\n"
                + "c. OGT\r\n"
                + "d. A y B son correctas");
        String pregunta1 = sc.next();
        numpreguntas++;
        if (pregunta1.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("2. En el momento de crear una nueva cuenta de usuario, existen ciertas medidas de seguridad que se pueden implementar, estas incluyen: (Tema 9)\r\n\n"
                + "a. El usuario debe cambiar la contraseñas en el siguiente inicio de sesión\r\n"
                + "b. La cuenta expirará al final de la siguiente sesión\r\n"
                + "c. La contraseña expìrará al final de la siguiente sesión\r\n"
                + "d. El usuario no podrá cambiar la contraseña\r\n");
        String pregunta2 = sc.next();
        numpreguntas++;
        if (pregunta2.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        }else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("3. Existen diferentes directivas en función del objeto al que se aplican, indique la opción correctaExisten diferentes directivas en función del objeto al que se aplican, indique la opción correcta (Tema 10)\r\n\n"
                + "a. Equipo local\r\n"
                + "b. Sitio\r\n"
                + "c. Dominio\r\n"
                + "d. Unidad Local \r\n");
        String pregunta3 = sc.next();
        numpreguntas++;
        if (pregunta3.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("4. ¿Qué es un servicio? (Tema 11)\r\n\n"
                + "a. Una aplicación o conjunto de aplicaciones que se ejecuta en un sistema para ofrecer una funcionalidad\r\n"
                + "b. Una aplicación que se ejecuta en segundo plano\r\n"
                + "c. Una aplicación que se inicia al encender el sistema operativo\r\n"
                + "d. Un conjunto de aplicaciones que se ejecuta en segundo plano y se inicia al encender el sistema operativo");

        String pregunta4 = sc.next();
        numpreguntas++;
        if (pregunta4.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("5. ¿Con qué comando modificaremos la red de una interfaz desde el símbolo del sistema? (Tema 12)\r\n\n"
                + "a. ipconfig/all\r\n"
                + "b. ipconfig/interface\r\n"
                + "c. netsh interface ipv4 set address “nombreinterfaz”\r\n"
                + "d. mkdir “nombreinterfaz” Desktop\r\n");
        String pregunta5 = sc.next();
        numpreguntas++;
        if (pregunta5.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("6. ¿Qué medio de almacenamiento es más rápido? (Tema 13)\r\n\n"
                + "a. SSD\r\n"
                + "b. M.2\r\n"
                + "c. HDD\r\n"
                + "d. DVDL\r\n");

        String pregunta6 = sc.next();
        numpreguntas++;
        if (pregunta6.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("7. Di cuál de las siguientes afirmaciones es cierta sobre los RAID 0 (Tema 14)\r\n\n"
                + "a. Por lo general el más usado, consiste en duplicar el contenido de un disco en otro\r\n"
                + "b. Necesarios como mínimo 3 discos y se usa espacio de todos los discos\r\n"
                + "c. De los raids más básicos, consiste en duplicar la velocidad de lectura y escritura\r\n"
                + "d. Requiere mínimo de 4 discos y permite que aún fallando dos discos, no se pierda información \r\n");

        String pregunta7 = sc.next();
        numpreguntas++;
        if (pregunta7.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("8. ¿Cuáles son los gestores de arranque más usados en las distribuciones de linux? (Tema 8)\r\n\n"
                + "a. GRUB y LILO\r\n"
                + "b. MINT y GRUB\r\n"
                + "c. MINT y OGT\r\n"
                + "d. Ninguna es correcta\r\n");
        String pregunta8 = sc.next();
        numpreguntas++;
        if (pregunta8.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("9. A través de los grupos se conceden privilegios a un usuario o grupo de usuarios. ¿Cuáles son los tres más importantes en Windows Server? (Tema 9)\r\n\n"
                + "a. Usuarios de escritorio remoto, Administradores y Root\r\n"
                + "b. Administradores, Usuarios y Root\r\n"
                + "c. Administradores, Usuarios y Usuarios de Escritorio Remoto\r\n"
                + "d. Usuarios, Usuarios de Escritorio Remoto y Root");
        String pregunta9 = sc.next();
        numpreguntas++;
        if (pregunta9.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("10. Elija la definición correcta sobre los derechos de conexión (Tema 10)\r\n\n"
                + "a. Son las distintas maneras que tiene un usuario para acceder al sistema\r\n"
                + "b. Son las distintas maneras que tiene un usuario para crear el sistema\r\n"
                + "c. Se refieren a las acciones concretas y predefinidas que un usuario puede realizar conectado al equipo\r\n"
                + "d. Son atributos que permiten a los usuarios o grupos determinadas acciones \r\n");
        String pregunta10 = sc.next();
        numpreguntas++;
        if (pregunta10.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("11. ¿Cuál de los siguientes servicios no se considera un servicio crítico? (Tema 11)\r\n\n"
                + "a. Windows Update\r\n"
                + "b. Programador de tareas\r\n"
                + "c. Oracle Server\r\n"
                + "d. Cliente DHCP\r\n");

        String pregunta11 = sc.next();
        numpreguntas++;
        if (pregunta11.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("12. ¿Cómo ejecutaremos el programador de tareas de Windows? (Tema 12)\r\n\n"
                + "a. Instalando el plugin desde la página de Microsoft\r\n"
                + "b. Desde las herramientas administrativas de Windows\r\n"
                + "c. Eso solo se puede realizar si usamos Windows Server\r\n"
                + "d. Ninguna es correcta\r\n");
        String pregunta12 = sc.next();
        numpreguntas++;
        if (pregunta12.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("13. ¿Qué administración de particiones de unidades no tiene límite en el número de particiones primarias? (Tema 13)\r\n\n"
                + "a. GPT\r\n"
                + "b. MBRE\r\n"
                + "c. MBR\r\n"
                + "d. GPTD\r\n");

        String pregunta13 = sc.next();
        numpreguntas++;
        if (pregunta13.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("14. El Instituto Nacional de Ciberseguridad recomiendo determinar qué información se debe salvar en función de los siguientes criterios:(Tema 14)\r\n\n"
                + "a. Nivel de accesibilidad o confidencialidad, utilidad o funcionalidad, en caso de robo, borrado o pérdida\r\n"
                + "b. Nivel de acceso o seguridad, utilidad o funcionalidad, en caso de robo o pérdida\r\n"
                + "c. Ambas son verdaderas\r\n"
                + "d. Ambas son falsas \r\n");

        String pregunta14 = sc.next();
        numpreguntas++;
        if (pregunta14.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("15. ¿Qué opciones te da “Herramientas de Utilidades de disco” de Mac OS? (Tema 8)\r\n\n"
                + "a. Modificar partición\r\n"
                + "b. Crear partición\r\n"
                + "c. Borrar o restaurar partición\r\n"
                + "d. Todas son correctas\r\n");
        String pregunta15 = sc.next();
        numpreguntas++;
        if (pregunta15.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("16. De la última versión de Windows Server (2019), ¿cuál no es una de sus condiciones? (Tema 9)\r\n\n"
                + "a. Datacenter\r\n"
                + "b. Standard\r\n"
                + "c. Essentials\r\n"
                + "d. Mandalorians \r\n");
        String pregunta16 = sc.next();
        numpreguntas++;
        if (pregunta16.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas +=1;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("17. Elija la opción que no tenga que ver con los grupos de dominio (Tema 10)\r\n\n"
                + "a. Se emplean para asignar permisos a los diferentes recursos del dominio\r\n"
                + "b. Siempre que se quiera asignar un permiso a un recurso, debemos asignarlo a un grupo de usuarios\r\n"
                + "c. A diferencia de los grupos locales, solo se asignan permisos a los objetos y usuarios de un grupo\r\n"
                + "d. Se trata de contenedores en los que se organizan los objetos del dominio 0\r\n");
        String pregunta17 = sc.next();
        numpreguntas++;
        if (pregunta17.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("18. ¿Qué no se consigue monitorizando el sistema? (Tema 11)\r\n\n"
                + "a. Conocer la disponibilidad del servidor y sus posibles fallos o problemas\r\n"
                + "b. Controlar o conocer la capacidad de respuesta\r\n"
                + "c. Provocar futuros problemas\r\n"
                + "d. Conocer la capacidad, carga y trabajo del sistema\r\n");

        String pregunta18 = sc.next();
        numpreguntas++;
        if (pregunta18.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("19. ¿Cómo se conoce también al Símbolo del Sistema? (Tema 12)\r\n\n"
                + "a. CMD\r\n"
                + "b. CBD\r\n"
                + "c. THC\r\n"
                + "d. PowerShell \r\n");
        String pregunta19 = sc.next();
        numpreguntas++;
        if (pregunta19.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("20.  ¿Cuál es el tipo de conexión de discos duros más común actualmente? (Tema 13)\r\n\n"
                + "a. IDE\r\n"
                + "b. SCSI/SAS\r\n"
                + "c. PATA\r\n"
                + "d. SATA\r\n");

        String pregunta20 = sc.next();
        numpreguntas++;
        if (pregunta20.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("21. El Sistema RAID: Por software no... (Tema 14)\r\n\n"
                + "a. Es fácil de configurar\r\n"
                + "b. Es fiable\r\n"
                + "c. Se puede hacer el RAID con el sistema operativo\r\n"
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

        System.out.println("22. ¿Cuál es el espacio recomendado para instalar WIndows 10 de 64 bits?(Tema 8)\r\n\n"
                + "a. 50Gb\r\n"
                + "b. 43Gb\r\n"
                + "c. 32Gb\r\n"
                + "d. 10Gb\r\n");
        String pregunta22 = sc.next();
        numpreguntas++;
        if (pregunta22.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("23. De los siguientes, ¿cuál no es un requisito mínimo de Windows Server? (Tema 9)\r\n\n"
                + "a. Procesador de 64 bits a 1,4GHz\r\n"
                + "b. 256MB de memoria RAM\r\n"
                + "c. Tarjeta de Red\r\n"
                + "d. 32Gb de disco duro \r\n");
        String pregunta23 = sc.next();
        numpreguntas++;
        if (pregunta23.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("24. Las directivas de seguridad (Tema 10)\r\n\n"
                + "a. Sirven para implementar configuraciones específicas a suarios/equipos del dominio\r\n"
                + "b. Se aplican siempre a un dominio\r\n"
                + "c. Impiden que se conecten intrusos al servidor\r\n"
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

        System.out.println("25. ¿Qué técnicas de monitorización son incorrectas? (Tema 11)\r\n\n"
                + "a. Tiempo real\r\n"
                + "b. Continuada\r\n"
                + "c. Rendimiento\r\n"
                + "d. Trabajo \r\n");

        String pregunta25 = sc.next();
        numpreguntas++;
        if (pregunta25.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("26. ¿Qué es PowerShell? (Tema 12)\r\n\n"
                + "a. Intérprete de comandos de Windows\r\n"
                + "b. Herramienta de creación de aplicaciones\r\n"
                + "c. Entorno de desarrollo de Windows\r\n"
                + "d. Ninguna de las anteriores \r\n");
        String pregunta26 = sc.next();
        numpreguntas++;
        if (pregunta26.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("27. ¿Qué dos sistemas de archivos de Windows podemos encontrar en sus Sistemas Operativos? (Tema 13)\r\n\n"
                + "a. FAT32 Y NTFS\r\n"
                + "b. CDFS Y FAT\r\n"
                + "c. FAT32 Y FAT36\r\n"
                + "d. CDFS Y NTFS \r\n");

        String pregunta27 = sc.next();
        numpreguntas++;
        if (pregunta27.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("28. ¿Cuántos discos son necesarios mínimamente para crear un RAID en Windows 10? (Tema 14)\r\n\n"
                + "a. 1\r\n"
                + "b. 2\r\n"
                + "c. 3\r\n"
                + "d. 4 \r\n");

        String pregunta28 = sc.next();
        numpreguntas++;
        if (pregunta28.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("29. ¿Cuándo se inicia el gestor de arranque en un equipo con Windows? (Tema 8)\r\n\n"
                + "a. letter-spacing\r\n"
                + "b. word-spacing\r\n"
                + "c. text-decoration\r\n"
                + "d. line-height\r\n ");
        String pregunta29 = sc.next();
        numpreguntas++;
        if (pregunta29.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("30. ¿Cuál de las siguientes es una directiva local? (Tema 9)\r\n\n"
                + "a. Directiva de tutoría\r\n"
                + "b. Directiva de supremacía\r\n"
                + "c. Directiva de auditoría\r\n"
                + "d. DIrectiva de localidad\r\n");
        String pregunta30 = sc.next();
        numpreguntas++;
        if (pregunta30.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("31. Señala la opción correcta (Tema 10)\r\n\n"
                + ". Active Directory es el servicio directorio de Windows Server\r\n"
                + "b. Active Directory no es el servicio de directorio de Windows Server\r\n"
                + "c. Amazing Directory es el servicio de directorio de Windows Server\r\n"
                + "d. Amazing Directory no es el servicio de directorio de Windows Server \r\n");
        String pregunta31 = sc.next();
        numpreguntas++;
        if (pregunta31.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("32. ¿Qué funcionalidad tiene el monitor de rendimiento? (Tema 11)\r\n\n"
                + "a. Ver datos en tiempo real o desde un archivo de registro\r\n"
                + "b. Ver las aplicaciones que funcionan en segundo plano\r\n"
                + "c. Se ejecuta en un sistema para ofrecer una funcionalidad\r\n"
                + "d. Permite visualizar información, en tiempo real, acerca de los recursos de hardware y del sistema, usados por el sistema operativo\r\n");

        String pregunta32 = sc.next();
        numpreguntas++;
        if (pregunta32.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("33. ¿Dónde tendríamos que instalar la implementación de RDS? (Tema 12)\r\n\n"
                + "a. Admin. del servidor, Agregar Roles y Características, Instalación de Servicios de Escritorio Remoto\r\n"
                + "b. Admin. del servidor, Agregar Roles y Características, Instalación basada en características o roles\r\n"
                + "c. Admin. del servidor, Enrutamiento, Acceso Remoto\r\n"
                + "d. Ninguna de las anteriores\r\n");
        String pregunta33 = sc.next();
        numpreguntas++;
        if (pregunta33.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("34. ¿Para qué sirve el directorio raíz “/bin”?? (Tema 13)\r\n\n"
                + "a. Almacena los dispositivos de almacenamiento conectados\r\n"
                + "b. Carpeta que almacena los binarios esenciales para las funciones básicas del sistema\r\n"
                + "c. Es la carpeta donde se encuentran los archivos del usuario\r\n"
                + "d. Incluye los archivos necesarios para iniciar el sistema\r\n");

        String pregunta34 = sc.next();
        numpreguntas++;
        if (pregunta34.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("35. RAID 5... (Tema 14)\r\n\n"
                + "a. Mejora la velocidad de escritura\r\n"
                + "b. Mejora la velocidad de lectura y escritura\r\n"
                + "c. No mejora la velocidad de lectura ni la de escritura\r\n"
                + "d. Mejora la velocidad de lectura \r\n");

        String pregunta35 = sc.next();
        numpreguntas++;
        if (pregunta35.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("36. ¿Dónde se crean particiones en Windows? (Tema 8)\r\n\n"
                + "a. Administrador de particiones\r\n"
                + "b. Administrador de discos\r\n"
                + "c. Administrador de Dispositivos\r\n"
                + "d. Administrador de Máquinas Virtuales\r\n ");
        String pregunta36 = sc.next();
        numpreguntas++;
        if (pregunta36.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("37. La opción de instalación de “Nano Server” se caracteriza por... (Tema 9)\r\n\n"
                + "a. Fernando Alonso\r\n"
                + "b. EL PLAN de 2022\r\n"
                + "c. No dispone de escritorio, es más pesado y está optimizado para entornos cloud\r\n"
                + "d. No dispone de escritorio, es más ligero y está optimizado para entornos cloud\r\n");
        String pregunta37 = sc.next();
        numpreguntas++;
        if (pregunta37.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("38. Cuando hablamos de bosque y de la estructura del Directorio Activo nos referimos a: (Tema 10)\r\n\n"
                + "a. Conjunto de uno o más árboles que mantienen la misma estructura de nombres independientes y están conectados entre los dominios\r\n"
                + "b. Conjunto de árboles que se encuentran en la naturaleza\r\n"
                + "c. Conjunto de uno o más árboles que no mantienen la misma estructura y están conectados entre los dominios\r\n"
                + "d. Conjunto de uno o más árboles que mantienen la misma estructura de nombres independientes y no están conectados entre los dominios \r\n");

        String pregunta38 = sc.next();
        numpreguntas++;
        if (pregunta38.equalsIgnoreCase("A")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("39. Señale la respuesta correcta: (Tema 11)\r\n\n"
                + "a. No se encuentra activo, pero sí preparado y a la espera de que ocurra un evento\r\n"
                + "b. El proceso no se encuentra en ejecución. Puede no haberse ejecutado o haberse detenido al cerrar una aplicación\r\n"
                + "c. El proceso no se está ejecutando, pero se ha detenido y aún tiene entrada en la tabla de procesos\r\n"
                + "d. No se encuentra activo, pero sí preparado y a la espera de que no ocurra ningún evento \r\n");
        String pregunta39 = sc.next();
        numpreguntas++;
        if (pregunta39.equalsIgnoreCase("C")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("40. ¿Qué servicio necesitaríamos para conectar un servidor a la red de forma inalámbrica? (Tema 12)\r\n\n"
                + "a. Servicio WINS\r\n"
                + "b. Servicio SMTP\r\n"
                + "c. Telnet Client\r\n"
                + "d. Servicio Wlan\r\n");
        String pregunta40 = sc.next();
        numpreguntas++;
        if (pregunta40.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("41. El directorio raíz “/dev” sirve para... (Tema 13)\r\n\n"
                + "a. Incluye los archivos de personalización del sistema\r\n"
                + "b. Archivar los archivos ocultos del usuario\r\n"
                + "c. Almacenar los binarios esenciales para las funciones básicas del sistema\r\n"
                + "d. Almacenar los dispositivos de almacenamiento conectados\r\n");

        String pregunta41 = sc.next();
        numpreguntas++;
        if (pregunta41.equalsIgnoreCase("D")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("42. En los errores más comunes, el id de evento 154 indica... (Tema 14)\r\n\n"
                + "a. Estructura del sistema de archivos dañada\r\n"
                + "b. Error del hardware de disco\r\n"
                + "c. Disco extraído o desconectado de forma imprevista\r\n"
                + "d. Error de controladora de disco\r\n");
        String pregunta42 = sc.next();
        numpreguntas++;
        if (pregunta42.equalsIgnoreCase("B")) {
            System.out.println("Respuesta correcta.");
            correctas ++;
        } else {
            System.out.println("Respuesta incorrecta.");
            falladas ++;
        }

        System.out.println("Has acertado " + correctas + " preguntas. \n"
                + "Has fallado " + falladas + " preguntas. \n");

        double nota = correctas/numpreguntas;
        double resta = ((falladas/numpreguntas)/3)*10;
        double notafinal = (nota-resta);

        System.out.println("Has sacado un "+notafinal);
        sc.close();
    }

}
