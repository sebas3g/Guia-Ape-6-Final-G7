# 💻 GUÍA APE 6 – MANEJO DE ARREGLOS EN JAVA
## Grupo 7 | Día 1 y Día 2

<div align="center">

# 📚 PROGRAMACIÓN

### Desarrollo de ejercicios prácticos con arreglos en Java

**Universidad Técnica de Ambato**

Facultad de Ingeniería en Sistemas, Electrónica e Industrial

**Carrera:** Ingeniería en Software

**Asignatura:** Programación

**Tema:** Manejo, búsqueda, procesamiento y ordenamiento de arreglos.

</div>

---

## 📌 Descripción del proyecto

El presente repositorio contiene el desarrollo de seis ejercicios prácticos correspondientes a la Guía APE 6, divididos en dos partes: Día 1 y Día 2.

Los ejercicios están desarrollados en el lenguaje de programación Java y permiten aplicar conocimientos sobre declaración, almacenamiento, recorrido, búsqueda, modificación y ordenamiento de arreglos.

Además, se utilizan estructuras repetitivas, condicionales y métodos de la biblioteca `java.util.Arrays` para resolver diferentes situaciones relacionadas con gastos semanales, producción por turnos, rendimiento académico y procesamiento de datos.

---

## 👥 Integrantes y distribución de actividades

| Integrante | Actividad asignada |
|---|---|
| **Francis Bonifaz** | Ejercicio 1,2,3 - Día 1 |
| **David Puniña** | Ejercicio 1 - Día 2 |
| **Dixon Prado** | Ejercicio 3 - Día 2 y Documentación  |
| **Sebastián Navas** | Ejercicio 2 - Día 2  y Elaboración del README  |

**Nota:** Los ejercicios del Día 2 corresponden a la continuación del trabajo práctico del Grupo 6.

---

# 📖 PRIMERA PARTE – DÍA 1

## 1. Control de gastos semanales y ajuste por inflación

**Descripción:**

Se desarrolla un programa que permite registrar los gastos diarios durante una semana, almacenándolos en un arreglo de tipo `double`.

**Operaciones realizadas:**
- Registrar los gastos correspondientes a los 7 días.
- Calcular el gasto total de la semana.
- Obtener el promedio diario.
- Aplicar un incremento del 10 % únicamente a los días cuyo gasto supere el promedio.
- Mostrar el arreglo actualizado en orden inverso.
- Indicar cuántos días recibieron el incremento.

## 2. Filtro y suma condicionada de producción

**Descripción:**

Se crea un arreglo de 10 números enteros que representan la cantidad de piezas fabricadas durante diferentes turnos de producción.

**Operaciones realizadas:**
- Ingresar las cantidades de piezas producidas por cada turno.
- Calcular la suma de los valores ubicados en índices pares (0, 2, 4, 6 y 8).
- Contar los turnos cuya producción sea impar y superior a 15.
- Calcular el promedio general de producción con dos decimales.

## 3. Análisis de asistencia y rendimiento

**Descripción:**

Se desarrolla un programa que solicita la cantidad de estudiantes de un curso y almacena sus calificaciones en un arreglo de tipo `int`.

**Operaciones realizadas:**
- Solicitar la cantidad de estudiantes.
- Registrar notas válidas entre 0 y 20.
- Calcular el promedio general del curso.
- Contar los estudiantes aprobados (nota mayor o igual a 14).
- Contar los estudiantes reprobados.
- Identificar los estudiantes cuyas notas estén por debajo del promedio.

---

# 📖 SEGUNDA PARTE – DÍA 2

## 4. Búsqueda y conteo

**Descripción:**

Se utiliza un arreglo de números enteros para solicitar un valor al usuario y determinar cuántas veces aparece dentro del arreglo.

**Operaciones realizadas:**
- Buscar un número ingresado por teclado.
- Contar cuántas veces aparece.
- Identificar su primera posición.
- Utilizar la variable `posicion = -1` cuando el número no existe.
- Mostrar el mensaje "No existe" si el elemento no se encuentra.

## 5. Máximo y mínimo con arreglos paralelos

**Descripción:**

