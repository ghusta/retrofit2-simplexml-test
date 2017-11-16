package fr.husta.test.xml;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "breakfast_menu")
public class BreakfastMenu
{

    @ElementList(inline = true)
    private List<Food> foodList;

    public BreakfastMenu()
    {
    }

    public List<Food> getFoodList()
    {
        return foodList;
    }

    public void setFoodList(List<Food> foodList)
    {
        this.foodList = foodList;
    }
}

