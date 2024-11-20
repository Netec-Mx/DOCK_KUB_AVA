# Práctica 5.

Crear un manifiesto en kubernetes que permita desplegar múltiples servicios

## Objetivo del laboratorio:
Al finalizar la práctica, serás capaz de:
- Realizar el despliegue de dos bases de datos en un solo manifiesto

## Objetivo Visual

![diagrama1](../images/Capítulo2/cap2_obt_final.png)

## Duración aproximada:
- 45 minutos.
## Instrucciones

### Tarea 1. Creando manifiesto

Paso 1. Creamos el lab5.yaml

### YAML
```YAML
apiVersion: v1
kind: Pod
metadata:
  name: db-pod
  labels:
    app: db-app
spec:
  containers:
    - name: mysql-container
      image: mysql:latest
      env:
        - name: MYSQL_ROOT_PASSWORD
          value: "rootpassword"
      ports:
        - containerPort: 3306


    - name: postgres-container
      image: postgres:latest
      env:
        - name: POSTGRES_DB
          value: "mydatabase"
        - name: POSTGRES_USER
          value: "myuser"
        - name: POSTGRES_PASSWORD
          value: "mypassword"
      ports:
        - containerPort: 5432
```

### Tarea 2. Desplegar multiples contenedores

Paso 1. Ejecutar comando para crear los multiples contenedores

### shell
```shell
 kubectl apply -f deployment-email.yaml
```

![diagrama1](../images/Capítulo5/Cap5_run_deploy.png)

Paso 2. Validar el log de la creacion del pod

![diagrama1](../images/Capítulo5/Cap5_run_deploy_1.png)

### shell
```shell
 kubectl describe pod db-pod
```

### NOTA IMPORTANTE

1 . Si se tarda en crear el contenedor primero descargar la imagen con el siguiente comando
### shell
```shell
 docker pull postgres:latest
```

2. PAra obtneer la Ip de los pod desplegados

### shell
```shell
  kubectl port-forward deployment/db-deployment 3306:3306t
```
![diagrama1](../images/Capítulo5/Cap5_run_deploy_2.png)
### Resultado esperado

![diagrama1](../images/Capítulo5/Cap5_esperado.png)
