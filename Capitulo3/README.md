# Práctica 3. Microservicio Seguridad

## Objetivo de la práctica:
Al finalizar la práctica, serás capaz de:
- Crear un Microservicio dedicado a la seguridad y permita la creación de usuarios   
- Manejo de JWT
- Crear un microservicio basado en Spring security para la gestión de usuarios con una base de datos en memoria. 

## Duración aproximada:
- 80 minutos.

### Tarea 1. Creacion de microservicio

Paso 1. Ingresar al link https://start.spring.io/ para crear el servicio.

![diagrama1](../images/Capitulo3/cap3_ms_seg_1.png)

Paso 2. Agregar JWT en el `POM.XML`.

![diagrama1](../images/Capitulo3/cap3_ms_seg_2.png)

Paso 3. Crear estructura del proyecto.

![diagrama1](../images/Capitulo3/cap3_ms_seg_3.png)

Paso 4. Crear entidad AuthUser.

![diagrama1](../images/Capitulo3/cap3_ms_seg_4.png)

Paso 5. Crear el Repository AuthUser.

![diagrama1](../images/Capitulo3/cap3_ms_seg_5.png)

Paso 6. Creacion DTO AuthUserDto

![diagrama1](../images/Capitulo3/cap3_ms_seg_6.png)

Paso 7. Creacion DTO AuthUserDto.

![diagrama1](../images/Capitulo3/cap3_ms_seg_7.png)

Paso 8. Creacion DTO RequestDto

![diagrama1](../images/Capitulo3/cap3_ms_seg_8.png)

Paso 9. Crear clase PasswordEncoderConfig en security.

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

Paso 1. Método para guardar usuario en el  AuthService.

![diagrama1](../images/Capitulo3/cap3_ms_seg_23.png)

Paso 2. Método para Inicio de sesion  en el  AuthService.

![diagrama1](../images/Capitulo3/cap3_ms_seg_24.png)

Paso 3. Creación Controller AuthController.

![diagrama1](../images/Capitulo3/cap3_ms_seg_25.png)

Paso 4. Método Login  AuthController.

![diagrama1](../images/Capitulo3/cap3_ms_seg_26.png)

Paso 5. Método Validate AuthController.

![diagrama1](../images/Capitulo3/cap3_ms_seg_27.png)

Paso 6. Método create user.

![diagrama1](../images/Capitulo3/cap3_ms_seg_28.png)


### Resultado esperado
![diagrama1](../images/Capitulo3/cap3_ms_seg_29.png)
