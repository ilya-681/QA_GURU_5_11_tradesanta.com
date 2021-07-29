package tradesanta.com.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties",
        "classpath:config/${env}.properties"
})
public interface AppConfig extends Config {

    @Key("webUrl")
    String webUrl();

    @Key("apiUrl")
    String apiUrl();

    @Key("existingUsername")
    String existingUsername();

    @Key("existingUsernamePassword")
    String existingUsernamePassword();

}
