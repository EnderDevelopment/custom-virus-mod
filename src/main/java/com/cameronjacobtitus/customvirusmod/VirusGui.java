package com.cameronjacobtitus.customvirusmod;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;

public
class VirusGui extends Screen {
    private final Player player;

    public VirusGui(Player player) {
        super(Component.literal("Virus GUI"));
        this.player = player;
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        super.render(guiGraphics, mouseX, mouseY, delta);
        guiGraphics.drawString(this.font, "Apply Virus", this.width / 2 - 50, this.height / 2 - 10, 0xFFFFFF);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (mouseX >= this.width / 2 - 50 && mouseX <= this.width / 2 + 50 && mouseY >= this.height / 2 - 10 && mouseY <= this.height / 2 + 10) {
            player.addEffect(new MobEffectInstance(CustomVirusMod.VIRUS_EFFECT, 200, 0));
            this.onClose();
            return true;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }
}
