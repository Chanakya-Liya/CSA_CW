import java.util.Date;

public class Appointment {
    private static int meetingIdAssigned = 0;
    private int meetingId;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public Appointment(Patient patient, Doctor doctor, Date date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        meetingId = ++meetingIdAssigned;
    }

    public int getMeetingId() {
        return meetingId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
