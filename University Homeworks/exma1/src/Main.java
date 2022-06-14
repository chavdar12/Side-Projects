import java.util.List;

public class Main {
    public static void main(String[] args) {
        //create estate
        Estate estate = EstateBuilder.anEstate()
                .withType(Types.APARTMENT)
                .withArea(100)
                .withPrice(1000)
                .withFurniture(List.of(new Furniture(FurnitureTypes.BED, true),
                        new Furniture(FurnitureTypes.CHAIR, false)))
                .build();

        Agent agent = Agent.getInstance();
        agent.setFirstName("John");
        agent.setLastName("Doe");
        agent.setProperties(List.of(estate));

        System.out.println(agent);
    }
}
