public class Furniture {
    private FurnitureTypes furnitureType;
    private boolean furnished;

    public Furniture(FurnitureTypes furnitureType, boolean furnished) {
        this.furnitureType = furnitureType;
        this.furnished = furnished;
    }

    public FurnitureTypes getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(FurnitureTypes furnitureType) {
        this.furnitureType = furnitureType;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Furniture: ").append(furnitureType).append(" ").append(furnished ? "furnished" : "not furnished");
        return sb.toString();
    }
}
