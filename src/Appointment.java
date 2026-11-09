public class Appointment {
  int appointmentid;
Patient patient;
Doctor doctor;
String date;
String time;
String status;

public Appointment(int appointmentid,Patient patient,Doctor doctor,
        String date,String time,String status){
    this.appointmentid = appointmentid;
    this.patient = patient;
    this.doctor = doctor;
    this.date = date;
    this.time = time;
    this.status = status;
}
}
