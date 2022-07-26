package builder;

public class User
{
    private long id;
    private String name;
    private String surname;
    private int age;
    private String password;
    
    public void setId(long id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public long getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getPassword()
    {
        return password;
    }
}
