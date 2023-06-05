public class Staff {
    private String id;
    private String designation;
    private String name;
    private String salary;
    private String  contact;


    Staff(String id, String designation , String name, String salary, String contact){
        this.id = id;
        this.designation = designation;
        this.name = name;
        this.salary = salary;
        this.contact = contact;
    }
    public String getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getContact() {
        return contact;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return id+"\t"+designation+"\t"+name+"\t"+salary+"\t"+contact;
    }
}
