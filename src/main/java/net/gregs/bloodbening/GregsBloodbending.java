package net.gregs.bloodbening;

import net.fabricmc.api.ModInitializer;

import net.gregs.bloodbening.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GregsBloodbending implements ModInitializer {
	public static final String MOD_ID = "gregsbloodbending";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registrarModItems();
	}
}