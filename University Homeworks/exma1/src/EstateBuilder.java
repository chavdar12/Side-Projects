import java.util.List;

public final class EstateBuilder {
    private Types type;
    private double area;
    private double price;
    private List<Furniture> furniture;
    private Expositions exposition;
    private Locations location;
    private int numberOfRooms;
    private boolean hasGarage;
    private boolean hasGarden;

    private EstateBuilder() {
    }

    public static EstateBuilder anEstate() {
        return new EstateBuilder();
    }

    public EstateBuilder withType(Types type) {
        this.type = type;
        return this;
    }

    public EstateBuilder withArea(double area) {
        this.area = area;
        return this;
    }

    public EstateBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public EstateBuilder withFurniture(List<Furniture> furniture) {
        this.furniture = furniture;
        return this;
    }

    public EstateBuilder withExposition(Expositions exposition) {
        this.exposition = exposition;
        return this;
    }

    public EstateBuilder withLocation(Locations location) {
        this.location = location;
        return this;
    }

    public EstateBuilder withNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    public EstateBuilder withHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public EstateBuilder withHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public Estate build() {
        return new Estate(type, area, price, furniture, exposition, location, numberOfRooms, hasGarage, hasGarden);
    }
}
