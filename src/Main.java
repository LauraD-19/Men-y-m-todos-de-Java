import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println(
                "Bienvenido, escoge una opción: \n" +
                        "1. Método con retorno \n" +
                        "2. Método sin retorno \n" +
                        "3. Método estatico \n" +
                        "4. Método instancia \n" +
                        "5. Método abstracto \n" +
                        "6. Método de fabrica \n" +
                        "7. Método con parámetros \n" +
                        "8. Método getter y setter \n" +
                        "9. Método sobrecargado \n" +
                        "10. Método anulado ");
        int op= teclado.nextInt();
        switch (op){
            case 1:
                //metodo con retorno
                int suma;
                suma = sumaR();
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                //metodo sin retorno

                edad(teclado);
                break;
            case 3:
                //metodo estatico

                fraccion(teclado);
                break;

            case 4:
                //metodo de instancia

                pet Axel= new pet();
                Axel.ladrar();
                break;
            case 5:
                //metodo abstracto1

                Animal mascota = new bubu();
                mascota.habla();
                break;
            case 6:
                //metodo de fabrica

                System.out.println("Método de fábrica");

                conexion c1=conexion.conexionL();
                conexion c2=conexion.conexionR();
                c1.conectar();
                c1.conectar();
                break;
            case 7:
                //metodo con parametros

                System.out.println("Método con parámetros");
                System.out.println("ejericio de suma");
                System.out.println("ingrese el primer numero");
                int n2= teclado.nextInt();
                System.out.println("ingrese el segundo numero");
                int n3= teclado.nextInt();
                CalcEs calc = new CalcEs();
                int sumar=calc.sumar(n2, n3);
                System.out.println("la suma es: "+ sumar);
                break;
            case 8:
                //metodo getter y setter
                System.out.println("Método getter y setter");

                CuentaBancaria cuenta=new CuentaBancaria();
                cuenta.setSaldo(5000);
                System.out.println("saldo actual: " + cuenta.getSaldo());
                cuenta.setSaldo(7000);
                System.out.println("nuevo saldo: " + cuenta.getSaldo());
                break;

            case 9:
                //metodo sobrecargado

                System.out.println("Método sobrecargado");

                saludar();
                saludar("Lau~");
                break;
            case 10:
                //metodo anulado
                System.out.println("Método anulado");
                Beast mypet = new Bt();
                mypet.talk();
                break;
            default:

                System.out.println("opción invalida, intentelo de nuevo más tarde");
                break;
        }
    }

    // 1. metodo con retorno
    public static int sumaR(){
        System.out.println("método con retorno");
        System.out.println("suma de 15 números aleatorios entre 1 y 200");
        int n1, j=0;
        Random gigi = new Random();
        for (int i = 0; i <= 15; i++) {
            n1= gigi.nextInt((200-1)+1)+1;
            System.out.println(n1);
            j = n1 + j;
        }
        return j;
    }
    //2. metodo sin retorno
    public static void edad(Scanner teclado){

        System.out.println("método sin retorno");
        System.out.println("mayor o menor de edad?");

        System.out.println("Digite su edad:");
        int edad=teclado.nextInt();
        if (edad>=18){
            System.out.println("Eres mayor de edad!");
        }else {
            System.out.println("Eres menor de edad!");
        }
    }
    //3. metodo estatico
    public static void fraccion(Scanner teclado){
        System.out.println("método estático");
        System.out.println("Ingrese 2 numeros para hacer una division");
        double a=teclado.nextInt();
        double b= teclado.nextInt();
        System.out.println("la fracción es: "+ a +"/"+ b);
        double division = a/b;
        System.out.println("El resultado es: "+ division);

    }
    //4. metodo instancia
    public static class pet {

        public void ladrar(){
            System.out.println("método de instancia");
            System.out.println("WOOF! WOOF!");
            System.out.println("Buen chico~");
        }
    }
    //5. metodo abstracto
    static abstract class Animal {
        public abstract void habla ();
    }
    static class bubu extends Animal{
        public void habla(){
            System.out.println("Metodo abstracto");
            System.out.println("Holly!!");
        }
    }
    //6. metodo de fabrica
    public static class conexion {
        private String tipo;
        private conexion(){

        }
        public static conexion conexionL(){
            conexion c= new conexion();
            c.tipo= "Local";
            return c;
        }
        public static conexion conexionR(){
            conexion c= new conexion();
            c.tipo= "Remota";
            return c;
        }
        public void conectar(){
            System.out.println("Espere, conectando a la base "+ tipo);
        }
    }
    //7. metodos con parametros
    static class CalcEs{
        public int sumar(int a, int b) {
            return a + b;
        }
    }
    //8. metodo getter y setter
    static class CuentaBancaria {
        private double saldo;

        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo){
            this.saldo=saldo;
        }
    }
    //9. metodo sobrecargado

    public static void saludar(){
        System.out.println("Hola, tú");
    }
    public static void saludar(String nombre){
        System.out.println("Hola, " + nombre + "!");
    }
    //10. metodo anulado

    static class Beast{
        public void talk(){
            System.out.println("Holaa~");
        }
    }
    static class Bt extends Beast{
        public void talk(){
            System.out.println("-Bay-");
        }
    }

}