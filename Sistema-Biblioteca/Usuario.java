public class Usuario
{
  private String nome;
  private String cpf;

  public Usuario()
  {
  }

  public void setNome(String nome) 
  {
      this.nome = nome;
  }

  public String getNome()
  {
      return nome;
  }

  public void setCpf(String cpf) 
  {
      this.cpf = cpf;
  }

  public String getCpf() 
  {
      return cpf;
  }

  public void exibirDados()
  {
    System.out.println("Nome: " + getNome());
    System.out.println("Cpf: " getCpf());
  }
}
