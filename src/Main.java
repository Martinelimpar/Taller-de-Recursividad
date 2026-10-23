public class Main {

    // 1. Factorial

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // 2. Suma de Numeros

    public static int suma(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + suma(n - 1);
    }

    // 3. Potencia de un Numero
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }

        return base * potencia(base, exponente - 1);
    }

    // 4. Contar los digitos
    public static int contarDigitos(int n) {
        if (n > -10 && n < 10) {
            return 1;
        }

        return 1 + contarDigitos(n / 10);
    }

    // 5. Invertir una cadena
    public static String invertir(String cadena) {
        if (cadena.length() <= 1) {
            return cadena;
        }

        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }

    public static void main(String[] args) {

        System.out.println("1. Factorial de 3: " + factorial(3));

        System.out.println("2. Suma del 1 al 3: " + suma(3));

        System.out.println("3. Potencia 3 elevado a 2: " + potencia(3, 2));

        System.out.println("4. Digitos del numero 87658321: " + contarDigitos(87654321));

        System.out.println("5. Invertir la palabra Contraseña: " + invertir("Contraseña"));
    }
}





