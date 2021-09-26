// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelzombie extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer head;
	private final ModelRenderer hat_r1;
	private final ModelRenderer head_r1;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm_r1;
	private final ModelRenderer rightItem;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer leftLeg;

	public Modelzombie() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(15.0F, 0.0F, -20.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-15.0F, 8.0F, 17.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.3927F, 0.0F, 0.0F);
		body_r1.setTextureOffset(16, 16).addBox(-4.0F, -8.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);

		hat_r1 = new ModelRenderer(this);
		hat_r1.setRotationPoint(-15.0F, 8.0F, 17.0F);
		head.addChild(hat_r1);
		setRotationAngle(hat_r1, 0.3927F, 0.0F, 0.0F);
		hat_r1.setTextureOffset(32, 0).addBox(-4.0F, -15.5F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-15.0F, 8.0F, 17.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.7854F, 0.0F, 0.0F);
		head_r1.setTextureOffset(0, 0).addBox(-4.0F, -15.0F, -1.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		body.addChild(rightArm);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setRotationPoint(-10.0F, 6.0F, 17.0F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, -0.3927F, 0.0F, 0.0F);
		rightArm_r1.setTextureOffset(0, 32).addBox(-8.0F, -7.0F, -6.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightItem = new ModelRenderer(this);
		rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
		rightArm.addChild(rightItem);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		body.addChild(leftArm);
		leftArm.setTextureOffset(40, 16).addBox(-16.0F, -2.0F, 12.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		body.addChild(rightLeg);

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setRotationPoint(-13.1F, -4.0F, 17.0F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, 0.3927F, 0.0F, 0.0F);
		rightLeg_r1.setTextureOffset(0, 16).addBox(-3.9F, 4.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		body.addChild(leftLeg);
		leftLeg.setTextureOffset(0, 16).addBox(-17.0F, 0.0F, 17.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}