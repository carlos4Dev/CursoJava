# Gestor de biblioteca

Ejercicio correspondiente al módulo **Java Fundamentals** del curso de Java realizado en **Intecssa**.

Enunciado:

Se requiere un programa para una biblioteca, el programa debe tener el siguiente menú:

1. Insertar persona
2. Insertar Libro
3. Prestar libro
4. Mostrar lista de personas registradas
5. Mostrar lista de libros registrados
6. Mostrar lista de personas que tiene al menos un libro de la biblioteca
7. Mostrar lista de ficha de prestamos
8. Mostrar libros prestados a una persona: insertar código de persona
9. Mostrar datos de ficha de préstamo: insertar código de ficha

El programa tiene las siguientes clases con los siguientes atributos:

- Libros: nombre, código, autor, genero, paginas, estado (prestado - disponible)
- Persona: nombre, apellido, dirección, teléfono, número de identificación personal.
- Ficha de préstamo: código de ficha, código de la persona, código del libro, fecha de préstamo (hacer uso del api de java fecha de devolución, máximo 3 días luego de la fecha de préstamo). Si el estado del libro es prestado deberá mostrar un mensaje pidiendo que inserte un código de libro diferente.

En una lista almacenar los libros que inserte el usuario por teclado.

En una lista diferente almacene las personas insertada por teclado.

En un set almacene las fichas de prestamos.

Cree los métodos y funciones necesarios para que se muestre el menú requerido por la biblioteca.

Comente el código explicando que hace cada método.