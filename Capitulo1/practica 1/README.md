# Práctica 1.

## Objetivo del laboratorio
Al finalizar la práctica, serás capaz de:
- Desplegar el el servicio de emails en ECS.
- Configurar Cuenta de emails.
- Dockerisar un servicio de backend.

## Objetivo Visual 

![diagrama1](../../images/Capitulo%201/practica1_objetivo.png)

## Duración aproximada:
- 60 minutos.
  
## Instrucciones 

### Tarea 1. Configuracion token servicio email
Paso 1. En el application.properties tenemos la variable “spring.mail.password”, la cual es utilizada para el token de envío de correo.

![diagrama1](../../images/Capitulo%201/practica1_application_properties.png)

Paso 2. Para crear el token debemos ingresar a las configuraciones y buscar “Contraseñas de aplicaciones”.

![diagrama1](../../images/Capitulo%201/practica1_gmial.png)

Paso 3. Agregar un nuevo nombre  del token.

![diagrama1](../../images/Capitulo%201/practica1_gmial_1.png)

Paso 4. Generar el token y reemplazarlo en el `aplicacion.properties`.

![diagrama1](../../images/Capitulo%201/practica1_token_1.png)

Paso 4. Crear el Dockerfile.

![diagrama1](../../images/Capitulo%201/practica1_dockerfile.png)

Paso 5. Crear el artefacto, primero a clean y package.

![diagrama1](../../images/Capitulo%201/practica1_mvn.png)

![diagrama1](../../images/Capitulo%201/practica1_mvn_2.png)


### Tarea 2. Dockerizando BackEnd

Paso 1. Crear el repositorio en Docker Hub.

![diagrama1](../../images/Capitulo%201/practca1_docker_1.png)


Paso 2. Nombrar el repositorio en Docker.

![diagrama1](../../images/Capitulo%201/practca1_docker_2.png)
![diagrama1](../../images/Capitulo%201/practca1_docker_3.png)


Paso 3. Crear la imagen de Docker del email.

### shell
```shell
  docker build -t img_email:V1 . 
```

![diagrama1](../../images/Capitulo%201/practca1_docker_4.png)


Paso 4. Taggear la imagen en el Docker Hub.

### shell
```shell
  docker tag img_email:V1 daniel0223/netec_email
```

![diagrama1](../../images/Capitulo%201/practca1_docker_5.png)


Paso 5. Subir la imagen a Docker Hub.

### shell
```shell
  docker push daniel0223/netec_email
```

![diagrama1](../../images/Capitulo%201/practca1_docker_6.png)

![diagrama1](../../images/Capitulo%201/practca1_docker_7.png)



### Tarea 3. Desplegando en ECS

Paso 1. Crear Task en el servicio de ECS.

![diagrama1](../../images/Capitulo%201/ECS_1.png)


Paso 2. Agregar un nombre a la tarea y seleccionar Fargate serveless.

![diagrama1](../../images/Capitulo%201/ECS_2.png)


Paso 3. Seleccionar ninguno y por defecto en task execution role.

![diagrama1](../../images/Capitulo%201/ECS_3.png)


Paso 4. Seleccionar la imagen a crear, la cual corresponde a la creada en Docker Hub.

![diagrama1](../../images/Capitulo%201/ECS_4.png)


Paso 5. Puerto de despliegue de la aplicación o backend.

![diagrama1](../../images/Capitulo%201/ECS_6.png)


Paso 6. Puerto de despliegue de la aplicación o backend.

![diagrama1](../../images/Capitulo%201/ECS_5.png)


Paso 7. Crear clúster.

![diagrama1](../../images/Capitulo%201/ECS_7.png)


Paso 8. Dar un nombre al clúster y no seleccionar los servidores.

![diagrama1](../../images/Capitulo%201/ECS_8.png)


Paso 9. Crear el clúster.

![diagrama1](../../images/Capitulo%201/ECS_9.png)


Paso 10. Crear el clúster

![diagrama1](../../images/Capitulo%201/ECS_10.png)


Paso 11. Desplegar con Fargate y última versión.

![diagrama1](../../images/Capitulo%201/ECS_11.png)


Paso 12. Crear un nuevo Segurity Group, dando a acceso al tráfico de entrada.

![diagrama1](../../images/Capitulo%201/ECS_12.png)


Paso 13. Seleccionar la tarea que creamos en pasos anteriores y creamos.

![diagrama1](../../images/Capitulo%201/ECS_13.png)

![diagrama1](../../images/Capitulo%201/ECS_14.png)


Paso 14. En el clúster ubicamos la IP pública para realizar la petición del servicio.

![diagrama1](../../images/Capitulo%201/ECS_15.png)


Paso 15.  Prueba postman.

![diagrama1](../../images/Capitulo%201/ECS_16.png)


### Resultado esperado
![diagrama1](../../images/Capitulo%201/ECS_16.png)
