-- Usamos aliases para las tablas para que sea más fácil de leer y escribir. En este caso corchetes porque la palabra lleva espacios.

SELECT COLUMN_NAME AS ALIAS_NAME
FROM EMPLEADOS;

SELECT ProductName AS * [Nombre del producto]
FROM EMPLEADOS;

SELECT CustomerName, Direccion + ', ' + PostalCode + ', ' + City + ', ' + Country AS Direccion
FROM Customers;

{RESULT} {Alfreds Futterkiste	Obere Str. 57, 12209, Berlin, Germany}

SELECT CustomerName, CONCAT(Direccion,', ',PostalCode,', ',City,', ',Country) AS Direccion
FROM Customers;

{RESULT} {Alfreds Futterkiste	Obere Str. 57, 12209, Berlin, Germany}

SELECT c.Name, e.Name
FROM Customers AS c, Employees AS e;

SELECT c.Name, e.Name
FROM Customers  c, Employees e;

-- Crear una consulta que use min y max para obtener el salario mínimo y máximo de la tabla de empleados.

SELECT MIN(SALARIO), MAX(SALARIO)
FROM EMPLEADOS;

-- Crear una tabla que use las funciones de agregado para obtener el salario medio de los empleados.

SELECT AVG(SALARIO)
FROM EMPLEADOS;

-- Crear una tabla que use las funciones de agregado para obtener el salario máximo de los empleados.

SELECT MAX(SALARIO)
FROM EMPLEADOS;

-- Crear una tabla que use las funciones de agregado para obtener el salario mínimo de los empleados.

SELECT MIN(SALARIO)
FROM EMPLEADOS;

-- Crear una tabla que use SUM para obtener la suma de los salarios de los empleados.

SELECT SUM(SALARIO)
FROM EMPLEADOS;

-- Crear una tabla que use las funciones de agregado para obtener el número de empleados.

SELECT COUNT(*)
FROM EMPLEADOS;

-- Crear una consulta que use COUNT y DISTINCT para obtener el número de departamentos distintos.

SELECT COUNT(DISTINCT DEPARTAMENTO)
FROM EMPLEADOS;

-- Crear una consulta que use el TOP para filtrar los 10 primeros registros de la tabla de empleados.

SELECT TOP 10 * 
FROM EMPLEADOS;

-- Crear una consulta que use el limit para filtrar los 10 primeros registros de la tabla de empleados.

SELECT * 
FROM EMPLEADOS LIMIT 10;

-- Crear una tabla que use BETWEEN, AND y OR para obtener los empleados que tengan un salario 
-- entre 1000 y 2000 o entre 3000 y 4000.

SELECT * 
FROM EMPLEADOS 
WHERE SALARIO BETWEEN 1000 AND 2000 OR SALARIO BETWEEN 3000 AND 4000;

-- Crear una tabla que use JOIN para obtener los empleados que tengan un salario entre 1000 y 2000 o entre 3000 y 4000.

SELECT * 
FROM EMPLEADOS E 
JOIN DEPARTAMENTOS D ON E.DEPARTAMENTO = D.ID 
WHERE SALARIO BETWEEN 1000 AND 2000 OR SALARIO BETWEEN 3000 AND 4000;

-- Crear una tabla que use LIKE, AND y OR

SELECT *
FROM EMPLEADOS
WHERE SALARIO LIKE '1__0' OR SALARIO LIKE '2__0' OR SALARIO LIKE '3__0' OR SALARIO LIKE '4__0';

-- Crea una tabla que use las variantes de % para obtener los empleados que tengan un salario entre 1000 y 2000 o entre 3000 y 4000.

SELECT *
FROM EMPLEADOS
WHERE SALARIO LIKE '1%0' OR SALARIO LIKE '2%0' OR SALARIO LIKE '3%0' OR SALARIO LIKE '4%0';

-- Crea una consulta que te saque el nombre del producto mas caro de la tabla de productos.

SELECT ProductName, UnitPrice
FROM Products
WHERE UnitPrice = (SELECT MAX(UnitPrice) FROM Products);

-- Crea una consulta que te saque el nombre del producto mas barato de la tabla de productos.

