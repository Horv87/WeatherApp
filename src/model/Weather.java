package model;

/**
 * Created by martin on 14.12.16.
 */
public class Weather {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    private String main;
    private String description;
    private String icon;

    public Weather(int id, String main, String description, String icon){

        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;

    }
}
