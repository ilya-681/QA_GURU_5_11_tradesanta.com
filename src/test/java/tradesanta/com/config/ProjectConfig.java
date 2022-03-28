package tradesanta.com.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties",
        "classpath:config/${env}.properties"
})
public interface ProjectConfig extends Config {

    @DefaultValue("chrome")
    @Key("browser")
    String browser();

    @DefaultValue("99.0")
    @Key("browserVersion")
    String browserVersion();

    @DefaultValue("1920x1080")
    @Key("browserSize")
    String browserSize();

    @Key("browserMobileView")
    String browserMobileView();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

    @Key("videoStorage")
    String videoStorage();
}
