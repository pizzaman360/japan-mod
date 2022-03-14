
package net.mcreator.japan.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.japan.init.JapanModSounds;

public class JapaneseMusicDiscItem extends RecordItem {
	public JapaneseMusicDiscItem() {
		super(0, JapanModSounds.REGISTRY.get(new ResourceLocation("japan:japanese_music")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("japanese_music_disc");
	}
}
