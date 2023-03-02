package net.orekoth.mythicgate.mixin;

import net.orekoth.mythicgate.MythicGate;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MythicGateMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		//MythicGate.LOGGER.info("[Mythic Gate] [IN] MythicGateMixin.init()");
	}
}
