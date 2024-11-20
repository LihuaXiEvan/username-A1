import java.util.ArrayList;
import java.util.List;

/**
 * github : https://github.com/LihuaXiEvan/username-A1
 * short video: https://scuonline-my.sharepoint.com/:v:/g/personal/l_xi_11_student_scu_edu_au/EbSnVV3MMZtCpE-YtZ730lABs_OO_2slusHWAcHDAR75ZA?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=moSVsq
 */
public class AssignmentOne {

    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        GeneralPractitioner practitioner1 = new GeneralPractitioner(1, "xiao wang", "666", "nose");
        GeneralPractitioner practitioner2 = new GeneralPractitioner(2, "xiao li", "999", "ear");
        GeneralPractitioner practitioner3 = new GeneralPractitioner(3, "James", "888", "throat");


        PsychologicalProfessional psychologicalProfessional1 =
                new PsychologicalProfessional(1, "Marry", "New York", "character test");
        PsychologicalProfessional psychologicalProfessional2 =
                new PsychologicalProfessional(2, "li ming", "Los Angeles", "pressure test");

        // print the appointment information
        practitioner1.print();
        practitioner2.print();
        practitioner3.print();

        // print  the appointment information
        psychologicalProfessional1.print();
        psychologicalProfessional2.print();

        System.out.println("------------------------------");


        // Part 5 – Collection of appointments
        List<Appointment> list = new ArrayList<>();

        Appointment appointment1 = new Appointment("Celandine", "100001", "08:00", practitioner1);
        createAppointment(list, appointment1);
        Appointment appointment2 = new Appointment("Cherise", "100002", "09:00", practitioner3);
        createAppointment(list, appointment2);

        Appointment appointment3 = new Appointment("Doris", "100003", "08:00", psychologicalProfessional1);
        createAppointment(list, appointment3);
        Appointment appointment4 = new Appointment("Durriya", "100004", "07:00", psychologicalProfessional2);
        createAppointment(list, appointment4);

        printExistingAppointments(list);

        cancelBooking(list, "100002");

        printExistingAppointments(list);


        System.out.println("------------------------------");

    }

    /**
     * add new appointment
     * @param list
     * @param appointment
     */
    public static void createAppointment(List<Appointment> list, Appointment appointment) {
        list.add(appointment);
    }


    /**
     * print existing appointments
     * @param list
     */
    public static void printExistingAppointments(List<Appointment> list) {
        if (list.isEmpty()) {
            System.out.println("No existing appointments");
        } else {
            for (Appointment appointment : list) {
                appointment.print();
            }
        }
    }

    /**
     *  Cancel booking
     * @param list
     * @param phone
     */
    public static void cancelBooking(List<Appointment> list, String phone) {
        if (list == null || list.isEmpty()) {
            System.out.println("No appointment found for phone number: " + phone);
            return;
        }
        for (Appointment appointment : list) {
            if (appointment.getPhone().equals(phone)) {
                list.remove(appointment);
                System.out.println("Appointment cancelled for phone number: " + phone);
                return;
            }
        }
    }

}
