public abstract class Application {
    private String name;
    private String developer;
    private int releaseYear;
    private static int appCount = 0;

    public Application() {
        this.name = "Unknown";
        this.developer = "Unknown";
        this.releaseYear = 2024;
        appCount++;
    }

    public Application(String name, String developer, int year) {
        this.name = name;
        this.developer = developer;
        this.releaseYear = year;
        appCount++;
    }

    public static int getAppCount() { return appCount; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public abstract void launch();

    public void displayInfo() {
        System.out.print(name + " (" + developer + ", " + releaseYear + "г.)");
    }
}

abstract class MobileApplication extends Application {
    private double sizeMb;
    private int ageRating;

    public MobileApplication(String name, String developer, int year, double size, int age) {
        super(name, developer, year);
        this.sizeMb = size;
        this.ageRating = age;
    }

    public void update() {
        System.out.println("Приложение " + getName() + " обновляется...");
    }

    public void update(String version) {
        System.out.println("Приложение " + getName() + " успешно обновлено до версии " + version);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(", Размер: " + sizeMb + "МБ, Рейтинг: " + ageRating + "+");
    }
}
