/*1. SIMPLE QUERIES*/
/*1.1. List the books */
SELECT *
FROM BOOK;

/*1.2. List all the members */
SELECT *
FROM MEMBER;

/*1.3. List the publishers */
SELECT *
FROM PUBLISHER;

/*1.4. List the genres */
SELECT * 
FROM GENRE;

/*2. ATTRIBUTE PROJECTION*/
/*2.1. Title and code of books. */
SELECT TITLE, BOOK_CODE
FROM BOOK;

/*2.2. Name and surnames of members*/
SELECT NAME, SURNAMES
FROM MEMBER;

/*2.3. Publisher name and phone number */
SELECT NAME, PHONE 
FROM PUBLISHER;

/*2.4. Full name of members. Give also their entry date. */
SELECT CONCAT(NAME,' ', SURNAMES), ENTRY_DATE 
FROM MEMBER;

/*2.5. Publisher name and full address. */
SELECT CONCAT(ADDRESS, ' ', POSTAL_CODE,' ', CITY), NAME
FROM PUBLISHER;

/*2.6. Cities of members. */
SELECT DISTINCT(CITY)
FROM MEMBER;

/*2.7. Book codes of copies.*/
SELECT DISTINCT(BOOK_CODE)
FROM COPY;

/*2.8. Nationalities of authors. */
SELECT DISTINCT(NATIONALITY)
FROM AUTHOR;

/*2.9. Number of copies*/
SELECT COUNT(COPY_CODE)
FROM COPY;

/*2.10. Number of members*/
SELECT COUNT(MEMBER_CODE)
FROM MEMBER;

/*2.11. Name, followed by the last name of the members, in capital letters.*/

/*2.12. Book titles, in lowercase.*/

/*3. ORDER BY*/
/*3.1. Borrows, ordered by borrow date.*/
SELECT *
FROM BORROW 
ORDER BY BORROW_DATE;

/*3.2. Genres, ordered by name in descending order.*/
SELECT *
FROM GENRE
ORDER BY NAME DESC;

/*3.3. Members, ordered by name and entry date.*/
SELECT * 
FROM MEMBER 
ORDER BY NAME AND ENTRY_DATE;

/*4. WHERE CLAUSE*/
/*4.1. Name and surnames of all members living in Manacor*/
SELECT NAME, SURNAMES
FROM MEMBER 
WHERE CITY = 'Manacor';

/*4.2. Name and surnames of all members living in Felanitx */
SELECT NAME, SURNAMES
FROM MEMBER 
WHERE CITY = 'Felanitx';

/*4.3. Number of members from Manacor */
SELECT COUNT(*)
FROM MEMBER
WHERE CITY = 'Manacor';

/*4.4. Number of books borrowed by the member with the code 1. */
SELECT COUNT(*)
FROM BORROW 
WHERE MEMBER_CODE = 1;

/*4.5. All members’ names and surnames living in Manacor or Felanitx.*/
SELECT NAME, SURNAMES
FROM MEMBER
WHERE CITY = 'Manacor';

/*4.6. Members’ names and surname living on Manacor 
with entry date previous to 01/01/2009. */
SELECT NAME, SURNAMES
FROM MEMBER
WHERE CITY = 'Manacor' AND ENTRY_DATE < 01/01/2009;

/*4.7. Members’ names with code between 10 and 20 */
SELECT NAME
FROM MEMBER
WHERE MEMBER_CODE between 10 AND 20;

/*4.8. All borrows table data for the books returned late. */
SELECT *
FROM BORROW
WHERE RETURN_DATE > DEAD_DATE;

/*4.9. Books without publisher */
SELECT *
FROM BOOK
WHERE PUBLISHER_CODE IS NULL;

/*4.10. Copy code and member code of all the not returned borrows. */
SELECT COPY_CODE, MEMBER_CODE
FROM BORROW
WHERE RETURN_DATE IS NULL;

/*4.11. Name of members without phone. */
SELECT NAME
FROM MEMBER
WHERE PHONE IS NULL;

/*4.12. Publishers with phone */
SELECT *
FROM PUBLISHER
WHERE PHONE IS NOT NULL;

