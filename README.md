Caso:

Considere que se desea trabajar con una matriz de números enteros de dimensiones m x n.

Se desea crear una aplicación basada en una serie de métodos para trabajar ciertas funcionalidades para administrar y visualizar el contenido de la matriz.

Actividades

1. Las dimensiones de la matriz son definidas por el usuario (m: filas, n: columnas) y se debe considerar que estos datos ingresados sean válidos, es decir, debe considerar además un método que valide dichas dimensiones, considere:

boolean validarDimensiones(int filas, int cols) {

...

}

¿Cuándo m y n son dimensiones válidas?

2. Una vez estén capturadas y validadas las dimensiones de la matriz, se debe crear la matriz, por lo que recibe como parámetros las dimensiones y devuelve una matriz de enteros, considere:

int [ ][ ] crearMatriz(int filas, in cols) {

...

}

3. La matriz debe ser llenada con datos de tipo entero, de forma aleatoria, entre 0 y 9, considere:

<tipo> llenarMatriz(int matriz [ ][ ] ) {

...

}

¿Qué tipo de dato se retorna?

4. Muestre por pantalla toda la fila que desee el usuario, considere:

void mostrarFila(int matriz[ ][ ], int fila) {

...

}

5. Verifique si la matriz es de TIPO CERO, esto sucede cuando más del 50% de los valores de la matriz son CERO, considere:

boolean matrizCero(int matriz[ ][ ] ) {

...

}

6. Considere un menú que es llamado desde el método main(), para hacer de los métodos anteriores, considere:

void menu(???) {

...

}

¿Necesita algo más para usar el MENÚ? Por ej. ? leerOpcion( ? ){...}



Considere que su aplicación:

- debe mantenerse en funcionamiento mientras el usuario lo desee, lo que debe quedar expresado en el MENÚ con una opción para SALIR.

- cada método considerado, debe hacer sólo UNA TAREA, en caso que no sea así, se considerará como parcial, siempre y cuando haga de forma correcta la funcionalidad requerida, caso contrario está incorrecto.

- su método MAIN() de la clase principal, no debe realizar ninguna funcionalidad, todo debe ser invocación a los métodos ya creados y alguna declaración de variables requeridas.

- se considerará como deseable el uso de buenas prácticas: nombre adecuado de atributos, métodos, parámetros y variables internas. Así como el uso de la indentación y separado de instrucciones.

- se considerará la aplicación de una métrica en la que un método no podrá tener más de 15-20 líneas de instrucciones, caso contrario ==> método incorrecto.

- no reinvente la rueda ( ej. uso de Math.random(...) ; uso de toString(...) ; etc... )

- considere sus métodos de tipo static

De la entrega:

- debe subir su proyecto con la solución a su repositorio GitHub.

Sino recuerda como hacerlo, ver ayuda en: https://www.jetbrains.com/help/idea/manage-projects-hosted-on-github.html

- 1er commit en su repositorio, hasta las 9:00AM: en el archivo README del repositorio, la descripción de su solución, métodos y como los usará.

- 2do commit en su repositorio, hasta las 9:30AM: Actividad 1, 2

- 3er commit en su repositorio, hasta las 10:00AM: Actividad 3, 4

- 4to commit en su repositorio, hasta las 10:30AM: Actividad 5, 6

- Puede enviar un último commit hasta las 11:00AM, para corregir detalles y la Solución final completa

- el resultado a entregar es el link a su repositorio GitHub, el cual debe copiar en la zona de texto destinado para ello en esta tarea.
