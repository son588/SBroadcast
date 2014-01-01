package io.github.son588.SBroadcast;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin
{

    public Main()
    {
    }

    public void onEnable()
    {
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
    		if(args.length > 0){
    			if(args[0].equalsIgnoreCase("red")){
    				String msg = "";
    				for (String s : args){
    					if(!s.contains("red")) { msg = msg + s + " "; }
    				}
    				Bukkit.broadcastMessage(ChatColor.DARK_RED + "[SBC] " + ChatColor.RED + msg);
    				return true;
    			}
    		}else if(args.length > 0){
    			if(args[0].equalsIgnoreCase("blue")){
    				String msg = "";
    				for (String s : args){
    					if(!s.contains("blue")) { msg = msg + s + " "; }
    				}
    				Bukkit.broadcastMessage(ChatColor.DARK_RED + "[SBC] " + ChatColor.BLUE + msg);
    				return true;
    			}
    		}else if(args.length > 0){
    			if(args[0].equalsIgnoreCase("green")){
    				String msg = "";
    				for (String s : args){
    					if(!s.contains("green")) { msg = msg + s + " "; }
    				}
    				Bukkit.broadcastMessage(ChatColor.DARK_RED + "[SBC] " + ChatColor.GREEN + msg);
    				return true;
    			}
    		}else if(args.length > 0){
    			if(args[0].equalsIgnoreCase("white")){
    				String msg = "";
    				for (String s : args){
    					if(!s.contains("white")) { msg = msg + s + " "; }
    				}
    				Bukkit.broadcastMessage(ChatColor.DARK_RED + "[SBC] " + ChatColor.WHITE + msg);
    				return true;
    			}
    		}else{
    			sender.sendMessage(ChatColor.GREEN + "Usage: /bc |red|blue|green|white| [message]");
    		}
    	}
    		
        return false;
    }
}