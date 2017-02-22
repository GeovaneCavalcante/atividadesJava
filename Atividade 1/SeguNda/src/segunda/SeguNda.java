
package segunda;

public class SeguNda {

    public static void main(String[] args) {
        Estoque n = new Estoque("Arroz", 10, 2);
        n.repor(5);
        System.out.println(n.descricao());
        
        if (n.check()==true){
            System.out.println("Princesa repor o estoque, quantidade mínima exedida");
        }else{
            System.out.println("Estoque com quantidade minima permitada");
        }
    }
    
}
