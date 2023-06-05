public class Patient {
    private String id;
    private String name;
    private String gender;
    private String age;
    private String disease;
    private String admitStatus;


    Patient(String id, String name , String gender, String age, String disease, String admitStatus){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age  = age;
        this.disease = disease;
        this.admitStatus = admitStatus;

    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String getAdmitStatus() {
        return admitStatus;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setAdmitStatus(String admitStatus) {
        this.admitStatus = admitStatus;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+gender+"\t"+age+"\t"+disease+"\t"+admitStatus;
    }
}
