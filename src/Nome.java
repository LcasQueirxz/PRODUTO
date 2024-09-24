class GerarNome {
    private String nome;
    private double altura;
    private String datanasc;
    private String email;
    private String sobrenome;
    
    // Construtor que inicializa os atributos e gera o email automaticamente
    public GerarNome(String nome, String sobrenome, double altura, String datanasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = altura;
        this.datanasc = datanasc;
        this.email = geraremail(nome, sobrenome);  // Gera o email automaticamente
    }

    // Método para gerar email no formato nome.sobrenome@dominio.com
    private String geraremail(String nome, String sobrenome) {
        return nome + "." + sobrenome + "@dominio.com";
    }

    // Getters para acessar os atributos
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double getAltura() {
        return altura;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public String getEmail() {
        return email;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}

public class Nome{
    public static void main(String[] args) {
        // Criando uma pessoa com valores pré-definidos
        GerarNome nome1 = new GerarNome("joão", "mendes", 1.75, "01/01/1990");

        // Exibindo as informações da pessoa
        System.out.println("Nome completo: " + nome1.getNomeCompleto());
        System.out.println("Altura: " + nome1.getAltura());
        System.out.println("Data de nascimento: " + nome1.getDatanasc());
        System.out.println("Email: " + nome1.getEmail());
    }
}