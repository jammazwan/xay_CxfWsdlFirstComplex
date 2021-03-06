package jammazwan.xay;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-06-17T11:01:24.424-05:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "XayServiceService", 
                  wsdlLocation = "classpath:wsdl/eventPass.wsdl",
                  targetNamespace = "http://xay.jammazwan/") 
public class XayServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://xay.jammazwan/", "XayServiceService");
    public final static QName XayServicePort = new QName("http://xay.jammazwan/", "XayServicePort");
    static {
        URL url = XayServiceService.class.getClassLoader().getResource("wsdl/eventPass.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(XayServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/eventPass.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public XayServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public XayServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public XayServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public XayServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public XayServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public XayServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns XayService
     */
    @WebEndpoint(name = "XayServicePort")
    public XayService getXayServicePort() {
        return super.getPort(XayServicePort, XayService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns XayService
     */
    @WebEndpoint(name = "XayServicePort")
    public XayService getXayServicePort(WebServiceFeature... features) {
        return super.getPort(XayServicePort, XayService.class, features);
    }

}
