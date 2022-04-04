package org.xkmc.polaris_rpg.content.item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public interface IGlowingTarget {

	@OnlyIn(Dist.CLIENT)
	int getDistance(ItemStack stack);

}