/*4.13. Publishers with known state but unknown city */
SELECT * 
FROM PUBLISHER
WHERE STATE IS NOT NULL AND CITY IS NULL; 

/*4.14. Amount of members without phone.*/
SELECT COUNT(*)
FROM MEMBER
WHERE PHONE IS NULL;

/*4.15. Title of books containing the word ‘TIERRA’ or ‘FUEGO’*/
SELECT TITLE
FROM BOOK 
WHERE TITLE LIKE '%TIERRA%' OR TITLE LIKE '%FUEGO%';

/*4.16. Title of books containing the word ‘TIERRA’ and not containing the word ‘PILARES’.*/
SELECT TITLE
FROM BOOK 
WHERE TITLE LIKE '%TIERRA%' AND TITLE NOT LIKE '%PILARES%';

/*4.17. Members that have ‘SANCHEZ’ as one of their surnames.*/
SELECT *
FROM MEMBER
WHERE SURNAMES LIKE '%SANCHEZ%';

/*4.18. Today’s date. (NOW).*/

/*4.19. Members registered in 2009 (YEAR)*/
SELECT *
FROM MEMBER
WHERE YEAR (ENTRY_DATE) = '2009';

/*4.20. Members registered in january of 2010. (YEAR, MONTH)*/
SELECT *
FROM MEMBER
WHERE YEAR (ENTRY_DATE) = '2010' AND MONTH (ENTRY_DATE) = '01';

/*4.21. Borrows between 2009 and 2013*/
SELECT *
FROM BORROW
WHERE YEAR (BORROW_DATE) BETWEEN '2009' AND '2013';

/*4.22. Borrows returned more than 15 days late (DATEDIFF).*/
SELECT *
FROM BORROW
WHERE DATEDIFF(RETURN_DATE, DEAD_DATE) > 15;

/*4.23. Borrows returned on Tuesday (WEEKDAY)*/
SELECT *
FROM BORROW
WHERE WEEKDAY(RETURN_DATE) = 1;

/*4.24. Borrows returned between 15:00 and 17:00 (HOUR).*/
SELECT *
FROM BORROW
WHERE HOUR(RETURN_DATE) BETWEEN 15 AND 17;

/*4.25. Books written in ‘CA’ or ‘ES’.*/
SELECT *
FROM BOOK
WHERE LANGUAGE = 'CA' OR LANGUAGE = 'ES';

/*4.26. Publishers with one of the following postal codes: 8001, 8009, 8010, 8015.*/
/*
Obtén en una sola columna llamada "Full Name" el nombre y los apellidos de todos los autores de manera que quede "APELLIDOS, NOMBRE" (es decir, pon un ", " entre apellidos y nombre)
*/
SELECT CONCAT(SURNAMES, ', ', NAME) AS 'Full Name'


/*Query 3
Obtén, de BOOK, los book_code, title y language de todos aquellos libros que NO estén publicados en las siguientes lenguas: ES, CA, AN
*/

SELECT BOOK_CODE, TITLE, LANGUAGE
FROM BOOK
WHERE LANGUAGE NOT IN ('ES', 'CA', 'AN')

--
SELECT LANGUAGE, MAX(EDITION_NUM)
    FROM BOOK
    GROUP BY LANGUAGE
    HAVING max(EDITION_NUM) >14;
    
/*Query 10:
Añade a la anterior consulta un filtrado para que solo obtengamos información de los lenguajes que empiecen por 'c' o superior (es decir, los lenguajes que empiezan por A y B no saldrán)
*/    

SELECT LANGUAGE, MAX(EDITION_NUM)
    FROM BOOK
    WHERE LANGUAGE LIKE 'C%'
    GROUP BY LANGUAGE
    HAVING max(EDITION_NUM) >14;


/*Query 3
Obtén, de BOOK, los book_code, title y language de todos aquellos libros que NO estén publicados en las siguientes lenguas: ES, CA, AN
*/

SELECT BOOK_CODE, TITLE, LANGUAGE
FROM BOOK
WHERE LANGUAGE NOT IN ('ES', 'CA', 'AN')