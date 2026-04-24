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

  public boolean cpfFormatoValido(cpf)
  {
    if (cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
        return true;
    else
        return false;
        
  }

  public void exibirDados()
  {
    System.out.println("Nome: " + getNome());
    System.out.println("Cpf: " getCpf());
  }
}
