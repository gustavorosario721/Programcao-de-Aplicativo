public enum Disciplina 
{
    LOGICA_DE_PROGRAMACAO,
    UML,
    BANCO_DE_DADOS,
    LINGUAGENS_DE_PROGRAMACAO;

    public String nomeFormatado()
    {
        return name().toLowerCase().replace("_", " ");
    }

    public static void listarDisciplinas()
    {
        Disciplina disciplinas[] = Disciplina.values();
        for (Disciplina d : disciplinas) 
        {
            System.out.println((d.ordinal() + 1) + " - " + d.nomeFormatado());
        }
    }
}
