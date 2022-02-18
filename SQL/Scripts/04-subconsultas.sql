
-- Selecciona todas las películas que tiene la categoría de drama
SELECT * FROM film_category WHERE category_id = 7;

-- Obtener os datos de las películas de una categoría
-- IN: dentro de los paréntesis podemos poner una lista de valores para recuperar. Se utiliza para probar si una expresión coincide con algún valor de la lista de valores.  
-- Subconsulta
-- Solo se puede recuperar una columna en el IN, si se intentan recuperar todas las columnas de la tabla dará un error. 
-- Se puede leer como: 
SELECT * FROM film WHERE film_id IN(SELECT film_id FROM film_category WHERE category_id = 7);

-- Ejercicio: obtener todas las películas donde haya participado un actor (a elección). 
-- Ejemplo: actor con id 2.
-- Se puede leer como: recupera TODAS las COLUMNAS de la tabla "film" DONDE el "film_id" está presente / coincida / sea igual DENTRO de la siguiente consulta -> (recupera la COLUMNA "film_id" de la TABLA auxiliar "film_actor" donde los registros tengan "actor_id" igual a 2). 
SELECT * FROM film WHERE film_id IN(SELECT film_id FROM film_actor WHERE actor_id = 2);

-- Between nos permite seleccionar un rango de valores. Incluye el primer y el último número. Es un intervalo cerrado. 
SELECT * FROM actor WHERE actor_id BETWEEN 16 AND 34;

-- Para recuperar con nombre:
SELECT * FROM film WHERE film_id IN (SELECT film_id FROM film_actor WHERE actor_id = (SELECT actor_id FROM actor WHERE first_name = 'RITA'));




