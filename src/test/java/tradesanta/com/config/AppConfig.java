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

    @Key("telegrammLink")
    @DefaultValue("https://t.me/joinchat/UXVKxRWC-f_hSDOS")
    String getTelegrammLink();

    @Key("facebookLink")
    @DefaultValue("https://www.facebook.com/tradesanta")
    String getFacebookLink();

    @Key("twitterLink")
    @DefaultValue("https://twitter.com/trade_santa")
    String getTwitterLink();

    @Key("youtubeLink")
    @DefaultValue("https://www.youtube.com/channel/UCXcw4IIdFNIbBJ2ptUunoQQ/")
    String getYoutubeLink();

    @Key("iosAppLink")
    @DefaultValue("https://apps.apple.com/au/app/tradesanta-crypto-trading-bot/id1457051269")
    String getIosAppLink();

    @Key("androidAppLink")
    @DefaultValue("https://play.google.com/store/apps/details?id=com.tradesanta&hl=en")
    String getAndroidAppLink();
}
