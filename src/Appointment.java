public class Appointment {

    private String name;

    private String phone;

    /**
     * exemple：08:00、10:00、14:30
     */
    private String appointmentTime;

    /**
     * base class
     */
    private HealthProfessional healthProfessional;

    /**
     * A default constructor
     */
    public Appointment() {

    }

    /**
     * A constructor with parameters
     * @param name
     * @param phone
     * @param appointmentTime
     * @param healthProfessional
     */
    public Appointment(String name, String phone, String appointmentTime, HealthProfessional healthProfessional) {
        this.name = name;
        this.phone = phone;
        this.appointmentTime = appointmentTime;
        this.healthProfessional = healthProfessional;
    }

    /**
     * Print the appointment information
     */
    public void print() {
        System.out.println("Appointment{" + "name='" + name + '\'' + ", phone='" + phone + '\'' + ", appointmentTime='" + appointmentTime + '\'' + ", healthProfessional=" + healthProfessional + '}');
    }

    @Override
    public String toString() {
        return "Appointment{" + "name='" + name + '\'' + ", phone='" + phone + '\'' + ", appointmentTime='" + appointmentTime + '\'' + ", healthProfessional=" + healthProfessional + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }

    public void setHealthProfessional(HealthProfessional healthProfessional) {
        this.healthProfessional = healthProfessional;
    }
}
