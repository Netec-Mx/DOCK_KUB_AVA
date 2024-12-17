# Práctica 3. Microservicio Seguridad

## Objetivo de la práctica:
Al finalizar la práctica, serás capaz de:
- Crear un microservicio dedicado a la seguridad, permitiendo la creación de usuarios.
- Implementar el manejo de JWT (JSON Web Tokens) para autenticación.
- Configurar un microservicio basado en Spring Security con gestión de usuarios utilizando una base de datos en memoria.

## Duración aproximada:
- 80 minutos.

### Tarea 1. Creacion de microservicio

Configurar un proyecto Spring Boot que implemente las funcionalidades de seguridad necesarias para gestionar usuarios y autenticar mediante JWT.

Paso 1. Acceder al enlace https://start.spring.io/ y generar un proyecto con las dependencias necesarias, como Spring Web, Spring Security y Spring Data JPA.

![diagrama1](../images/Capitulo3/cap3_ms_seg_1.png)

Paso 2. Añadir las dependencias de JWT necesarias para manejar la creación y validación de tokens.

La dependencia io.jsonwebtoken permite la creación, firma y validación de tokens JWT, los cuales se utilizan comúnmente para la autenticación y autorización en aplicaciones. Con esta librería, es posible generar tokens que contienen información cifrada (claims) y validar su integridad para garantizar que no hayan sido manipulados. Esto facilita implementar mecanismos seguros de acceso a recursos protegidos.

![diagrama1](../images/Capitulo3/cap3_ms_seg_2.png)

Paso 3. Organizar el proyecto en paquetes, por ejemplo: entity, repository, security, service, controller, y dto.

![diagrama1](../images/Capitulo3/cap3_ms_seg_3.png)

Paso 4. Definir una clase de entidad que represente a los usuarios en el sistema, con atributos como username, password, y roles.

![diagrama1](../images/Capitulo3/cap3_ms_seg_4.png)

Paso 5. Implementar un repositorio para manejar operaciones de persistencia relacionadas con la entidad AuthUser.

![diagrama1](../images/Capitulo3/cap3_ms_seg_5.png)

Paso 6. Este DTO representará los datos del usuario que serán enviados entre el cliente y el servidor.

![diagrama1](../images/Capitulo3/cap3_ms_seg_6.png)

Paso 7. Este DTO contendrá los datos necesarios para solicitudes como el inicio de sesión.

![diagrama1](../images/Capitulo3/cap3_ms_seg_7.png)

Paso 8. Definir un PasswordEncoder para gestionar el cifrado de contraseñas.

![diagrama1](../images/Capitulo3/cap3_ms_seg_8.png)

Paso 9. Implementar validaciones de rutas para verificar permisos según los roles del usuario.

![diagrama1](../images/Capitulo3/cap3_ms_seg_9.png)

Paso 10. Crear la clase RouteValidation en el package security.

![diagrama1](../images/Capitulo3/cap3_ms_seg_10.png)

Paso 11. En este paso se crea la clase **JwtProvider** como componente de Spring para gestionar los tokens JWT. Incluir una clave secreta (Key secret) para firmar y validar los tokens, de igual manera, utilizar el componente RouteValidator para verificar rutas protegidas, garantizando una seguridad robusta en la aplicación.

![diagrama1](../images/Capitulo3/cap3_ms_seg_11.png)

Paso 12. La clase **JwtProvider** es un componente encargado de gestionar los tokens JWT en la aplicación. Utilizar una clave secreta para firmar y validar los tokens y el componente RouteValidator para verificar rutas protegidas, garantizando un control de acceso seguro.

![diagrama1](../images/Capitulo3/cap3_ms_seg_12.png)

Paso 13. Agregar un método en la clase JwtProvider para convertir un objeto LocalDateTime a un objeto Date. El método **convertToLocalDateTimeToDate** utiliza la zona horaria del sistema (ZoneId.systemDefault()) y transforma el **LocalDateTime** en un instante que luego se convierte en un objeto Date.

![diagrama1](../images/Capitulo3/cap3_ms_seg_13.png)

Paso 14. Implementar el método **createToken** en la clase **JwtProvider** para generar tokens JWT basados en los datos del usuario (AuthUser). Este método permitirá autenticar y autorizar usuarios de forma segura en el sistema.

![diagrama1](../images/Capitulo3/cap3_ms_seg_14.png)

