import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class commands extends ListenerAdapter {

    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {

        String messageReceive = event.getMessage().getContentRaw();

        if ((messageReceive.equalsIgnoreCase(Main.prefix + "ava") ||
                (messageReceive.equalsIgnoreCase(Main.prefix + "Ava")))) {
            event.getChannel().sendMessage("Big Fan Ava").queue();
        }

        if (messageReceive.equalsIgnoreCase(Main.prefix + "buddhaisgay")) {
            event.getChannel().sendMessage("No he is not.").queue();
        }

        if (messageReceive.equalsIgnoreCase(Main.prefix + "bubu")) {
            event.getChannel().sendMessage("|| Hehehehe ||").queue();
        }

        if (messageReceive.equalsIgnoreCase(Main.prefix + "Gorilla") ||
                (messageReceive.equalsIgnoreCase(Main.prefix + "gorilla"))){
            event.getChannel().sendMessage("Tech doctor").queue();
        }

        if (messageReceive.equalsIgnoreCase(Main.prefix + "help") ||
                (messageReceive.equalsIgnoreCase(Main.prefix + "Help"))) {
            String help = " `Type !registertime to see how much time is " +
                    "left for registration to open `" +"\n" + " `Type !scrimtime to see " +
                    "how much time is left for scrim to start. `";
            event.getChannel().sendMessage(help).queue();
        }
    }
}



