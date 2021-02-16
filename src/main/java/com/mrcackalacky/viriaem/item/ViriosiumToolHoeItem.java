
package com.mrcackalacky.viriaem.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import com.mrcackalacky.viriaem.itemgroup.ViriosiumItemGroup;
import com.mrcackalacky.viriaem.ViriaemModElements;

@ViriaemModElements.ModElement.Tag
public class ViriosiumToolHoeItem extends ViriaemModElements.ModElement {
	@ObjectHolder("viriaem:viriosium_hoe")
	public static final Item block = null;
	public ViriosiumToolHoeItem(ViriaemModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 4082;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 1f;
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
		}, 0, -3f, new Item.Properties().group(ViriosiumItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("viriosium_hoe"));
	}
}
