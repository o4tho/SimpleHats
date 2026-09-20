package fonnymunkey.simplehats.loot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;

public abstract class LootRegistry {

	public static final List<Identifier> LOOT_HATINJECT_CHEST = Arrays.asList(
			BuiltInLootTables.ABANDONED_MINESHAFT.identifier(),
			BuiltInLootTables.NETHER_BRIDGE.identifier(),
			BuiltInLootTables.STRONGHOLD_LIBRARY.identifier(),
			BuiltInLootTables.DESERT_PYRAMID.identifier(),
			BuiltInLootTables.JUNGLE_TEMPLE.identifier(),
			BuiltInLootTables.WOODLAND_MANSION.identifier(),
			BuiltInLootTables.BURIED_TREASURE.identifier(),
			BuiltInLootTables.SHIPWRECK_TREASURE.identifier(),
			BuiltInLootTables.PILLAGER_OUTPOST.identifier(),
			BuiltInLootTables.SPAWN_BONUS_CHEST.identifier(),
			BuiltInLootTables.END_CITY_TREASURE.identifier(),
			BuiltInLootTables.SIMPLE_DUNGEON.identifier(),
			BuiltInLootTables.VILLAGE_ARMORER.identifier(),
			BuiltInLootTables.VILLAGE_TEMPLE.identifier(),
			BuiltInLootTables.PILLAGER_OUTPOST.identifier(),
			BuiltInLootTables.BASTION_TREASURE.identifier()
	);
	
	public static final List<Identifier> LOOT_HATINJECT_ENTITY = Stream.of(
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
		.map(ResourceKey::identifier)
		.toList();
}