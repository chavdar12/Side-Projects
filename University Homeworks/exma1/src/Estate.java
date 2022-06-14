import java.util.List;

public class Estate {
    private Types type;
    private double area;
    private double price;
    private List<Furniture> furniture;
    private Expositions exposition;
    private Locations location;
    private int numberOfRooms;
    private boolean hasGarage;
    private boolean hasGarden;

    public Estate(Types type, double area, double price, List<Furniture> furniture, Expositions exposition, Locations location, int numberOfRooms, boolean hasGarage, boolean hasGarden) {
        this.type = type;
        this.area = area;
        this.price = price;
        this.furniture = furniture;
        this.exposition = exposition;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Furniture> getFurniture() {
        return furniture;
    }

    public void setFurniture(List<Furniture> furniture) {
        this.furniture = furniture;
    }

    public Expositions getExposition() {
        return exposition;
    }

    public void setExposition(Expositions exposition) {
        this.exposition = exposition;
    }

    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estate ").append(type).append("\n");
        sb.append("Area: ").append(area).append("\n");
        sb.append("Price: ").append(price).append("\n");
        sb.append("Furniture: ").append(furniture).append("\n");
        sb.append("Exposition: ").append(exposition).append("\n");
        sb.append("Location: ").append(location).append("\n");
        sb.append("Number of rooms: ").append(numberOfRooms).append("\n");
        sb.append("Has garage: ").append(hasGarage).append("\n");
        sb.append("Has garden: ").append(hasGarden).append("\n");
        return sb.toString();
    }
}
