
package net.aurora.szkolna17.item;

@Szkolna17ModElements.ModElement.Tag
public class AzbestToolSwordItem extends Szkolna17ModElements.ModElement {

	@ObjectHolder("szkolna17:azbest_tool_sword")
	public static final Item block = null;

	public AzbestToolSwordItem(Szkolna17ModElements instance) {
		super(instance, 108);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("azbest_tool_sword"));
	}

}
