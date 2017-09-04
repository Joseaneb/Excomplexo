public class Complexo {

    private double real;
    private double imaginario;

    public Complexo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;

    }

    public void soma(Complexo a) {

        real = real + a.real;
        imaginario = imaginario + a.imaginario;

    }

    public void subtracao(Complexo c) {

        real = real - c.real;
        imaginario = imaginario - c.imaginario;


    }
    public String toString() {

        return ("(" + real + ", " + imaginario + ")");
    }

}
