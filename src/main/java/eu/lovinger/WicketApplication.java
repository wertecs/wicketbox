package eu.lovinger;

import eu.lovinger.page.SamplesPage;
import org.apache.wicket.Application;
import org.apache.wicket.DefaultPageManagerProvider;
import org.apache.wicket.pageStore.IDataStore;
import org.apache.wicket.pageStore.memory.HttpSessionDataStore;
import org.apache.wicket.pageStore.memory.PageNumberEvictionStrategy;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 */
public class WicketApplication extends WebApplication {
    /**
     * Constructor
     */
    public WicketApplication() {
    }

    /**
     * @see Application#getHomePage()
     */
    public Class<HomePage> getHomePage() {
        return HomePage.class;
    }

    @Override
    protected void init() {
        super.init();
        mountPage("/samples", SamplesPage.class);

        setPageManagerProvider(new DefaultPageManagerProvider(this) {
            protected IDataStore newDataStore() {
                return new HttpSessionDataStore(getPageManagerContext(), new PageNumberEvictionStrategy(20));
            }
        });

    }


}
