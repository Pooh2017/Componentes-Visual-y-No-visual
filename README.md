Componentes para conectar una base de datos.
===========

Descripción
===========

El componente NoVisualBD es una clase Java que permite establecer una
conexión a una base de datos MySQL utilizando JDBC. Proporciona métodos
para conectarse y desconectarse de la base de datos, así como para
imprimir los datos de una tabla específica.

Usos
====

-   Integración en aplicaciones Java que requieran acceso a una base de
    datos MySQL.

-   Desarrollo de herramientas de gestión de datos que interactúen con
    una base de datos.

-   Implementación de funcionalidades de base de datos en aplicaciones
    Java existentes.

Características
===============

-   Conexión a una base de datos MySQL utilizando JDBC.

-   Métodos para establecer y cerrar la conexión.

-   Método para imprimir los datos de una tabla específica.

-   Encapsulación de los datos de conexión a la base de datos.

Requisitos
==========

-   Java JDK 8 o superior.

-   Conector JDBC para MySQL (mysql-connector-java).

-   Acceso a una base de datos MySQL con las credenciales adecuadas.

Api
===

NoVisualBD

La clase NoVisualBD gestiona la conexión a una base de datos MySQL.
Permite establecer y cerrar conexiones, así como imprimir datos de una
tabla especificada. La clase incluye métodos para configurar los
parámetros de conexión y verificar la conexión establecida.

## Campos
  -----------------------------------------------------------------------
  **Tipo**    | **Campo**    |**Descripción**
  ------------ |------------ |--------------------------------------------------------|
  String       |ip           |Dirección IP del servidor de base de datos.             |
  String       |puerto       |Puerto del servidor de base de datos.                   |
  String       |bd           |Nombre de la base de datos.                             |
  String       |user         |Usuario de la base de datos.                            |  
  String       |password     |Contraseña del usuario de la base de datos.             |  
  Connection   |connection   |Objeto Connection para la conexión a la base de datos.  |

-----------------------------------------------------------------------
## Métodos

| **Tipo**  | **Nombre**        | **Tipo de Dato que Retorna** | **Tipo de dato que recibe** | **Descripción**                           |
|-----------|-------------------|------------------------------|-----------------------------|-------------------------------------------|
| Constructor| `NoVisualBD(String ip, String puerto, String bd, String user, String password)` | N/A                          | String ip, String puerto, String bd, String user, String password | Inicializa los campos de conexión a la base de datos. |
| Getter    | `getIp()`         | `String`                     | N/A                         | Obtiene la dirección IP del servidor de base de datos. |
| Setter    | `setIp(String ip)` | `void`                       | String ip                    | Establece la dirección IP del servidor de base de datos. |
| Getter    | `getPuerto()`     | `String`                     | N/A                         | Obtiene el puerto del servidor de base de datos. |
## Métodos

| **Tipo**  | **Nombre**           | **Tipo de Dato que Retorna** | **Tipo de dato que recibe** | **Descripción**                                    |
|-----------|----------------------|------------------------------|-----------------------------|----------------------------------------------------|
| Setter    | `setPuerto(String puerto)` | `void`                       | String puerto                | Establece el puerto del servidor de base de datos. |
| Getter    | `getBd()`            | `String`                     | N/A                         | Obtiene el nombre de la base de datos.            |
| Setter    | `setBd(String bd)`   | `void`                       | String bd                    | Establece el nombre de la base de datos.          |
| Getter    | `getUser()`          | `String`                     | N/A                         | Obtiene el usuario de la base de datos.           |
| Setter    | `setUser(String user)`| `void`                       | String user                  | Establece el usuario de la base de datos.         |
| Getter    | `getPassword()`      | `String`                     | N/A                         | Obtiene la contraseña del usuario de la base de datos. |
| Setter    | `setPassword(String password)` | `void`                       | String password             | Establece la contraseña del usuario de la base de datos. |
| Método    | `getUrl()`           | `String`                     | N/A                         | Genera la URL de conexión JDBC utilizando los campos de conexión. |
| Método    | `connect()`          | `void`                       | N/A                         | Establece la conexión a la base de datos utilizando la URL generada y los datos de usuario y contraseña. |
| Método    | `disconnect()`       | `void`                       | N/A                         | Cierra la conexión a la base de datos.            |
| Método    | `printTableData(String tableName)` | `void`                       | String tableName            | Imprime los datos de la tabla especificada en la consola. |
| Método    | `getConnection()`    | `Connection`                 | N/A                         | Obtiene el objeto `Connection` de la conexión establecida. |

