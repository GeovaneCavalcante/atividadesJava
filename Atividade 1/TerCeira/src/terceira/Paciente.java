package terceira;

public final class Paciente {
    private String nome;
    private float peso;
    private float altura;

    public Paciente(String nome, float peso, float altura) {
        this.setNome(nome);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    float imc(){
        float x = ((this.getAltura()*this.getAltura()) * this.getPeso());
        return x;
    }
}
