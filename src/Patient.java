public class Patient extends Person{
    private static int patientIdAssigned = 0;
    private int patientId;
    private MedicalRecord medicalHistory;
    private String currentHealthStatus;
    public Patient(String name, String contactInfo, String address, MedicalRecord medicalHistory, String currentHealthStatus) {
        super(name, contactInfo, address);
        this.medicalHistory = medicalHistory;
        this.currentHealthStatus = currentHealthStatus;
        patientId = ++patientIdAssigned;
    }

    public MedicalRecord getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(MedicalRecord medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getCurrentHealthStatus() {
        return currentHealthStatus;
    }

    public void setCurrentHealthStatus(String currentHealthStatus) {
        this.currentHealthStatus = currentHealthStatus;
    }
}
