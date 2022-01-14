package linkedinlearning.cucumbercourse;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {
    List<RestaurantMenuItem> menuItems;

    public RestaurantMenu() {
        menuItems = new ArrayList<>();
    }

    public boolean addMenuItem(RestaurantMenuItem restaurantMenuItem) throws IllegalArgumentException{
        if (doesItemExist(restaurantMenuItem)) {
            throw new IllegalArgumentException("Duplicate item");
        }
        return menuItems.add(restaurantMenuItem);
    }

    public boolean doesItemExist(RestaurantMenuItem restaurantMenuItem){
        boolean exists = false;
        if (menuItems.contains(restaurantMenuItem)){
            exists = true;
        }
        return exists;
    }
}
