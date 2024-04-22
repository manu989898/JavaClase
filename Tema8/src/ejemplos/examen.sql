/*
    Teniendo la base de datos classicmodels
    tablas: 
    customers
    emplyees
    offices
    orderdetails
    orders
    payments
    productlines
    products
*/
    Haz un ejemplo de consultas usando: inner joins, left joins, right joins, intersect, full outer joins, group by, 

    1. Consulta que muestre los clientes que han hecho pedidos

    2. Consulta que muestre los clientes que no han hecho pedidos

        select c.customerNumber, c.customerName, o.customerNumber
        from customers c
        left join orders o
        on c.customerNumber = o.customerNumber
        where o.customerNumber is null



    3. Consulta que muestre los clientes que han hecho pedidos y los que no han hecho pedidos

        select c.customerNumber, c.customerName, o.customerNumber
        from customers c
        left join orders o
        on c.customerNumber = o.customerNumber
        where o.customerNumber is null
        union
        select c.customerNumber, c.customerName, o.customerNumber
        from customers c
        inner join orders o
        on c.customerNumber = o.customerNumber


    4. Consulta que muestre los clientes que han hecho pedidos y los que no han hecho pedidos, mostrando los que han hecho pedidos primero

        select c.customerNumber, c.customerName, o.customerNumber
        from customers c
        inner join orders o
        on c.customerNumber = o.customerNumber
        union
        select c.customerNumber, c.customerName, o.customerNumber
        from customers c
        left join orders o
        on c.customerNumber = o.customerNumber
        where o.customerNumber is null


    5. Consulta que muestre los productos que han sido vendidos

        select p.productCode, p.productName, od.productCode
        from products p
        inner join orderdetails od
        on p.productCode = od.productCode

    6. Consulta que muestre los productos que no han sido vendidos

        select p.productCode, p.productName, od.productCode
        from products p
        left join orderdetails od
        on p.productCode = od.productCode
        where od.productCode is null

    7. Consulta que muestre las oficinas que han hecho mas ventas

        select o.officeCode, o.city, sum(p.amount) as total
        from offices o
        inner join employees e
        on o.officeCode = e.officeCode
        inner join customers c
        on e.employeeNumber = c.salesRepEmployeeNumber
        inner join payments p
        on c.customerNumber = p.customerNumber
        group by o.officeCode
        order by total desc

    8. Consulta que muestre las oficinas que han hecho menos ventas

        select o.officeCode, o.city, sum(p.amount) as total
        from offices o
        inner join employees e
        on o.officeCode = e.officeCode
        inner join customers c
        on e.employeeNumber = c.salesRepEmployeeNumber
        inner join payments p
        on c.customerNumber = p.customerNumber
        group by o.officeCode
        order by total asc

    9. Consulta que muestre los productos que han sido vendidos mas de 10 veces

        select p.productCode, p.productName, count(od.productCode) as total
        from products p
        inner join orderdetails od
        on p.productCode = od.productCode
        group by p.productCode
        having total > 10
        order by total desc;

    10. Consulta con subconsulta que muestre los productos que han sido vendidos mas de 10 veces

        select p.productCode, p.productName, total
        from products p
        inner join (
            select od.productCode, count(od.productCode) as total
            from orderdetails od
            group by od.productCode
            having total > 10
        ) as t
        on p.productCode = t.productCode
        order by total desc;

    11. Consulta con subconsulta que muestre los customers que mas han comprado

        select c.customerNumber, c.customerName, total
        from customers c
        inner join (
            select customerNumber, sum(amount) as total
            from payments
            group by customerNumber
            order by total desc
        ) as t
        on c.customerNumber = t.customerNumber  
        order by total desc;

    12. Consulta con inner join que productlines que han sido vendidos y la cantidad de productos vendidos

        select pl.productLine, count(od.productCode) as total
        from productlines pl
        inner join products p
        on pl.productLine = p.productLine
        inner join orderdetails od
        on p.productCode = od.productCode
        group by pl.productLine
        order by total desc;

    13. Consulta usando left join y union que relacione la tabla payments con la tabla orders

        select p.checkNumber, p.paymentDate, p.amount, o.orderNumber, o.orderDate
        from payments p
        left join orders o
        on p.customerNumber = o.customerNumber
        union
        select p.checkNumber, p.paymentDate, p.amount, o.orderNumber, o.orderDate
        from orders o
        left join payments p
        on p.customerNumber = o.customerNumber;

    14. consulta que relacione products con productLine donde productLine es "Classic Cars".

        select p.productCode, p.productName, p.productLine
        from products p
        inner join productlines pl
        on p.productLine = pl.productLine
        where pl.productLine = "Classic Cars";

        
