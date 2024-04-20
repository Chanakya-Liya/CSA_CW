public class Billing {
    private Patient patient;
    private Doctor doctor;
    private double amount;
    private boolean isPaid;

    public Billing(Patient patient, Doctor doctor, double amount, boolean isPaid) {
        this.patient = patient;
        this.doctor = doctor;
        this.amount = amount;
        this.isPaid = isPaid;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
