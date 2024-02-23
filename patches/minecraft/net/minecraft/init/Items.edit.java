
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 3  @  2 : 3

~ import net.eaglerforge.api.ModData;

> CHANGE  12 : 13  @  12 : 200

~ import java.util.Map;

> INSERT  1 : 190  @  1

+ public class Items extends ModData {
+ 	public static Item iron_shovel;
+ 	public static Item iron_pickaxe;
+ 	public static Item iron_axe;
+ 	public static Item flint_and_steel;
+ 	public static Item apple;
+ 	public static ItemBow bow;
+ 	public static Item arrow;
+ 	public static Item coal;
+ 	public static Item diamond;
+ 	public static Item iron_ingot;
+ 	public static Item gold_ingot;
+ 	public static Item iron_sword;
+ 	public static Item wooden_sword;
+ 	public static Item wooden_shovel;
+ 	public static Item wooden_pickaxe;
+ 	public static Item wooden_axe;
+ 	public static Item stone_sword;
+ 	public static Item stone_shovel;
+ 	public static Item stone_pickaxe;
+ 	public static Item stone_axe;
+ 	public static Item diamond_sword;
+ 	public static Item diamond_shovel;
+ 	public static Item diamond_pickaxe;
+ 	public static Item diamond_axe;
+ 	public static Item stick;
+ 	public static Item bowl;
+ 	public static Item mushroom_stew;
+ 	public static Item golden_sword;
+ 	public static Item golden_shovel;
+ 	public static Item golden_pickaxe;
+ 	public static Item golden_axe;
+ 	public static Item string;
+ 	public static Item feather;
+ 	public static Item gunpowder;
+ 	public static Item wooden_hoe;
+ 	public static Item stone_hoe;
+ 	public static Item iron_hoe;
+ 	public static Item diamond_hoe;
+ 	public static Item golden_hoe;
+ 	public static Item wheat_seeds;
+ 	public static Item wheat;
+ 	public static Item bread;
+ 	public static ItemArmor leather_helmet;
+ 	public static ItemArmor leather_chestplate;
+ 	public static ItemArmor leather_leggings;
+ 	public static ItemArmor leather_boots;
+ 	public static ItemArmor chainmail_helmet;
+ 	public static ItemArmor chainmail_chestplate;
+ 	public static ItemArmor chainmail_leggings;
+ 	public static ItemArmor chainmail_boots;
+ 	public static ItemArmor iron_helmet;
+ 	public static ItemArmor iron_chestplate;
+ 	public static ItemArmor iron_leggings;
+ 	public static ItemArmor iron_boots;
+ 	public static ItemArmor diamond_helmet;
+ 	public static ItemArmor diamond_chestplate;
+ 	public static ItemArmor diamond_leggings;
+ 	public static ItemArmor diamond_boots;
+ 	public static ItemArmor golden_helmet;
+ 	public static ItemArmor golden_chestplate;
+ 	public static ItemArmor golden_leggings;
+ 	public static ItemArmor golden_boots;
+ 	public static Item flint;
+ 	public static Item porkchop;
+ 	public static Item cooked_porkchop;
+ 	public static Item painting;
+ 	public static Item golden_apple;
+ 	public static Item sign;
+ 	public static Item oak_door;
+ 	public static Item spruce_door;
+ 	public static Item birch_door;
+ 	public static Item jungle_door;
+ 	public static Item acacia_door;
+ 	public static Item dark_oak_door;
+ 	public static Item bucket;
+ 	public static Item water_bucket;
+ 	public static Item lava_bucket;
+ 	public static Item minecart;
+ 	public static Item saddle;
+ 	public static Item iron_door;
+ 	public static Item redstone;
+ 	public static Item snowball;
+ 	public static Item boat;
+ 	public static Item leather;
+ 	public static Item milk_bucket;
+ 	public static Item brick;
+ 	public static Item clay_ball;
+ 	public static Item reeds;
+ 	public static Item paper;
+ 	public static Item book;
+ 	public static Item slime_ball;
+ 	public static Item chest_minecart;
+ 	public static Item furnace_minecart;
+ 	public static Item egg;
+ 	public static Item compass;
+ 	public static ItemFishingRod fishing_rod;
+ 	public static Item clock;
+ 	public static Item glowstone_dust;
+ 	public static Item fish;
+ 	public static Item cooked_fish;
+ 	public static Item dye;
+ 	public static Item bone;
+ 	public static Item sugar;
+ 	public static Item cake;
+ 	public static Item bed;
+ 	public static Item repeater;
+ 	public static Item cookie;
+ 	public static ItemMap filled_map;
+ 	public static ItemShears shears;
+ 	public static Item melon;
+ 	public static Item pumpkin_seeds;
+ 	public static Item melon_seeds;
+ 	public static Item beef;
+ 	public static Item cooked_beef;
+ 	public static Item chicken;
+ 	public static Item cooked_chicken;
+ 	public static Item mutton;
+ 	public static Item cooked_mutton;
+ 	public static Item rabbit;
+ 	public static Item cooked_rabbit;
+ 	public static Item rabbit_stew;
+ 	public static Item rabbit_foot;
+ 	public static Item rabbit_hide;
+ 	public static Item rotten_flesh;
+ 	public static Item ender_pearl;
+ 	public static Item blaze_rod;
+ 	public static Item ghast_tear;
+ 	public static Item gold_nugget;
+ 	public static Item nether_wart;
+ 	public static ItemPotion potionitem;
+ 	public static Item glass_bottle;
+ 	public static Item spider_eye;
+ 	public static Item fermented_spider_eye;
+ 	public static Item blaze_powder;
+ 	public static Item magma_cream;
+ 	public static Item brewing_stand;
+ 	public static Item cauldron;
+ 	public static Item ender_eye;
+ 	public static Item speckled_melon;
+ 	public static Item spawn_egg;
+ 	public static Item experience_bottle;
+ 	public static Item fire_charge;
+ 	public static Item writable_book;
+ 	public static Item written_book;
+ 	public static Item emerald;
+ 	public static Item item_frame;
+ 	public static Item flower_pot;
+ 	public static Item carrot;
+ 	public static Item potato;
+ 	public static Item baked_potato;
+ 	public static Item poisonous_potato;
+ 	public static ItemEmptyMap map;
+ 	public static Item golden_carrot;
+ 	public static Item skull;
+ 	public static Item carrot_on_a_stick;
+ 	public static Item nether_star;
+ 	public static Item pumpkin_pie;
+ 	public static Item fireworks;
+ 	public static Item firework_charge;
+ 	public static ItemEnchantedBook enchanted_book;
+ 	public static Item comparator;
+ 	public static Item netherbrick;
+ 	public static Item quartz;
+ 	public static Item tnt_minecart;
+ 	public static Item hopper_minecart;
+ 	public static ItemArmorStand armor_stand;
+ 	public static Item iron_horse_armor;
+ 	public static Item golden_horse_armor;
+ 	public static Item diamond_horse_armor;
+ 	public static Item lead;
+ 	public static Item name_tag;
+ 	public static Item command_block_minecart;
+ 	public static Item record_13;
+ 	public static Item record_cat;
+ 	public static Item record_blocks;
+ 	public static Item record_chirp;
+ 	public static Item record_far;
+ 	public static Item record_mall;
+ 	public static Item record_mellohi;
+ 	public static Item record_stal;
+ 	public static Item record_strad;
+ 	public static Item record_ward;
+ 	public static Item record_11;
+ 	public static Item record_wait;
+ 	public static Item prismarine_shard;
+ 	public static Item prismarine_crystals;
+ 	public static Item banner;
+ 

> CHANGE  4 : 16  @  4 : 5

~ 	public static ModData makeModData() {
~ 		ModData data = new ModData();
~ 		Map<ResourceLocation, Item> itemMap = Item.itemRegistry.registryObjects;
~ 		for (Map.Entry<ResourceLocation, Item> entry : itemMap.entrySet()) {
~ 			if (entry.getKey().resourceName != null && entry.getValue() != null) {
~ 				data.set(entry.getKey().resourceName, entry.getValue().makeModData());
~ 			}
~ 		}
~ 		return data;
~ 	}
~ 
~ 	static void doBootstrap() {

> EOF