Se utilizan dos arreglos relacionados entre sí: uno almacena los nombres de los estudiantes y otro contiene sus respectivas calificaciones.

**Operaciones realizadas:**
- Identificar la nota más alta y el estudiante correspondiente.
- Identificar la nota más baja y el estudiante correspondiente.
- Utilizar las variables `posMax` y `posMin` para almacenar las posiciones.
- Calcular el promedio general de las calificaciones.
- Mostrar el promedio con dos decimales.

## 6. Integrador con java.util.Arrays

**Descripción:**

Se trabaja con un arreglo de números enteros para aplicar diferentes métodos de la biblioteca `java.util.Arrays`.

**Operaciones realizadas:**
- Crear una copia independiente utilizando `Arrays.copyOf()`.
- Ordenar únicamente la copia mediante `Arrays.sort()`.
- Mostrar ambos arreglos utilizando `Arrays.toString()`.
- Identificar el segundo número mayor.
- Buscar la posición del número 14 mediante `Arrays.binarySearch()`.

---

## 🎯 Objetivo general

Desarrollar seis ejercicios prácticos en Java mediante el uso de arreglos y estructuras de control, aplicando operaciones de almacenamiento, recorrido, búsqueda, comparación y ordenamiento de datos para fortalecer las habilidades de programación y resolución de problemas.

## 🎯 Objetivos específicos

1. Aplicar el uso de arreglos de tipo `double` e `int` para registrar, almacenar y procesar información relacionada con gastos semanales, producción por turnos y rendimiento académico.

2. Implementar operaciones de búsqueda, conteo y comparación mediante arreglos, identificando valores máximos, mínimos, posiciones y elementos que cumplan determinadas condiciones.

3. Utilizar los métodos de la biblioteca `java.util.Arrays` para copiar, ordenar y visualizar arreglos, comprendiendo su funcionamiento y aplicación en la resolución de problemas.

---

## 📌 Conclusiones

1. El desarrollo de los seis ejercicios permitió comprender la importancia de los arreglos en Java para almacenar y organizar información, facilitando el procesamiento de múltiples datos mediante una misma estructura.

2. La aplicación de estructuras repetitivas y condicionales fortaleció la capacidad para realizar cálculos, validar información, buscar elementos y establecer comparaciones de acuerdo con diferentes condiciones.

3. La utilización de métodos de la biblioteca `java.util.Arrays` permitió conocer herramientas que facilitan la manipulación de arreglos, como la copia, el ordenamiento y la búsqueda de elementos, complementando los conocimientos adquiridos durante la práctica.

## 💡 Recomendaciones

1. Verificar que los datos ingresados por el usuario sean válidos y correspondan al tipo de información solicitado, evitando errores durante la ejecución de los programas.

2. Utilizar correctamente los índices y límites de los arreglos para evitar errores de acceso a posiciones inexistentes y garantizar el procesamiento adecuado de los datos.

3. Realizar diferentes pruebas con valores de entrada variados para comprobar que las operaciones, condiciones y métodos utilizados funcionen correctamente y produzcan los resultados esperados.

---

## 🛠️ Tecnologías y herramientas utilizadas

- **Lenguaje de programación:** Java.
- **Biblioteca:** `java.util.Arrays`.
- **IDE:** Visual Studio Code.
- **Control de versiones:** Git.
- **Plataforma:** GitHub.

## 📂 Estructura del repositorio

```text
GUIA-APE-6/
│
├── Dia1/
│   ├── Ejercicio1/
│   ├── Ejercicio2/
│   └── Ejercicio3/
│
├── Dia2/
│   ├── Ejercicio1/
│   ├── Ejercicio2/
│   └── Ejercicio3/
│
└── README.md
```

---

<div align="center">

### 🎓 UNIVERSIDAD TÉCNICA DE AMBATO

**FACULTAD DE INGENIERÍA EN SISTEMAS, ELECTRÓNICA E INDUSTRIAL**

**CARRERA DE INGENIERÍA EN SOFTWARE**

### GRUPO 7

*Aprendiendo, practicando y desarrollando soluciones mediante la programación en Java.*

</div>
