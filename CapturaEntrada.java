import java.util.Scanner;

// Es una clase que captura datos de tipo entero, flotante, double y string.
class CapturaEntrada {
    //Metodo que permite capturar numeros enteros
    //Al ser static son metodos de clase (Le pertenece a la clase)(por lo que ya no haria faltar instanciar o crear objeros, si no que puedes llamarlo con la clase)
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }
    //Metodo que permite capturar numeros flotantes
    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }
    //Metodo que permite capturar double
    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }
    //Metodo que permite capturar cadenas
    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }
    //Metodo que permite caprutar tipo char
    public static char capturarCaracter(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(""+msg+": ");
        return (sc.next().charAt(0));
        // }

    }

}