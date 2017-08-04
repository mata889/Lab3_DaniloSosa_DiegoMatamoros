package lab3_diego_danilo;

public class Enanos extends Integrantes {

    public String barba;
    public String hacha;
    public double ataque=300,defensa=200,curacion=50;

    public Enanos() {
        super();
    }

    public Enanos(String barba, String hacha) {
        this.barba = barba;
        this.hacha = hacha;
    }

    public String getBarba() {
        return barba;
    }

    public void setBarba(String barba) {
        this.barba = barba;
    }

    public String getHacha() {
        return hacha;
    }

    public void setHacha(String hacha) {
        this.hacha = hacha;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getCuracion() {
        return curacion;
    }

    public void setCuracion(double curacion) {
        this.curacion = curacion;
    }

   
    

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    

}
