import java.util.List;

public class Agent {
    private String firstName;
    private String lastName;
    private List<Estate> properties;

    private Agent() {
    }

    public static Agent getInstance() {
        return new Agent();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Estate> getProperties() {
        return properties;
    }

    public void setProperties(List<Estate> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agent ").append(firstName).append(" ").append(lastName).append("\n");
        sb.append("Properties:\n");
        for (Estate property : properties) {
            sb.append(property.toString()).append("\n");
        }
        return sb.toString();
    }
}
