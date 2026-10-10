package com.cameronjacobtitus.customvirusmod;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.level.ServerPlayer;

public
class VirusCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("virus").executes(context -> {
            ServerPlayer player = context.getSource().getPlayer();
            if (player != null) {
                player.sendSystemMessage(Component.literal("Opening Virus GUI"));
                player.openGui(new VirusGui(player));
            }
            return 1;
        }));
    }
}
