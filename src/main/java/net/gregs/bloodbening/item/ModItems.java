package net.gregs.bloodbening.item;

import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gregs.bloodbening.GregsBloodbending;
import net.gregs.bloodbening.item.custom.MagicMissileStaffItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item blood_orb = registrarItem("blood_orb", new Item(new Item.Settings()));
    public static final Item empty_blood_orb = registrarItem("empty_blood_orb", new Item(new Item.Settings()));
    public static final Item Magic_Missile_Staff = registrarItem("magic_missile_staff", new MagicMissileStaffItem(new Item.Settings().maxCount(1).maxDamage(128)));


    private static Item registrarItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GregsBloodbending.MOD_ID, name), item);
    }

    public static void registrarModItems() {
        GregsBloodbending.LOGGER.info("Registrering Mod Items for " + GregsBloodbending.MOD_ID);
    }
}
