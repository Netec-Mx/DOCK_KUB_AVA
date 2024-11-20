# Microservicio Seguridad


Crear un microservicio basado en Spring security para la gestión de usuarios con una base de datos en memoria


## Objetivo de la práctica:
Al finalizar la práctica, serás capaz de:
- Crear un Microservicio dedicado a la seguridad y permita la creación de usuarios   
- Manejo de JWT


## Duración aproximada:
- 80 minutos.

### Tarea 1. Creacion microservicio

Paso 1. ingresar al link https://start.spring.io/ para crear el servicio

![diagrama1](../images/Capitulo3/cap3_ms_seg_1.png)

Paso 2. Agregar JWT en el POM.XML

![diagrama1](../images/Capitulo3/cap3_ms_seg_2.png)

Paso 3. Crear estructura del proyecto

![diagrama1](../images/Capitulo3/cap3_ms_seg_3.png)

Paso 4. Crear entidad AuthUser

![diagrama1](../images/Capitulo3/cap3_ms_seg_4.png)

Paso 5. Crear el Repository AuthUser

![diagrama1](../images/Capitulo3/cap3_ms_seg_5.png)

Paso 6. Creacion DTO AuthUserDto

![diagrama1](../images/Capitulo3/cap3_ms_seg_6.png)

Paso 7. Creacion DTO AuthUserDto

![diagrama1](../images/Capitulo3/cap3_ms_seg_7.png)

Paso 8. Creacion DTO RequestDto

![diagrama1](../images/Capitulo3/cap3_ms_seg_8.png)

Paso 9. Crear clase PasswordEncoderConfig en security

![diagrama1](../images/Capitulo3/cap3_ms_seg_9.png)

Paso 10. Crear la clase RouteValidation en el package security

![diagrama1](../images/Capitulo3/cap3_ms_seg_10.png)

Paso 11. Creacion validacion metodo  is admin y URL 

![diagrama1](../images/Capitulo3/cap3_ms_seg_11.png)

Paso 12. Creacion de JwtProvider en security

![diagrama1](../images/Capitulo3/cap3_ms_seg_12.png)

Paso 13. Crear metodo para convertir de LocalDateTime To Date

![diagrama1](../images/Capitulo3/cap3_ms_seg_13.png)

Paso 14. Crear metodo para generar Token

![diagrama1](../images/Capitulo3/cap3_ms_seg_14.png)

Paso 15. Crear metodo para generar Token

![diagrama1](../images/Capitulo3/cap3_ms_seg_15.png)

Paso 16. Ajustando metodo createToken

![diagrama1](../images/Capitulo3/cap3_ms_seg_16.png)

Paso 17. Ajustando metodo createToken

![diagrama1](../images/Capitulo3/cap3_ms_seg_17.png)

Paso 18. Metodo para extraer y validar los claims del token

![diagrama1](../images/Capitulo3/cap3_ms_seg_18.png)

Paso 19. Metodo validate en JwtProvider

![diagrama1](../images/Capitulo3/cap3_ms_seg_19.png)

Paso 20. Creacion clase SecurityConfig

![diagrama1](../images/Capitulo3/cap3_ms_seg_20.png)

Paso 21. Creacion de la clase AuthService

![diagrama1](../images/Capitulo3/cap3_ms_seg_21.png)

Paso 22. Crear metodo NewUserDTO

![diagrama1](../images/Capitulo3/cap3_ms_seg_22.png)


### Tarea 2. Ajuste controller

Paso 1. Metodo para guardar usuario en el  AuthService

![diagrama1](../images/Capitulo3/cap3_ms_seg_23.png)

Paso 2. Metodo para Inicio de sesion  en el  AuthService

![diagrama1](../images/Capitulo3/cap3_ms_seg_24.png)

Paso 3. Creacion Controller AuthController

![diagrama1](../images/Capitulo3/cap3_ms_seg_25.png)

Paso 4. Metodo Login  AuthController

![diagrama1](../images/Capitulo3/cap3_ms_seg_26.png)

Paso 5. Metodo Validate AuthController

![diagrama1](../images/Capitulo3/cap3_ms_seg_27.png)

Paso 6. Metodo create user 

![diagrama1](../images/Capitulo3/cap3_ms_seg_28.png)


### Resultado esperado
![diagrama1](../images/Capitulo3/cap3_ms_seg_29.png)
