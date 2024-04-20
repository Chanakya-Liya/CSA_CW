public class Doctor extends Person{
    private static int doctorIdAssigned = 0;
    private int doctorId;
    private String specialization;

    public Doctor(String name, String contactInfo, String address,String specialization) {
        super(name, contactInfo, address);
        this.specialization = specialization;
        doctorId = ++doctorIdAssigned;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getDoctorId() {
        return doctorId;
    }
}
