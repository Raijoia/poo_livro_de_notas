public class TesteCarro {
  public static void main(String[] args) {
    Carro carro1 = new Carro("Vectra", "Ford");
    Carro carro2 = new Carro("Jetta", "Volkswagem");
  
    carro1.exibirNomeDoCarro();
    carro2.exibirNomeDoCarro();

    carro1.exibirMarcaDoCarro();
    carro2.exibirMarcaDoCarro();
  }
}
