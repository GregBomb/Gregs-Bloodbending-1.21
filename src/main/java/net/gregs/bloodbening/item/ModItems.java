package net.gregs.bloodbening.item;

import net.gregs.bloodbening.GregsBloodbending;
import net.gregs.bloodbening.item.custom.EmptyBloodOrbItem;
import net.gregs.bloodbening.item.custom.MagicMissileStaffItem;
import net.gregs.bloodbening.item.custom.ModArmorItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item blood_orb = registrarItem("blood_orb",new Item(new Item.Settings()));
    public static final Item empty_blood_orb = registrarItem("empty_blood_orb", new EmptyBloodOrbItem(new Item.Settings()));
    public static final Item blood_shard = registrarItem("blood_shard", new Item(new Item.Settings()));
    public static final Item Magic_Missile_Staff = registrarItem("magic_missile_staff", new MagicMissileStaffItem(new Item.Settings().maxCount(1).maxDamage(128)));
    public static final Item blood_metal = registrarItem("blood_metal",new Item(new Item.Settings()));

    public static final Item blood_metal_helmet = registrarItem("blood_metal_helmet",
            new ArmorItem(ModArmorMaterials.BLOOD_METAL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item blood_metal_chestplate = registrarItem("blood_metal_chestplate",
            new ModArmorItem(ModArmorMaterials.BLOOD_METAL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item blood_metal_leggins = registrarItem("blood_metal_leggins",
            new ArmorItem(ModArmorMaterials.BLOOD_METAL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
    public static final Item blood_metal_boots = registrarItem("blood_metal_boots",
            new ArmorItem(ModArmorMaterials.BLOOD_METAL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));

    private static Item registrarItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GregsBloodbending.MOD_ID, name), item);
    }

    public static void registrarModItems() {
        GregsBloodbending.LOGGER.info("Registrering Mod Items for " + GregsBloodbending.MOD_ID);
    }
}
