package com.ShadowJesus.Mod;

public class Reference 
{
	public static final String MOD_ID = "sjm";
	public static final String NAME = "Shadow Jesus' Mod";
	public static final String VERSION = "1.0";
	
	public static final String CLIENT_PROXY_CLASS = "com.ShadowJesus.Mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.ShadowJesus.Mod.proxy.ServerProxy";
	
	public static enum MainItems{
		ANTIMATER("antimater", "ItemAntimater"),DARKMATER("darkmater", "ItemDarkmater");
		
		
		private String unlocalizedName;
		private String registryName;
		
		MainItems(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
		}
		
		public String getunlocalizedName()
		{
			return unlocalizedName;
			
		}
		
		public String getRegistryName()
		{
			return registryName;
			
		}
		
	}
}
