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

#Campos

  **Tipo**    | **Campo**    |**Descripción**
  ------------ |------------ |--------------------------------------------------------|
  String       |ip           |Dirección IP del servidor de base de datos.             |
  String       |puerto       |Puerto del servidor de base de datos.                   |
  String       |bd           |Nombre de la base de datos.                             |
  String       |user         |Usuario de la base de datos.                            |  
  String       |password     |Contraseña del usuario de la base de datos.             |  
  Connection   |connection   |Objeto Connection para la conexión a la base de datos.  |

  Métodos

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
