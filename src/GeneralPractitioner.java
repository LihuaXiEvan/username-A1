public class GeneralPractitioner extends HealthProfessional {

    private String specialty;

    /**
     * A default constructor
     */
    public GeneralPractitioner() {

    }

    /**
     * A constructor with parameters
     * @param id
     * @param name
     * @param address
     * @param specialty
     */
    public GeneralPractitioner(long id, String name, String address, String specialty) {
        super(id, name, address);
        this.specialty = specialty;
    }

    /**
     * Print the appointment information
     */
    @Override
    public void print() {
        super.print();
        System.out.println("Specialty: " + specialty);
    }

    @Override
    public String toString() {
        return "GeneralPractitioner{" + "specialty='" + specialty + '\'' + ", id=" + super.getId() + ", name='" + super.getName() + '\'' + ", address='" + super.getAddress() + '\'' + '}';
    }
}
