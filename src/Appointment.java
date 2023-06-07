public class Appointment {
    private String patientName;
    private String patientContact;
    private String specialist;
    private String doctorName;
    private String slot;

    Appointment(String patientName,String patientContact, String specialist, String doctorName, String slot){
        this.patientName =patientName;
        this.patientContact =patientContact;
        this.specialist = specialist;
        this.doctorName =doctorName;
        this.slot =slot;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientContact() {
        return patientContact;
    }

    public String getSpecialist() {
        return specialist;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSlot() {
        return slot;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientContact(String patientContact) {
        this.patientContact = patientContact;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return patientName+"\t"+patientContact+"\t"+specialist+"\t"+doctorName+"\t"+slot;
    }
}