Paso 15. Inicializar la clave secreta (secret) en JwtProvider tras la creación del componente, generando una clave HMAC segura de 512 bits para gestionar los tokens JWT.

![diagrama1](../images/Capitulo3/cap3_ms_seg_15.png)

Paso 16. Ajustar el método **createToken** para incluir información personalizada en el token JWT. Agregar los atributos **id** y **role** del usuario (authUser) a un mapa de reclamaciones (claims), y definir la fecha de inicio del token utilizando LocalDateTime.now(). 

![diagrama1](../images/Capitulo3/cap3_ms_seg_16.png)

Paso 17. Completar el método createToken en JwtProvider, agregando id y role del usuario a las claims del token JWT y estableciendo la fecha de inicio con LocalDateTime.now(). Esto asegura que el token incluya información del usuario y una marca de tiempo.

![diagrama1](../images/Capitulo3/cap3_ms_seg_17.png)

Paso 18. El método **getUserNameFromToken** extrae y valida el nombre de usuario de un token JWT. Utilizar la clave secreta (secret) para verificar la firma del token y extraer su sujeto (subject). En caso de error, retorna un mensaje indicando que el token no es válido.

![diagrama1](../images/Capitulo3/cap3_ms_seg_18.png)

Paso 19. El método **validate** verifica la validez de un token JWT usando la clave secreta y valida permisos según el objeto RequestDto. Si el token no es válido o los permisos no coinciden, retornar false; de lo contrario, confirmar la autenticidad y permisos con true.

![diagrama1](../images/Capitulo3/cap3_ms_seg_19.png)

Paso 20. Crear la clase SecurityConfig, anotada con @Configuration y @EnableWebSecurity para habilitar la seguridad web en la aplicación. Incluir un método que define un SecurityFilterChain, deshabilitando la protección CSRF y permitiendo que todas las solicitudes sean accesibles sin autenticación. Esto configura las políticas de seguridad iniciales de la aplicación.

![diagrama1](../images/Capitulo3/cap3_ms_seg_20.png)

Paso 21. Crear la clase AuthService dentro del paquete `com.auth.service`. Esta clase será utilizada para implementar la lógica relacionada con la autenticación en el servicio de autorización de la aplicación. Por ahora, la clase se encuentra vacía, lista para ser desarrollada.

![diagrama1](../images/Capitulo3/cap3_ms_seg_21.png)

Paso 22. Crear la clase **NewUserDto**, diseñada para manejar los datos de transferencia relacionados con la creación de un nuevo usuario. Utilizar Lombok para reducir el código boilerplate, con anotaciones como @Data para generar getters y setters; @Builder para un patrón de construcción fluido y constructores, con y sin, argumentos gracias a @AllArgsConstructor y @NoArgsConstructor. La clase incluye tres atributos: userName, password y role.

![diagrama1](../images/Capitulo3/cap3_ms_seg_22.png)


### Tarea 2. Ajuste controller

Paso 1. Implementar un método en AuthService que permita guardar usuarios en la base de datos.

![diagrama1](../images/Capitulo3/cap3_ms_seg_23.png)

Paso 2. Definir un método en AuthService que genere un token JWT al autenticar un usuario válido.

![diagrama1](../images/Capitulo3/cap3_ms_seg_24.png)

Paso 3. Exponer los endpoints necesarios para las operaciones de autenticación y gestión de usuarios.

![diagrama1](../images/Capitulo3/cap3_ms_seg_25.png)

Paso 4. El método debe aceptar credenciales de usuario y devolver un token JWT si son válidas. Este endPoint se crea para que el usuario pueda ingresar al backend y si es correcto se retornara el token.

![diagrama1](../images/Capitulo3/cap3_ms_seg_26.png)

Paso 5. Agregar un endpoint en el controlador para validar si un token JWT sigue siendo válido.

![diagrama1](../images/Capitulo3/cap3_ms_seg_27.png)

Paso 6. Agregar un endpoint para permitir la creación de nuevos usuarios. Este endpoint es utilizado para crear el usuario en el backend y así poder generar el token cuando se realice el login.

![diagrama1](../images/Capitulo3/cap3_ms_seg_28.png)


### Resultado esperado

Al finalizar la práctica, tendrás un microservicio funcional que permita:

- Crear usuarios en una base de datos en memoria.
- Autenticar usuarios utilizando JWT.
- Exponer endpoints seguros para la gestión de usuarios.
- 
![diagrama1](../images/Capitulo3/cap3_ms_seg_29.png)
