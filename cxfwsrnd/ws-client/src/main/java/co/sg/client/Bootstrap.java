package co.sg.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import co.sg.basicmath.basicmath.DividePortType;
import co.sg.basicmath.basicmath.DividePortTypeImplService;
import co.sg.basicmath.basicmath.types.MathOperands;
import co.sg.basicmath.basicmath.types.OperationResult;

public class Bootstrap {
	public static void main(String[] args) {
		URL url = Bootstrap.class.getResource("/basicmath.wsdl");
		QName serviceQName = new QName("http://basicmath.sg.co/basicmath/",
				"DividePortTypeImplService");

		DividePortTypeImplService mathOperationsServiceSOAP = new DividePortTypeImplService(
				url, serviceQName);
		DividePortType dividePortType = mathOperationsServiceSOAP
				.getDividePortTypePort();

		((BindingProvider) dividePortType).getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://localhost:8080/wsapp/services/Samplews");
		MathOperands mo = new MathOperands();
		mo.setNumber1(7);
		mo.setNumber2(2);
		OperationResult or = dividePortType.divideOperation(mo);
		System.out.println(or.getNumber1());
	}
}
