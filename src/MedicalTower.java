import java.util.ArrayList;
public class MedicalTower {
    ArrayList<Doctor>doctors;
    ArrayList<Patient>patients;
    ArrayList<Appointment>appointments;
    
    int nextPatientid = 1;
    int nextAppointmentid = 1;
    
    public MedicalTower(){
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
        
        doctors.add(new Doctor(1,"احمد محمد","باطنية",2));
        doctors.add(new Doctor(2,"محمد علي","قلب",3));
        doctors.add(new Doctor(3,"خالد عادل","أطفال",4));
        doctors.add(new Doctor(4,"سامي أحمد","جلدية",5));
        doctors.add(new Doctor(5,"ياسر محمد","عيون",6));
        doctors.add(new Doctor(6,"لبنئ محمود","أسنان",7));
        doctors.add(new Doctor(7,"مازن هاني","عظام",8));
        doctors.add(new Doctor(8,"فهد حسن","أنف وأذن وحنجرة",9));
        doctors.add(new Doctor(9,"ماجد أحمد","جراحة عامة",10));
        doctors.add(new Doctor(10,"أمل عبدالسلام","نساء وولادة",11));
    }
    public void addAppointment(String patientName,int age,String condition,
            Doctor doctor,String date,String time){
        Patient patient = new Patient(
        nextPatientid,
        patientName,
        age,
        condition);
        
        patients.add(patient);
        nextPatientid++;
        
        Appointment appointment = new Appointment(
        nextAppointmentid
        ,patient
        ,doctor
        ,date
        ,time,"Waiting");
        
       appointments.add(appointment);
       nextAppointmentid++;
        
        
    }
}
