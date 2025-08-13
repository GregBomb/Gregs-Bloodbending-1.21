package net.gregs.bloodbening.item.custom;

import net.gregs.bloodbening.GregsBloodbending;
import net.gregs.bloodbening.item.ModItems;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

import static com.ibm.icu.impl.locale.KeyTypeData.ValueType.any;
import static net.minecraft.entity.damage.DamageTypes.DRY_OUT;

public class EmptyBloodOrbItem extends Item {
    public EmptyBloodOrbItem(Settings settings) {super(settings);}


    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("empty_blood_orb_tooltip").formatted(Formatting.GOLD));}

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (!world.isClient()) {
            if(user.damage(user.getDamageSources().dryOut(), 10.0f))
                if(user.getInventory().insertStack(new ItemStack(ModItems.blood_orb)))
                    user.getStackInHand(hand).decrement(1);
            return TypedActionResult.success(itemStack);
        }
        return TypedActionResult.success(itemStack);
        }
    }
