import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class Workshop {

    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
        //probando la forma de subir esto
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
        int factor = 1;
        for (int i = n; i > 0; i--) {
            factor = factor * i;
        }
        return factor;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo");
        }
        int[] fib = new int[n];
        if (n >= 1) {
            fib[0] = 0;
        }
        if (n >= 2) {
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        int suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        int suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        double promedio = suma / arreglo.length;
        return promedio;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        int mayor = 0;
        for (int numero : arreglo) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        int menor = arreglo[0];
        for (int numero : arreglo) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        for (int numero : arreglo) {
            if (numero == elemento) {
                return true;
            }
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        int[] inversion = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            inversion[i] = arreglo[arreglo.length - 1 - i];
        }
        return inversion;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        int[] ascendente = arreglo.clone();
        for (int i = 0; i < ascendente.length - 1; i++) {
            for (int j = 0; j < ascendente.length - i - 1; j++) {
                if (ascendente[j] > ascendente[j + 1]) {
                    int temp = ascendente[j];
                    ascendente[j] = ascendente[j + 1];
                    ascendente[j + 1] = temp;
                }
            }
        }
        return ascendente;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        List<Integer> listaUnicos = new ArrayList<>();
        for (int num : arreglo) {
            if (!listaUnicos.contains(num)) {
                listaUnicos.add(num);
            }
        }

        int[] resultado = new int[listaUnicos.size()];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = listaUnicos.get(i);
        }
        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        int[] lista = new int[arreglo1.length + arreglo2.length];
        int index = 0;
        for (int numero : arreglo1) {
            lista[index] = numero;
            index++;
        }
        for (int numero : arreglo2) {
            lista[index] = numero;
            index++;
        }
        return lista;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        int[] rotacion = new int[arreglo.length];
        int posicion = 0;
        if (arreglo.length == 1){
            rotacion[0] = arreglo[0];
        } else {
            for (int numero: arreglo){
                System.out.println(numero);
                if (posiciones < 0){
                    if (arreglo.length - 1 + posicion <= arreglo.length){
                        rotacion[arreglo.length - 2 + posicion] = numero;
                    } else {
                        rotacion[(arreglo.length - 2 + posicion) - (arreglo.length)] = numero;
                    }
                } else {
                    if (posicion + posiciones < arreglo.length){
                        rotacion[posicion + posiciones] = numero;
                    } else {
                        rotacion[(posicion + posiciones) - arreglo.length] = numero;
                    }
                }
                posicion ++;
            }
        }
        return rotacion;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        String inversion = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            inversion = inversion + (cadena.charAt(i));
        }
        return inversion;
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        String inversion = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            inversion = inversion + (cadena.charAt(i));
        }
        String sinInversion = inversion.replace(" ", "").toLowerCase();
        String sinCadena = cadena.replace(" ", "").toLowerCase();
        return sinCadena.equalsIgnoreCase(sinInversion);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = cadena.split("\\s+");
        return palabras.length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        if (correo == null) {
            return false;
        }

        // Regex más completa según RFC 5322
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return correo.matches(regex);
    }

    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }
        double index = 0;
        double suma = 0;
        for (int numero : lista) {
            suma += numero;
            index++;
        }
        return suma/index;
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        if (numero >= 0) {
            return Integer.toBinaryString(numero);
        } else {
            // Para negativos, agregamos el signo - al valor absoluto
            return "-" + Integer.toBinaryString(Math.abs(numero));
        }
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        if (numero >= 0) {
            return Integer.toHexString(numero).toUpperCase();
        } else {
            // Para negativos, quitamos el signo y agregamos "-" al inicio
            return "-" + Integer.toHexString(-numero).toUpperCase();
        }
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra

        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        if (eleccionUsuario == null || eleccionUsuario.isEmpty()) {
            return "Elección no válida";
        }

        eleccionUsuario = eleccionUsuario.toLowerCase();

        String[] opciones = {"piedra", "papel", "tijera", "lagarto", "spock"};

        Random rand = new Random();
        String eleccionComputadora = opciones[rand.nextInt(opciones.length)];
        if (eleccionUsuario.equals(eleccionComputadora)) {
            return "Empate. Ambos eligieron " + eleccionUsuario;
        }

        boolean usuarioGana = false;

        switch (eleccionUsuario) {
            case "piedra":
                usuarioGana = eleccionComputadora.equals("tijera") || eleccionComputadora.equals("lagarto");
                break;
            case "papel":
                usuarioGana = eleccionComputadora.equals("piedra") || eleccionComputadora.equals("spock");
                break;
            case "tijera":
                usuarioGana = eleccionComputadora.equals("papel") || eleccionComputadora.equals("lagarto");
                break;
            case "lagarto":
                usuarioGana = eleccionComputadora.equals("spock") || eleccionComputadora.equals("papel");
                break;
            case "spock":
                usuarioGana = eleccionComputadora.equals("tijera") || eleccionComputadora.equals("piedra");
                break;
        }
        String resultado = usuarioGana ? "Ganaste" : "Perdiste";
        return resultado;
    }


    public double areaCirculo(double radio) {
        if (radio < 0) {
            return 0.0;
        }
        return Math.PI * radio * radio;
    }

    public String zoodiac(int day, int month) {
        if (month == 3 && day >= 21 && day <= 31) {
            return "Aries";
        } else if (month == 4 && day >= 1 && day <= 19) {
            return "Aries";
        }
        else if (month == 4 && day >= 20 && day <= 30) {
            return "Tauro";
        } else if (month == 5 && day >= 1 && day <= 20) {
            return "Tauro";
        }
        else if (month == 5 && day >= 21 && day <= 31) {
            return "Gemini";
        } else if (month == 6 && day >= 1 && day <= 20) {
            return "Gemini";
        }
        else if (month == 6 && day >= 21 && day <= 30) {
            return "Cancer";
        } else if (month == 7 && day >= 1 && day <= 22) {
            return "Cancer";
        }
        else if (month == 7 && day >= 23 && day <= 31) {
            return "Leo";
        } else if (month == 8 && day >= 1 && day <= 22) {
            return "Leo";
        }
        else if (month == 8 && day >= 23 && day <= 31) {
            return "Virgo";
        } else if (month == 9 && day >= 1 && day <= 22) {
            return "Virgo";
        }
        else if (month == 9 && day >= 23 && day <= 30) {
            return "Libra";
        } else if (month == 10 && day >= 1 && day <= 22) {
            return "Libra";
        }
        else if (month == 10 && day >= 23 && day <= 31) {
            return "Escorpio";
        } else if (month == 11 && day >= 1 && day <= 21) {
            return "Escorpio";
        }
        else if (month == 11 && day >= 22 && day <= 30) {
            return "Sagitario";
        } else if (month == 12 && day >= 1 && day <= 21) {
            return "Sagitario";
        }
        else if (month == 12 && day >= 22 && day <= 31) {
            return "Capricornio";
        } else if (month == 1 && day >= 1 && day <= 19) {
            return "Capricornio";
        }
        else if (month == 1 && day >= 20 && day <= 31) {
            return "Acuario";
        } else if (month == 2 && day >= 1 && day <= 18) {
            return "Acuario";
        }
        else if (month == 2 && day >= 19 && day <= 29) { // Considerando años bisiestos
            return "Piscis";
        } else if (month == 3 && day >= 1 && day <= 20) {
            return "Piscis";
        }
        else {
            return "Invalid Date";
        }
    }

    public String pptls2 (String game[]) {

        if (game.length != 2) {
            return "Empate";
        }

        String player1 = game[0];
        String player2 = game[1];

        if (player1.equals(player2)) {
            return "Empate";
        }

        if ((player1.equals("S") && (player2.equals("P") || player2.equals("L"))) ||
                (player1.equals("P") && (player2.equals("R") || player2.equals("V"))) ||
                (player1.equals("R") && (player2.equals("L") || player2.equals("S"))) ||
                (player1.equals("L") && (player2.equals("V") || player2.equals("P"))) ||
                (player1.equals("V") && (player2.equals("S") || player2.equals("R")))) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }

}
