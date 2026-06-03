public class Main {
    static void main() {
        SocialNetwork social = new SocialNetwork("VKontakte", "VK Group", 2006, 150.5, 12, "vk.com");
        Game game = new Game("Genshin Impact", "HoYoverse", 2020, 25000.0, 16, "Action RPG");
        Weather weather = new Weather("Gismeteo", "MapMakers", 2010, 45.2, 3, true);

        social.displayInfo();
        social.launch();
        social.update("5.1.4");

        System.out.println("\n");

        game.displayInfo();
        game.launch();
        game.play();

        System.out.println("\n");

        weather.displayInfo();
        weather.launch();
        weather.checkPrecipitation();

        System.out.println("\nВсего приложений в системе: " + Application.getAppCount());
    }
}
