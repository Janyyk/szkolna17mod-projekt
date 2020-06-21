
package net.aurora.szkolna17.item;

@Szkolna17ModElements.ModElement.Tag
public class AzbestToolAxeItem extends Szkolna17ModElements.ModElement {

	@ObjectHolder("szkolna17:azbest_tool_axe")
	public static final Item block = null;

	public AzbestToolAxeItem(Szkolna17ModElements instance) {
		super(instance, 107);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("azbest_tool_axe"));
	}

}
