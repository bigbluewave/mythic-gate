package net.orekoth.mythicgate.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ItemCooldownManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.orekoth.mythicgate.item.MythicItems;

@Mixin(PlayerEntity.class)
public abstract class MGPlayerEntityMixin {
    @Shadow public abstract ItemCooldownManager getItemCooldownManager();

    @Inject(
            method = "disableShield",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/ItemCooldownManager;set(Lnet/minecraft/item/Item;I)V")
    )
    public void disableShield(boolean sprinting, CallbackInfo ci) {
        this.getItemCooldownManager().set(MythicItems.ADAMANTITE_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.AQUARIUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.BANGLUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.BRONZE_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.CARMOT_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.CELESTIUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.COPPER_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.DURASTEEL_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.HALLOWED_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.KYBER_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.METALLURGIUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.MYTHRIL_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.ORICHALCUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.OSMIUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.PALLADIUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.PROMETHEUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.QUADRILLUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.RUNITE_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.STAR_PLATINUM_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.STEEL_SHIELD, 100);
        this.getItemCooldownManager().set(MythicItems.STORMYX_SHIELD, 100);
    }
}