/*

- productlines
    - productLine
    - textDescription
    - htmlDescription
    - image
- employees
    - employeeNumber
    - lastName
    - firstName
    - extension
    - email
    - officeCode
    - reportsTo
    - jobTitle
- offices
    - officeCode
    - city
    - phone
    - addressLine1
    - addressLine2
    - state
    - country
    - postalCode
    - territory
- products
    - productCode
    - productName
    - productLine
    - productScale
    - productVendor
    - productDescription
    - quantityInStock
    - buyPrice
    - MSRP
- customers
    - customerNumber
    - customerName
    - contactLastName
    - contactFirstName
    - phone
    - addressLine1
    - addressLine2
    - city
    - state
    - postalCode
    - country
    - salesRepEmployeeNumber
    - creditLimit
- orderdetails
    - orderNumber
    - productCode
    - quantityOrdered
    - priceEach
    - orderLineNumber
- orders
    - orderNumber
    - orderDate
    - requiredDate
    - shippedDate
    - status
    - comments
    - customerNumber
- payments
    - customerNumber
    - checkNumber
    - paymentDate
    - amount
    */

/*
        ********     APUNTES DE SQL     ********
*/

    1. Consulta que muestre los clientes que han hecho pedidos

        SELECT c.customerNumber, c.customerName, o.orderNumber
        FROM customers c
        INNER JOIN orders o
        ON c.customerNumber = o.customerNumber;


    2. Consulta que muestre los clientes que no han hecho pedidos    

    3. -- Retrieves all customers and their orders, not including customers with no orders.
        SELECT c.customerNumber, c.customerName, o.orderNumber
        FROM customers c
        INNER JOIN orders o
        ON c.customerNumber = o.customerNumber;
    
    3. -- Retrieves all customers and their orders, including customers with no orders.
        SELECT c.customerNumber, c.customerName, o.orderNumber
        FROM customers c
        LEFT JOIN orders o
        ON c.customerNumber = o.customerNumber;
    
    5. Consulta con subconsulta que muestre los productos que han sido vendidos mas de 10 veces
        select p.productCode, p.productName, total
        from products p
        inner join (
            select od.productCode, count(od.productCode) as total
            from orderdetails od
            group by od.productCode
            having total > 10
        ) as t;

    6. --Consulta con subconsulta que muestre los customers que mas han comprado
        select c.customerNumber, c.customerName, total
        from customers c
        inner join (
            select customerNumber, sum(amount) as total
            from payments
            group by customerNumber
            order by total desc
        ) as t;

    7. --Consulta con inner join que productlines que han sido vendidos y la cantidad de productos vendidos
        select pl.productLine, count(od.productCode) as total
        from productlines pl
        inner join products p
        on pl.productLine = p.productLine
        inner join orderdetails od
        on p.productCode = od.productCode
        group by pl.productLine
        order by total desc;

    8. --Consulta usando left join y union que relacione la tabla payments con la tabla orders
        select p.checkNumber, p.paymentDate, p.amount, o.orderNumber, o.orderDate
        from payments p
        left join orders o
        on p.customerNumber = o.customerNumber
        union
        select p.checkNumber, p.paymentDate, p.amount, o.orderNumber, o.orderDate
        from orders o
        left join payments p
        on p.customerNumber = o.customerNumber;

        /*Obtén, de todos los EMPLOYEES que tienen más de 7 CUSTOMERS asignados los siguientes datos :
Nombre completo del empleado (Nombre+” “+Apellidos), como 'NombreEmpleado'
Nombre completo de contacto en el Cliente, (contactFirstName + “ “ + contactLastName) como 'NombreCliente'
*/

select concat(e.firstName, ' ', e.lastName) as NombreEmpleado, concat(c.contactFirstName, ' ', c.contactLastName) as NombreCliente
from employees e
inner join customers c
on e.employeeNumber = c.salesRepEmployeeNumber
group by e.employeeNumber
having count(c.customerNumber) > 7;
