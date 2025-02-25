# Registro, Búsqueda y Notas de Estudiantes

Este programa en Java permite registrar nombres de estudiantes junto con sus calificaciones, ordenarlos y buscar nombres dentro del registro.

## Características

- Permite ingresar una cantidad determinada de estudiantes junto con sus notas.
- Almacena los nombres y notas en un `HashMap`.
- Permite buscar un nombre en la lista y verificar si está registrado.
- Determina y muestra el estudiante con la nota más alta.
- Manejo básico de excepciones para evitar fallos inesperados.

## Tecnologías utilizadas

- Java 8 o superior
- Librerías utilizadas: `java.util.HashMap`, `java.util.Scanner`

## Cómo ejecutar el programa

1. Compila el archivo con el siguiente comando:
   ```bash
   javac Main.java
   ```
2. Ejecuta el programa con:
   ```bash
   java com.ejercicio2.Main
   ```

## Explicación del código

1. Se utiliza un `Scanner` para capturar la entrada del usuario.
2. Se solicita la cantidad de estudiantes a registrar.
3. Se ingresa cada nombre y su respectiva nota, almacenándolos en un `HashMap<String, Double>`.
4. Se muestra la lista de estudiantes junto con sus notas.
5. Se pregunta si se desea buscar un nombre dentro del registro.
6. Si el nombre está en la lista, se muestra un mensaje confirmando su existencia.
7. Se identifica al estudiante con la nota más alta y se muestra en pantalla.

## Autor

Este código fue creado como un ejercicio de práctica en Java para manejo de mapas, listas y entrada de usuario 

jedier stivenson correa amariz

