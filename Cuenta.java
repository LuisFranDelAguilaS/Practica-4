public class Cuenta {

    private String nombre;
    private String pin; //Numero de 3 digitos.
    private float saldo;
    private int cont;
    private String numC=" ";


    public Cuenta (String nombre,String numC ,String pin, int cont, float saldo ){

        setNombre(nombre);
        setNumC(numC);
        setPin(pin);
        setCont(cont);
        setSaldo(saldo);

    }



    //Setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setNumC(String numC){
        this.numC=numC;
    }

    public void setPin(String pin){
        this.pin=pin;
    }

    public void setCont(int cont){
        this.cont=cont;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getNumC(){
        return numC;
    }

    public String getPin(){
        return pin;
    }

    public int getCont(){
        return cont;
    }

    public float getSaldo(){
        return saldo;
    }


    //metodos

     public float deposito (float numero,float saldo,String nom){
        System.out.println("Bienvenido "+nom);
        System.out.println("Tu saldo actual es de $"+saldo+" pesos");
        numero=CapturaEntrada.capturarFlotante("Dame el dinero que deseas depositar");
        saldo+=numero;
        return saldo;
    }

     public float retiro (float num,float saldo,String nom) {
        num=CapturaEntrada.capturarFlotante("Dame cuanto quieres retirar");
        float a=saldo;
        if (num>a){
            System.out.println("No tienes el saldo suficiente");
            saldo=a;
        }
        else {
            System.out.println("Bienvenido " + nom);
            System.out.println("Tu saldo actual es de $" + saldo + " pesos");
            saldo -= num;
        }

             return saldo;

     }


}
