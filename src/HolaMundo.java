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

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");

        //Esta clase nos permite ingresar información en la consola
        Scanner consola = new Scanner(System.in);

        //con este método, podemos leer dicha información
        var usuario = consola.nextLine();
        System.out.println("Su nombre es " + usuario);
    }
}