package bex.training.core.module;

import javax.servlet.http.HttpServletRequest;

import brightspot.core.page.CurrentPageViewModel;
import brightspot.core.page.PageViewModel;
import com.psddev.cms.db.PageFilter;
import com.psddev.cms.db.Site;
import com.psddev.cms.view.ViewModel;
import com.psddev.cms.view.ViewResponse;
import com.psddev.cms.view.servlet.CurrentSite;
import com.psddev.dari.util.PageContextFilter;
import com.psddev.styleguide.core.product_launch_module.ProductLaunchModuleView;
import com.psddev.styleguide.core.product_launch_module.ProductLaunchModuleViewMediaField;

public class ProductLaunchModuleViewModel extends ViewModel<ProductLaunchModule> implements ProductLaunchModuleView {

    @CurrentSite
    Site site;

    @CurrentPageViewModel
    PageViewModel pageViewModel;

    @Override
    protected void onCreate(ViewResponse response) {
        System.out.println("Creating Product Launch Module!");

        super.onCreate(response);
    }

    @Override
    public CharSequence getDescription() {
        return model.getDescription();
    }

    @Override
    public CharSequence getEndDate() {
        return model.getDate() != null ? model.getDate().toString() : null;
    }

    @Override
    public Iterable<? extends ProductLaunchModuleViewMediaField> getMedia() {
        return createViews(ProductLaunchModuleViewMediaField.class, model.getImage());
    }

    @Override
    public CharSequence getTitle() {
        return model.getTitle();
    }
}
