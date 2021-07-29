package tradesanta.com.pages;

public enum Links {
    TELEGRAM_LINK("https://t.me/joinchat/UXVKxRWC-f_hSDOS"),
    FACEBOOK_LINK("https://www.facebook.com/tradesanta"),
    TWITTER_LINK("https://twitter.com/trade_santa"),
    YOUTUBE_LINK("https://www.youtube.com/channel/UCXcw4IIdFNIbBJ2ptUunoQQ/"),
    IOS_APP_LINK("https://apps.apple.com/au/app/tradesanta-crypto-trading-bot/id1457051269"),
    ANDROID_APP_LINK("https://play.google.com/store/apps/details?id=com.tradesanta&hl=en");

    private String link;

    private Links(String url)
    {
        this.link = url;
    }

    public String getURL()
    {
        return link;
    }
}