package me.color.Main;

import me.color.gui.Gefekty;
import me.color.gui.Listeners;
import me.color.komendy.Cefekt;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {


        System.out.println(getIP());
        new Cefekt(this);
        new Listeners(this);
        Gefekty.initialize();
    }

    public static String getIP() {
        try {
            return new BufferedReader(new InputStreamReader(new URL("http://checkip.amazonaws.com").openStream())).readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
