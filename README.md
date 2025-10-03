# Gestión de Procesos 1

## 📌 Autor
**Virgilio Jesús Domínguez González**

---

## 📖 Introducción
Este proyecto tiene como objetivo trabajar con **procesos en Java** utilizando **tuberías (pipes)** en la línea de comandos.  
La idea principal es **conectar dos programas independientes** de manera que la salida de uno se convierta en la entrada del otro, sin necesidad de archivos intermedios.

Los programas desarrollados son:
- **aleatorios** → Genera al menos 40 números aleatorios en el rango [0, 100].  
- **ordenarNumeros** → Recibe números por entrada estándar, los ordena y los muestra en salida estándar.

---

## 📝 Programas

### 🔹 Programa 1: ordenarNumeros
- **Descripción:**  
  Lee números desde la entrada estándar, los almacena en una lista y los ordena de menor a mayor con `Collections.sort()`.  

- **Ejecución:**  
  ```bash
  java ordenarNumeros
🔹 Programa 2: aleatorios
Descripción:
Genera 40 números enteros aleatorios en el rango [0, 100] y los imprime en pantalla, cada uno en una nueva línea.

Ejecución:

bash
Copiar código
java aleatorios
🔗 Ejecución conjunta con tuberías
La utilidad real del proyecto se observa al conectar ambos programas con el operador |.

bash
Copiar código
java aleatorios | java ordenarNumeros
➡️ Flujo del proceso:
aleatorios genera los números.

El pipe (|) conecta su salida con la entrada del siguiente programa.

ordenarNumeros recibe los números, los ordena y los muestra en pantalla.

📌 Resultado esperado: una lista ordenada de los números aleatorios generados.

🚀 Conclusión
Este trabajo muestra cómo:

Crear programas independientes en Java.

Interconectarlos mediante tuberías en la línea de comandos.

Automatizar procesos de generación y ordenación de datos sin interacción manual ni archivos intermedios.

sql
Copiar código

¿Quieres que lo prepare también con un **ejemplo de ejecución real** (simulación en consola mostrando números des
