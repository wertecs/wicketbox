package eu.lovinger.widgets;

import eu.lovinger.model.widget.SampleModel;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.GenericPanel;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 7/19/16.
 */
public class SampleWidget extends GenericPanel<String> {

    private String staticString;

    public SampleWidget(String id, SampleModel model) {
        super(id, model);
        this.staticString = model.getObject();
    }


    @Override
    protected void onInitialize() {
        super.onInitialize();

        Label label = new Label("label", getModel());
        Label staticLabel = new Label("staticLabel", staticString);

        add(label);
        add(staticLabel);

    }
}
