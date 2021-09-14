import java.util.Scanner;

public class Banco {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion ;
        Cuenta cuentas[]= new Cuenta[10];
        int cont =0 ;
        float saldo=0;
        float num=0;
        int b=0;



        do {
            System.out.println("---------MENU---------");
            System.out.println("");
            System.out.println("1-Ingresar clientes");
            System.out.println("2-Depositar");
            System.out.println("3-Retirar");
            System.out.println("4-Salir");
            System.out.println("Cual opcion desea?: ");


            opcion = sc.nextInt();

            switch (opcion) {

                
                case 1:

                    cuentas[cont] = new Cuenta(CapturaEntrada.capturarCadena("Dame el nombre asosiado a la cuenta"), CapturaEntrada.capturarCadena("Dame un numero de cuenta"), CapturaEntrada.capturarCadena("Dame el pin de 3 digitos que deseas utilizar"), cont, saldo);
                    cont += 1;

                    break;

                case 2:
                 int valor=0;
                 if(cont!=0) {
                     System.out.println("Deposito");
                     String a=CapturaEntrada.capturarCadena("Ingresa numero de cuenta");

                     for (int i = 0; i < cont; i++) {
                         if (cuentas[i].getNumC().equals(a)) {
                                 String contra = CapturaEntrada.capturarCadena("Ingresa contraseña");
                                 if (cuentas[i].getPin().equals(contra)) {
                                     cuentas[i].setSaldo(cuentas[i].deposito(num, cuentas[i].getSaldo(), cuentas[i].getNombre()));
                                     System.out.println("El saldo ahora es de $" + cuentas[i].getSaldo()+" pesos");
                                     valor=0;
                                 } else{
                                      valor=12;}
                         }
                         else{
                            valor=13;}

                     }

                     if (valor==12){
                         System.out.println("No es la contraseña");}

                     if(valor ==13){
                         System.out.println("Ese numero de cuenta no existe");}

                 }
                 else { System.out.println("No hay cuentas creadas"); }

                    break;

                case 3:
                    int valor2= 0;
                    if(cont!=0) {
                        System.out.println("Retirar");
                        String a=CapturaEntrada.capturarCadena("Ingresa numero de cuenta");

                        for (int i = 0; i < cont; i++) {
                            if (cuentas[i].getNumC().equals(a)) {
                                String contra = CapturaEntrada.capturarCadena("Ingresa contraseña");
                                if (cuentas[i].getPin().equals(contra)) {
                                    cuentas[i].setSaldo(cuentas[i].retiro(num, cuentas[i].getSaldo(), cuentas[i].getNombre()));
                                    System.out.println("El saldo ahora es de $" + cuentas[i].getSaldo()+" pesos");
                                    valor2=0;
                                } else
                                    valor2=12;

                            }
                            else
                                valor2=13;

                        }
                        if (valor2==12){
                            System.out.println("No es la contraseña");}

                        if(valor2 ==13){
                            System.out.println("Ese numero de cuenta no existe");}

                    }
                    else  System.out.println("No hay cuentas creadas");

            }

        }while(opcion!=4);
    }
}


