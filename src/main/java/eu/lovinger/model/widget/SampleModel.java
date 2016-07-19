package eu.lovinger.model.widget;

import org.apache.wicket.model.LoadableDetachableModel;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 7/19/16.
 */
public class SampleModel extends LoadableDetachableModel<String> {


    private static Integer counter = 1;


    @Override
    protected String load() {
        return getLongString(counter++);
    }

    private String getLongString(Integer num)
    {
        String ret = "";
        for(int i = 0 ; i < 10 ; i++)
        {
            ret += String.valueOf(num);
        }
        return  ret;
    }
}
