package eu.lovinger.page;

import eu.lovinger.model.widget.SampleModel;
import eu.lovinger.widgets.SampleWidget;
import org.apache.wicket.markup.html.WebPage;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 7/19/16.
 */
public class SamplesPage extends WebPage  {

    private static final long serialVersionUID = 1L;

    public SamplesPage() {
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();

        add(new SampleWidget("sample", new SampleModel()));
    }


}
