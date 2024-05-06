package domain;

// Como a classe Pessoa.java está dentro do mesmo pacote
// não há necessidade de importá-la
public class TestaPacote {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Zé da Silva");
        System.out.println(p.getNome());
    }
}