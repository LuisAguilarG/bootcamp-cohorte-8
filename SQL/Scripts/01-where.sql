/*
Where nos permite obtener valores a través de un campo específico. 
*/

-- Obtiene toda la información de la tabla actor: 
-- Columnas: actor_id, first_name, last_name y last_update.
SELECT * FROM actor;

-- Obtiene solo las columnas que nosotros especifiquemos de la tabla actor. 
SELECT actor_id, first_name, last_name FROM actor;


/*
Operadores de comparación
OPERADORES DE COMPARACION:
Igual           =
Distinto        !=
Menor           <
Mayor           >
Menor o igual   <=
Mayor o igual   >=
Entre           between A and B
En              in
Es nulo         is null
No nulo         is not null
Como            like
No es como      not like
*/
-- El where funciona como un if. 

-- Obtiene de la tabla de "actor" todos los registros que tengan en la columna "first_name" el valor 'Penelope'. 
-- Nota: en este caso recupera nombres en mayúscula "PENELOPE", incluso cuando se le especificó "Penelope". Esto es porque no diferencia entre mayúsculas y minúsculas. 
-- Si necesitamos diferenciarlos, se hará desde el back end. 
SELECT * FROM actor WHERE first_name = 'Penelope';


-- Obtiene los registros de personas que NO se llamen 'Penelope'
SELECT * FROM actor WHERE first_name != 'Penelope';

-- Otros ejemplos.

SELECT * FROM film WHERE film_id > 50;

SELECT * FROM film WHERE film_id <= 50;

-- Clientes pares
SELECT * FROM customer WHERE customer_id % 2 = 0;

-- Que cumplan con dos caracterísitcas
SELECT * FROM film WHERE rental_rate = 2.99 AND rating = 'PG-13';

-- De la tabla "actor" obtener todos los registros que tengan en la columna "first_name" un valor que termine con "e".
SELECT * FROM actor WHERE first_name like '%e';

-- De la tabla "actor" obtener todos los registros que tengan en la columna "first_name" un valor que inicie con "an".
SELECT * FROM actor WHERE first_name like 'an%';

-- Que contenga una "n", no importa la posición en donde esté. 
SELECT * FROM actor WHERE last_name LIKE '%n%';

-- Solo hace falta que una de las condiciones se cumpla
SELECT * FROM actor WHERE first_name LIKE 'b%' OR last_name LIKE 'b%';

-- Que en medio contenga cualquier caracter (entre k y r) y que puede estar en cualquie posición. No necesariamente al inicio o al final. 
SELECT * FROM actor WHERE first_name LIKE '%k_r%';
