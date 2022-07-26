package singleton;

public class Admin
{
    private static Admin admin;
    
    private final long id;
    private final String name;
    private final String email;
    private final String password;
    
    private Admin(long id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public static Admin getInstance(long id, String name, String email, String password)
    {
        if (admin == null)
        {
            admin = new Admin(id, name, email, password);
        }
        return admin;
    }
    
    public long getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPassword()
    {
        return password;
    }
}
