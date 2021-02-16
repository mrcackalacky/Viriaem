
package com.mrcackalacky.viriaem.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.mrcackalacky.viriaem.block.VoidedEndStoneBlock;
import com.mrcackalacky.viriaem.ViriaemModElements;

@ViriaemModElements.ModElement.Tag
public class ViriosiumItemGroup extends ViriaemModElements.ModElement {
	public ViriosiumItemGroup(ViriaemModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabviriosium") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(VoidedEndStoneBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