SELECT ProductName, UnitPrice
FROM Products
WHERE UnitPrice = (SELECT MIN(UnitPrice) FROM Products);

-- Crea una consulta que saque el nombre del producto que mas veces se ha pedido.

SELECT ProductName, COUNT(*) AS Total
FROM Products P JOIN OrderDetails O ON P.ProductID = O.ProductID
GROUP BY ProductName
ORDER BY Total DESC
LIMIT 1;

--From the following table, write a SQL query to find the details of 1970 Nobel Prize winners. 
--Order the results by subject, ascending except for 'Chemistry' and ‘Economics’ which will come at the end of the result set. 
--Return year, subject, winner, country, and category. 

Sample table: nobel_win 

SELECT year, subject, winner, country, category
FROM nobel_win
WHERE year = 1970 AND subject NOT IN ('Chemistry', 'Economics')
ORDER BY subject ASC
UNION
SELECT year, subject, winner, country, category
FROM nobel_win
WHERE year = 1970 AND subject IN ('Chemistry', 'Economics');

--From the following table, write a SQL query to select a range of products whose price is in the range Rs.200 to Rs.600. 
--Begin and end values are included. Return pro_id, pro_name, pro_price, and pro_com.  

Sample table: item_mast

SELECT pro_id, pro_name, pro_price, pro_com
FROM item_mast
WHERE pro_price BETWEEN 200 AND 600;

--From the following table, write a SQL query to calculate the average price for a manufacturer code of 16. Return avg.  

Sample table: item_mast

SELECT AVG(pro_price)
FROM item_mast
WHERE pro_com = 16;

--From the following table, write a SQL query to display the pro_name as 'Item Name' and pro_priceas 'Price in Rs.'  

Sample table: item_mast

SELECT pro_name AS [Item Name], pro_price AS [Price in Rs.]
FROM item_mast;

--From the following table, write a SQL query to find the items whose prices are higher than or equal to $250. 
--Order the result by product price in descending, then product name in ascending. Return pro_name and pro_price.  

Sample table: item_mast

SELECT pro_name, pro_price
FROM item_mast
WHERE pro_price >= 250
ORDER BY pro_price DESC, pro_name;

--From the following table, write a SQL query to calculate average price of the items for each company. Return average price and company code. 

Sample table: item_mast

SELECT AVG(pro_price), pro_com
FROM item_mast
GROUP BY pro_com;

--From the following table, write a SQL query to find the cheapest item(s). Return pro_name and, pro_price.  

Sample table: item_mast

SELECT pro_name, pro_price
FROM item_mast
WHERE pro_price = (SELECT MIN(pro_price) FROM item_mast);

-- query to find those rows where col1 contains the escape character underscore ( _ ) and return col1 using wildcard characters.
-- Usamos escape para declarar el caracter de escape que queremos usar en la consulta.

Sample table: testtable

SELECT col1
FROM testtable
WHERE col1 LIKE '%/_%' ESCAPE '/';

-- query to identify those rows where co1 does not contain the escape character underscore (_). return col1.

Sample table: testtable

SELECT col1
FROM testtable
WHERE col1 NOT LIKE '%/_%' ESCAPE '/';

-- Ejemplo de consulta usando el GROUP BY para obtener el mayor grado de cada ciudad "city". Return city, maximum grade

Sample table: customer

SELECT city, MAX(grade)
FROM customer
GROUP BY city;

-- Ejemplo de consulta usando el GROUP BY para obtener el mayor grado de cada "city", usando un filtro "HAVING" de maximo 200(no incluido). 
-- Return city, maximum grade

Sample table: customer

SELECT city, MAX(grade)
FROM customer
GROUP BY city
HAVING MAX(grade) < 200;

-- Ejemplo consulta para encontrar la compra mas grande ordenada por cada "customer" y "salesman". 
-- Return customer_id, maximum purchase amount

Sample table: orders

SELECT customer_id, MAX(purchase_amt), salesman_id
FROM orders
GROUP BY customer_id, salesman_id;

-- Ejemplo consulta para encontrar el pedido mas grande (purchase) para cada cliente (customer) en una fecha dada (ord_date).
-- Filtra los resultados por el pedidio mas grande siempre que supere 2000. Return customer_id, maximum purchase amount, order date.

