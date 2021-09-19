package net.mcreator.testestsetest.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.testestsetest.entity.SliimeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SliimeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SliimeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelslime(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("testestsetest:textures/sdfghjkl.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelslime extends EntityModel<Entity> {
		private final ModelRenderer inner;
		private final ModelRenderer outer;
		public Modelslime() {
			textureWidth = 64;
			textureHeight = 32;
			inner = new ModelRenderer(this);
			inner.setRotationPoint(0.0F, 0.0F, 0.0F);
			inner.setTextureOffset(0, 16).addBox(-3.0F, 17.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			inner.setTextureOffset(32, 0).addBox(-3.3F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			inner.setTextureOffset(32, 4).addBox(1.3F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			inner.setTextureOffset(32, 8).addBox(-0.5F, 20.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			inner.setTextureOffset(32, 8).addBox(-1.0F, 20.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			inner.setTextureOffset(32, 8).addBox(-1.5F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			inner.setTextureOffset(32, 8).addBox(0.5F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			inner.setTextureOffset(32, 8).addBox(1.0F, 20.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			inner.setTextureOffset(32, 8).addBox(-2.0F, 20.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			outer = new ModelRenderer(this);
			outer.setRotationPoint(0.0F, 0.0F, 0.0F);
			outer.setTextureOffset(0, 0).addBox(-4.0F, 16.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			outer.setTextureOffset(32, 0).addBox(-3.3F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			outer.setTextureOffset(32, 4).addBox(1.3F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			outer.setTextureOffset(32, 8).addBox(0.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			inner.render(matrixStack, buffer, packedLight, packedOverlay);
			outer.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.outer.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.outer.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.inner.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.inner.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
