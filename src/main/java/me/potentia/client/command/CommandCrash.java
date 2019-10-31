package me.potentia.client.command;

import me.potentia.client.module.Modules;
import me.potentia.client.util.ChatUtils;
import me.potentia.client.module.Module;

public class CommandCrash extends Command {

    @Override
    public boolean onCommand(String command, String[] args) {
        Module crasher = Modules.getById("crash");
        Modules.toggle(crasher.getId());
        ChatUtils.printMessage(ChatUtils.toggledMsg(crasher));
        return false;
    }

    @Override
    public String getUsage() {
        return "crash";
    }

    @Override
    public String getDescription() {
        return "Used to crash";
    }

}
