package net.gregs.bloodbening.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gregs.bloodbening.GregsBloodbending;
import net.gregs.bloodbening.item.custom.MagicMissileStaffItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup gregs_bloodbending_items = Registry.register(Registries.ITEM_GROUP, Identifier.of(GregsBloodbending.MOD_ID, "gregs_bloodbending_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.blood_orb))
                    .displayName(Text.translatable("itemgroup.gregsbloodbending.mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.empty_blood_orb);
                        entries.add(ModItems.blood_orb);
                        entries.add(ModItems.Magic_Missile_Staff);
                    }).build());

    public static void registrarItemGroups() {
        GregsBloodbending.LOGGER.info("Registering Item Groups for " + GregsBloodbending.MOD_ID);
    }
}
