package com.lozangocomz.simpleblockphysicsxsable.mixin;

import dev.ryanhcode.sable.Sable;
import io.github.ferrinember.simpleblockphysics.utils.TickHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(TickHandler.class)
public class TickHandlerMixin {

    @Inject(
            method = "checkBreak",
            at = @At("HEAD"),
            cancellable = true
    )
    private void examplemod$cancelBreakInSubLevel(
            BlockPos pos,
            Level level,
            Integer generation,
            CallbackInfo ci
    ) {
        if (Sable.HELPER.getContaining(level, pos) != null) {
            ci.cancel();
        }
    }

    @Inject(
            method = "checkWeight",
            at = @At("HEAD"),
            cancellable = true
    )
    private void examplemod$cancelWeightInSubLevel(
            BlockPos pos,
            Level level,
            Integer weight,
            CallbackInfo ci
    ) {
        if (Sable.HELPER.getContaining(level, pos) != null) {
            ci.cancel();
        }
    }
}