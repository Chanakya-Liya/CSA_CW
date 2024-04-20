public class Prescription {
    private Patient patient;
    private String medication;
    private String dosage;
    private String instructions;
    private String duration;

    public Prescription(Patient patient, String medication, String dosage, String instructions, String duration) {
        this.patient = patient;
        this.medication = medication;
        this.dosage = dosage;
        this.instructions = instructions;
        this.duration = duration;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getMedication() {
        return medication;
    }

    public String getDosage() {
        return dosage;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getDuration() {
        return duration;
    }
}
