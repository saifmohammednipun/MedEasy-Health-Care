public class Pharmacist2 {
    private String id;
    private String password;

    Pharmacist2(String id,String password){
        this.id = id;
        this.password=password;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return id+"\t"+password;
    }
}


