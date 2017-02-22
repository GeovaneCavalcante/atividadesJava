package terceira;

public class TerCeira {

    public static void main(String[] args) {
        Paciente p = new Paciente("Geovane", 60, (float) 1.80);
        System.out.println(p.imc());
    }
    
}
