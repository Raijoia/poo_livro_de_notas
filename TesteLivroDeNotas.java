import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
  public static void main(String[] args) {
    String nome1 = JOptionPane.showInputDialog("Digite o nome do seu primeiro curso");

    LivroDeNotas livroDeNotas = new LivroDeNotas(nome1);
    LivroDeNotas livroDeNotas2 = new LivroDeNotas(JOptionPane.showInputDialog("Digite o nome do seu segundo curso"));
    LivroDeNotas livroDeNotas3 = new LivroDeNotas();
    String nome3 = JOptionPane.showInputDialog("Digite o nome do seu terceiro curso");
    livroDeNotas3.setNomeDoCurso(nome3);

    JOptionPane.showMessageDialog(null, livroDeNotas.getNomeDoCurso(), "Veja o curso 1", JOptionPane.INFORMATION_MESSAGE);
    // or
    livroDeNotas.exibirMensagem();

    JOptionPane.showMessageDialog(null, livroDeNotas2.getNomeDoCurso(), "Veja o curso 2", JOptionPane.INFORMATION_MESSAGE);
    // or
    livroDeNotas2.exibirMensagem();

    JOptionPane.showMessageDialog(null, livroDeNotas3.getNomeDoCurso(), "Veja o curso 3", JOptionPane.INFORMATION_MESSAGE);
    // or
    livroDeNotas3.exibirMensagem();
  }
}
