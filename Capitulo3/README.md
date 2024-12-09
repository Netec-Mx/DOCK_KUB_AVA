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

Paso 1. Accede al enlace https://start.spring.io/ y genera un proyecto con las dependencias necesarias, como Spring Web, Spring Security y Spring Data JPA.

![diagrama1](../images/Capitulo3/cap3_ms_seg_1.png)

Paso 2. Añade las dependencias de JWT necesarias para manejar la creación y validación de tokens.

![diagrama1](../images/Capitulo3/cap3_ms_seg_2.png)

Paso 3. Organiza el proyecto en paquetes, por ejemplo: entity, repository, security, service, controller, y dto.

![diagrama1](../images/Capitulo3/cap3_ms_seg_3.png)

Paso 4. Define una clase de entidad que represente a los usuarios en el sistema, con atributos como username, password, y roles.

![diagrama1](../images/Capitulo3/cap3_ms_seg_4.png)

Paso 5. Implementa un repositorio para manejar operaciones de persistencia relacionadas con la entidad AuthUser.

![diagrama1](../images/Capitulo3/cap3_ms_seg_5.png)

Paso 6. Este DTO representará los datos del usuario que serán enviados entre el cliente y el servidor.

![diagrama1](../images/Capitulo3/cap3_ms_seg_6.png)

Paso 7. Este DTO contendrá los datos necesarios para solicitudes como el inicio de sesión.

![diagrama1](../images/Capitulo3/cap3_ms_seg_7.png)

Paso 8. Define un PasswordEncoder para gestionar el cifrado de contraseñas.

![diagrama1](../images/Capitulo3/cap3_ms_seg_8.png)

Paso 9. Implementa validaciones de rutas para verificar permisos según los roles del usuario.

![diagrama1](../images/Capitulo3/cap3_ms_seg_9.png)

Paso 10. Crear la clase RouteValidation en el package security.

![diagrama1](../images/Capitulo3/cap3_ms_seg_10.png)

Paso 11. Creacion de validación, método is admin y URL 

![diagrama1](../images/Capitulo3/cap3_ms_seg_11.png)

Paso 12. Creacion de JwtProvider en security.

![diagrama1](../images/Capitulo3/cap3_ms_seg_12.png)

Paso 13. Crear método para convertir de LocalDateTime To Date.

![diagrama1](../images/Capitulo3/cap3_ms_seg_13.png)

Paso 14. Crear método para generar Token.

![diagrama1](../images/Capitulo3/cap3_ms_seg_14.png)

Paso 15. Crear método para generar Token.

![diagrama1](../images/Capitulo3/cap3_ms_seg_15.png)

Paso 16. Ajustando método createToken.

![diagrama1](../images/Capitulo3/cap3_ms_seg_16.png)

Paso 17. Ajustando método createToken.

![diagrama1](../images/Capitulo3/cap3_ms_seg_17.png)

Paso 18. Método para extraer y validar los claims del token.

![diagrama1](../images/Capitulo3/cap3_ms_seg_18.png)

Paso 19. Método validate en JwtProvider.

![diagrama1](../images/Capitulo3/cap3_ms_seg_19.png)

Paso 20. Crear clase SecurityConfig.

![diagrama1](../images/Capitulo3/cap3_ms_seg_20.png)

Paso 21. Crear la clase AuthService.

![diagrama1](../images/Capitulo3/cap3_ms_seg_21.png)

Paso 22. Crear método NewUserDTO.

![diagrama1](../images/Capitulo3/cap3_ms_seg_22.png)


### Tarea 2. Ajuste controller

Paso 1. Implementa un método en AuthService que permita guardar usuarios en la base de datos.

![diagrama1](../images/Capitulo3/cap3_ms_seg_23.png)

Paso 2. Define un método en AuthService que genere un token JWT al autenticar un usuario válido.

![diagrama1](../images/Capitulo3/cap3_ms_seg_24.png)

Paso 3. Expón los endpoints necesarios para las operaciones de autenticación y gestión de usuarios.

![diagrama1](../images/Capitulo3/cap3_ms_seg_25.png)

Paso 4. El método debe aceptar credenciales de usuario y devolver un token JWT si son válidas.

![diagrama1](../images/Capitulo3/cap3_ms_seg_26.png)

Paso 5. Agrega un endpoint en el controlador para validar si un token JWT sigue siendo válido.

![diagrama1](../images/Capitulo3/cap3_ms_seg_27.png)

Paso 6. Agrega un endpoint para permitir la creación de nuevos usuarios.

![diagrama1](../images/Capitulo3/cap3_ms_seg_28.png)


### Resultado esperado

Al finalizar la práctica, tendrás un microservicio funcional que permita:

- Crear usuarios en una base de datos en memoria.
- Autenticar usuarios utilizando JWT.
- Exponer endpoints seguros para la gestión de usuarios.
- 
![diagrama1](../images/Capitulo3/cap3_ms_seg_29.png)