## componenteVisual

## Descripción del componente
Este componente permite la generación de contraseñas, de manera aleatoria incluyendo numeros letras mayusculas, minusculas y algunos caracteres especiales, ademas permite ver la contraseña y ocultarla de una manera sencilla, todo en java.


## Aplicaciones
* Aplicaciones de Prueba y Desarrollo: Ideal para entornos de desarrollo que requieren generación rápida de contraseñas para pruebas de software.
* Aplicaciones de Aprendizaje: Útil para proyectos educativos que enseñan conceptos básicos de seguridad informática y manejo de contraseñas.
* Herramienta de Uso Personal: Para usuarios individuales que necesitan generar contraseñas seguras para cuentas personales y acceso seguro a dispositivos.

## Caracteristicas
* Generación de Contraseñas Aleatorias: Crea contraseñas aleatorias que incluyen letras minúsculas, mayúsculas, números y caracteres especiales.
* Interfaz Minimalista y Funcional: Incluye un JPasswordField para visualizar y copiar la contraseña generada de manera segura.
* Opción de Mostrar/Ocultar Contraseña: Un checkbox permite alternar entre ocultar y mostrar la contraseña generada. El icono del checkbox cambia visualmente para indicar el estado actual de la contraseña.
* Botón de Generar: Al presionar un botón, se genera una nueva contraseña aleatoria con los parámetros configurados.

## Campos

| **Tipo**  | **Campo**             | **Descripción**                                           |
|-----------|-----------------------|-----------------------------------------------------------|
| `int`     | `minimo`              | Valor mínimo permitido para un rango.                   |
| `int`     | `maximo`              | Valor máximo permitido para un rango.                   |
| `boolean` | `mayusculas`          | Indica si se permiten letras mayúsculas.                |
| `boolean` | `minuscula`           | Indica si se permiten letras minúsculas.                |
| `boolean` | `numero`              | Indica si se permiten números.                          |
| `boolean` | `caracterEspecial`    | Indica si se permiten caracteres especiales.            |
| `boolean` | `visibleEtiqueta`     | Indica si la etiqueta es visible.                        |

## Métodos

