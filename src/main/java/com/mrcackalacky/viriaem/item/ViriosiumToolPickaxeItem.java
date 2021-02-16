
package com.mrcackalacky.viriaem.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.mrcackalacky.viriaem.itemgroup.ViriosiumItemGroup;
import com.mrcackalacky.viriaem.ViriaemModElements;

@ViriaemModElements.ModElement.Tag
public class ViriosiumToolPickaxeItem extends ViriaemModElements.ModElement {
	@ObjectHolder("viriaem:viriosium_pickaxe")
	public static final Item block = null;
	public ViriosiumToolPickaxeItem(ViriaemModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4082;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ViriosiumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ViriosiumItemGroup.tab)) {
		}.setRegistryName("viriosium_pickaxe"));
	}
}
