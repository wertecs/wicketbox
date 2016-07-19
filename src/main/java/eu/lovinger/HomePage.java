package eu.lovinger;

import eu.lovinger.model.widget.SampleModel;
import eu.lovinger.widgets.SampleWidget;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	// TODO Add any page properties or variables here

    /**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
    public HomePage() {


    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        // Add the simplest type of label
        add(new Label("message", "If you see this message wicket is properly configured and running"));
        add(new SampleWidget("sample", new SampleModel()));

        // TODO Add your page's components here
    }
}
