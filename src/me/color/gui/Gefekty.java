package me.color.gui;

import me.color.Main.Main;
import me.color.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Gefekty{

    public static Main plugin;

    public Gefekty(Main pl) {
        plugin = pl;
    }

    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 5 * 9;

    public static void initialize() {
        inventory_name = Utils.chat("Efekty");

        inv = Bukkit.createInventory(null, inv_rows);
    }



    public static Inventory Efekty (Player p) {
        Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);



        for (int a = 1; a <= inv_rows; a++) {
            Utils.createItemByte(inv, 160, 15, 1, a, "&8&m--।--", "&8» &cPuste Pole!", "&8» &cWybierz inna pozycja!");
        }

       /*



 */
        int amount = 0;
        for (int i2 = 0; i2 < 36; i2++) {
            ItemStack slot = p.getInventory().getItem(i2);
            if (slot == null || !slot.isSimilar(new ItemStack(Material.EMERALD_BLOCK)))
                continue;
            amount += slot.getAmount();
        }

        int EmeAmount ;




        EmeAmount = 25;
        Utils.createItem(inv, 274, 1 , 11, "\uD83E\uDC6F", false, "&8&m&l----------------------" ,
                "             &f&lHaste 1         " ,
                "        &8&l    5 minut       " ,
                "",
                "        &f&l     Koszt",
                //&8&m-----------------------
                "&c&l "+ EmeAmount + " blokow szmaragdowych",
                amount >= EmeAmount ? "  &a&l  Mozesz kupic efekt! " : "  &4&l  Brakuje Ci " + (EmeAmount - amount) + "blokow! ",
                "&8&m&l----------------------"
        );
        EmeAmount = 40;
        Utils.createItem(inv, 257, 1 , 11 + 9, "\uD83E\uDC6F", false, "&8&m&l----------------------" ,
                "             &f&lHaste 2         " ,
                "        &8&l    5 minut       " ,
                "",
                "        &f&l     Koszt",
                //&8&m-----------------------
                "&c&l "+ EmeAmount + " blokow szmaragdowych",
                amount >= EmeAmount ? "  &a&l  Mozesz kupic efekt! " : "  &4&l  Brakuje Ci " + (EmeAmount - amount) + "blokow! ",
                "&8&m&l----------------------"
        );

        EmeAmount = 10;
        Utils.createItem(inv, 353, 1 , 13, "\uD83E\uDC6F", false,
                "&8&m&l----------------------" ,
                "          &f&lSzybkosc 2      " ,
                "        &8&l    5 minut       " ,
                "",
                "        &f&l     Koszt",
               //&8&m-----------------------
                "&c&l "+ EmeAmount + " blokow szmaragdowych",
                amount >= EmeAmount ? "  &a&l  Mozesz kupic efekt! " : "  &4&l  Brakuje Ci " + (EmeAmount - amount) + "blokow! ",
                "&8&m&l----------------------"
        );

        EmeAmount = 15;
        Utils.createItem(inv, 317, 1 , 13 + 2, "\uD83E\uDC6F", false,
                "&8&m&l----------------------" ,
                "      &f&lWysokie skakanie" ,
                "        &8&l    5 minut       " ,
                "",
                "        &f&l     Koszt",
                //&8&m-----------------------
                "&c&l "+ EmeAmount + " blokow szmaragdowych",
                amount >= EmeAmount ? "  &a&l  Mozesz kupic efekt! " : "  &4&l  Brakuje Ci " + (EmeAmount - amount) + "blokow! ",
                "&8&m&l----------------------"
        );

        EmeAmount = 20;
        Utils.createItem(inv, 267, 1 , 13 + 4, "\uD83E\uDC6F", false,
                "&8&m&l----------------------" ,
                "          &f&lStrength 1      " ,
                "        &8&l    5 minut       " ,
                "",
                "        &f&l     Koszt",
                //&8&m-----------------------
                "&c&l "+ EmeAmount + " blokow szmaragdowych",
                amount >= EmeAmount ? "  &a&l  Mozesz kupic efekt! " : "  &4&l  Brakuje Ci " + (EmeAmount - amount) + "blokow! ",
                "&8&m&l----------------------"
        );

        EmeAmount = 35;
        Utils.createItem(inv, 276, 1 , 13 + 4 + 9, "\uD83E\uDC6F", false,
                "&8&m&l----------------------" ,
                "          &f&lStrength 2      " ,
                "        &8&l    5 minut       " ,
                "",
                "        &f&l     Koszt",
                //&8&m-----------------------
                "&c&l "+ EmeAmount + " blokow szmaragdowych",
                amount >= EmeAmount ? "  &a&l  Mozesz kupic efekt! " : "  &4&l  Brakuje Ci " + (EmeAmount - amount) + "blokow! ",
                "&8&m&l----------------------"
        );
        EmeAmount = 0;
        Utils.createItem(inv, 335, 1 , 13 + 4 + 9 + 6 - 2, "\uD83E\uDC6F", false,
                "&8&m&l----------------------" ,
                "        &f&lClear Efektow   " ,
                "",
                "        &f&l     Koszt",
                //&8&m-----------------------
                "&c&l "+ EmeAmount + " blokow szmaragdowych",
                amount >= EmeAmount ? "  &a&l  Mozesz kupic efekt! " : "  &4&l  Brakuje Ci " + (EmeAmount - amount) + "blokow! ",
                "&8&m&l----------------------"
        );

        EmeAmount = 15;
        Utils.createItem(inv, 327, 1 , 13 + 4 + 9 + 6 + 2, "\uD83E\uDC6F", false,
                "&8&m&l----------------------" ,
                "     &f&lClear Zlych Efektow",
                "",
                "        &f&l      Koszt",
                //&8&m-----------------------
                "&c&l "+ EmeAmount + " blokow szmaragdowych",
                amount >= EmeAmount ? "  &a&l  Mozesz kupic efekt! " : "  &4&l  Brakuje Ci " + (EmeAmount - amount) + "blokow! ",
                "&8&m&l----------------------"
        );

        //Utils.createItem(inv, 266, 1 , 12, "&d&lZloto", Main.Config.golddrop, "&r&fSzansa: &d&l" + Main.Config.GoldChance + "%", "&fDrop: " + gold);




        toReturn.setContents(inv.getContents());
        return toReturn;

    }

    //Uproscic do jednej funkcji


    public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {


        int min = 20 * 60;


        int amount = 0;
        for (int i2 = 0; i2 < 36; i2++) {
            ItemStack slots = p.getInventory().getItem(i2);
            if (slots == null || !slots.isSimilar(new ItemStack(Material.EMERALD_BLOCK)))
                continue;
            amount += slots.getAmount();
        }

        if(clicked.getItemMeta().getLore().get(1).equalsIgnoreCase(Utils.chat("          &f&lSzybkosc 2      "))){
            if(p.getInventory().contains(Material.EMERALD_BLOCK, 10)){
                p.getInventory().removeItem(new ItemStack(Material.EMERALD_BLOCK, 10));
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, min * 5, 1));p.closeInventory();
            } else{
                p.sendMessage(Utils.chat("&4Brakuje Ci: " + (10 - amount) + " blokow Emeraldow"));p.closeInventory();
            }
        }

        if(clicked.getItemMeta().getLore().get(1).equalsIgnoreCase(Utils.chat("             &f&lHaste 1         "))){
            if(p.getInventory().contains(Material.EMERALD_BLOCK, 25)){
                p.getInventory().removeItem(new ItemStack(Material.EMERALD_BLOCK, 25));
                p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, min * 5, 0));p.closeInventory();
            } else{
                p.sendMessage(Utils.chat("&4Brakuje Ci: " + (25 - amount) + " blokow Emeraldow"));p.closeInventory();
            }
        }




        if(clicked.getItemMeta().getLore().get(1).equalsIgnoreCase(Utils.chat("             &f&lHaste 2         "))){
            if(p.getInventory().contains(Material.EMERALD_BLOCK, 40)){
                if(p.hasPotionEffect(PotionEffectType.FAST_DIGGING))
                {
                    Collection<PotionEffect> pe = p.getActivePotionEffects();
                    for(PotionEffect effect : pe)
                    {
                        if(effect.getType().equals(PotionEffectType.FAST_DIGGING))
                        {
                            if(effect.getAmplifier() >= 0)
                            {
                                p.removePotionEffect(PotionEffectType.FAST_DIGGING);
                                p.getInventory().removeItem(new ItemStack(Material.EMERALD_BLOCK, 40));
                                p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, min * 5, 1));p.closeInventory();
                            }
                        }
                    }
                } else{
                    p.getInventory().removeItem(new ItemStack(Material.EMERALD_BLOCK, 40));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, min * 5, 1));p.closeInventory();
                }
            } else{
                p.sendMessage(Utils.chat("&4Brakuje Ci: " + (40 - amount) + " blokow Emeraldow"));p.closeInventory();
            }
        }

        //20 35
        if(clicked.getItemMeta().getLore().get(1).equalsIgnoreCase(Utils.chat("          &f&lStrength 1     "))){
            if(p.getInventory().contains(Material.EMERALD_BLOCK, 20)){
                p.getInventory().removeItem(new ItemStack(Material.EMERALD_BLOCK, 20));
                p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, min * 5, 0));p.closeInventory();
            } else{
                p.sendMessage(Utils.chat("&4Brakuje Ci: " + (20 - amount) + " blokow Emeraldow"));p.closeInventory();
            }
        }

        if(clicked.getItemMeta().getLore().get(1).equalsIgnoreCase(Utils.chat("          &f&lStrength 2      "))){
            if(p.getInventory().contains(Material.EMERALD_BLOCK, 35)){
                if(p.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE))
                {
                    Collection<PotionEffect> pe = p.getActivePotionEffects();
                    for(PotionEffect effect : pe)
                    {
                        if(effect.getType().equals(PotionEffectType.INCREASE_DAMAGE))
                        {
                            if(effect.getAmplifier() >= 0)
                            {
                                p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
                                p.getInventory().removeItem(new ItemStack(Material.EMERALD_BLOCK, 35));
                                p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, min * 5, 1));p.closeInventory();
                            }
                        }
                    }
                } else{
                    p.getInventory().removeItem(new ItemStack(Material.EMERALD_BLOCK, 35));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, min * 5, 1));p.closeInventory();
                }
            } else{
                p.sendMessage(Utils.chat("&4Brakuje Ci: " + (35 - amount) + " blokow Emeraldow"));
                p.closeInventory();
            }
        }


        if(clicked.getItemMeta().getLore().get(1).equalsIgnoreCase(Utils.chat("      &f&lWysokie skakanie"))){
            if(p.getInventory().contains(Material.EMERALD_BLOCK, 15)){
                p.getInventory().removeItem(new ItemStack(Material.EMERALD_BLOCK, 15));
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, min * 5, 0));p.closeInventory();
            } else{
                p.sendMessage(Utils.chat("&4Brakuje Ci: " + (15 - amount) + " blokow Emeraldow"));p.closeInventory();
            }
        }
        PotionEffectType pot;

        List<PotionEffectType> BAD = new ArrayList<PotionEffectType>();
        Collections.addAll(BAD,
                PotionEffectType.BLINDNESS,
                PotionEffectType.WEAKNESS,
                PotionEffectType.SLOW_DIGGING,
                PotionEffectType.SLOW,
                PotionEffectType.WITHER,
                PotionEffectType.POISON,
                PotionEffectType.HUNGER,
                PotionEffectType.BLINDNESS,
                PotionEffectType.HARM
                );


        if(clicked.getItemMeta().getLore().get(1).equalsIgnoreCase(Utils.chat( "     &f&lClear Zlych Efektow"))){
            if(p.getInventory().contains(Material.EMERALD_BLOCK, 15)){
                for (int i = 0; i < BAD.size(); i++){
                    p.removePotionEffect(BAD.get(i));
                }p.closeInventory();
            } else{
                p.sendMessage(Utils.chat("&4Brakuje Ci: " + (15 - amount) + " blokow Emeraldow"));p.closeInventory();
            }
        }

        if(clicked.getItemMeta().getLore().get(1).equalsIgnoreCase(Utils.chat("        &f&lClear Efektow   "))){
            System.out.println(p.getActivePotionEffects());



            for (PotionEffect effect : p.getActivePotionEffects())
                p.removePotionEffect(effect.getType());

        }
    }

}