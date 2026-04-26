public class Usuario
{
  private String nome;
  private String cpf;
  private byte qtdLivros;

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

  public void setQtdLivros(byte qtdLivros) 
  {
      this.qtdLivros = qtdLivros;
  }

  public byte getQtdLivros() 
  {
      return qtdLivros;
  }

  public void pegarLivro(byte qtdEmprestado)
  {
    this.qtdLivros += qtdEmprestado;
  }
  
  public void devolverLivro(byte qtdDevolvido)
  {
    this.qtdLivros -= qtdDevolvido;
  }

  public void exibirDados()
  {
    System.out.println("Nome: " + getNome());
    System.out.println("Cpf: " + getCpf());
    System.out.println("Livros em posse: " + getQtdLivros());
  }
}
