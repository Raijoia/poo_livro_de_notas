public class LivroDeNotas {
  private String nomeDoCurso;

  // constructor com parâmetro
  public LivroDeNotas (String nomeDoCurso){
    this.nomeDoCurso = nomeDoCurso;
  }

  // constructor padrão
  public LivroDeNotas () {

  }

  // metodos de acesso a variáveis privadas => getters
  public String getNomeDoCurso() {
    return nomeDoCurso;
  }

  // metodos modificadores de variáveis privadas =>  setters
  public void setNomeDoCurso(String nomeDoCurso) {
    this.nomeDoCurso = nomeDoCurso;
  }

  public void exibirMensagem() {
    System.out.println("Bem-vindo ao livro de notas do curso de " + nomeDoCurso);
  }
}