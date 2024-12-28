package net.necrokochou.testmod;

import net.fabricmc.api.ModInitializer;

import net.necrokochou.testmod.block.ModBlocks;
import net.necrokochou.testmod.item.ModItems;
import net.necrokochou.testmod.itemgroup.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Test Commit Comment
public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}