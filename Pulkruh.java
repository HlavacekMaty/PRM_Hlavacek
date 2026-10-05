package půlkruh;

public class Pulkruh {
    //atributy
    private double prumer;

    public Pulkruh(double prumer) {
        //kontrola nuloveho, nebo zaporneho prumeru
        if(prumer <=0) {
            //je to spatne -> default
            this.prumer = 1;
        } else {
            //prumer je spravne zadany ->zkopirujeme
            this.prumer = prumer;
            }
    }
    //getter
    public double getPrumer() {
        return prumer;
    }

    //setter
    //s kontrolou
    public void setPrumer (int prumer) {
        if (prumer > 0) {
            this.prumer = prumer;
        } else {
            //neni to spravne -> neudelam nic
        }

    }

    //toString
    @Override 
    public String toString() {
        String vysl = "pulkruh o prumeru: ";
        vysl += getPrumer();
        return vysl;
        
    }

    //dalsi metody
    public float obsah() {
        return (float)(Math.PI * prumer * prumer / 4 / 2);

    }

    public float obvod() {
        return (float) (Math.PI * prumer / 2);
    }

    public float polomer() {
        return (float)(prumer / 2);
    }

    
}
