package POO.prueba;

public class Aritmetica {
    private int num1, num2;

    //Contructor vacío, sobrecarga de constructores
    public Aritmetica(){

    }

    public Aritmetica(int n1, int n2){
        System.out.println("Ejecuntando el contructor");
        this.num1=n1;
        this.num2=n2;
    }

    public void sumar(){
        int resultado=num1+num2;
        System.out.println("El resultado de la suma es: "+resultado);
    }

    public void restar(){
        int resultado=num1-num2;
        System.out.println("El resultado de la resta es: "+resultado);
    }

    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1=num1;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum2(int num2){
        this.num2=num2;
    }
}
