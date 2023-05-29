public class Doctor {
    private String id;
    private String department;
    private String name;
    private String email;
    private String  password;


    Doctor(String id, String department, String name, String email, String password){
        this.id = id;
        this.department =department;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getId() {
        return id;
    }
    public String getDepartment() {
        return department;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return id+"\t"+department+"\t"+name+"\t"+email+"\t"+password;
    }
}
