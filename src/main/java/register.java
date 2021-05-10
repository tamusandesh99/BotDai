
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class register extends ListenerAdapter {

    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {

        String messageReceive = event.getMessage().getContentRaw();

        if ((messageReceive.equalsIgnoreCase(Main.prefix + "registrationTime") ||
                (messageReceive.equalsIgnoreCase(Main.prefix + "registertime")))) {

            int year = 2021;
            int month = 4;
            int day = 17;
            int hours = 8;
            int minutes = 0;

            while (day < 32) {

                DateTime dt1 = new DateTime();
                DateTime dt2 = new DateTime(year, month, day, hours, minutes, 0, 0);
                int seconds = Seconds.secondsBetween(dt1, dt2).getSeconds();

                int noOfDays = seconds / (24 * 60 * 60);
                int noOfHours = (seconds % (24 * 60 * 60)) / (60 * 60);
                int noOfMinutes = ((seconds % (24 * 60 * 60)) % (60 * 60)) / 60;
                int noSec = ((seconds % (24 * 60 * 60)) % (60 * 60)) % 60;

                if (noSec > 0) {

                    event.getChannel().sendMessage("Register will open in : ** " +
                            noOfDays + " Days " + noOfHours + " Hours " +
                            noOfMinutes + " Minutes " + noSec + " Seconds " + " ** from now.").queue();
                    break;

                } else if (noSec < -1 || noSec == 0) {
                    day = day + 7;

                    if ((month == 4) || (month == 9) || (month == 6) || (month == 11)) {
                        if (day > 30) {
                            month = month + 1;
                            day = (day + 7) - 30;
                        }
                    }
                    else if(month == 2) {
                        if (day > 28) {
                            month = month + 1;
                            day = (day + 7) - 28;
                        }
                    }
                    else {
                        if (day > 31) {
                            month = month + 1;
                            day = (day + 7) - 31;
                        }
                    }

                    if(month > 12) {
                        year = year + 1;
                        month = 1;
                       day = (day + 7) - 31;
                    }
                }
            }
        }
    }
}

