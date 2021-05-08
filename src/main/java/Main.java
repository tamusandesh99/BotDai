import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;

public class Main {
    public static String prefix = "!";

    public static void main(String[] args) throws LoginException{
        JDA jda = JDABuilder.createDefault("ODMwMTg3MTE4Mjk4MjY3Njc5.YHDCAQ.WLGB-ormFLnglpWNw-l2i8iFLqY").build();
        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.getPresence().setActivity(Activity.watching("Tero bau ko tauko"));
        jda.addEventListener(new commands());
//        jda.addEventListener(new register());
//        jda.addEventListener(new scrim());
    }
}

