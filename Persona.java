public class Persona {

    private double Estatura;
    private double Peso;
    private double IMC;

    public Persona() {
        this.Estatura = 0;
        this.Peso = 0;
        this.IMC = 0;
    }

    public void setEstatura(double Estatura) {
        if (Estatura > 3){
            Estatura = Estatura / 100;
        }
        this.Estatura = Estatura;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getEstatura() {
        return this.Estatura;
    }

    public double getPeso() {
        return this.Peso;
    }

    public double getIMC() {
        return this.IMC;
    }

    public void calcularIMC() {
        this.IMC = this.Peso / (this.Estatura * this.Estatura);
    }

}