public class Staff extends Employee{

    private String  contact;


    public Staff(String id, String designation, String name, String contact){
        super(id, name, designation);
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }


    public void setContact(String contact) {
        this.contact = contact;
    }


    @Override
    public int salary() {
        return 0;
    }

    public String toString() {
        return super.toString()+"\t"+salary()+"\t"+contact;
    }
}
