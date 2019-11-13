package bex.training.google;

import brightspot.core.site.IntegrationHeadScripts;
import com.psddev.dari.db.Record;

public class GoogleDfpCustom extends Record implements IntegrationHeadScripts {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
