package net.necrokochou.testmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.necrokochou.testmod.block.ModBlocks;
import net.necrokochou.testmod.component.ModDataComponentTypes;
import net.necrokochou.testmod.item.ModItems;
import net.necrokochou.testmod.itemgroup.ModItemGroups;
import net.necrokochou.testmod.event.HammerUsageEvent;
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

		ModDataComponentTypes.registerDataComponentTypes();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 20000);

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}