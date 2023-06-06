public abstract class Employee {
    private String id;
    private String name;
    private String designation;

    Employee(String id, String name, String designation){
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public abstract int salary();

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+designation+"\t";
    }
}
