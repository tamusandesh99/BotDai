import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class commands extends ListenerAdapter {

    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {

        String messageReceive = event.getMessage().getContentRaw();

        if (messageReceive.equalsIgnoreCase(Main.prefix + "ava")) {
            event.getChannel().sendMessage("I love you bubu").queue();
        }
        if (messageReceive.equalsIgnoreCase(Main.prefix + "buddhaisgay")) {
            event.getChannel().sendMessage("No he is not.").queue();

        }

        if (messageReceive.equalsIgnoreCase(Main.prefix + "bubu")) {
            event.getChannel().sendMessage("|| I love you scoopum scooopum ||").queue();
        }

        if (messageReceive.equalsIgnoreCase(Main.prefix + "Andrew")) {
            event.getChannel().sendMessage("GoodJob on Activity 6 code. Thank You.").queue();
        }

    }
}



