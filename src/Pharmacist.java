public class Pharmacist extends Employee{
    private String  password;


    public Pharmacist(String id, String designation, String name, String contact){
        super(id, name, designation);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int salary() {
        return 0;
    }

    public String toString() {
        return super.toString()+"\t"+salary()+"\t"+password;
    }
}
