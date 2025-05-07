# Librería - Sistema de Gestión con Spring Boot y JPA

Este proyecto implementa un sistema de gestión para una librería que vende libros físicos, desarrollado con Spring Boot, JPA y PostgreSQL.

## Estructura del Proyecto

- `src/main/java/com/corto/application/data/entity`: Contiene las entidades JPA (Libro, Autor, Cliente, Venta, DetalleVenta)
- `src/main/java/com/corto/application/data/repository`: Contiene los repositorios para cada entidad
- `src/main/java/com/corto/application/data/config`: Contiene la configuración para la creación automática de la base de datos
- `src/main/resources`: Contiene los archivos de configuración (application.properties)

## Entidades y Relaciones

- **Libro**: Representa un libro físico con atributos como título, ISBN, precio, etc.
- **Autor**: Representa a los autores de los libros.
- **Cliente**: Representa a los clientes de la librería.
- **Venta**: Representa una transacción de venta.
- **DetalleVenta**: Representa los items individuales en una venta.

### Relaciones:
- Un Libro puede tener varios Autores (muchos a muchos)
- Un Cliente puede tener muchas Ventas (uno a muchos)
- Una Venta tiene muchos DetalleVenta (uno a muchos)
- Cada DetalleVenta se refiere a un Libro (muchos a uno)

## Configuración del Proyecto

El proyecto está configurado para crear automáticamente la base de datos y las tablas necesarias al iniciar la aplicación.

### Proceso de Creación de la Base de Datos:

1. Al iniciar, el archivo application.properties se conecta a la base de datos predeterminada de PostgreSQL.
2. La clase `DatabaseConfig.java` verifica si la base de datos "corto-ha23039" existe.
3. Si no existe, la crea automáticamente.
4. Después, Hibernate crea todas las tablas definidas por las entidades JPA.

### Notas Ingeniero:

El archivo application.properties está inicialmente configurado para conectarse a la base de datos (postgres) por defecto de PostgreSQL, si se desea probar el sistema con la db creada automaticamente corto-ha23039 con los mismos accesos por defecto: