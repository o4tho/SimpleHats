package fonnymunkey.simplehats.loot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;

public abstract class LootRegistry {

	public static final List<ResourceKey<LootTable>> LOOT_HATINJECT_CHEST = Arrays.asList(
			BuiltInLootTables.ABANDONED_MINESHAFT,
			BuiltInLootTables.NETHER_BRIDGE,
			BuiltInLootTables.STRONGHOLD_LIBRARY,
			BuiltInLootTables.DESERT_PYRAMID,
			BuiltInLootTables.JUNGLE_TEMPLE,
			BuiltInLootTables.WOODLAND_MANSION,
			BuiltInLootTables.BURIED_TREASURE,
			BuiltInLootTables.SHIPWRECK_TREASURE,
			BuiltInLootTables.PILLAGER_OUTPOST,
			BuiltInLootTables.SPAWN_BONUS_CHEST,
			BuiltInLootTables.END_CITY_TREASURE,
			BuiltInLootTables.SIMPLE_DUNGEON,
			BuiltInLootTables.VILLAGE_ARMORER,
			BuiltInLootTables.VILLAGE_TEMPLE,
			BuiltInLootTables.PILLAGER_OUTPOST,
			BuiltInLootTables.BASTION_TREASURE
	);
	
	public static final List<ResourceKey<LootTable>> LOOT_HATINJECT_ENTITY = Stream.of(
			EntityTypes.BLAZE.getDefaultLootTable(),
			EntityTypes.CAVE_SPIDER.getDefaultLootTable(),
			EntityTypes.CREEPER.getDefaultLootTable(),
			EntityTypes.DROWNED.getDefaultLootTable(),
			EntityTypes.ELDER_GUARDIAN.getDefaultLootTable(),
			EntityTypes.ENDERMAN.getDefaultLootTable(),
			EntityTypes.EVOKER.getDefaultLootTable(),
			EntityTypes.GHAST.getDefaultLootTable(),
			EntityTypes.GUARDIAN.getDefaultLootTable(),
			EntityTypes.HUSK.getDefaultLootTable(),
			EntityTypes.RAVAGER.getDefaultLootTable(),
			EntityTypes.ILLUSIONER.getDefaultLootTable(),
			EntityTypes.PHANTOM.getDefaultLootTable(),
			EntityTypes.PILLAGER.getDefaultLootTable(),
			EntityTypes.SKELETON.getDefaultLootTable(),
			EntityTypes.SPIDER.getDefaultLootTable(),
			EntityTypes.STRAY.getDefaultLootTable(),
			EntityTypes.VINDICATOR.getDefaultLootTable(),
			EntityTypes.WITCH.getDefaultLootTable(),
			EntityTypes.WITHER_SKELETON.getDefaultLootTable(),
			EntityTypes.ZOGLIN.getDefaultLootTable(),
			EntityTypes.ZOMBIE.getDefaultLootTable(),
			EntityTypes.ZOMBIFIED_PIGLIN.getDefaultLootTable(),
			EntityTypes.HOGLIN.getDefaultLootTable(),
			EntityTypes.ZOMBIE_VILLAGER.getDefaultLootTable()
	)
		.filter(Optional::isPresent)
		.map(Optional::orElseThrow)
		.toList();
}
