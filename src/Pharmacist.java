public class Pharmacist {
    private String id;
    private String pharmacyNo;
    private String name;
    private String salary;
    private String  contact;


    Pharmacist(String id, String designation , String name, String salary, String contact){
        this.id = id;
        this.pharmacyNo = pharmacyNo;
        this.name = name;
        this.salary = salary;
        this.contact = contact;
    }
    public String getId() {
        return id;
    }

    public String getPharmacyNo() {
        return pharmacyNo;
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

    public void setPharmacyNo(String pharmacyNo) {
        this.pharmacyNo = pharmacyNo;
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
        return id+"\t"+pharmacyNo+"\t"+name+"\t"+salary+"\t"+contact;
    }

}
