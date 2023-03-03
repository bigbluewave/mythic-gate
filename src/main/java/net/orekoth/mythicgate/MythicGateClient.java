package net.orekoth.mythicgate;

import draylar.gateofbabylon.impl.client.ShieldUsePredicate;
import draylar.gateofbabylon.item.CustomBowItem;
import draylar.gateofbabylon.impl.client.BowPullPredicate;
import draylar.gateofbabylon.impl.client.BowPullingPredicate;
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
        registerBowPredicates(MythicItems.ADAMANTITE_BOW);
        registerBowPredicates(MythicItems.AQUARIUM_BOW);
        registerBowPredicates(MythicItems.BANGLUM_BOW);
        registerBowPredicates(MythicItems.BRONZE_BOW);
        registerBowPredicates(MythicItems.CARMOT_BOW);
        registerBowPredicates(MythicItems.CELESTIUM_BOW);
        registerBowPredicates(MythicItems.COPPER_BOW);
        registerBowPredicates(MythicItems.DURASTEEL_BOW);
        registerBowPredicates(MythicItems.HALLOWED_BOW);
        registerBowPredicates(MythicItems.KYBER_BOW);
        registerBowPredicates(MythicItems.METALLURGIUM_BOW);
        registerBowPredicates(MythicItems.MYTHRIL_BOW);
        registerBowPredicates(MythicItems.ORICHALCUM_BOW);
        registerBowPredicates(MythicItems.OSMIUM_BOW);
        registerBowPredicates(MythicItems.PALLADIUM_BOW);
        registerBowPredicates(MythicItems.PROMETHEUM_BOW);
        registerBowPredicates(MythicItems.QUADRILLUM_BOW);
        registerBowPredicates(MythicItems.RUNITE_BOW);
        registerBowPredicates(MythicItems.STAR_PLATINUM_BOW);
        registerBowPredicates(MythicItems.STEEL_BOW);
        registerBowPredicates(MythicItems.STORMYX_BOW);

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

    public static void registerBowPredicates(CustomBowItem bow) {
        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pull"), new BowPullPredicate(bow));
        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pulling"), new BowPullingPredicate());
    }
}