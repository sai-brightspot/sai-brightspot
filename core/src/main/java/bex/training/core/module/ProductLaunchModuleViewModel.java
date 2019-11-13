package bex.training.core.module;

import com.psddev.cms.view.ViewModel;
import com.psddev.styleguide.core.product_launch_module.ProductLaunchModuleView;
import com.psddev.styleguide.core.product_launch_module.ProductLaunchModuleViewMediaField;

public class ProductLaunchModuleViewModel extends ViewModel<ProductLaunchModule> implements ProductLaunchModuleView {

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
