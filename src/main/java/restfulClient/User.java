package restfulClient;

	/* POJO (Plain Old Java Objects) */
public class User {
    private int id;
    private String name;
    private Integer age;
    private String email;
 
    public User() {
    	
    }
    
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
}