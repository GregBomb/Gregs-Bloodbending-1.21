package net.gregs.bloodbening.item;

import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gregs.bloodbening.GregsBloodbending;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Blood_Amulet = registrarItem("blood_amulet", new Item(new Item.Settings()));


    private static Item registrarItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GregsBloodbending.MOD_ID, name), item);
    }

    public static void registrarModItems() {
        GregsBloodbending.LOGGER.info("Registrering Mod Items for " + GregsBloodbending.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(Blood_Amulet);
        });
    }
}
