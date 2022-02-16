/* 
Crear una BD llamada "tienda_abarrotes"
Tablas:
	productos
	clientes
    proveedores
    
Cada tabla tiene 5 columnas
*/

CREATE DATABASE tienda_abarrotes;
USE tienda_abarrotes;

CREATE TABLE productos(id int NOT NULL auto_increment, primary key(id));  
CREATE TABLE clientes(id int NOT NULL auto_increment, primary key(id)); 
CREATE TABLE proveedores(id int NOT NULL auto_increment, primary key(id)); 

-- Columnas en la tabla de productos
ALTER TABLE productos ADD COLUMN sku varchar(100) NOT NULL;
ALTER TABLE productos ADD COLUMN cantidad_actual smallint NOT NULL;
ALTER TABLE productos ADD COLUMN peso float NOT NULL;
ALTER TABLE productos ADD COLUMN marca varchar(100) NOT NULL;
ALTER TABLE productos ADD COLUMN precio float NOT NULL;

-- Colunas en la tabla de clientes
ALTER TABLE clientes ADD COLUMN nombre varchar(100) NOT NULL;
ALTER TABLE clientes ADD COLUMN apellidos varchar(100) NOT NULL;
ALTER TABLE clientes ADD COLUMN direccion varchar(255) NOT NULL;
ALTER TABLE clientes ADD COLUMN telefono varchar(50) NOT NULL;
ALTER TABLE clientes ADD COLUMN estado varchar(100) NOT NULL;

-- Columnas de la tabla de proveedores
ALTER TABLE proveedores ADD COLUMN nombre varchar(100) NOT NULL;
ALTER TABLE proveedores ADD COLUMN apellidos varchar(100) NOT NULL;
ALTER TABLE proveedores ADD COLUMN empresa varchar(100) NOT NULL;
ALTER TABLE proveedores ADD COLUMN telefono_uno varchar(100) NOT NULL;
ALTER TABLE proveedores ADD COLUMN telefono_dos varchar(100) NULL;
