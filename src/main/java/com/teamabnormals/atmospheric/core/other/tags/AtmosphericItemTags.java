package com.teamabnormals.atmospheric.core.other.tags;

import com.teamabnormals.atmospheric.core.Atmospheric;
import com.teamabnormals.blueprint.core.util.TagUtil;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class AtmosphericItemTags {
	public static final TagKey<Item> ROSEWOOD_LOGS = itemTag("rosewood_logs");
	public static final TagKey<Item> MORADO_LOGS = itemTag("morado_logs");
	public static final TagKey<Item> YUCCA_LOGS = itemTag("yucca_logs");
	public static final TagKey<Item> ASPEN_LOGS = itemTag("aspen_logs");
	public static final TagKey<Item> KOUSA_LOGS = itemTag("kousa_logs");
	public static final TagKey<Item> GRIMWOOD_LOGS = itemTag("grimwood_logs");
	public static final TagKey<Item> LAUREL_LOGS = itemTag("laurel_logs");

	public static final TagKey<Item> MONKEY_BRUSH = itemTag("monkey_brush");
	public static final TagKey<Item> TRAVERTINE = itemTag("travertine");
	public static final TagKey<Item> FRUITS = TagUtil.itemTag("forge", "fruits");
	public static final TagKey<Item> FRUITS_PASSION_FRUIT = TagUtil.itemTag("forge", "fruits/passion_fruit");
	public static final TagKey<Item> FRUITS_CURRANT = TagUtil.itemTag("forge", "fruits/currant");
	public static final TagKey<Item> FRUITS_DRAGON_FRUIT = TagUtil.itemTag("forge", "fruits/dragon_fruit");
	public static final TagKey<Item> FRUITS_ORANGE = TagUtil.itemTag("forge", "fruits/orange");
	public static final TagKey<Item> SEEDS_ALOE_VERA = TagUtil.itemTag("forge", "seeds/aloe_vera");

	public static final TagKey<Item> COCHINEAL_FOOD = itemTag("cochineal_food");
	public static final TagKey<Item> COCHINEAL_BREEDING_FOOD = itemTag("cochineal_breeding_food");

	private static TagKey<Item> itemTag(String name) {
		return TagUtil.itemTag(Atmospheric.MOD_ID, name);
	}
}
