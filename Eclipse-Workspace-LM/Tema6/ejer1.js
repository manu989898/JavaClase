/**
 * Escribe con un programa que solicite dos números y muestre el mayor
en la consola.
 */

let num4 = prompt("Introduce un número");
let num5 = prompt("Introduce otro número");

if (num4 > num5) {
    console.log(`El número mayor es ${num4}`);
}
else {
    console.log(`El número mayor es ${num5}`);
}


/**
 *  Escribe un programa que solicite dos números y muestre la suma de los
dos.
 */

let num1 = prompt("Introduce un número");
let num2 = prompt("Introduce otro número");
let suma = parseInt(num1) + parseInt(num2);
console.log(`La suma de ${num1} y ${num2} es ${suma}`);

/*
Escribe un programa que solicite tu nombre, tu edad, tu estatura y tu
estado civil (casado o soltero). Después debe mostrar estos datos en una misma
línea si el estado civil está casado, y en columna si el estado civil es soltero.
(resultado por consola).

*/

let nombre = prompt("Introduce tu nombre");
let edad = prompt("Introduce tu edad");
let estatura = prompt("Introduce tu estatura");
let estadoCivil = prompt("Introduce tu estado civil");

if (estadoCivil === "casado") {
    console.log(`Nombre: ${nombre} Edad: ${edad} Estatura: ${estatura} Estado civil: ${estadoCivil}`);
}
else {
    console.log(`Nombre: ${nombre} \nEdad: ${edad} \nEstatura: ${estatura} \nEstado civil: ${estadoCivil}`);
}


/*
5.Escribe un programa que solicite una palabra y devuelva el número de
caracteres que tiene la palabra.
*/

let palabra = prompt("Introduce una palabra");
let longitud = palabra.length;
console.log(`La palabra ${palabra} tiene ${longitud} caracteres`);

/*
6.Escribe un programa que solicite una nota (numérica), y devuelva un
mensaje de valoración de la nota, por ejemplo: Si se introduce un 3, se puede
mostrar el mensaje en la consola: «la nota 3 es muy insuficiente», si se introduce un
7, el mensaje podría ser: «El 7 es un notable bajo», etc
*/

let nota = prompt("Introduce una nota");
if (nota < 5) {
    console.log(`La nota ${nota} es muy insuficiente`);
}
else if (nota >= 5 && nota < 6) {
    console.log(`La nota ${nota} es insuficiente`);
}
else if (nota >= 6 && nota < 7) {
    console.log(`La nota ${nota} es suficiente`);
}
else if (nota >= 7 && nota < 8) {
    console.log(`La nota ${nota} es notable bajo`);
}
else if (nota >= 8 && nota < 9) {
    console.log(`La nota ${nota} es notable`);
}
else {
    console.log(`La nota ${nota} es sobresaliente`);
}


/*
7.Crea un programa para saber si un número (pedido previamente), es
impar o par. Hay que poder pedir tantos números como el usuario quiera.
*/
let cont = prompt("¿Cuántos números quieres introducir?");
for (let i = 0; i < cont; i++) {
    let num = prompt("Introduce un número");
    let numParImpar = parseInt(num) % 2;
    if (numParImpar === 0) {
        console.log(`El número ${num} es par`);
    }
    else {
        console.log(`El número ${num} es impar`);
    }
}

/*
8.Crea un programa que dada una cadena de texto, muestre en la
consola el texto de forma inversa.
*/
let cadena = prompt("Introduce una cadena de texto");
let cadenaInversa = cadena.split("").reverse().join("");
console.log(cadenaInversa);

/*
9.Crea un programa que devuelva la cantidad de palabras en una
cadena de texto.
*/
let cadena2 = prompt("Introduce una cadena de texto");
let palabras = cadena2.split(" ");
let cantidadPalabras = palabras.length;
console.log(`La cadena de texto tiene ${cantidadPalabras} palabras`);

/*
10.Escribe un programa que solicite tres números e imprima en la consola
el número más pequeño.
*/
let num6 = prompt("Introduce un número");
let num7 = prompt("Introduce otro número");
let num8 = prompt("Introduce otro número");
if (num6 < num7 && num6 < num8) {
    console.log(`El número más pequeño es ${num6}`);
}
else if (num7 < num6 && num7 < num8) {
    console.log(`El número más pequeño es ${num7}`);
}
else {
    console.log(`El número más pequeño es ${num8}`);
}

/*
11.Escribe un programa que pida una cadena alfanumérica por pantalla y
devuelva la misma cadena convertida a minúsculas y también convertida a
mayúsculas (en la consola).
*/

let cadena3 = prompt("Introduce una cadena alfanumérica");
let cadenaMinusculas = cadena3.toLowerCase();
let cadenaMayusculas = cadena3.toUpperCase();
console.log(`Cadena en minúsculas: ${cadenaMinusculas}`);
console.log(`Cadena en mayúsculas: ${cadenaMayusculas}`);





