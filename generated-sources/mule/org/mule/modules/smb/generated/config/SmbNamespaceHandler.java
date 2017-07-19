
package org.mule.modules.smb.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/smb</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-19T03:22:28+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class SmbNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(SmbNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [smb] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [smb] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new SmbConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("copy-file", new CopyFileDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("copy-file", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-files", new GetFilesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-files", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("read-file", new ReadFileDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("read-file", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-file", new DeleteFileDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-file", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("move-file", new MoveFileDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("move-file", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("receiver", new ReceiverDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("receiver", "@Source", ex);
        }
    }

}