Sample table: orders

SELECT customer_id, MAX(purchase_amt), ord_date
FROM orders
GROUP BY customer_id, ord_date
HAVING MAX(purchase_amt) > 2000;

-- Hay que incluir todos los selected en el order by!

Sample table: orders

SELECT OrderID, OrderDate, MAX(ShipperID) AS [Max shipper]
FROM Orders
GROUP BY OrderDate, ShipperID, OrderID;

-- Escribe una consulta que saque los pedidos con fecha del año 1997
-- Hay que poner WHERE antes de GROUP BY.

Sample table: orders

SELECT OrderID, OrderDate, MAX(ShipperID) AS [Max shipper]
FROM Orders
WHERE YEAR (OrderDate) = '1997'
GROUP BY OrderDate, ShipperID, OrderID;

-- Obtener los clientes agrupados por codigo de cliente el ultimo pedido realizado

Sample table: orders

SELECT CustomerID, MAX(OrderDate) AS [Último Día]
FROM Orders
GROUP BY CustomerID;

-- Obtener el código de cliente y última fecha de pedido para cada cliente, 
-- en el caso de que esa última fecha haya sido posterior a 01-01-1997

Sample table: orders

SELECT CustomerID, OrderDate AS [Último Día]
FROM Orders
WHERE OrderDate >= '01-01-1997'
GROUP BY CustomerID;

-- From the following table, write a SQL query to calculate total purchase amount of all orders. Return total purchase amount.

Sample table: orders

--ord_no  	purch_amt   	ord_date	    customer_id 	salesman_id
--------  ----------  --------------------- -----------
--70001   	150.5   	2012-10-05  3005     	5002
--70009   	270.65  	2012-09-10  3001     	5005
--70002   	65.26   	2012-10-05  3002     	5001
--70004   	110.5 	  	2012-08-17  3009     	5003
--70007   	948.5   	2012-09-10  3005     	5002
--70005   	2400.6  	2012-07-27  3007     	5001
--70008   	5760    	2012-09-10  3002     	5001

SELECT SUM(purchase_amt)
FROM orders;

-- From the following table, write a SQL query that counts the number of unique salespeople. Return number of salespeople.

Sample table: orders

SELECT COUNT(DISTINCT salesperson) 
FROM orders;

-- From the following table, write a SQL query to count the number of customers. Return number of customers.  

Sample table: customer

SELECT COUNT(customer_id)
FROM customer;

-- From the following table, write a SQL query to determine the number of customers who received at least one grade for their activity.  

Sample table: customer

SELECT COUNT(customer_id)
FROM customer
WHERE grade IS NOT NULL;

-- From the following table, write a SQL query to find the maximum purchase amount.  

Sample table: orders

SELECT MAX(purchase_amt)
FROM orders;

--From the following table, write a SQL query to determine the highest purchase amount made by each salesperson on '2012-08-17'. Return salesperson ID, purchase amount 

Sample table: orders

SELECT salesman_id, MAX(purchase_amt)
FROM orders
WHERE order_date = '2012-08-17'
GROUP BY salesman_id;

/*
    *** TIPOS DE LENGUAJES ***

DML (Data Manipulation Language) es el lenguaje de manipulación de datos. (La parte de consultas y modificación de datos).

DQL (Data Query Language) es el lenguaje de consulta de datos. (SELECT, FROM, WHERE...)

DDL (Data Definition Language) es el lenguaje de definición de datos. (cuando se crean tablas con lo que pueden tener, estructura...)

SQL (Structured Query Language) es el lenguaje de consulta estructurado. 

*/

