Gestión de Procesos 1 - README
Autor: Virgilio Jesús Domínguez González
■ Introducción
Este proyecto tiene como objetivo trabajar con procesos en Java utilizando tuberías (pipes) en la
línea de comandos. La idea principal es conectar dos programas independientes de manera que la
salida de uno se convierta en la entrada del otro, sin necesidad de archivos intermedios.
1 aleatorios → Genera al menos 40 números aleatorios en el rango [0, 100].
2 ordenarNumeros → Recibe números por entrada estándar, los ordena y los muestra en salida
estándar.
■ Programa 1: ordenarNumeros
Descripción
Lee números desde la entrada estándar, los almacena en una lista y los ordena de menor a mayor
con Collections.sort().
Ejecución:
java ordenarNumeros
■ Programa 2: aleatorios
Descripción
Genera 40 números enteros aleatorios en el rango [0, 100] y los imprime en pantalla, cada uno en
una nueva línea.
Ejecución:
java aleatorios
■ Ejecución conjunta con tuberías
La utilidad real del proyecto se observa al conectar ambos programas con el operador |.
java aleatorios | java ordenarNumeros
1 aleatorios genera los números.
2 El pipe (|) conecta su salida con la entrada del siguiente programa.
3 ordenarNumeros recibe los números, los ordena y los muestra en pantalla.
■ Resultado esperado: una lista ordenada de los números aleatorios generados.
■ Conclusión
1 Crear programas independientes en Java.
2 Interconectarlos mediante tuberías en la línea de comandos.
3 Automatizar procesos de generación y ordenación de datos sin interacción manual ni archivos
intermedios.
