package jammazwan.xay;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class XayRoutes extends RouteBuilder {

	@Autowired
	private XayProcessor xayProcessor;

	@Override
	public void configure() throws Exception {
		from("cxf:bean:eventPassEndpoint").process(xayProcessor).log("\n\n${body}\n\n");
	}
}
