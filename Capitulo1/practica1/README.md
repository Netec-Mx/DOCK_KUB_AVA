# Práctica 1.2. Creación de servicio ECS

## Objetivo del laboratorio
Al finalizar la práctica, serás capaz de:
- Desplegar el servicio de correos electrónicos en Amazon ECS.
- Configurar correctamente una cuenta para el envío de correos electrónicos.
- Dockerizar un servicio de backend para facilitar su despliegue.

## Objetivo Visual 
El objetivo visual es desplegar un servicio de correos electrónicos completamente funcional utilizando Docker y ECS.
![diagrama1](../../images/Capitulo%201/practica1_objetivo.png)

## Duración aproximada:
- 30 minutos.
  
## Instrucciones 

### Tarea 1. Configuracion token servicio email
Paso 1. En el archivo `application.properties`, ubicar la variable spring.mail.password. Esta será utilizada para almacenar el token de envío de correos electrónicos.

![diagrama1](../../images/Capitulo%201/practica1_application_properties.png)

Paso 2. Ingresar a las configuraciones de la cuenta de correo y buscar la sección "Contraseñas de aplicaciones".

![diagrama1](../../images/Capitulo%201/practica1_gmial.png)

Paso 3. Crear un nuevo token asignándole un nombre.

![diagrama1](../../images/Capitulo%201/practica1_gmial_1.png)

Paso 4. Generar el token y reemplazarlo en el archivo `application.properties`.

![diagrama1](../../images/Capitulo%201/practica1_token_1.png)

Paso 5. Crear el archivo Dockerfile para preparar el servicio para su despliegue en Docker.


![diagrama1](../../images/Capitulo%201/practica1_dockerfile.png)

Paso 6. Generar el artefacto de la aplicación ejecutando los comandos **clean** y **package** con Maven.

![diagrama1](../../images/Capitulo%201/practica1_mvn.png)

![diagrama1](../../images/Capitulo%201/practica1_mvn_2.png)


### Tarea 2. Dockerizando BackEnd

Convertir el servicio de backend en una imagen de Docker y almacenarla en Docker Hub.

Paso 1. Crear el repositorio en Docker Hub.

![diagrama1](../../images/Capitulo%201/practca1_docker_1.png)


Paso 2. Nombrar el repositorio en Docker.

![diagrama1](../../images/Capitulo%201/practca1_docker_2.png)
![diagrama1](../../images/Capitulo%201/practca1_docker_3.png)


Paso 3. Crear la imagen de Docker para el servicio de correos electrónicos.

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

Desplegar el servicio de correos electrónicos en Amazon ECS utilizando Fargate.


Paso 1. Crear una tarea (Task) en el servicio ECS.

![diagrama1](../../images/Capitulo%201/ECS_1.png)


Paso 2. se configura una definición de tarea en Amazon ECS con el nombre email_task_definition. Se selecciona AWS Fargate como el tipo de ejecución, lo que permite utilizar un entorno serverless para contenedores. Además, se especifican los requisitos de infraestructura: sistema operativo Linux, 1 vCPU, 3 GB de memoria y el modo de red awsvpc para garantizar la conectividad de la tarea.

![diagrama1](../../images/Capitulo%201/ECS_2.png)


Paso 3. Mantener la opción "Ninguno" en el rol de ejecución de tareas.

![diagrama1](../../images/Capitulo%201/ECS_3.png)


Paso 4. Seleccionar la imagen previamente subida a Docker Hub.

![diagrama1](../../images/Capitulo%201/ECS_4.png)


Paso 5. Configurar el puerto de despliegue para la aplicación (backend).

![diagrama1](../../images/Capitulo%201/ECS_6.png)


Paso 6. Puerto de despliegue de la aplicación o backend.

![diagrama1](../../images/Capitulo%201/ECS_5.png)


Paso 7. Asignar un nombre al clúster y no seleccionar servidores.

![diagrama1](../../images/Capitulo%201/ECS_7.png)


Paso 8. Dar un nombre al clúster y no seleccionar los servidores.

![diagrama1](../../images/Capitulo%201/ECS_8.png)


Paso 9. Configurar las tareas para ejecutarlas en Fargate con la última versión disponible.

![diagrama1](../../images/Capitulo%201/ECS_9.png)


Paso 10. Crear un nuevo Security Group, permitiendo el acceso al tráfico de entrada.

![diagrama1](../../images/Capitulo%201/ECS_10.png)


Paso 11. Seleccionar la tarea creada anteriormente y desplegarla.

![diagrama1](../../images/Capitulo%201/ECS_11.png)


Paso 12. Una vez desplegado, localizar la IP pública en el clúster para realizar pruebas.

![diagrama1](../../images/Capitulo%201/ECS_12.png)


Paso 13. Realizar pruebas con Postman para validar el servicio.

![diagrama1](../../images/Capitulo%201/ECS_13.png)

![diagrama1](../../images/Capitulo%201/ECS_14.png)


Paso 14. En el clúster ubicamos la IP pública para realizar la petición del servicio.

![diagrama1](../../images/Capitulo%201/ECS_15.png)


Paso 15.  Prueba postman.

![diagrama1](../../images/Capitulo%201/ECS_16.png)


### Resultado esperado
![diagrama1](../../images/Capitulo%201/ECS_16.png)
