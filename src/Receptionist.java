public class Receptionist extends Employee{
    private String salary;
    private String  contact;

    public Receptionist(String id, String designation, String name, String salary,String contact){
        super(id, name, designation);
        this.salary=salary;
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public String getSalary() {
        return salary;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public int salary() {
        return 0;
    }

    public String toString() {
        return super.toString()+"\t"+salary+"\t"+contact;
    }
}
