

public class Aluno {
  private String matricula;
  private String nome;
  private String email;
  private String telefone;
  private String residencia;

  public Aluno(String matricula, String nome, String email, String telefone, String residencia) {
    this.matricula = matricula;
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.residencia = residencia;
  }
  
  public String getMatricula() {
      return matricula;
  }
  
  public void setMatricula(String matricula) {
      this.matricula = matricula;
  }
  
  public String getNome() {
      return nome;
  }
  
  public void setNome(String nome) {
      this.nome = nome;
  }
  
  public String getEmail() {
      return email;
  }
  
  public void setEmail(String email) {
      this.email = email;
  }
  
  public String getTelefone() {
      return telefone;
  }
  
  public void setTelefone(String telefone) {
      this.telefone = telefone;
  }
  
  public String getResidencia() {
      return residencia;
  }
  
  public void setResidencia(String residencia) {
      this.residencia = residencia;
  }
}