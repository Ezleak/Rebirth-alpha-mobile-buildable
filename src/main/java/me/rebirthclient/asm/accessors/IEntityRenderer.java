package me.rebirthclient.asm.accessors;

import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={EntityRenderer.class})
public interface IEntityRenderer {
    @Invoker(value="setupCameraTransform")
    public void invokeSetupCameraTransform(float var1, int var2);

    @Invoker(value="renderHand")
    public void invokeRenderHand(float var1, int var2);
}

