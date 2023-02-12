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
import nourl.mythicmetals.tools.MythicToolMaterials;

public class MythicItems {
    public static final BroadswordItem ADAMANTITE_BROADSWORD = register("adamantite_broadsword", new BroadswordItem(MythicToolMaterials.ADAMANTITE, 16f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem AQUARIUM_BROADSWORD = register("aquarium_broadsword", new BroadswordItem(MythicToolMaterials.AQUARIUM, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem BANGLUM_BROADSWORD = register("banglum_broadsword", new BroadswordItem(MythicToolMaterials.BANGLUM, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem BRONZE_BROADSWORD = register("bronze_broadsword", new BroadswordItem(MythicToolMaterials.BRONZE, 11f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem CARMOT_BROADSWORD = register("carmot_broadsword", new BroadswordItem(MythicToolMaterials.CARMOT, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem CELESTIUM_BROADSWORD = register("celestium_broadsword", new BroadswordItem(MythicToolMaterials.CELESTIUM, 18f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem COPPER_BROADSWORD = register("copper_broadsword", new BroadswordItem(MythicToolMaterials.COPPER, 8f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem DURASTEEL_BROADSWORD = register("durasteel_broadsword", new BroadswordItem(MythicToolMaterials.DURASTEEL, 13f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem HALLOWED_BROADSWORD = register("hallowed_broadsword", new BroadswordItem(MythicToolMaterials.HALLOWED, 16f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem KYBER_BROADSWORD = register("kyber_broadsword", new BroadswordItem(MythicToolMaterials.KYBER, 11.5f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem METALLURGIUM_BROADSWORD = register("metallurgium_broadsword", new BroadswordItem(MythicToolMaterials.METALLURGIUM, 20f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem MYTHRIL_BROADSWORD = register("mythril_broadsword", new BroadswordItem(MythicToolMaterials.MYTHRIL, 12.5f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem ORICHALCUM_BROADSWORD = register("orichalcum_broadsword", new BroadswordItem(MythicToolMaterials.ORICHALCUM, 14f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem OSMIUM_BROADSWORD = register("osmium_broadsword", new BroadswordItem(MythicToolMaterials.OSMIUM, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem PALLADIUM_BROADSWORD = register("palladium_broadsword", new BroadswordItem(MythicToolMaterials.PALLADIUM, 13.5f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem PROMETHEUM_BROADSWORD = register("prometheum_broadsword", new BroadswordItem(MythicToolMaterials.PROMETHEUM, 14f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem QUADRILLUM_BROADSWORD = register("quadrillum_broadsword", new BroadswordItem(MythicToolMaterials.QUADRILLUM, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem RUNITE_BROADSWORD = register("runite_broadsword", new BroadswordItem(MythicToolMaterials.RUNITE, 13.2f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem STAR_PLATINUM_BROADSWORD = register("star_platinum_broadsword", new BroadswordItem(MythicToolMaterials.STAR_PLATINUM, 12.5f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem STEEL_BROADSWORD = register("steel_broadsword", new BroadswordItem(MythicToolMaterials.STEEL, 11f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem STORMYX_BROADSWORD = register("stormyx_broadsword", new BroadswordItem(MythicToolMaterials.STORMYX, 13f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));

    public static final KatanaItem ADAMANTITE_KATANA = register("adamantite_katana", new KatanaItem(MythicToolMaterials.ADAMANTITE, 10f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem AQUARIUM_KATANA = register("aquarium_katana", new KatanaItem(MythicToolMaterials.AQUARIUM, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem BANGLUM_KATANA = register("banglum_katana", new KatanaItem(MythicToolMaterials.BANGLUM, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem BRONZE_KATANA = register("bronze_katana", new KatanaItem(MythicToolMaterials.BRONZE, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem CARMOT_KATANA = register("carmot_katana", new KatanaItem(MythicToolMaterials.CARMOT, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem CELESTIUM_KATANA = register("celestium_katana", new KatanaItem(MythicToolMaterials.CELESTIUM, 11f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem COPPER_KATANA = register("copper_katana", new KatanaItem(MythicToolMaterials.COPPER, 6f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem DURASTEEL_KATANA = register("durasteel_katana", new KatanaItem(MythicToolMaterials.DURASTEEL, 8.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem HALLOWED_KATANA = register("hallowed_katana", new KatanaItem(MythicToolMaterials.HALLOWED, 10.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem KYBER_KATANA = register("kyber_katana", new KatanaItem(MythicToolMaterials.KYBER, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem METALLURGIUM_KATANA = register("metallurgium_katana", new KatanaItem(MythicToolMaterials.METALLURGIUM, 12f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem MYTHRIL_KATANA = register("mythril_katana", new KatanaItem(MythicToolMaterials.MYTHRIL, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem ORICHALCUM_KATANA = register("orichalcum_katana", new KatanaItem(MythicToolMaterials.ORICHALCUM, 9f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem OSMIUM_KATANA = register("osmium_katana", new KatanaItem(MythicToolMaterials.OSMIUM, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem PALLADIUM_KATANA = register("palladium_katana", new KatanaItem(MythicToolMaterials.PALLADIUM, 8.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem PROMETHEUM_KATANA = register("prometheum_katana", new KatanaItem(MythicToolMaterials.PROMETHEUM, 9f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem QUADRILLUM_KATANA = register("quadrillum_katana", new KatanaItem(MythicToolMaterials.QUADRILLUM, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem RUNITE_KATANA = register("runite_katana", new KatanaItem(MythicToolMaterials.RUNITE, 8.3f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem STAR_PLATINUM_KATANA = register("star_platinum_katana", new KatanaItem(MythicToolMaterials.STAR_PLATINUM, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem STEEL_KATANA = register("steel_katana", new KatanaItem(MythicToolMaterials.STEEL, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem STORMYX_KATANA = register("stormyx_katana", new KatanaItem(MythicToolMaterials.STORMYX, 8.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));

    public static final SpearItem ADAMANTITE_SPEAR = register("adamantite_spear", new SpearItem(MythicToolMaterials.ADAMANTITE, 9.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem AQUARIUM_SPEAR = register("aquarium_spear", new SpearItem(MythicToolMaterials.AQUARIUM, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem BANGLUM_SPEAR = register("banglum_spear", new SpearItem(MythicToolMaterials.BANGLUM, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem BRONZE_SPEAR = register("bronze_spear", new SpearItem(MythicToolMaterials.BRONZE, 6.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem CARMOT_SPEAR = register("carmot_spear", new SpearItem(MythicToolMaterials.CARMOT, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem CELESTIUM_SPEAR = register("celestium_spear", new SpearItem(MythicToolMaterials.CELESTIUM, 10.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem COPPER_SPEAR = register("copper_spear", new SpearItem(MythicToolMaterials.COPPER, 5.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem DURASTEEL_SPEAR = register("durasteel_spear", new SpearItem(MythicToolMaterials.DURASTEEL, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem HALLOWED_SPEAR = register("hallowed_spear", new SpearItem(MythicToolMaterials.HALLOWED, 9f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem KYBER_SPEAR = register("kyber_spear", new SpearItem(MythicToolMaterials.KYBER, 6.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem METALLURGIUM_SPEAR = register("metallurgium_spear", new SpearItem(MythicToolMaterials.METALLURGIUM, 11.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem MYTHRIL_SPEAR = register("mythril_spear", new SpearItem(MythicToolMaterials.MYTHRIL, 7f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem ORICHALCUM_SPEAR = register("orichalcum_spear", new SpearItem(MythicToolMaterials.ORICHALCUM, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem OSMIUM_SPEAR = register("osmium_spear", new SpearItem(MythicToolMaterials.OSMIUM, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem PALLADIUM_SPEAR = register("palladium_spear", new SpearItem(MythicToolMaterials.PALLADIUM, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem PROMETHEUM_SPEAR = register("prometheum_spear", new SpearItem(MythicToolMaterials.PROMETHEUM, 8f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem QUADRILLUM_SPEAR = register("quadrillum_spear", new SpearItem(MythicToolMaterials.QUADRILLUM, 6.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem RUNITE_SPEAR = register("runite_spear", new SpearItem(MythicToolMaterials.RUNITE, 7.3f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem STAR_PLATINUM_SPEAR = register("star_platinum_spear", new SpearItem(MythicToolMaterials.STAR_PLATINUM, 7.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem STEEL_SPEAR = register("steel_spear", new SpearItem(MythicToolMaterials.STEEL, 6.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem STORMYX_SPEAR = register("stormyx_spear", new SpearItem(MythicToolMaterials.STORMYX, 7.5f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));

    public static final CustomShieldItem ADAMANTITE_SHIELD = register("adamantite_shield", new CustomShieldItem(new Item.Settings().maxDamage(1424).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem AQUARIUM_SHIELD = register("aquarium_shield", new CustomShieldItem(new Item.Settings().maxDamage(790).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem BANGLUM_SHIELD = register("banglum_shield", new CustomShieldItem(new Item.Settings().maxDamage(770).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem BRONZE_SHIELD = register("bronze_shield", new CustomShieldItem(new Item.Settings().maxDamage(904).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem CARMOT_SHIELD = register("carmot_shield", new CustomShieldItem(new Item.Settings().maxDamage(1040).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem CELESTIUM_SHIELD = register("celestium_shield", new CustomShieldItem(new Item.Settings().maxDamage(2270).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem COPPER_SHIELD = register("copper_shield", new CustomShieldItem(new Item.Settings().maxDamage(385).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem DURASTEEL_SHIELD = register("durasteel_shield", new CustomShieldItem(new Item.Settings().maxDamage(1090).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem HALLOWED_SHIELD = register("hallowed_shield", new CustomShieldItem(new Item.Settings().maxDamage(1665).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem KYBER_SHIELD = register("kyber_shield", new CustomShieldItem(new Item.Settings().maxDamage(1119).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem METALLURGIUM_SHIELD = register("metallurgium_shield", new CustomShieldItem(new Item.Settings().maxDamage(3000).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem MYTHRIL_SHIELD = register("mythril_shield", new CustomShieldItem(new Item.Settings().maxDamage(1204).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem ORICHALCUM_SHIELD = register("orichalcum_shield", new CustomShieldItem(new Item.Settings().maxDamage(2048).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem OSMIUM_SHIELD = register("osmium_shield", new CustomShieldItem(new Item.Settings().maxDamage(824).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem PALLADIUM_SHIELD = register("palladium_shield", new CustomShieldItem(new Item.Settings().maxDamage(1404).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem PROMETHEUM_SHIELD = register("prometheum_shield", new CustomShieldItem(new Item.Settings().maxDamage(1772).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem QUADRILLUM_SHIELD = register("quadrillum_shield", new CustomShieldItem(new Item.Settings().maxDamage(804).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem RUNITE_SHIELD = register("runite_shield", new CustomShieldItem(new Item.Settings().maxDamage(1507).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem STAR_PLATINUM_SHIELD = register("star_platinum_shield", new CustomShieldItem(new Item.Settings().maxDamage(1450).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem STEEL_SHIELD = register("steel_shield", new CustomShieldItem(new Item.Settings().maxDamage(980).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem STORMYX_SHIELD = register("stormyx_shield", new CustomShieldItem(new Item.Settings().maxDamage(1485).group(GateOfBabylon.GROUP)));

    private static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, new Identifier(MythicGate.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering mod items for" + MythicGate.MOD_ID);
    }
}
