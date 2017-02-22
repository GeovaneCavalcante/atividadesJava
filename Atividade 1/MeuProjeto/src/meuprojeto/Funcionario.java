
package meuprojeto;

public final class Funcionario {

    private String nome;
    private float hora;
    private float valor_hora;
    
    public Funcionario(String n, float h, float v_h){
        this.setNome(n);
        this.setHora(h);
        this.setValor_hora(v_h); 
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHora() {
        return hora;
    }

    public void setHora(float hora) {
        this.hora = hora;
    }

    public float getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(float valor_hora) {
        this.valor_hora = valor_hora;
    }
    
    float calcula_hora(){
        float x = (this.getHora() * this.getValor_hora());
        return (x);
    }

  
}
