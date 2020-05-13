package minestrapp.crafting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;

import minestrapp.MBlocks;
import minestrapp.MItems;
import minestrapp.block.BlockMGlowDyed;
import minestrapp.block.EnumStoneTypeMOnly;
import net.minecraft.block.BlockPlanks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CrusherRecipes {
	private static final CrusherRecipes CRUSHING = new CrusherRecipes();
	public final Map<ItemStack, ItemStack> crushing = Maps.<ItemStack, ItemStack>newHashMap();
	public final Map<ItemStack, ItemStack> extra = Maps.<ItemStack, ItemStack>newHashMap();
	public final Map<ItemStack, Integer> chance = Maps.<ItemStack, Integer>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

	public static CrusherRecipes instance() {
		return CRUSHING;
	}
	
	private CrusherRecipes() {
		//Input, Result, Extra, Chance, Exp
		//Plants
		this.addCrusherRecipe(new ItemStack(Blocks.DEADBUSH), new ItemStack(Items.STICK, 4), new ItemStack(Items.STICK), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.TALLGRASS, 1, 1), new ItemStack(MItems.natural_ingredients, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.savanna_grass), new ItemStack(MItems.natural_ingredients, 1, 0), new ItemStack(MItems.natural_ingredients, 1, 0), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.YELLOW_FLOWER), new ItemStack(Items.DYE, 2, EnumDyeColor.YELLOW.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.YELLOW.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_FLOWER, 1, 0), new ItemStack(Items.DYE, 2, EnumDyeColor.RED.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.RED.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_FLOWER, 1, 1), new ItemStack(Items.DYE, 2, EnumDyeColor.LIGHT_BLUE.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.LIGHT_BLUE.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_FLOWER, 1, 2), new ItemStack(Items.DYE, 2, EnumDyeColor.MAGENTA.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.MAGENTA.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_FLOWER, 1, 3), new ItemStack(Items.DYE, 2, EnumDyeColor.SILVER.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.SILVER.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_FLOWER, 1, 4), new ItemStack(Items.DYE, 2, EnumDyeColor.RED.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.RED.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_FLOWER, 1, 5), new ItemStack(Items.DYE, 2, EnumDyeColor.ORANGE.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.ORANGE.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_FLOWER, 1, 6), new ItemStack(Items.DYE, 2, EnumDyeColor.SILVER.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.SILVER.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_FLOWER, 1, 7), new ItemStack(Items.DYE, 2, EnumDyeColor.PINK.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.PINK.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_FLOWER, 1, 8), new ItemStack(Items.DYE, 2, EnumDyeColor.SILVER.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.SILVER.getDyeDamage()), 35, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.DOUBLE_PLANT, 1, 0), new ItemStack(Items.DYE, 3, EnumDyeColor.YELLOW.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.YELLOW.getDyeDamage()), 55, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.DOUBLE_PLANT, 1, 1), new ItemStack(Items.DYE, 3, EnumDyeColor.MAGENTA.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.MAGENTA.getDyeDamage()), 55, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.DOUBLE_PLANT, 1, 4), new ItemStack(Items.DYE, 3, EnumDyeColor.RED.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.RED.getDyeDamage()), 55, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.DOUBLE_PLANT, 1, 5), new ItemStack(Items.DYE, 3, EnumDyeColor.PINK.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.PINK.getDyeDamage()), 55, 0.1F);
		this.addCrusherRecipe(new ItemStack(Items.REEDS), new ItemStack(Items.PAPER, 2), new ItemStack(Items.SUGAR), 35, 0.15F);
		this.addCrusherRecipe(new ItemStack(Blocks.CACTUS), new ItemStack(Items.DYE, 3, EnumDyeColor.GREEN.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.GREEN.getDyeDamage()), 15, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.MELON_BLOCK), new ItemStack(Items.MELON, 7), new ItemStack(Items.MELON_SEEDS), 65, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.melon_bricks), new ItemStack(Items.MELON, 7), new ItemStack(Items.MELON_SEEDS), 65, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.PUMPKIN), new ItemStack(Items.PUMPKIN_SEEDS, 8), new ItemStack(Items.PUMPKIN_SEEDS), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.LIT_PUMPKIN), new ItemStack(Items.PUMPKIN_SEEDS, 8), new ItemStack(MItems.dye, 1, 8), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.purple_glowshroom), new ItemStack(MItems.dye, 2, 8), new ItemStack(MItems.dye, 1, 8), 20, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.green_glowshroom), new ItemStack(MItems.dye, 2, 5), new ItemStack(MItems.dye, 1, 5), 20, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.blue_glowshroom), new ItemStack(MItems.dye, 2, 6), new ItemStack(MItems.dye, 1, 6), 20, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_MUSHROOM_BLOCK), new ItemStack(Blocks.RED_MUSHROOM), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.BROWN_MUSHROOM_BLOCK), new ItemStack(Blocks.BROWN_MUSHROOM), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.blue_glowshroom_block), new ItemStack(MBlocks.blue_glowshroom), new ItemStack(MItems.dye, 1, 6), 50, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.green_glowshroom_block), new ItemStack(MBlocks.green_glowshroom), new ItemStack(MItems.dye, 1, 5), 50, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.purple_glowshroom_block), new ItemStack(MBlocks.purple_glowshroom), new ItemStack(MItems.dye, 1, 8), 50, 0.1F);
		for(int i = 0 ; i < BlockPlanks.EnumType.values().length ; i++)
		{
			this.addCrusherRecipe(new ItemStack(Blocks.SAPLING, 1, i), new ItemStack(Items.STICK, 5), new ItemStack(Items.STICK), 60, 0.05F);
		}
		this.addCrusherRecipe(new ItemStack(MBlocks.blueberry_bush), new ItemStack(Items.STICK, 5), new ItemStack(Items.STICK), 60, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.strawberry_bush), new ItemStack(Items.STICK, 5), new ItemStack(Items.STICK), 60, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.blackberry_bush), new ItemStack(Items.STICK, 5), new ItemStack(Items.STICK), 60, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.raspberry_bush), new ItemStack(Items.STICK, 5), new ItemStack(Items.STICK), 60, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mana_bush), new ItemStack(Items.STICK, 5), new ItemStack(Items.STICK), 60, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.voidberry_bush), new ItemStack(Items.STICK, 5), new ItemStack(Items.STICK), 60, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.carpet_glow_moss), new ItemStack(MItems.dye, 1, 1), new ItemStack(MItems.dye, 1, 1), 20, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.creeping_glow_moss), new ItemStack(MItems.dye, 1, 7), new ItemStack(MItems.dye, 1, 7), 20, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.hanging_glow_moss), new ItemStack(MItems.dye, 1, 4), new ItemStack(MItems.dye, 1, 4), 20, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.clutchthorn), new ItemStack(MItems.natural_ingredients, 1, 2), new ItemStack(MItems.dye, 1, 0), 10, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.CHORUS_FLOWER), new ItemStack(MItems.dye, 3, 8), new ItemStack(MItems.dye, 1, 0), 25, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mite_hive), new ItemStack(MItems.mite_honey), new ItemStack(MItems.mite_honey), 20, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mite_comb), new ItemStack(MItems.mite_honey), new ItemStack(MItems.mite_honey), 20, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mite_hive_honeyed), new ItemStack(MItems.mite_honey, 2), new ItemStack(MItems.mite_honey), 50, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.honeycomb_bronze), new ItemStack(MItems.mite_honey), new ItemStack(MItems.nuggets, 3, 2), 80, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.honeycomb_steel), new ItemStack(MItems.mite_honey), new ItemStack(MItems.nuggets, 3, 3), 80, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.honeycomb_meurodite), new ItemStack(MItems.mite_honey), new ItemStack(MItems.gems, 1, 4), 20, 0.15F);
		
		//Soil
		this.addCrusherRecipe(new ItemStack(Blocks.DIRT, 1, 1), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.FLINT), 12, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.DIRT, 1, 2), new ItemStack(Blocks.DIRT, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.GRASS), new ItemStack(Blocks.DIRT, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.MYCELIUM), new ItemStack(Blocks.DIRT, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.GRASS_PATH), new ItemStack(Blocks.DIRT, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.FARMLAND), new ItemStack(Blocks.DIRT, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.clay_soil, 1, 0), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.CLAY_BALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.clay_soil, 1, 1), new ItemStack(MBlocks.clay_soil, 1, 0), new ItemStack(Items.FLINT), 12, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.clay_soil, 1, 2), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.CLAY_BALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.clay_grass), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.CLAY_BALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.clay_grass_path), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.CLAY_BALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.permafrost, 1, 0), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.SNOWBALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.permafrost, 1, 1), new ItemStack(MBlocks.permafrost, 1, 0), new ItemStack(Items.FLINT), 12, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.permafrost, 1, 2), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.SNOWBALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.lichen), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.SNOWBALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.lichen_path), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.SNOWBALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.permafrost_farmland), new ItemStack(Blocks.DIRT, 1, 0), new ItemStack(Items.SNOWBALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cold_sand, 1, 0), new ItemStack(Blocks.SAND, 1, 0), new ItemStack(Items.SNOWBALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cold_sand, 1, 1), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.SNOWBALL), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mud), new ItemStack(MItems.mud_ball, 4), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.dried_mud), new ItemStack(Blocks.SAND, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.CLAY), new ItemStack(Items.CLAY_BALL, 4), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.GRAVEL), new ItemStack(Blocks.SAND, 1, 0), new ItemStack(Items.FLINT), 12, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.portal_dust, 1, 0), new ItemStack(MBlocks.portal_dust, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.portal_dust, 1, 2), new ItemStack(MBlocks.portal_dust, 1, 0), new ItemStack(Items.CHORUS_FRUIT), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.fargrowth), new ItemStack(MBlocks.portal_dust, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.fargrowth_path), new ItemStack(MBlocks.portal_dust, 1, 0), null, 0, 0.05F);
		
		//Snow & Ice
		this.addCrusherRecipe(new ItemStack(Blocks.SNOW_LAYER), new ItemStack(Items.SNOWBALL, 1), new ItemStack(Items.SNOWBALL, 1), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.SNOW), new ItemStack(Blocks.SNOW_LAYER, 2), new ItemStack(Items.SNOWBALL, 1), 35, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.ICE), new ItemStack(Blocks.SNOW_LAYER, 4), new ItemStack(Items.SNOWBALL, 1), 45, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.PACKED_ICE), new ItemStack(Blocks.SNOW), new ItemStack(Items.SNOWBALL, 1), 65, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glacieric_ice), new ItemStack(Blocks.PACKED_ICE), new ItemStack(MItems.gems, 1, 6), 35, 0.05F);
		
		//Stone Decor
		this.addCrusherRecipe(new ItemStack(MBlocks.mud_bricks), new ItemStack(MBlocks.dried_mud), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.SANDSTONE, 1, 0), new ItemStack(Blocks.SAND, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.SANDSTONE, 1, 1), new ItemStack(Blocks.SANDSTONE, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.SANDSTONE, 1, 2), new ItemStack(Blocks.SANDSTONE, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_SANDSTONE, 1, 0), new ItemStack(Blocks.SAND, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_SANDSTONE, 1, 1), new ItemStack(Blocks.RED_SANDSTONE, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_SANDSTONE, 1, 2), new ItemStack(Blocks.RED_SANDSTONE, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 0), new ItemStack(Blocks.SANDSTONE, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 1), new ItemStack(Blocks.RED_SANDSTONE, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 2), new ItemStack(MBlocks.cold_sand, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 3), new ItemStack(MBlocks.sandstone, 1, 2), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 4), new ItemStack(MBlocks.sandstone, 1, 2), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 5), new ItemStack(MBlocks.sandstone, 1, 2), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 6), new ItemStack(MBlocks.cold_sand, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 7), new ItemStack(MBlocks.sandstone, 1, 6), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 8), new ItemStack(MBlocks.sandstone, 1, 6), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sandstone, 1, 9), new ItemStack(MBlocks.sandstone, 1, 6), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.desert_quartz, 1, 0), new ItemStack(MItems.gems, 3, 1), new ItemStack(MItems.gems, 1, 1), 70, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.desert_quartz, 1, 1), new ItemStack(MBlocks.desert_quartz, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.desert_quartz, 1, 2), new ItemStack(MBlocks.desert_quartz, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.irradiant_quartz, 1, 0), new ItemStack(MItems.gems, 3, 3), new ItemStack(MItems.gems, 1, 3), 70, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.irradiant_quartz, 1, 1), new ItemStack(MBlocks.irradiant_quartz, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.irradiant_quartz, 1, 2), new ItemStack(MBlocks.irradiant_quartz, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.BRICK_BLOCK), new ItemStack(Items.BRICK, 3), new ItemStack(Items.BRICK), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONE, 1, 1), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(MItems.gems, 1, 1), 12, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONE, 1, 2), new ItemStack(Blocks.STONE, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONE, 1, 3), new ItemStack(Blocks.SAND, 1, 0), new ItemStack(Items.QUARTZ), 6, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONE, 1, 4), new ItemStack(Blocks.STONE, 1, 3), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONE, 1, 5), new ItemStack(Blocks.GRAVEL), new ItemStack(MItems.gems, 1, 2), 3, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONE, 1, 6), new ItemStack(Blocks.STONE, 1, 5), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.decor_stone, 1, 0), new ItemStack(Blocks.STONE, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.decor_stone, 1, 1), new ItemStack(Blocks.STONE, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.decor_stone, 1, 2), new ItemStack(Blocks.STONE, 1, 3), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.decor_stone, 1, 3), new ItemStack(Blocks.STONE, 1, 3), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.decor_stone, 1, 4), new ItemStack(Blocks.STONE, 1, 5), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.decor_stone, 1, 5), new ItemStack(Blocks.STONE, 1, 5), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.decor_stone, 1, 6), new ItemStack(Blocks.CLAY), new ItemStack(Items.FLINT), 3, 0.05F);
		for(int i = 0 ; i < 3 ; i++)
		{
			this.addCrusherRecipe(new ItemStack(MBlocks.decor_stone, 1, 7 + i), new ItemStack(MBlocks.decor_stone, 1, 6), null, 0, 0.05F);
		}
		this.addCrusherRecipe(new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.GRAVEL), new ItemStack(MItems.chunks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone, 1, 0), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(MItems.chunks, 1, 0), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone, 1, 1), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(MItems.chunks, 1, 0), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone, 1, 2), new ItemStack(Blocks.GRAVEL), new ItemStack(MItems.chunks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone, 1, 3), new ItemStack(Blocks.GRAVEL), new ItemStack(MItems.chunks, 1, 2), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone, 1, 4), new ItemStack(Blocks.GRAVEL), new ItemStack(MItems.chunks, 1, 2), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone, 1, 5), new ItemStack(MBlocks.cold_sand, 1, 0), new ItemStack(MItems.chunks, 1, 3), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone, 1, 6), new ItemStack(MBlocks.cold_sand, 1, 0), new ItemStack(MItems.chunks, 1, 3), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone, 1, 7), new ItemStack(Blocks.SAND, 1, 0), new ItemStack(MItems.chunks, 1, 4), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone, 1, 8), new ItemStack(Blocks.SAND, 1, 0), new ItemStack(MItems.chunks, 1, 4), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE), new ItemStack(Blocks.GRAVEL), new ItemStack(MItems.chunks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone, 1, 0), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(MItems.chunks, 1, 0), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone, 1, 1), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(MItems.chunks, 1, 0), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone, 1, 2), new ItemStack(Blocks.GRAVEL), new ItemStack(MItems.chunks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone, 1, 3), new ItemStack(Blocks.GRAVEL), new ItemStack(MItems.chunks, 1, 2), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone, 1, 4), new ItemStack(Blocks.GRAVEL), new ItemStack(MItems.chunks, 1, 2), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone, 1, 5), new ItemStack(MBlocks.cold_sand, 1, 0), new ItemStack(MItems.chunks, 1, 3), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone, 1, 6), new ItemStack(MBlocks.cold_sand, 1, 0), new ItemStack(MItems.chunks, 1, 3), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone, 1, 7), new ItemStack(Blocks.SAND, 1, 0), new ItemStack(MItems.chunks, 1, 4), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone, 1, 8), new ItemStack(Blocks.SAND, 1, 0), new ItemStack(MItems.chunks, 1, 4), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONE, 1, 0), new ItemStack(Blocks.COBBLESTONE), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONEBRICK, 1, 0), new ItemStack(Blocks.STONEBRICK, 1, 2), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONEBRICK, 1, 1), new ItemStack(Blocks.STONEBRICK, 1, 2), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONEBRICK, 1, 2), new ItemStack(Blocks.COBBLESTONE), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STONEBRICK, 1, 3), new ItemStack(Blocks.COBBLESTONE), null, 0, 0.05F);
		for(int i = 0 ; i < EnumStoneTypeMOnly.values().length ; i++)
		{
			this.addCrusherRecipe(new ItemStack(MBlocks.stone, 1, i), new ItemStack(MBlocks.cobblestone, 1, i), null, 0, 0.05F);
			this.addCrusherRecipe(new ItemStack(MBlocks.stone_bricks, 1, i), new ItemStack(MBlocks.cracked_stone_bricks, 1, i), null, 0, 0.05F);
			this.addCrusherRecipe(new ItemStack(MBlocks.mossy_stone_bricks, 1, i), new ItemStack(MBlocks.cracked_stone_bricks, 1, i), null, 0, 0.05F);
			this.addCrusherRecipe(new ItemStack(MBlocks.cracked_stone_bricks, 1, i), new ItemStack(MBlocks.cobblestone, 1, i), null, 0, 0.05F);
			this.addCrusherRecipe(new ItemStack(MBlocks.chiseled_stone, 1, i), new ItemStack(MBlocks.cobblestone, 1, i), null, 0, 0.05F);
		}
		this.addCrusherRecipe(new ItemStack(Blocks.COBBLESTONE_WALL, 1, 0), new ItemStack(MItems.chunks, 1, 1), new ItemStack(MItems.chunks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.COBBLESTONE_WALL, 1, 1), new ItemStack(MItems.chunks, 1, 1), new ItemStack(MItems.chunks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone_wall, 1, 0), new ItemStack(MItems.chunks, 1, 0), new ItemStack(MItems.chunks, 1, 0), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone_wall, 1, 1), new ItemStack(MItems.chunks, 1, 0), new ItemStack(MItems.chunks, 1, 0), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone_wall, 1, 2), new ItemStack(MItems.chunks, 1, 1), new ItemStack(MItems.chunks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone_wall, 1, 3), new ItemStack(MItems.chunks, 1, 2), new ItemStack(MItems.chunks, 1, 2), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone_wall, 1, 4), new ItemStack(MItems.chunks, 1, 2), new ItemStack(MItems.chunks, 1, 2), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone_wall, 1, 5), new ItemStack(MItems.chunks, 1, 3), new ItemStack(MItems.chunks, 1, 3), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone_wall, 1, 6), new ItemStack(MItems.chunks, 1, 3), new ItemStack(MItems.chunks, 1, 3), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone_wall, 1, 7), new ItemStack(MItems.chunks, 1, 4), new ItemStack(MItems.chunks, 1, 4), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.cobblestone_wall, 1, 8), new ItemStack(MItems.chunks, 1, 4), new ItemStack(MItems.chunks, 1, 4), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone_wall, 1, 0), new ItemStack(MItems.chunks, 1, 0), new ItemStack(MItems.chunks, 1, 0), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone_wall, 1, 1), new ItemStack(MItems.chunks, 1, 0), new ItemStack(MItems.chunks, 1, 0), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone_wall, 1, 2), new ItemStack(MItems.chunks, 1, 1), new ItemStack(MItems.chunks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone_wall, 1, 3), new ItemStack(MItems.chunks, 1, 2), new ItemStack(MItems.chunks, 1, 2), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone_wall, 1, 4), new ItemStack(MItems.chunks, 1, 2), new ItemStack(MItems.chunks, 1, 2), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone_wall, 1, 5), new ItemStack(MItems.chunks, 1, 3), new ItemStack(MItems.chunks, 1, 3), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone_wall, 1, 6), new ItemStack(MItems.chunks, 1, 3), new ItemStack(MItems.chunks, 1, 3), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone_wall, 1, 7), new ItemStack(MItems.chunks, 1, 4), new ItemStack(MItems.chunks, 1, 4), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mossy_cobblestone_wall, 1, 8), new ItemStack(MItems.chunks, 1, 4), new ItemStack(MItems.chunks, 1, 4), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_terracotta, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.WHITE_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.SILVER_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.GRAY_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.BLACK_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.ORANGE_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.YELLOW_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.GREEN_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.CYAN_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.BLUE_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.PURPLE_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.MAGENTA_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.PINK_GLAZED_TERRACOTTA), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_glazed_terracotta_white), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_glazed_terracotta_magenta), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_glazed_terracotta_red), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_glazed_terracotta_orange), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_glazed_terracotta_yellow), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_glazed_terracotta_green), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_glazed_terracotta_cyan), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_glazed_terracotta_blue), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glow_glazed_terracotta_purple), new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Items.CLAY_BALL), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.PRISMARINE, 1, 0), new ItemStack(Items.PRISMARINE_SHARD, 3), new ItemStack(Items.PRISMARINE_SHARD), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.PRISMARINE, 1, 1), new ItemStack(Blocks.PRISMARINE, 1, 0), new ItemStack(Items.PRISMARINE_SHARD), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.PRISMARINE, 1, 2), new ItemStack(Blocks.PRISMARINE, 1, 0), new ItemStack(Items.PRISMARINE_SHARD), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.NETHERRACK), new ItemStack(Blocks.SOUL_SAND), new ItemStack(MItems.chunks, 1, 5), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.NETHER_BRICK), new ItemStack(Blocks.NETHERRACK), new ItemStack(MItems.chunks, 1, 5), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.RED_NETHER_BRICK), new ItemStack(Blocks.NETHERRACK), new ItemStack(MItems.chunks, 1, 5), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.MAGMA), new ItemStack(Items.MAGMA_CREAM, 1), new ItemStack(MItems.chunks, 1, 5), 30, 0.12F);
		this.addCrusherRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 1, 0), new ItemStack(Items.QUARTZ, 3), new ItemStack(Items.QUARTZ), 70, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 1, 1), new ItemStack(Blocks.QUARTZ_BLOCK, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), new ItemStack(Blocks.QUARTZ_BLOCK, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.soul_glass, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.SOUL_SAND), new ItemStack(MItems.gems, 1, 1), 20, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.blazed_soul_glass, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.SOUL_SAND), new ItemStack(MItems.gems, 1, 5), 20, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.END_STONE), new ItemStack(Blocks.SAND, 1, 0), new ItemStack(MItems.chunks, 1, 6), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.END_BRICKS), new ItemStack(Blocks.END_STONE), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.PURPUR_BLOCK), new ItemStack(Items.CHORUS_FRUIT_POPPED, 3), new ItemStack(Items.CHORUS_FRUIT_POPPED), 45, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.PURPUR_PILLAR), new ItemStack(Items.CHORUS_FRUIT_POPPED, 3), new ItemStack(Items.CHORUS_FRUIT_POPPED), 45, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.purpur), new ItemStack(Items.CHORUS_FRUIT_POPPED, 8), new ItemStack(Items.CHORUS_FRUIT_POPPED), 45, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.portar, 1, 0), new ItemStack(MBlocks.portal_dust, 1, 0), new ItemStack(MItems.bricks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.portar, 1, 1), new ItemStack(MBlocks.portal_dust, 1, 0), new ItemStack(MItems.bricks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.portar, 1, 2), new ItemStack(MBlocks.portal_dust, 1, 0), new ItemStack(MItems.bricks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.portar, 1, 3), new ItemStack(MBlocks.portal_dust, 1, 0), new ItemStack(MItems.bricks, 1, 1), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.portar, 1, 4), new ItemStack(MBlocks.portal_dust, 1, 0), new ItemStack(MItems.gems, 1, 0), 75, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.portar, 1, 5), new ItemStack(MBlocks.portal_dust, 1, 0), new ItemStack(Items.GLOWSTONE_DUST), 75, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.portar, 1, 6), new ItemStack(MBlocks.portal_dust, 1, 0), new ItemStack(Items.PRISMARINE_CRYSTALS), 75, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.shimmerstone, 1, 0), new ItemStack(MBlocks.shimmerstone, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.shimmerstone, 1, 2), new ItemStack(MBlocks.shimmerstone, 1, 3), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.shimmerstone, 1, 3), new ItemStack(MBlocks.shimmerstone, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.shimmerstone, 1, 4), new ItemStack(MBlocks.shimmerstone, 1, 3), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.shimmerstone, 1, 5), new ItemStack(MBlocks.shimmerstone, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.shimmerstone, 1, 6), new ItemStack(MBlocks.shimmerstone, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.shimmerstone, 1, 7), new ItemStack(MBlocks.shimmerstone, 1, 1), new ItemStack(MItems.dye, 1, 6), 20, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.shimmerstone, 1, 8), new ItemStack(MBlocks.shimmerstone, 1, 1), new ItemStack(MItems.dye, 1, 8), 20, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.shimmerstone, 1, 9), new ItemStack(MBlocks.shimmerstone, 1, 1), new ItemStack(MItems.dye, 1, 5), 20, 0.05F);
		
		//Ores
		this.addCrusherRecipe(new ItemStack(MBlocks.desert_quartz_deposit, 1, 0), new ItemStack(MItems.gems, 2, 1), new ItemStack(MItems.gems, 1, 2), 5, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.desert_quartz_deposit, 1, 1), new ItemStack(MItems.gems, 2, 1), new ItemStack(MItems.salt), 50, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.desert_quartz_deposit, 1, 2), new ItemStack(MItems.gems, 2, 1), new ItemStack(MItems.salt), 50, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.desert_quartz_deposit, 1, 3), new ItemStack(MItems.gems, 2, 1), new ItemStack(MItems.salt), 50, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.desert_quartz_deposit, 1, 4), new ItemStack(MItems.gems, 2, 1), new ItemStack(MItems.salt), 50, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_salt, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MItems.salt, 3, 0), new ItemStack(MItems.gems, 1, 2), 5, 0.1F);
		this.addCrusherRecipe(new ItemStack(Blocks.COAL_ORE), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 1), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_coal, 1, 0), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 0), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_coal, 1, 1), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 0), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_coal, 1, 2), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 1), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_coal, 1, 3), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 2), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_coal, 1, 4), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 2), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_coal, 1, 5), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 3), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_coal, 1, 6), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 3), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_coal, 1, 7), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 4), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_coal, 1, 8), new ItemStack(Items.COAL, 2, 0), new ItemStack(MItems.chunks, 1, 4), 40, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_copper, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MItems.chunks, 2, 7), new ItemStack(MItems.chunks, 1, 8), 30, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_tin, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MItems.chunks, 2, 8), new ItemStack(MItems.chunks, 1, 7), 30, 0.15F);
		this.addCrusherRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 1), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_iron, 1, 0), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 0), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_iron, 1, 1), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 0), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_iron, 1, 2), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 1), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_iron, 1, 3), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 2), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_iron, 1, 4), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 2), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_iron, 1, 5), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 3), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_iron, 1, 6), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 3), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_iron, 1, 7), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 4), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_iron, 1, 8), new ItemStack(MItems.chunks, 2, 9), new ItemStack(MItems.chunks, 1, 4), 40, 0.15F);
		this.addCrusherRecipe(new ItemStack(Blocks.GOLD_ORE), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 1), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_gold, 1, 0), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 0), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_gold, 1, 1), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 0), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_gold, 1, 2), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 1), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_gold, 1, 3), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 2), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_gold, 1, 4), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 2), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_gold, 1, 5), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 3), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_gold, 1, 6), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 3), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_gold, 1, 7), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 4), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_gold, 1, 8), new ItemStack(MItems.chunks, 2, 10), new ItemStack(MItems.chunks, 1, 4), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 0), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 0), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 1), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 0), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 2), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 1), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 3), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 2), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 4), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 2), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 5), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 3), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 6), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 3), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 7), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 4), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 8), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 4), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_meurodite, 1, 9), new ItemStack(MItems.gems, 2, 4), new ItemStack(MItems.chunks, 1, 1), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(Blocks.LAPIS_ORE), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 1), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_lapis, 1, 0), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 0), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_lapis, 1, 1), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 0), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_lapis, 1, 2), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 1), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_lapis, 1, 3), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 2), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_lapis, 1, 4), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 2), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_lapis, 1, 5), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 3), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_lapis, 1, 6), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 3), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_lapis, 1, 7), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 4), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_lapis, 1, 8), new ItemStack(Items.DYE, 8, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(MItems.chunks, 1, 4), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(Blocks.REDSTONE_ORE), new ItemStack(Items.REDSTONE, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_redstone, 1, 0), new ItemStack(MBlocks.redstone_sandy, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_redstone, 1, 1), new ItemStack(MBlocks.redstone_sandy, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_redstone, 1, 2), new ItemStack(Items.REDSTONE, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_redstone, 1, 3), new ItemStack(MBlocks.redstone_frosted, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_redstone, 1, 4), new ItemStack(MBlocks.redstone_frosted, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_redstone, 1, 5), new ItemStack(MBlocks.redstone_icy, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_redstone, 1, 6), new ItemStack(MBlocks.redstone_icy, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_redstone, 1, 7), new ItemStack(MBlocks.redstone_briny, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_redstone, 1, 8), new ItemStack(MBlocks.redstone_briny, 8), new ItemStack(Items.GUNPOWDER), 12, 0.2F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_irradium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MItems.irradium, 3), new ItemStack(MItems.gems, 1, 3), 5, 0.25F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_torite, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MItems.chunks, 2, 11), new ItemStack(MItems.chunks, 1, 10), 12, 0.25F);
		this.addCrusherRecipe(new ItemStack(MBlocks.sunstone_deposit), new ItemStack(MItems.gems, 3, 0), new ItemStack(MItems.gems, 1, 0), 50, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.rock_crystal_deposit), new ItemStack(MItems.gems, 3, 2), new ItemStack(MItems.gems, 1, 2), 50, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.glacieric_ice_branch_0), new ItemStack(Items.SNOWBALL, 1), new ItemStack(MItems.gems, 1, 6), 40, 0.2F);
		this.addCrusherRecipe(new ItemStack(Blocks.DIAMOND_ORE), new ItemStack(Items.DIAMOND, 2), new ItemStack(Items.EMERALD), 15, 0.3F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_diamond, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.DIAMOND, 2), new ItemStack(Items.EMERALD), 15, 0.3F);
		this.addCrusherRecipe(new ItemStack(Blocks.EMERALD_ORE), new ItemStack(Items.EMERALD, 2), new ItemStack(Items.DIAMOND), 15, 0.3F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_emerald, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.EMERALD, 2), new ItemStack(Items.DIAMOND), 15, 0.3F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 0), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 0), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 1), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 0), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 2), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 1), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 3), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 2), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 4), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 2), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 5), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 3), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 6), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 3), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 7), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 4), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 8), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 4), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_titanium, 1, 9), new ItemStack(MItems.chunks, 2, 12), new ItemStack(MItems.chunks, 1, 1), 40, 0.4F);
		this.addCrusherRecipe(new ItemStack(Blocks.QUARTZ_ORE), new ItemStack(Items.QUARTZ, 3), new ItemStack(Items.GHAST_TEAR), 12, 0.15F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_blazium), new ItemStack(MItems.gems, 6, 5), new ItemStack(Items.BLAZE_POWDER), 35, 0.25F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_shimmering), new ItemStack(MItems.chunks, 2, 14), new ItemStack(MItems.chunks, 1, 5), 40, 0.6F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_soul), new ItemStack(MItems.gem_soul, 2), new ItemStack(Items.QUARTZ), 45, 0.5F);
		this.addCrusherRecipe(new ItemStack(MBlocks.soul_eyes), new ItemStack(MItems.gem_soul, 2), null, 0, 0.5F);
		this.addCrusherRecipe(new ItemStack(MBlocks.ore_dimensium), new ItemStack(MItems.chunks, 2, 13), new ItemStack(MItems.chunks, 1, 6), 40, 0.3F);
		
		//Dyeables
		for(int i = 0 ; i < EnumDyeColor.values().length ; i++)
		{
			this.addCrusherRecipe(new ItemStack(Blocks.CONCRETE, 1, i), new ItemStack(Blocks.CONCRETE_POWDER, 1, i), null, 0, 0.05F);
		}
		for(int i = 0 ; i < BlockMGlowDyed.EnumGlowDye.values().length ; i++)
		{
			this.addCrusherRecipe(new ItemStack(MBlocks.glow_concrete, 1, i), new ItemStack(MBlocks.glow_concrete_powder, 1, i), null, 0, 0.05F);
		}
		
		//Misc Decor
		this.addCrusherRecipe(new ItemStack(MBlocks.red_rock_road), new ItemStack(MItems.chunks, 1, 0), new ItemStack(Items.CLAY_BALL), 80, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.stone_road), new ItemStack(MItems.chunks, 1, 1), new ItemStack(MItems.mud_ball), 80, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.coldstone_road), new ItemStack(MItems.chunks, 1, 2), new ItemStack(MItems.mud_ball), 80, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.icestone_road), new ItemStack(MItems.chunks, 1, 3), new ItemStack(Items.SNOWBALL), 80, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.oceanstone_road), new ItemStack(MItems.chunks, 1, 4), new ItemStack(Items.CLAY_BALL), 80, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.netherrack_road), new ItemStack(MItems.chunks, 1, 5), new ItemStack(Blocks.SOUL_SAND), 80, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.end_stone_road), new ItemStack(MItems.chunks, 1, 6), new ItemStack(MItems.mite_honey), 80, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.HAY_BLOCK), new ItemStack(Items.WHEAT, 8), new ItemStack(Items.WHEAT), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.BOOKSHELF), new ItemStack(Items.BOOK, 3), new ItemStack(Items.STICK), 65, 0.05F);
		this.addCrusherRecipe(new ItemStack(Items.ARMOR_STAND), new ItemStack(Items.STICK, 5), new ItemStack(Items.STICK), 35, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.LADDER), new ItemStack(Items.STICK, 5), new ItemStack(Items.STICK), 30, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.IRON_BARS), new ItemStack(Items.IRON_NUGGET), new ItemStack(Items.IRON_NUGGET), 35, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.steel_mesh), new ItemStack(MItems.nuggets, 1, 3), new ItemStack(MItems.nuggets, 1, 3), 35, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.wooden_window), new ItemStack(Items.STICK), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.iron_window), new ItemStack(Items.IRON_NUGGET), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.reinforced_glass), new ItemStack(MItems.nuggets, 1, 3), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.WEB), new ItemStack(Items.STRING, 3), new ItemStack(Items.SPIDER_EYE, 1), 8, 0.15F);
		this.addCrusherRecipe(new ItemStack(Blocks.BONE_BLOCK), new ItemStack(Items.DYE, 9, EnumDyeColor.WHITE.getDyeDamage()), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.SLIME_BLOCK), new ItemStack(Items.SLIME_BALL, 9), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.block_mite_honey), new ItemStack(MItems.mite_honey, 9), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.bauble_ice), new ItemStack(Items.SNOWBALL), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.block_sunstone), new ItemStack(MItems.gems, 4, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.block_irradiant_sunstone), new ItemStack(MItems.gems, 4, 0), new ItemStack(MItems.irradium), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.bauble_sunstone), new ItemStack(MItems.gems, 1, 0), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.SEA_LANTERN), new ItemStack(Items.PRISMARINE_CRYSTALS, 5), new ItemStack(Items.PRISMARINE_SHARD), 65, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.GLOWSTONE), new ItemStack(Items.GLOWSTONE_DUST, 4), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.bauble_glowstone), new ItemStack(Items.GLOWSTONE_DUST), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.bauble_glowshroom_purple), new ItemStack(MItems.dye, 2, 8), new ItemStack(MItems.dye, 1, 8), 30, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.bauble_glowshroom_green), new ItemStack(MItems.dye, 2, 5), new ItemStack(MItems.dye, 1, 5), 30, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.bauble_glowshroom_blue), new ItemStack(MItems.dye, 2, 6), new ItemStack(MItems.dye, 1, 6), 30, 0.1F);
		this.addCrusherRecipe(new ItemStack(MBlocks.bauble_blazium), new ItemStack(MItems.gems, 1, 5), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.candle, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MItems.mob_loot, 1, 1), new ItemStack(MBlocks.rope), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.candle2, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MItems.mob_loot, 1, 1), new ItemStack(MBlocks.rope), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.pumpkin_normie, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.PUMPKIN_SEEDS, 8), new ItemStack(MItems.mob_loot, 1, 1), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.pumpkin_grumpy, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.PUMPKIN_SEEDS, 8), new ItemStack(MItems.mob_loot, 1, 1), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.pumpkin_creepy, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.PUMPKIN_SEEDS, 8), new ItemStack(MItems.mob_loot, 1, 1), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.pumpkin_dumpy, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.PUMPKIN_SEEDS, 8), new ItemStack(MItems.mob_loot, 1, 1), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.pumpkin_smiley, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.PUMPKIN_SEEDS, 8), new ItemStack(MItems.mob_loot, 1, 1), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.plate_weave), new ItemStack(MItems.natural_ingredients, 3, 0), new ItemStack(MItems.natural_ingredients, 1, 0), 65, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.basket), new ItemStack(MItems.natural_ingredients, 5, 0), new ItemStack(MItems.natural_ingredients, 2, 0), 65, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.plate_metal, 1, 0), new ItemStack(MItems.plating, 1, 4), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.plate_metal, 1, 1), new ItemStack(MItems.plating, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.plate_metal, 1, 2), new ItemStack(MItems.plating, 1, 2), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.plate_metal, 1, 3), new ItemStack(MItems.plating, 1, 5), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.tanning_rack), new ItemStack(Items.STICK, 5), new ItemStack(MBlocks.rope), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.ANVIL, 1, 0), new ItemStack(Blocks.ANVIL, 1, 1), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.ANVIL, 1, 1), new ItemStack(Blocks.ANVIL, 1, 2), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.ANVIL, 1, 2), new ItemStack(Items.IRON_NUGGET, 48), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Items.CAULDRON), new ItemStack(Items.IRON_NUGGET, 32), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.NETHER_WART_BLOCK), new ItemStack(Items.NETHER_WART, 8), new ItemStack(Items.NETHER_WART), 55, 0.05F);
		this.addCrusherRecipe(new ItemStack(MItems.gems, 1, 5), new ItemStack(Items.BLAZE_POWDER), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Blocks.END_ROD), new ItemStack(Items.BLAZE_POWDER, 4), new ItemStack(Items.CHORUS_FRUIT_POPPED), 45, 0.05F);
		this.addCrusherRecipe(new ItemStack(MBlocks.mite_eggsack), new ItemStack(MItems.mite_honey, 10), new ItemStack(MItems.mite_honey, 5), 50, 5F);
		
		//Misc Items
		this.addCrusherRecipe(new ItemStack(MItems.mob_loot, 1, 0), new ItemStack(Items.DYE, 2, EnumDyeColor.WHITE.getDyeDamage()), null, 0, 0.1F);
		this.addCrusherRecipe(new ItemStack(MItems.mob_loot, 1, 12), new ItemStack(Items.DYE, 2, EnumDyeColor.WHITE.getDyeDamage()), null, 0, 0.5F);
		this.addCrusherRecipe(new ItemStack(Items.BONE), new ItemStack(Items.DYE, 5, EnumDyeColor.WHITE.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.WHITE.getDyeDamage()), 35, 0.05F);
		this.addCrusherRecipe(new ItemStack(Items.BLAZE_ROD), new ItemStack(Items.BLAZE_POWDER, 4), new ItemStack(Items.DYE, 1, EnumDyeColor.WHITE.getDyeDamage()), 8, 0.1F);
		this.addCrusherRecipe(new ItemStack(Items.CHORUS_FRUIT_POPPED), new ItemStack(Items.DYE, 1, EnumDyeColor.PURPLE.getDyeDamage()), new ItemStack(Items.DYE, 1, EnumDyeColor.PURPLE.getDyeDamage()), 15, 0.05F);
		this.addCrusherRecipe(new ItemStack(Items.COMPASS), new ItemStack(Items.IRON_NUGGET, 8), new ItemStack(Items.REDSTONE), 45, 0.05F);
		this.addCrusherRecipe(new ItemStack(Items.CLOCK), new ItemStack(Items.GOLD_NUGGET, 8), new ItemStack(Items.REDSTONE), 45, 0.05F);
		this.addCrusherRecipe(new ItemStack(Items.BUCKET), new ItemStack(Items.IRON_NUGGET, 6), null, 0, 0.05F);
		
		//Food Items
		this.addCrusherRecipe(new ItemStack(MItems.pepper), new ItemStack(MItems.pepper_seeds), new ItemStack(Items.DYE, 1, 1), 40, 0.05F);
		this.addCrusherRecipe(new ItemStack(MItems.cabbage), new ItemStack(MItems.cabbage_seeds), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MItems.celery), new ItemStack(MItems.celery_seeds), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(MItems.tomato), new ItemStack(MItems.tomato_seeds), new ItemStack(Items.DYE, 1, 1), 60, 0.05F);
		this.addCrusherRecipe(new ItemStack(Items.BEETROOT), new ItemStack(Items.BEETROOT_SEEDS), new ItemStack(Items.DYE, 1, 1), 80, 0.05F);
		this.addCrusherRecipe(new ItemStack(Items.CARROT), new ItemStack(Items.DYE, 1, EnumDyeColor.ORANGE.getDyeDamage()), null, 0, 0.1F);
		this.addCrusherRecipe(new ItemStack(Items.GOLDEN_CARROT), new ItemStack(Items.DYE, 1, EnumDyeColor.ORANGE.getDyeDamage()), new ItemStack(Items.GOLD_NUGGET), 75, 0.15F);
		this.addCrusherRecipe(new ItemStack(Items.WHEAT), new ItemStack(MItems.dough), null, 0, 0.1F);
		this.addCrusherRecipe(new ItemStack(MItems.corn), new ItemStack(MItems.corn_meal), null, 0, 0.1F);
		this.addCrusherRecipe(new ItemStack(Items.MELON), new ItemStack(Items.MELON_SEEDS, 2), null, 0, 0.05F);
		this.addCrusherRecipe(new ItemStack(Items.SPECKLED_MELON), new ItemStack(Items.MELON_SEEDS, 2), new ItemStack(Items.GOLD_NUGGET), 55, 0.1F);
		this.addCrusherRecipe(new ItemStack(MItems.voidberry), new ItemStack(MItems.dye, 1, 0), new ItemStack(MItems.dye, 1, 0), 25, 0.05F);
		this.addCrusherRecipe(new ItemStack(MItems.natural_ingredients, 1, 3), new ItemStack(MItems.dye, 2, 0), new ItemStack(MItems.dye, 1, 0), 40, 0.1F);
	}
	public void addCrusherRecipe(ItemStack input1, ItemStack result, ItemStack extra, Integer chance, float experience) {
		this.crushing.put(input1, result);
		this.extra.put(input1, extra);
		this.chance.put(input1, chance);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getCrusherResult(ItemStack input1) {
		for(Entry<ItemStack, ItemStack> ent : this.crushing.entrySet()) {
			if(this.compareItemStacks(input1, (ItemStack)ent.getKey())) {
				return (ItemStack)ent.getValue();
			}
		}	
	return ItemStack.EMPTY;
	}

	public ItemStack getSlotOne(ItemStack input1) {
		for(Entry<ItemStack, ItemStack> ent : this.crushing.entrySet()) {
			if(this.compareItemStacks(input1, (ItemStack)ent.getKey())) {
				return (ItemStack)ent.getKey();
			}
		}	
	return ItemStack.EMPTY;
	}
	
	
	public ItemStack getExtra(ItemStack input1) {
		for(Entry<ItemStack, ItemStack> ent : this.extra.entrySet()) {
			if(this.compareItemStacks(input1, (ItemStack)ent.getKey())) {
				return (ItemStack)ent.getValue();
			}
		}	
	return ItemStack.EMPTY;
	}

	public Integer getChance(ItemStack input1) {
		for(Entry<ItemStack, Integer> ent : this.chance.entrySet()) {
			if(this.compareItemStacks(input1, (ItemStack)ent.getKey())) {
				return (Integer)ent.getValue();
			}
		}	
	return 0;
	}
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 630 || stack2.getMetadata() == OreDictionary.WILDCARD_VALUE || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public float getCrusherExperience(ItemStack stack) {
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) {
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) {
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}