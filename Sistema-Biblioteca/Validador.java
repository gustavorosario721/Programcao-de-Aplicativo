public class Validador 
{
    public static boolean matriculaFormatoValido(String matricula)
    {
        if (matricula.matches("\\d{5}"))
            return true;
        else
            return false;
    }

    public  static boolean cpfFormatoValido(String cpf)
    {
        if (cpf.matches("\\d{9}\\-\\d{2}"))
            return true;
        else
            return false;
            
    }    
}
