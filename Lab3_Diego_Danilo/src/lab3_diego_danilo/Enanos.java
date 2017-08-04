package lab3_diego_danilo;

public class Enanos extends Integrantes {

    public String barba;
    public String hacha;

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

    

    @Override
    public String toString() {
        return "Enanos{" + "barba=" + barba + ", hacha=" + hacha + '}';
    }
    
    
    

}
