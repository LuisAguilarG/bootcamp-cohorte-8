/*
Consultas de agrupamiento
Las utilizamos para agrupar resultados que tengan el mismo valor. 
*/

-- Se pueden utilizar para hacer un conteo. 

-- Recupera y muestra todas las columnas de la tabla "inventory". Estarán agrupadas por medio de la columna "store_id". Todos los registros que tenían en común valores en esa columna colapsan y ya no se repetirán.  
SELECT * FROM inventory GROUP BY store_id;

SELECT * FROM rental GROUP BY customer_id;

-- Devolver el country_id y el city_id de la tabla city. Después agruparlos por country_id:
-- Selecciona el country id y el número de ciudades que tiene cada país agrupado por país. 
SELECT country_id, COUNT(city_id) AS 'total_de_ciudades' FROM city GROUP BY country_id;

SELECT * FROM city WHERE country_id = 6;

-- Comprobación
SELECT * FROM city WHERE country_id = 1;

-- Filtrar por países con más de dos ciudades
-- Having es similar a where
-- El "as" se utiliza para alias. Es solo temporal y no modifica la tabla original.
SELECT country_id, COUNT(city_id) AS 'total_de_ciudades' FROM city GROUP BY country_id HAVING total_de_ciudades > 2;

-- Orden de los países con más ciudades.
-- Order by nos permite ordenar elementos de forma ascendente y descendente. 
SELECT country_id, COUNT(city_id) AS 'total_de_ciudades' FROM city GROUP BY country_id ORDER BY total_de_ciudades DESC;

-- Mostrar solo el país con mayor número de ciudades.
SELECT country_id, COUNT(city_id) AS 'total_de_ciudades' FROM city GROUP BY country_id ORDER BY total_de_ciudades DESC LIMIT 1;

-- También se puede utilizar sin alias
-- SELECT country_id, count(city_id) FROM city GROUP BY country_id ORDER BY count(city_id) DESC LIMIT 1;

-- --------------------------------
-- Consulta para encontrar la película con mayor duración.
-- Nota: si bien hay varias películas con la misma duración "185", poniendo límite descendente de 1 el resultado será:
-- "film_id" = 141, "title" = CHICAGO NORTH, "duracion_de_pelicula" = 185.
SELECT film_id, title, length AS 'duracion_de_pelicula' FROM film ORDER BY duracion_de_pelicula DESC LIMIT 1;
-- Solución alternativa para mostrar todos las columnas del registro:
-- SELECT * FROM film ORDER BY length DESC LIMIT 1;




