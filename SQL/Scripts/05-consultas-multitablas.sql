-- Separamos las tablas por medio de comas.
-- Combina cada uno de los registros de "category" por todos los registros de "language".
-- MySQL coloca visualmente una tabla al lado de otra. 
-- FULL JOIN
SELECT * FROM category, language;

-- Ejercicio de conjuntos.

-- INNER JOIN
-- Recupera columnas de dos tablas distintas. 
-- Se lee como: Recupera las columnas "city_id", "city" y "country" de la tabla "city". Solo se mostrarán aquellos registros que estén presentes en las tablas "city" y "country" y que contengan el mismo country_id; 
-- O como: combina las tablas "city" y "country". Recuperará solo aquellos registros que tengan el mismo valor en la columna "country_id", que está presente en ambas tablas. Todo lo demás se deshecha. Al final solo se mostrarán 3 columnas. 
SELECT city_id, city, country FROM city INNER JOIN country ON city.country_id = country.country_id ORDER BY city_id ASC;

-- Las dos tablas, una al lado de otra.
SELECT * FROM city, country;

-- Seleccionar el nombre del país, el nombre de la ciudad y la dirección.
-- country está relacionada con city y city está relacionada con address
SELECT country, city, address FROM country
INNER JOIN city ON country.country_id = city.country_id
INNER JOIN address ON city.city_id = address.city_id;

-- Seleccionar el actor y las películas en las cuales ha estado involucrado, asi mismo como la descripción de cada película
SELECT CONCAT(first_name, ' ', last_name) as 'Name', title, description FROM film_text
INNER JOIN film_actor ON film_actor.film_id = film_text.film_id
INNER JOIN actor ON film_actor.actor_id = actor.actor_id;


