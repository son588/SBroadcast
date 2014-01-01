package io.github.son588.SBroadcast;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin
{
	
	public ChatColor red = ChatColor.RED;
	public ChatColor dark_red = ChatColor.DARK_RED;
	public ChatColor blue = ChatColor.BLUE;
	public ChatColor green = ChatColor.GREEN;
	public ChatColor white = ChatColor.WHITE;
	public ChatColor gold = ChatColor.GOLD;
	public String name;
	
	
	public Main()
    {
    }

    public void onEnable()
    {
    	this.saveDefaultConfig();
    	name = this.getConfig().getString("name");
        getLogger().info("SBroadcast Enabled.");
    }

    public void onDisable()
    {
        getLogger().info("SBroadcast Enabled.");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[])
    {
    	String cmdn = cmd.getName();
    	if(cmdn.equalsIgnoreCase("bc")){
    		String msg = "";
    		int count=0;
    		for (String s : args) { if(count==0){ count=1;
    		} else { msg = msg + s + " "; } }
    		
    		if(args.length < 2) { sender.sendMessage(dark_red + "[SBC] " + gold + "Usage: /bc red|blue|green|white [message]"); return false;}
    		
    		if(args[0].equalsIgnoreCase("red")){ Bukkit.broadcastMessage(dark_red + "[" + name + "] " + red + msg); } else
    		if(args[0].equalsIgnoreCase("blue")){ Bukkit.broadcastMessage(dark_red + "[" + name + "] " + blue + msg); } else
    		if(args[0].equalsIgnoreCase("green")){ Bukkit.broadcastMessage(dark_red + "[" + name +"] " + green + msg); } else
    		if(args[0].equalsIgnoreCase("white")){ Bukkit.broadcastMessage(dark_red + "[" + name + "] " + white + msg); }
    		else { sender.sendMessage(dark_red + "[" + name + "] " + gold + "Usage: /bc red|blue|green|white [message]"); return false;}
    		
    		return true;
    	}
    		
        return false;
    }
}
