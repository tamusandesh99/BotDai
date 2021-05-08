import org.joda.time.DateTime;
import org.joda.time.Seconds;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class scrim extends ListenerAdapter {

    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {

        String messageReceive = event.getMessage().getContentRaw();

        if (messageReceive.equalsIgnoreCase(Main.prefix + "scrimtime")) {

            int year = 2021;
            int month = 4;
            int day = 20;
            int hours = 0;
            int minutes = 0;

            while (day > 0) {

                DateTime dt1 = new DateTime();
                DateTime dt2 = new DateTime(year, month, day, hours, minutes, 0, 0);
                int seconds = Seconds.secondsBetween(dt1, dt2).getSeconds();

                int noOfDays = seconds / (24 * 60 * 60);
                int noOfHours = (seconds % (24 * 60 * 60)) / (60 * 60);
                int noOfMinutes = ((seconds % (24 * 60 * 60)) % (60 * 60)) / 60;
                int noSec = ((seconds % (24 * 60 * 60)) % (60 * 60)) % 60;

                if (noSec > 0) {

                    event.getChannel().sendMessage("Scrim will start in : ** " + noOfDays + " Days " + noOfHours + " Hours " +
                            noOfMinutes + " Minutes " + noSec + " Seconds " + " ** from now.").queue();
                    break;

                } else if (noSec < -1 || noSec == 0) {
                    day = day + 7;

                } else {
                    event.getChannel().sendMessage("Time has expired").queue();
                }
            }

        }

    }
}

