package net.orekoth.mythicgate;

import draylar.gateofbabylon.impl.client.ShieldUsePredicate;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.orekoth.mythicgate.item.MythicItems;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class MythicGateClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelPredicateProviderRegistry.register(MythicItems.ADAMANTITE_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.AQUARIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.BANGLUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.BRONZE_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.CARMOT_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.CELESTIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.COPPER_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.DURASTEEL_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.HALLOWED_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.KYBER_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.METALLURGIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.MYTHRIL_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.ORICHALCUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.OSMIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.PALLADIUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.PROMETHEUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.QUADRILLUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.RUNITE_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.STAR_PLATINUM_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.STEEL_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
        ModelPredicateProviderRegistry.register(MythicItems.STORMYX_SHIELD, new Identifier("blocking"), new ShieldUsePredicate());
    }
}