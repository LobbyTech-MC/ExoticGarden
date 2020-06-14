package io.github.thebusybiscuit.exoticgarden.items;

import io.github.thebusybiscuit.exoticgarden.ExoticGardenRecipeTypes;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class CustomFood extends ExoticGardenFruit {

    private final int food;

    public CustomFood(Category category, SlimefunItemStack item, ItemStack[] recipe, int food) {
        super(category, item, ExoticGardenRecipeTypes.KITCHEN, true, recipe);
        this.food = food;
    }

    @Override
    protected int getFoodValue() {
        return food;
    }

}
