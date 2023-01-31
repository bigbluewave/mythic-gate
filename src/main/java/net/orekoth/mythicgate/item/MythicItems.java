package net.orekoth.mythicgate.item;

import draylar.gateofbabylon.GateOfBabylon;
import draylar.gateofbabylon.item.*;
//import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;
//import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.orekoth.mythicgate.MythicGate;
import nourl.mythicmetals.tools.ToolMaterials;

public class MythicItems {
    public static final BroadswordItem ADAMANTITE_BROADSWORD = register("adamantite_broadsword", new BroadswordItem(ToolMaterials.ADAMANTITE, 16f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem AQUARIUM_BROADSWORD = register("aquarium_broadsword", new BroadswordItem(ToolMaterials.AQUARIUM, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem BANGLUM_BROADSWORD = register("banglum_broadsword", new BroadswordItem(ToolMaterials.BANGLUM, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem BRONZE_BROADSWORD = register("bronze_broadsword", new BroadswordItem(ToolMaterials.BRONZE, 11f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem CARMOT_BROADSWORD = register("carmot_broadsword", new BroadswordItem(ToolMaterials.CARMOT, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem CELESTIUM_BROADSWORD = register("celestium_broadsword", new BroadswordItem(ToolMaterials.CELESTIUM, 18f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem COPPER_BROADSWORD = register("copper_broadsword", new BroadswordItem(ToolMaterials.COPPER, 8f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem DURASTEEL_BROADSWORD = register("durasteel_broadsword", new BroadswordItem(ToolMaterials.DURASTEEL, 13f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem HALLOWED_BROADSWORD = register("hallowed_broadsword", new BroadswordItem(ToolMaterials.HALLOWED, 16f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem KYBER_BROADSWORD = register("kyber_broadsword", new BroadswordItem(ToolMaterials.KYBER, 11.5f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem METALLURGIUM_BROADSWORD = register("metallurgium_broadsword", new BroadswordItem(ToolMaterials.METALLURGIUM, 20f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem MYTHRIL_BROADSWORD = register("mythril_broadsword", new BroadswordItem(ToolMaterials.MYTHRIL, 12.5f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem ORICHALCUM_BROADSWORD = register("orichalcum_broadsword", new BroadswordItem(ToolMaterials.ORICHALCUM, 14f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem OSMIUM_BROADSWORD = register("osmium_broadsword", new BroadswordItem(ToolMaterials.OSMIUM, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem PALLADIUM_BROADSWORD = register("palladium_broadsword", new BroadswordItem(ToolMaterials.PALLADIUM, 13.5f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem PROMETHEUM_BROADSWORD = register("prometheum_broadsword", new BroadswordItem(ToolMaterials.PROMETHEUM, 14f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem QUADRILLUM_BROADSWORD = register("quadrillum_broadsword", new BroadswordItem(ToolMaterials.QUADRILLUM, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem RUNITE_BROADSWORD = register("runite_broadsword", new BroadswordItem(ToolMaterials.RUNITE, 13.2f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem STAR_PLATINUM_BROADSWORD = register("star_platinum_broadsword", new BroadswordItem(ToolMaterials.STAR_PLATINUM, 12.5f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem STEEL_BROADSWORD = register("steel_broadsword", new BroadswordItem(ToolMaterials.STEEL, 11f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem STORMYX_BROADSWORD = register("stormyx_broadsword", new BroadswordItem(ToolMaterials.STORMYX, 13f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));

    public static final KatanaItem ADAMANTITE_KATANA = register("adamantite_katana", new KatanaItem(ToolMaterials.ADAMANTITE, 10f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem AQUARIUM_KATANA = register("aquarium_katana", new KatanaItem(ToolMaterials.AQUARIUM, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem BANGLUM_KATANA = register("banglum_katana", new KatanaItem(ToolMaterials.BANGLUM, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem BRONZE_KATANA = register("bronze_katana", new KatanaItem(ToolMaterials.BRONZE, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem CARMOT_KATANA = register("carmot_katana", new KatanaItem(ToolMaterials.CARMOT, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem CELESTIUM_KATANA = register("celestium_katana", new KatanaItem(ToolMaterials.CELESTIUM, 11f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem COPPER_KATANA = register("copper_katana", new KatanaItem(ToolMaterials.COPPER, 6f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem DURASTEEL_KATANA = register("durasteel_katana", new KatanaItem(ToolMaterials.DURASTEEL, 8.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem HALLOWED_KATANA = register("hallowed_katana", new KatanaItem(ToolMaterials.HALLOWED, 10.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem KYBER_KATANA = register("kyber_katana", new KatanaItem(ToolMaterials.KYBER, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem METALLURGIUM_KATANA = register("metallurgium_katana", new KatanaItem(ToolMaterials.METALLURGIUM, 12f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem MYTHRIL_KATANA = register("mythril_katana", new KatanaItem(ToolMaterials.MYTHRIL, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem ORICHALCUM_KATANA = register("orichalcum_katana", new KatanaItem(ToolMaterials.ORICHALCUM, 9f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem OSMIUM_KATANA = register("osmium_katana", new KatanaItem(ToolMaterials.OSMIUM, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem PALLADIUM_KATANA = register("palladium_katana", new KatanaItem(ToolMaterials.PALLADIUM, 8.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem PROMETHEUM_KATANA = register("prometheum_katana", new KatanaItem(ToolMaterials.PROMETHEUM, 9f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem QUADRILLUM_KATANA = register("quadrillum_katana", new KatanaItem(ToolMaterials.QUADRILLUM, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem RUNITE_KATANA = register("runite_katana", new KatanaItem(ToolMaterials.RUNITE, 8.3f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem STAR_PLATINUM_KATANA = register("star_platinum_katana", new KatanaItem(ToolMaterials.STAR_PLATINUM, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem STEEL_KATANA = register("steel_katana", new KatanaItem(ToolMaterials.STEEL, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem STORMYX_KATANA = register("stormyx_katana", new KatanaItem(ToolMaterials.STORMYX, 8.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));

    public static final SpearItem ADAMANTITE_SPEAR = register("adamantite_spear", new SpearItem(ToolMaterials.ADAMANTITE, 9.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem AQUARIUM_SPEAR = register("aquarium_spear", new SpearItem(ToolMaterials.AQUARIUM, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem BANGLUM_SPEAR = register("banglum_spear", new SpearItem(ToolMaterials.BANGLUM, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem BRONZE_SPEAR = register("bronze_spear", new SpearItem(ToolMaterials.BRONZE, 6.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem CARMOT_SPEAR = register("carmot_spear", new SpearItem(ToolMaterials.CARMOT, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem CELESTIUM_SPEAR = register("celestium_spear", new SpearItem(ToolMaterials.CELESTIUM, 10.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem COPPER_SPEAR = register("copper_spear", new SpearItem(ToolMaterials.COPPER, 5.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem DURASTEEL_SPEAR = register("durasteel_spear", new SpearItem(ToolMaterials.DURASTEEL, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem HALLOWED_SPEAR = register("hallowed_spear", new SpearItem(ToolMaterials.HALLOWED, 9f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem KYBER_SPEAR = register("kyber_spear", new SpearItem(ToolMaterials.KYBER, 6.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem METALLURGIUM_SPEAR = register("metallurgium_spear", new SpearItem(ToolMaterials.METALLURGIUM, 11.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem MYTHRIL_SPEAR = register("mythril_spear", new SpearItem(ToolMaterials.MYTHRIL, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem ORICHALCUM_SPEAR = register("orichalcum_spear", new SpearItem(ToolMaterials.ORICHALCUM, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem OSMIUM_SPEAR = register("osmium_spear", new SpearItem(ToolMaterials.OSMIUM, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem PALLADIUM_SPEAR = register("palladium_spear", new SpearItem(ToolMaterials.PALLADIUM, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem PROMETHEUM_SPEAR = register("prometheum_spear", new SpearItem(ToolMaterials.PROMETHEUM, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem QUADRILLUM_SPEAR = register("quadrillum_spear", new SpearItem(ToolMaterials.QUADRILLUM, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem RUNITE_SPEAR = register("runite_spear", new SpearItem(ToolMaterials.RUNITE, 7.3f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem STAR_PLATINUM_SPEAR = register("star_platinum_spear", new SpearItem(ToolMaterials.STAR_PLATINUM, 7.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem STEEL_SPEAR = register("steel_spear", new SpearItem(ToolMaterials.STEEL, 6.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem STORMYX_SPEAR = register("stormyx_spear", new SpearItem(ToolMaterials.STORMYX, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));

    private static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, new Identifier(MythicGate.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering mod items for" + MythicGate.MOD_ID);
    }
}
