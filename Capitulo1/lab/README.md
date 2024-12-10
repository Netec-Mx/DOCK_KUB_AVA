# Laboratorio 

## Objetivo del laboratorio:
Al finalizar la práctica, serás capaz de:
- Crear un chart personalizable con Helm.
- Desplegar un microservicio utilizando Helm, configurando correctamente los manifiestos necesarios.

## Objetivo visual: 
Diseñar y desplegar un chart Helm que permita gestionar el microservicio de correos electrónicos de manera eficiente y reutilizable.
![diagrama1](../../images/lab_email_with_Helm.png)

## Duración aproximada:
- 30 minutos.
  
## Instrucciones 

### Tarea 1. Creación de un chart
Paso 1. Crear una nueva carpeta vacía con el nombre LAB.

Paso 2. Abrir la carpeta LAB en Visual Studio Code.

Paso 3. Ejecutar el comando `helm create ms-email` para generar automáticamente la estructura básica del chart. Este comando crea carpetas preconfiguradas que facilitan la personalización del despliegue.

### shell
```shell
helm create ms-email
```

![diagrama1](../../images/LAB_CREACION_CHART.png)

### Tarea 2. Modificar el manifiesto values.yaml

Personalizar los valores por defecto del chart para definir las réplicas, la imagen del contenedor y el puerto del servicio.

Paso 1. Abrir el archivo `values.yaml`.

Paso 2. Crear una sola replica del servicio `replicaCount = 1`.

Paso 3. Especificar los valores para la imagen del contenedor, tipo de servicio y puertos: 
### YAML
```
replicaCount: 1

image:
 repository: daniel0223/netec_email
 tag: latest
 pullPolicy: IfNotPresent


service:
 type: NodePort
 port: 8081


containerPort: 8081
```

### Tarea 3. Modificar el manifiesto deployment.yaml

Configurar el manifiesto de despliegue (deployment.yaml) para utilizar los valores definidos en values.yaml.

Paso 1. Abrir el archivo templates/deployment.yaml y ajustarlo.

Paso 2. Ajustar la configuración de despliegue para utilizar los parámetros definidos:
### YAML
```
apiVersion: apps/v1
kind: Deployment
metadata:
 name: {{ .Release.Name }}-ms-email
spec:
 replicas: {{ .Values.replicaCount }}
 selector:
   matchLabels:
     app: {{ .Release.Name }}-ms-email
 template:
   metadata:
     labels:
       app: {{ .Release.Name }}-ms-email
   spec:
     containers:
       - name: ms-email
         image: "{{ .Values.image.repository }}:{{ .Values.image.tag }}"
         ports:
           - containerPort: {{ .Values.containerPort }}
```

### Tarea 4. Modificar el manifiesto service.yaml

Configurar el servicio `(service.yaml)` para exponer el microservicio y definir el acceso desde el clúster.

Paso 1. Abrir el archivo `templates/service.yaml`.

Paso 2. Configurar el servicio para usar un puerto accesible desde fuera del clúster
### YAML
```
# templates/service.yaml


apiVersion: v1
kind: Service
metadata:
 name: {{ .Release.Name }}-ms-email
spec:
 type: {{ .Values.service.type }}
 ports:
   - port: {{ .Values.service.port }}
     targetPort: {{ .Values.containerPort }}
     nodePort: 30081  # Puedes especificar el NodePort o dejar que Kubernetes lo asigne
 selector:
   app: {{ .Release.Name }}-ms-email
```
### Tarea 5. Desplegar el chart

Realizar el despliegue del microservicio utilizando Helm y verificar que se haya implementado correctamente.

Paso 1. Dirigirse a la ruta donde se encuentra el chart ms-email y ejecutar el comando para instalar el chart.

### shell
```shell
 helm install ms-email ./ms-email
```

![imagen resultado](../../images/LAB_INSTALL.png)

Paso 1. Validar que el despliegue se completó correctamente verificando los recursos creados.

### shell
```shell
 kubectl get deployments
```

![imagen resultado](../../images/lab_validar_deploryment.png)

### Resultado esperado
![imagen resultado](../../images/LAB_INSTALL.png)
