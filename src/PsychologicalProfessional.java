public class PsychologicalProfessional extends HealthProfessional {

    private String assessmentContent;

    /**
     * A default constructor
     */
    public PsychologicalProfessional() {

    }

    /**
     * A constructor with parameters
     * @param id
     * @param name
     * @param address
     * @param assessmentContent
     */
    public PsychologicalProfessional(long id, String name, String address, String assessmentContent) {
        super(id, name, address);
        this.assessmentContent = assessmentContent;

    }

    /**
     * Print the appointment information
     */
    @Override
    public void print() {
        super.print();
        System.out.println("AssessmentContent: " + assessmentContent);
    }

    @Override
    public String toString() {
        return "PsychologicalProfessional{" +
                "assessmentContent='" + assessmentContent + '\'' +
                ", id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                '}';
    }
}
