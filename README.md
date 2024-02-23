### NTT DATA - Challenge QA E2E

Mediante el uso del Framework Serenity BDD se realiza la automatización de una prueba funcional E2E para el flujo de una compra con el navegador Chrome, en la página http://opencart.abstracta.us/ y en la cual se realizan los siguientes eventos por parte del actor:
- Agregar 2 productos al carrito de compras
- Visualizar el carrito de compras con los productos seleccionados
- Completar el 'Checkout' (Ingresar los datos del cliente) como invitado: 'Guest Checkout'
- Finalizar la compra de manera exitosa

#### Prerequisitos:
- Sistema Operativo Windows 10
- IDE IntelliJ IDEA 2023.3.2
- Gradle version 7.6
- JDK version Corretto 17
- Descargar o clonar el proyecto
- Extraer el proyecto en la ruta local de su preferencia

#### Comandos de Instalación y Ejecución
- Abri el proyecto con el IDE IntelliJ
- Click en el Icono de *'Gradle'*
- Abrir el *'Execute Gradle Task'*  y ejecutar los siguientes comandos

```bash
gradle clean
gradle build
```
En caso de preesentarse inconvenientes para ejecutar los 'test', con los comandos anteriores, ejecutar el siguiente comando:
```bash
gradle test
```

#### Instalación y Ejecución mediante IDE
- Abri el proyecto con el IDE IntelliJ
- Abrir el archivo "build.gradle" que se encuentra en la raiz del proyecto
- Click en el icon *'Load Gradle Changes'*
- Abrir el archivo *'Runners'* de la ruta "src/test/java/com/nttdata/challengeqa/runners/"
- Click sobre *'Run Test'* en la clase *'Runners'*

#### Reportes
Descargar los siguientes reportes, los cuales nos permiten tener un informe detallado de las pruebas automatizadas y su estado final:
```bash
"build/reports/tests/test/index.html"
"target/site/serenity/index.html"
```

#### Nota
En caso de presentar incovenientes con las dependencias se debe actualizar la versión de las mismas, las cuales se encuentran en el siguiente archivo "build.gradle" de la raíz del proyecto