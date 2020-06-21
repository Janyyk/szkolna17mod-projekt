package net.aurora.szkolna17.procedures;

@Szkolna17ModElements.ModElement.Tag
public class LiscieNitroBlockDestroyedByPlayerProcedure extends Szkolna17ModElements.ModElement {

	public LiscieNitroBlockDestroyedByPlayerProcedure(Szkolna17ModElements instance) {
		super(instance, 106);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LiscieNitroBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LiscieNitroBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LiscieNitroBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LiscieNitroBlockDestroyedByPlayer!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		if ((Math.random() <= 10)) {
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(NasionoNitroItem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}

	}

}
