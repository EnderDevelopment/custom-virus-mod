package com.cameronjacobtitus.customvirusmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class CustomVirusMod implements ModInitializer {
    public static final String MOD_ID = "customvirusmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final MobEffect VIRUS_EFFECT = new VirusEffect(MobEffectCategory.HARMFUL, 0xFF0000);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Custom Virus Mod");
        Registry.register(BuiltInRegistries.MOB_EFFECT, "customvirusmod:virus", VIRUS_EFFECT);
    }
}
