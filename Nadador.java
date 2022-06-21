public class Nadador {
    private String nome;
    private int idade;
    private String categoria;

    public void exibirDados(){
        categoria();
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Categoria: " + this.getCategoria());
    }

    public void categoria(){
        if(this.getIdade() > 4 && this.getIdade() < 8){
            this.setCategoria("Infantil A");
        }else if(this.getIdade() > 8 && this.getIdade() < 11){
            this.setCategoria("Infantil B");
        }else if(this.getIdade() > 10 && this.getIdade() < 14) {
            this.setCategoria("Juvenil A");
        }else if(this.getIdade() > 13 && this.getIdade() < 18) {
            this.setCategoria("Juvenil B");
        }else if(this.getIdade() > 17) {
            this.setCategoria("Adulto");
        }
    }

    public Nadador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

