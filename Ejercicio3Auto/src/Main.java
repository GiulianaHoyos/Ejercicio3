public class Main {
    public static void main(String[] args) {
        Coche MiCoche = new Coche();
        MiCoche.SumarPuertas();
        System.out.println(MiCoche.Puertas);

    }
}

class Coche{
    public int Puertas = 4;
    public int Ruedas = 5;
    public String Patente;

    public void SumarPuertas(){
        this.Puertas++;
    }
}