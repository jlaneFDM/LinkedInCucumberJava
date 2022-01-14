package linkedinlearning.cucumbercourse;

public class RestaurantMenuItem {
    private String itemName;
    private String description;
    private Integer price;

    public RestaurantMenuItem(String itemName, String description, Integer price) {
        this.itemName = itemName;
        this.description = description;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "RestaurantMenuItem{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
