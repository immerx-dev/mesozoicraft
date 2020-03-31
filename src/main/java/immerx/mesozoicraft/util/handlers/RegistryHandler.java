package immerx.mesozoicraft.util.handlers;

import immerx.mesozoicraft.init.ItemInit;
import immerx.mesozoicraft.util.ModelInterface;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof ModelInterface)
			{
				((ModelInterface)item).registerModels();
			}
		}
	}
}
