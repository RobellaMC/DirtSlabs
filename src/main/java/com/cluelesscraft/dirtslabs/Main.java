package com.cluelesscraft.dirtslabs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

// Dirt Slabs plugin written by Robella.
// https://robella.carrd.co/
// Discord: Robella#0015 for inquiries.

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemStack result = new ItemStack(Material.PETRIFIED_OAK_SLAB, 6);
        // The result of the recipe added will give you 6 petrified oak slabs.
        NamespacedKey key = new NamespacedKey(this, "dirt_slab");
        // Adds NBT tag with dirt_slab as the name.
        ShapedRecipe recipe = new ShapedRecipe(key, result);
        // Adds new shaped recipe.
        recipe.shape(
                "   ",
                "   ",
                "DDD"
        );
        // Recipe as shown in a crafting table.
        recipe.setIngredient('D', Material.DIRT);
        // D in the crafting table is dirt.
        Bukkit.addRecipe(recipe);
        // Adds recipe to server.


        // Second recipe.
        ItemStack result1 = new ItemStack(Material.PETRIFIED_OAK_SLAB, 6);
        NamespacedKey key1 = new NamespacedKey(this, "dirt_slab");
        ShapedRecipe recipe1 = new ShapedRecipe(key1, result1);
        recipe.shape(
                "   ",
                "DDD",
                "   "
        );
        recipe.setIngredient('D', Material.DIRT);
        Bukkit.addRecipe(recipe);


        // Third recipe.
        ItemStack result2 = new ItemStack(Material.PETRIFIED_OAK_SLAB, 6);
        NamespacedKey key2 = new NamespacedKey(this, "dirt_slab");
        ShapedRecipe recipe2 = new ShapedRecipe(key2, result2);
        recipe.shape(
                "DDD",
                "   ",
                "   "
        );
        recipe.setIngredient('D', Material.DIRT);
        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
