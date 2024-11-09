public class HealthProfessional {

    /**
     * ID
     */
    private long id;

    /**
     * name
     */
    private String name;

    /**
     * address
     */
    private String address;

    /**
     * A default constructor
     */
    public HealthProfessional() {
    }

    /**
     * A constructor with parameters
     * @param id
     * @param name
     * @param address
     */
    public HealthProfessional(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    /**
     * Print the   appointment information
     */
    public void print() {
        System.out.println("HealthProfessional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "HealthProfessional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String phone) {
        this.address = address;
    }
}
