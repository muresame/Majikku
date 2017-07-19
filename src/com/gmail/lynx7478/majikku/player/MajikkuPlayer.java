package com.gmail.lynx7478.majikku.player;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import com.gmail.lynx7478.majikku.CAD;

public class MajikkuPlayer 
{
	
	private OfflinePlayer bukkitPlayer;
	private String name;
	private int level;
	private double power;
	private double basePower;
	private CAD[] cads;
	
	public MajikkuPlayer(Player p)
	{
		this.bukkitPlayer = p;
		this.name = p.getName();
		
		this.level = 1;
		this.power = 50.0;
		this.basePower = 50.0;
		this.cads = new CAD[8];
	}
	
	public MajikkuPlayer(OfflinePlayer p, int level, double power, double basePower,  CAD[] cads)
	{
		this.bukkitPlayer = p;
		this.name = p.getName();
		
		this.level = level;
		this.power = power;
		this.cads = cads;
		this.basePower = basePower;
	}
	
	public OfflinePlayer getPlayer()
	{
		return bukkitPlayer;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public double getPower()
	{
		return power;
	}
	
	public double getBasePower()
	{
		return basePower;
	}
	
	public CAD[] getCADs()
	{
		return cads;
	}

}