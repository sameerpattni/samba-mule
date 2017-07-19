
package org.mule.modules.smb.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.smb.SmbConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>SmbConnectorProcessAdapter</code> is a wrapper around {@link SmbConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-19T03:22:28+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class SmbConnectorProcessAdapter
    extends SmbConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<SmbConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, SmbConnectorCapabilitiesAdapter> getProcessTemplate() {
        final SmbConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,SmbConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, SmbConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, SmbConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
