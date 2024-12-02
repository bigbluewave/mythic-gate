package net.orekoth.mythicgate;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.orekoth.mythicgate.item.MythicItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import draylar.gateofbabylon.registry.GOBItems;

public class MythicGate implements ModInitializer {
	public static final String MOD_ID = "mythicgate";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("modid");

	public static final ItemGroup GROUP = FabricItemGroup.builder().displayName(Text.translatable("itemGroup.mythicgate.group"))
	.icon(() -> new ItemStack(MythicItems.MYTHRIL_BROADSWORD))
	.entries((context, entries) -> {
		GOBItems.init();

		// Add GOB registry to ItemGroup
		Registries.ITEM.getEntrySet().stream().filter(entry -> entry.getKey().getValue().getNamespace().equals("mythicgate")).forEach(item -> {
			entries.add(new ItemStack(item.getValue()));
		});
	})
	.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registries.ITEM_GROUP, id("group"), GROUP);

		MythicItems.registerModItems();
	}

	public static Identifier id(String name) {
        return new Identifier(MythicGate.MOD_ID, name);
    }
}
