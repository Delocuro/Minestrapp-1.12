package minestrapp.compat.tconstruct;

import minestrapp.crafting.FreezingRecipes;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

import java.util.ListIterator;

import slimeknights.tconstruct.library.modifiers.IToolMod;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.library.utils.ToolHelper;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.TinkerTraits;

public class TraitChillTouch extends AbstractTrait {

    public TraitChillTouch() {
        super("chill_touch", 0xff5500);
    }

    @Override
    public boolean canApplyTogether(Enchantment enchantment) {
        return enchantment != Enchantments.SILK_TOUCH;
    }

    @Override
    public boolean canApplyTogether(IToolMod toolmod) {
        return !toolmod.getIdentifier().equals(TinkerTraits.squeaky.getIdentifier())
                && !toolmod.getIdentifier().equals(TinkerModifiers.modSilktouch.getIdentifier());
    }

    @Override
    public void blockHarvestDrops(ItemStack tool, BlockEvent.HarvestDropsEvent event) {
        if(ToolHelper.isToolEffective2(tool, event.getState())) {

            ListIterator<ItemStack> iter = event.getDrops().listIterator();

            while(iter.hasNext()) {
                ItemStack drop = iter.next();
                ItemStack recipeResult = FreezingRecipes.instance().getFreezingResult(drop, "light");
                System.out.println(recipeResult);
                if(!recipeResult.isEmpty()) {
                    recipeResult = recipeResult.copy();
                    recipeResult.setCount(drop.getCount());

                    iter.set(recipeResult);

                    // drop XP for it
                    float xp = FurnaceRecipes.instance().getSmeltingExperience(recipeResult);
                    if(xp < 1 && Math.random() < xp) {
                        xp += 1f;
                    }
                    if(xp >= 1f) {
                        event.getState().getBlock().dropXpOnBlockBreak(event.getWorld(), event.getPos(), (int) xp);
                    }
                }
            }
        }
    }

    @Override
    public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player, boolean wasEffective) {
        if(world.isRemote && wasEffective) {
            for(int i = 0; i < 3; i++) {
                world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL,
                        pos.getX() + random.nextDouble(),
                        pos.getY() + random.nextDouble(), pos.getZ() + random.nextDouble(),
                        0.0D, 0.0D, 0.0D);
            }
        }
    }
}