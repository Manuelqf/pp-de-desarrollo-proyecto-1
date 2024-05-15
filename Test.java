public class Test {

    private int numPulsaciones;
    private double TDR;
    private int Pulsacion1;
    private int Pulsacion2;
    private int Pulsacion3;

    public void setPulsacion1(int Pulsacion1) {
        this.Pulsacion1 = Pulsacion1;
    }

    public void setPulsacion2(int Pulsacion2) {
        this.Pulsacion2 = Pulsacion2;
    }

    public void setPulsacion3(int Pulsacion3) {
        this.Pulsacion3 = Pulsacion3;
    }

    public int getPulsacion1() {
        return this.Pulsacion1;
    }

    public int getPulsacion2() {
        return this.Pulsacion2;
    }

    public int getPulsacion3() {
        return this.Pulsacion3;
    }

    public double getTDR() {
        return this.TDR;
    }

    public void realizarTest() {
        this.TDR = ((Pulsacion1 + Pulsacion2 + Pulsacion3) - 200) / 10;
    }
}