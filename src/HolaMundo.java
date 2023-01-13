//Así se importan paqueterías, casi igual que en js
import java.util.Scanner;

/*public class HolaMundo {
    public static void main(String args[]){
        System.out.println("Hola mundo desde java");
    }
}*/

//System.out.println() => es el método para un console.log
//la clase debe llamarse igual al archivo, sino no va a compilar

/*public class HolaMundo {
    public static void main(String args[]){
        // se declara la variable y se inicializa con el valor de 10
        int miVariable = 10;
        System.out.println(miVariable);

        // se redefine la variable con el valor de 5
        miVariable = 5;
        System.out.println(miVariable);

        //variable de tipo string
        String miVariableCadena = "Hola";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //la palabra var se puede usar también, el tipo de dato será inferido del valor del mismo
        var variableEntera = 1;
        System.out.println(variableEntera);

        //al escribir soutv => se generará automáticamente
        var Cadena = "Hola Var";
        System.out.println("Cadena = " + Cadena);
    }
}*/

/*public class HolaMundo {
    public static void main (String args[]) {
        var cadena1 = "Juan";
        var cadena2 = "ingeniero";

        var union = cadena1 + " " + cadena2;
        System.out.println("union = " + union);

        //Suma
        var i = 4;
        var j = 6;

        var suma = j + i;
        System.out.println(j + i + cadena2);

        //Si primero imprimieramos el valor de la cadena, pues todo se va a tomar como una cadena
    }
}*/

/*
//Caracteres especiales
public class HolaMundo {
    public static void main(String[] args) {
        var nombre = "Karla";

        //Salto de línea se hace con => \n
        System.out.println("Salto de linea: \n" + nombre);

        //Tabulador se hace con => \t
        System.out.println("Tabulador: \t" + nombre);

        //Retroceso se hace con => \ = se pueden poner tantos carateres se desee
        System.out.println("Retroceso: \b" + nombre);

        //Comillas
        //Comilla simple se hace con => \' + loquesea + \'
        System.out.println("Retroceso: \'" + nombre + "\'");

        //Comillas dobles
        System.out.println("Comillas dobles: \"" + nombre + "\"");
    }
}*/

/*
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");

        //Esta clase nos permite ingresar información en la consola
        Scanner consola = new Scanner(System.in);

        //con este método, podemos leer dicha información
        var usuario = consola.nextLine();
        System.out.println("Su nombre es " + usuario);
    }
}*/

//TIPOS DE DATOS ENTEROS
public class HolaMundo {
    public static void main(String[] args) {
        //TIPO BYTE
        /*
        EN este caso, estamos obligando al programa a convertir 1000 a byte, pero
        como byte solo admite valores de -127 a 128, 1000 no puede ser de tipo byte,
        por lo que anteponemos el tipo "bite" entre paréntesis, para convertirlo a byte,
        pero al  compilar el programa, no se imprime el valor de mil, sino -24
        byte numeroByte = (byte)1000;
        System.out.println(numeroByte) => -24;*/

        byte numeroByte = 10;
        System.out.println(numeroByte);
        //Estos métodos permiten saber los valores mínimos o máximos que tolera un tipo de dato
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo byte: " + Byte.MAX_VALUE);

        //TIPO SHORT

        short numeroShort = 100;
        System.out.println(numeroShort);
        System.out.println("Numero short min: " + Short.MIN_VALUE);
        System.out.println("Numero short max: " + Short.MAX_VALUE);

        //TIPO INTEGER
        int numeroInteger = 100;
        System.out.println("numeroInteger = " + numeroInteger);
        System.out.println("Número integer min: " + Integer.MIN_VALUE);
        System.out.println("Número integer max: " + Integer.MAX_VALUE);

        //TIPO LONG
        int numeroLong = 100;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Número long min: " + Long.MIN_VALUE);
        System.out.println("Número long max: " + Long.MAX_VALUE);
    }
}