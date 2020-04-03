package me.mrCookieSlime.ExoticGarden;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CustomFood extends EGPlant {

	private final float food;

	public CustomFood(Category category, SlimefunItemStack item, ItemStack[] recipe, int food) {
		super(category, item, ExoticGarden.getKitchen().asRecipeType(), true, recipe);
		this.food = food;
	}

	@Override
	public void restoreHunger(Player p) {
		int level = p.getFoodLevel() + (int) food;
		p.setFoodLevel(Math.min(level, 20));
		p.setSaturation(food);
	}

}
