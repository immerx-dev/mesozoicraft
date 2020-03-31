package immerx.mesozoicraft.objects.items;

import immerx.mesozoicraft.init.ItemInit;
import immerx.mesozoicraft.Main;
import immerx.mesozoicraft.util.ModelInterface;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ModelInterface
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
