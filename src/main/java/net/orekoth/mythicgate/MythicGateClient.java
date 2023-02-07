package net.orekoth.mythicgate;

import draylar.gateofbabylon.impl.client.ShieldUsePredicate;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.orekoth.mythicgate.item.MythicItems;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class MythicGateClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricModelPredicateProviderRegistry.register(MythicItems.ADAMANTITE_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.AQUARIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.BANGLUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.BRONZE_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.CARMOT_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.CELESTIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.COPPER_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.DURASTEEL_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.HALLOWED_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.KYBER_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.METALLURGIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.MYTHRIL_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.ORICHALCUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.OSMIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.PALLADIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.PROMETHEUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.QUADRILLUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.RUNITE_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.STAR_PLATINUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.STEEL_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        FabricModelPredicateProviderRegistry.register(MythicItems.STORMYX_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
    }
}