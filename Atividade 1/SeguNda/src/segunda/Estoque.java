
package segunda;

public final class Estoque {
    private String nome; 
    private int quantidade;
    private int quantidade_minima; 

    public Estoque(String nome, int quantidade, int quantidade_minima) {
        this.setNome(nome);
        if (quantidade > 0){
            this.setQuantidade(quantidade);    
        }
        if (quantidade_minima > 0){
            this.setQuantidade_minima(quantidade_minima);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade_minima() {
        return quantidade_minima;
    }

    public void setQuantidade_minima(int quantidade_minima) {
        this.quantidade_minima = quantidade_minima;
    }
    
    void repor(int qtd){
        int quant = this.getQuantidade();
        quant += qtd;
        this.setQuantidade(quant);
    }  
    
    void darBaixa(int qtd){
        int quant = this.getQuantidade();
        quant -= qtd;
        this.setQuantidade(quant);
    } 
    String descricao(){
        String descri = (this.getNome() + " Tem em estoque " +this.getQuantidade()+ " unidades, e sua quantidade mínima é " + this.getQuantidade_minima() + " unidades");
        return (descri);
    }
    
    boolean check(){
      return (this.getQuantidade()<this.getQuantidade_minima());
    }
    
 
}