/*

Los alias "SELECT max_prince AS [PRECIO MAXIMO]" pueden ir en el SELECT, en el FROM y en el WHERE.

DISTINCT elimina los duplicados.
    EJEMPLO: SELECT DISTINCT departamento FROM empleados

WHERE se usa para filtrar los resultados.
    EJEMPLO: WHERE salario > 1000

IN se usa para filtrar los resultados.(se usa con una lista de valores)
    EJEMPLO: WHERE departamento IN (1,2,3)

AND se usa para filtrar los resultados. (los dos tienen que ser verdaderos)
    EJEMPLO: WHERE salario > 1000 AND salario < 2000 

OR se usa para filtrar los resultados. (uno de los dos tiene que ser verdadero)
    EJEMPLO: WHERE salario > 1000 OR salario < 2000

NOT se usa para filtrar los resultados. (lo contrario)
    EJEMPLO: WHERE NOT salario > 1000

UPPER & LOWER se usan para convertir a mayúsculas y minúsculas.
    EJEMPLO: SELECT UPPER(nombre) FROM empleados

LENGTH se usa para obtener la longitud de una cadena de caracteres.
    EJEMPLO: SELECT LENGTH(nombre) FROM empleados

TRIM se usa para eliminar espacios en blanco.
    EJEMPLO: SELECT TRIM(nombre) FROM empleados

POSITION se usa para obtener la posición de una cadena de caracteres.
    EJEMPLO: SELECT POSITION('a' IN nombre) FROM empleados

CONCAT se usa para concatenar cadenas de caracteres.
    EJEMPLO: SELECT CONCAT(nombre, ' ', apellido) FROM empleados (resultado: nombre apellido)

ORDER BY se usa para ordenar los resultados.
    EJEMPLO: ORDER BY salario DESC

GROUP BY se usa para agrupar los resultados.(se usa con funciones de agregado)
    EJEPMLO: GROUP BY departamento

HAVING se usa para filtrar los resultados de un GROUP BY. 
    EJEMPLO: HAVING MAX(salario) < 2000

MAX, MIN, AVG, SUM, COUNT son funciones de agregado.
    EJEMPLO: SELECT MAX(salario) FROM empleados

TOP se usa para limitar el número de resultados.
    EJEMPLO: SELECT TOP 10 * FROM empleados

LIMIT se usa para limitar el número de resultados.
    EJEMPLO: SELECT * FROM empleados LIMIT 10

BETWEEN se usa para filtrar los resultados entre dos valores. (incluidos) 
    EJEMPLO: WHERE salario BETWEEN 1000 AND 2000

IS NULL se usa para filtrar los resultados que sean nulos.
    EJEMPLO: WHERE salario IS NULL

LIKE se usa para filtrar los resultados que contengan un patrón.
    EJEMPLO: WHERE nombre LIKE 'A%'

ASC se usa para ordenar los resultados de forma ascendente.
    EJEMPLO: ORDER BY salario ASC

DESC se usa para ordenar los resultados de forma descendente.
    EJEMPLO: ORDER BY salario DESC

_ se usa para sustituir un caracter.
    EJEMPLO: WHERE nombre LIKE 'A__'

Que tenga cuatro caracteres minimo.
    EJEMPLO: WHERE nombre LIKE '____%'

% se usa para sustituir una cadena de caracteres.
    EJEMPLO: WHERE nombre LIKE 'A%'

<> se usa para filtrar los resultados que no sean iguales.
    EJEMPLO: WHERE salario <> 1000

<,>,<=,>= se usan para filtrar los resultados que sean menores, mayores, menores o iguales, mayores o iguales.
    EJEMPLO: WHERE salario > 1000


*/






-- Ejemplo de subconsulta en el SELECT

SELECT name, last_name
FROM customers
WHERE city IN (
    SELECT city FROM cities WHERE Postal_code = '07190');

/*
Obtén, de COPY, el COPY_CODE, RELEASE_YEAR y EDITION_NUMBER de todas aquellas copias que cumplen al menos una de estas dos condiciones:
- el RELEASE_YEAR es POSTERIOR (estrictamente, no igual, solo posterior) al año 2005
- la EDITION_NUMBER es POSTERIOR (estrictamente, no igual, solo posterior) a la edición 5
*/

SELECT COPY_CODE, RELEASE_YEAR, EDITION_NUMBER
FROM COPY
WHERE RELEASE_YEAR > 2005 OR EDITION_NUMBER > 5;
/*Query 8:
Selecciona, de BOOK, los lenguajes que hay, y para cada lenguaje el número de edición (EDITION_NUM) máximo
*/
SELECT LANGUAGE, MAX(EDITION_NUM)
FROM BOOK
GROUP BY LANGUAGE;