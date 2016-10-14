package com.ShadowJesus.Mod.init;

import com.ShadowJesus.Mod.Reference;
import com.ShadowJesus.Mod.items.ItemAntimater;
import com.ShadowJesus.Mod.items.ItemDarkmater;
import com.ShadowJesus.Mod.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	
	public static Item antimater;
	public static Item darkmater;
	
	public static void init()
	{
		antimater = new ItemAntimater();
		darkmater = new ItemDarkmater();
	
	}
	
	public static void register()
	{
		GameRegistry.register(antimater);
		GameRegistry.register(darkmater);
	}
	
	public static void registerRenders()
	{
		registerRender(antimater);
		registerRender(darkmater);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
