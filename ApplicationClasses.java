class SocialNetwork extends MobileApplication {
    private String websiteUrl;

    public SocialNetwork(String name, String developer, int year, double size, int age, String url) {
        super(name, developer, year, size, age);
        this.websiteUrl = url;
    }

    @Override
    public void launch() { System.out.println(" -> Открываем ленту новостей соцсети."); }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Сайт: " + websiteUrl);
    }
}

class Game extends MobileApplication {
    private String genre;

    public Game(String name, String developer, int year, double size, int age, String genre) {
        super(name, developer, year, size, age);
        this.genre = genre;
    }

    @Override
    public void launch() { System.out.println(" -> Загружаем 3D мир игры."); }

    public void play() { System.out.println("Вы играете в " + getName() + " (жанр: " + genre + ")"); }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Жанр: " + genre);
    }
}

class Weather extends MobileApplication {
    private boolean isPrecise;

    public Weather(String name, String developer, int year, double size, int age, boolean precise) {
        super(name, developer, year, size, age);
        this.isPrecise = precise;
    }

    @Override
    public void launch() { System.out.println(" -> Получаем данные со спутников погоды."); }

    public void checkPrecipitation() {
        System.out.println("Проверка осадков: " + (isPrecise ? "Высокая точность" : "Примерные данные"));
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Точность: " + (isPrecise ? "Высокая" : "Средняя"));
    }
}
