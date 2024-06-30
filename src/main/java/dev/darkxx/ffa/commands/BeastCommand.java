package dev.darkxx.ffa.commands;

import dev.darkxx.ffa.Main;
import dev.darkxx.ffa.settings.menu.BeastMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BeastCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }

        Player player = (Player) sender;

        BeastMenu.createBeastMenu(player, Main.getInstance()).open(player);

        return true;
    }
}
