
public class Main {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("123456", "João", "Joanzinho@example.com", "999999999", "Rua teste, itaipu - RJ");
    
    Principal p1 = new Principal(
      aluno1
    );

    System.out.println("Matrícula: " + p1.getAluno().getMatricula());
    System.out.println("Nome: " + p1.getAluno().getNome());
    System.out.println("E-mail: " + p1.getAluno().getEmail());
    System.out.println("Tel.: " + p1.getAluno().getTelefone());
    System.out.println("Residência "+ p1.getAluno().getResidencia());
    
  }
}