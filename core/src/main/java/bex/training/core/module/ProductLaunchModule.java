package bex.training.core.module;

import java.util.Date;

import brightspot.core.image.Image;
import brightspot.core.module.ModuleType;

public class ProductLaunchModule extends ModuleType {

    private String title;

    private String test;

    private String description;

    private Image image;

    private Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
