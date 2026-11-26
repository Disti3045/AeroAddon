package com.example.aeroaddon;

import net.neoforged.fml.common.Mod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(AeroAddon.MOD_ID)
public class AeroAddon {
    public static final String MOD_ID = "aeroaddon";

    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    public AeroAddon() {
        LOGGER.info("Aero Addon loaded.");
    }

}