| **Tipo**   | **Nombre**                        | **Tipo de Dato que Retorna** | **Tipo de Dato que Recibe**                           | **Descripción**                                          |
|------------|----------------------------------|------------------------------|------------------------------------------------------|----------------------------------------------------------|
| Constructor | `VisualPassword(int minimo, int maximo, boolean mayusculas, boolean minuscula, boolean numero, boolean caracterEspecial, boolean visibleEtiqueta)` | N/A                          | `int minimo`, `int maximo`, `boolean mayusculas`, `boolean minuscula`, `boolean numero`, `boolean caracterEspecial`, `boolean visibleEtiqueta` | Inicializa los campos de la clase para la generación de contraseñas. |
| Getter      | `getVisibleEtiqueta()`            | `boolean`                     | N/A                                                  | Obtiene el estado de visibilidad de la etiqueta.         |
| Setter      | `setVisibleEtiqueta(boolean visibleEtiqueta)` | `void`                        | `boolean visibleEtiqueta`                           | Establece la visibilidad de la etiqueta.                 |
| Getter      | `getMinimo()`                     | `int`                         | N/A                                                  | Obtiene el valor mínimo para la longitud de la contraseña. |
| Setter      | `setMinimo(int minimo)`           | `void`                        | `int minimo`                                        | Establece el valor mínimo para la longitud de la contraseña. |
| Getter      | `getMaximo()`                     | `int`                         | N/A                                                  | Obtiene el valor máximo para la longitud de la contraseña. |
| Setter      | `setMaximo(int maximo)`           | `void`                        | `int maximo`                                        | Establece el valor máximo para la longitud de la contraseña. |
| Getter      | `isMayusculas()`                  | `boolean`                     | N/A                                                  | Obtiene si se permiten letras mayúsculas en la contraseña. |
| Setter      | `setMayusculas(boolean mayusculas)` | `void`                        | `boolean mayusculas`                                | Establece si se permiten letras mayúsculas en la contraseña. |
| Getter      | `isMinuscula()`                   | `boolean`                     | N/A                                                  | Obtiene si se permiten letras minúsculas en la contraseña. |
| Setter      | `setMinuscula(boolean minuscula)`  | `void`                        | `boolean minuscula`                                | Establece si se permiten letras minúsculas en la contraseña. |
| Getter      | `isNumero()`                      | `boolean`                     | N/A                                                  | Obtiene si se permiten números en la contraseña.          |
| Setter      | `setNumero(boolean numero)`        | `void`                        | `boolean numero`                                    | Establece si se permiten números en la contraseña.        |
| Getter      | `isCaracterEspecial()`           | `boolean`                     | N/A                                                  | Obtiene si se permiten caracteres especiales en la contraseña. |
| Setter      | `setCaracterEspecial(boolean caracterEspecial)` | `void`                        | `boolean caracterEspecial`                          | Establece si se permiten caracteres especiales en la contraseña. |
| Método      | `generatePassword()`             | `String`                      | N/A                                                  | Genera una contraseña basada en los parámetros configurados. |
| Método      | `getPassword()`                  | `String`                      | N/A                                                  | Obtiene la contraseña actual del campo de texto.          |
| Constructor | `VisualPassword()`               | N/A                          | N/A                                                  | Inicializa los componentes de la interfaz gráfica.       |
| Método      | `initComponents()`               | `void`                        | N/A                                                  | Inicializa los componentes del formulario.               |
| Método      | `toglebtnOjoActionPerformed(java.awt.event.ActionEvent evt)` | `void`                        | `java.awt.event.ActionEvent evt`                    | Cambia el carácter de eco del campo de contraseña según el estado del botón. |
| Método      | `lblGeneradorPasswordMouseClicked(java.awt.event.MouseEvent evt)` | `void`                        | `java.awt.event.MouseEvent evt`                     | Genera y establece una nueva contraseña cuando se hace clic en la etiqueta. |

## Instalación
Primero vamos a descargar nuestros comoponentes  desde githup o descargar el zip despues de eso lo vamos a descomprimir y vamos abrir el archivo en netbeans.
![Descripción de la imagen](https://github.com/Pooh2017/Componentes-Visual-y-No-visual/raw/main/Imagenes/Captura%20de%20pantalla%202024-07-16%20212400.png)
Despues de abir el archivo nos vamos al proyecto le damos click derecho abrira una ventana y le daras a clean and build
![Descripción de la imagen](https://github.com/Pooh2017/Componentes-Visual-y-No-visual/blob/main/Imagenes/Captura%20de%20pantalla%202024-07-16%20212448.png)
Ahora ya solo tenemos que añadirlo a la paleta nos situaremos en el archivo le daremos click derecho nos iremos a tools  y luego add palette.. despues 
![Descripción de la imagen](https://github.com/Pooh2017/Componentes-Visual-y-No-visual/blob/main/Imagenes/Captura%20de%20pantalla%202024-07-16%20212511.png)
Despues solo queda en donde queremos guardar el componente le daremos ok
![Descripción de la imagen](https://github.com/Pooh2017/Componentes-Visual-y-No-visual/blob/main/Imagenes/Captura%20de%20pantalla%202024-07-16%20212526.png)
El resultado de esto es algo asi
![Descripción de la imagen](https://github.com/Pooh2017/Componentes-Visual-y-No-visual/blob/main/Imagenes/Captura%20de%20pantalla%202024-07-16%20212329.png)
## Funcionamiento
¡Descubre cómo funciona este componente visual Generador de Contraseñas y el control de base de datos! ---->https://youtu.be/Iq94rNB06PE
## Instalación
Lopez Gonzalez Eder Denilson - Estudiante del ITO - [Pooh2017](https://github.com/Pooh2017)
Eduardo Jiménez Mendoza- Estudiante del ITO
