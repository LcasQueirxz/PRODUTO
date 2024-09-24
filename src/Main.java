//criacao das classes de acordo com o enunciado
  class Produto {                                                                      
      private String nome;                                                             
      private String marca;                                                            
      private double precoVenda;                                                       
      private double precoCusto; 
        //dando valores as minhas classes, determindo oque cada uma é                                                                               
      public Produto(String nome, String marca, double precoVenda, double precoCusto) {
          this.nome = nome;                                                            
          this.marca = marca;                                                          
          this.precoVenda = precoVenda;                                                
          this.precoCusto = precoCusto;   
     //criacao dos getters pra chamar minhas classes 
      }  
                                                                                     
       double calcularLucro() {
          return precoVenda - precoCusto;
      }

      public String getNome() {
          return nome;
      }

      public String getMarca() {
          return marca; 
      }

      public double getPrecoVenda() {
          return precoVenda;
      }

      public double getPrecoCusto() {
          return precoCusto;                                          
                                                   
  }
  
  public double getCalcularLucro() {
		return calcularLucro();
	}
	
  }
public class Main {                                                                  
      public static void main(String[] args) {                                         
          // Criando um produto com valores definidos                                  
          Produto produto1 = new Produto("X Poco", "Xiaomi", 2000.0, 1500.0);          
                                                                                       
          // Exibindo as informações do produto                                        
          System.out.println("Nome do produto: " + produto1.getNome());                 
          System.out.println("Marca: " + produto1.getMarca());                          
          System.out.println("Preço de venda: R$" + produto1.getPrecoVenda());          
          System.out.println("Preço de custo: R$" + produto1.getPrecoCusto());          
          System.out.println("Lucro: R$" + produto1.calcularLucro());                   
      }                                                                                
  }                                                                                    

  
  
  
  



























































