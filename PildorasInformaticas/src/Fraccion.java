public class Fraccion {
    private int denominador, numerador;

    public void setFraccion(int denominador, int numerador){
        this.denominador=denominador;
        this.numerador=numerador;
    }

    public void Invierte(){
        int invertir;

        invertir=numerador;
        numerador=denominador;
        denominador=invertir;

        System.out.println("La fracción invertida quedaría así: "+numerador+"/"+denominador);
    }

    public int getDenominador() {
        return denominador;
    }
    public int getNumerador() {
        return numerador;
    }

    static Fraccion Multi(Fraccion f1, Fraccion f2){
        Fraccion f3=new Fraccion();

        f3.setFraccion(f1.getNumerador()* f2.getNumerador(), 
                       f1.getDenominador()*f2.getDenominador());
        
        return (f3);
    }

    static Fraccion Division(Fraccion f1, Fraccion f2){
        Fraccion f3=new Fraccion();

        f3.setFraccion(f1.getNumerador()* f2.getDenominador(), 
                       f1.getDenominador()*f2.getNumerador());
        
        return (f3);
    }

}
