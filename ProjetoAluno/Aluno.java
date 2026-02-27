public class Aluno 
{
    private String name;
    private int age;
    private String registration;

    public Aluno(String name, int age, String registration)
    {
        this.name = name;
        this.age = age;
        this.registration = registration;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setRegistraton(String registration)
    {
        this.registration = registration;
    }

    public String getRegistration()
    {
        return registration;
    }
}
