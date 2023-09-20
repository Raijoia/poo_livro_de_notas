public class Carro {
  private String nomeDoCarro;
  private String marcaDoCarro;

  public Carro (String nomeDoCarro, String marcaDoCarro) {
    this.nomeDoCarro = nomeDoCarro;
    this.marcaDoCarro = marcaDoCarro;
  } 

  // public String getNomeDoCarro() {
  //   return nomeDoCarro;
  // }

  // public String getMarcaDoCarro() {
  //   return marcaDoCarro;
  // }

  // public void setNomeDoCarro(String nomeDoCarro) {
  //   this.nomeDoCarro = nomeDoCarro;
  // }

  // public void setMarcaDoCarro(String marcaDoCarro) {
  //   this.marcaDoCarro = marcaDoCarro;
  // }

  public void exibirNomeDoCarro() {
    System.out.println("O nome do carro é: " + nomeDoCarro);
  }

  public void exibirMarcaDoCarro() {
    System.out.println("A marca do Carro " + nomeDoCarro + " é " + marcaDoCarro);
  }
}