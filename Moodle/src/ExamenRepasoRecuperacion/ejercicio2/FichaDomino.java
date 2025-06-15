package ExamenRepasoRecuperacion.ejercicio2;

public class FichaDomino {
    private int l1, l2;

    public FichaDomino(int l1, int l2){
        this.l1=l1;
        this.l2=l2;
    }

    public boolean encaja(FichaDomino f1){
        if (l1==f1.l1 || l1==f1.l2 || l2==f1.l1 || l2==f1.l2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String lado1, lado2;
        if (l1==0) {
            lado1=" ";
        }else {
            lado1=String.valueOf(l1);
        }

        if (l2==0) {
            lado2=" ";
        }else{
            lado2=String.valueOf(l2);
        }
        return "["+lado1+"|"+lado2+"]";
    }
}
