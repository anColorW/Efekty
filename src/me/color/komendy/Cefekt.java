package me.color.komendy;

import me.color.gui.Gefekty;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import me.color.Main.Main;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Cefekt implements CommandExecutor {

    public static Main plugin;

    public Cefekt(Main pl) {
        plugin = pl;
        plugin.getCommand("efekty").setExecutor(this);
        plugin.getCommand("efekt").setExecutor(this);
        plugin.getCommand("ef").setExecutor(this);
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof  Player)){
            System.out.println("Komende mozesz wywolac jedynie z poziomu gracza");
            return true;
        }

        Player p = (Player) sender;



        p.openInventory(Gefekty.Efekty(p));

        return false;
    }
}

