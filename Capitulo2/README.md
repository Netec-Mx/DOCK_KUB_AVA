# Práctica 2.

esplegar servicio email en un minikube de kubernetes
## Objetivo del laboratorio:
Al finalizar la práctica, serás capaz de:
- Creacion de manifiestos YAML para desplegar en k8s
- Configuracion proyecto back end

## Objetivo Visual

![diagrama1](../images/Capitulo2/cap2_obt_final.png)

## Duración aproximada:
- 45 minutos.
## Instrucciones

### Tarea 1. Configurando manifiesto

Paso 1. Creamos el deployment-email.yaml

![diagrama1](../images/Capitulo2/cap2_manifiesto1.png)

Paso 2. Crear manifiesto para exponer servicio

![diagrama1](../images/Capitulo2/cap2_manifiesto2.png)

### Tarea 2. Desplegar servicio

Paso 1. Ejecutamos el comando para crear el pod

![diagrama1](../images/Capitulo2/cap2_deploy1.png)

### shell
```shell
 kubectl apply -f deployment-email.yaml
```

Paso 2. Crear el service

![diagrama1](../images/Capitulo2/cap2_deploy2.png)

### shell
```shell
 kubectl apply -f svc-email.yaml
```

Paso 3. validar creacion del servicio

![diagrama1](../images/Capitulo2/cap2_deploy3.png)

### shell
```shell
 kubectl get pods
```


### Resultado esperado
![diagrama1](../images/Capitulo2/cap2_obt_final.png)
