/*
MAX nos permite obtener el valor máximo
*/

-- Seleccionar la película con mayor duración
-- Únicamente recupera el valor máximo que encuentre en la columna "length". Todo lo demás no lo va a mostrar. 
-- Max solo regresa eso. Puede ser una limitación para ciertos usos. 

-- Obtener el valor máximo en la columna.
SELECT MAX(length) FROM film;
SELECT MAX(RENTAL_RATE) FROM film;

-- Obtener el valor mínimo en la columna.
SELECT MIN(length) FROM film;
SELECT MIN(RENTAL_RATE) FROM film;

-- Obtener el promedio de la columna.
SELECT AVG(length) FROM film;

-- Nos permite obtener la suma de los valores de las columnas
-- Cuánto cuesta reemplazar el inventario
SELECT SUM(replacement_cost) FROM film; 


