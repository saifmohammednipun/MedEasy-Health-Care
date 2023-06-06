public class Doctor {
    private String id;
    private String department;
    private String name;
    private String email;
    private String  workdays;


    Doctor(String id, String department, String name, String email, String workdays){
        this.id = id;
        this.department =department;
        this.name = name;
        this.email = email;
        this.workdays = workdays;
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

    public String getWorkdays() {
        return workdays;
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

    public void setWorkdays(String workdays) {
        this.workdays = workdays;
    }

    @Override
    public String toString() {
        return id+"\t"+department+"\t"+name+"\t"+email+"\t"+workdays;
    }
}
