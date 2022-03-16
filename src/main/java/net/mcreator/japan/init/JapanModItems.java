
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.japan.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.japan.item.SamuraiArmorItem;
import net.mcreator.japan.item.KatanaItem;
import net.mcreator.japan.item.JapaneseMusicDiscItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JapanModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item KATANA = register(new KatanaItem());
	public static final Item CHERRY_BLOSSOM_LEAVES = register(JapanModBlocks.CHERRY_BLOSSOM_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item JAPANESE_MUSIC_DISC = register(new JapaneseMusicDiscItem());
	public static final Item SAMURAI_ARMOR_HELMET = register(new SamuraiArmorItem.Helmet());
	public static final Item SAMURAI_ARMOR_CHESTPLATE = register(new SamuraiArmorItem.Chestplate());
	public static final Item SAMURAI_ARMOR_LEGGINGS = register(new SamuraiArmorItem.Leggings());
	public static final Item SAMURAI_ARMOR_BOOTS = register(new SamuraiArmorItem.Boots());
	public static final Item SAMURAI = register(
			new SpawnEggItem(JapanModEntities.SAMURAI, -15263977, -14336, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("samurai_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
