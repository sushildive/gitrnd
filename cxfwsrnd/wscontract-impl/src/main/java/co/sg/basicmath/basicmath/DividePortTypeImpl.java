package co.sg.basicmath.basicmath;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.sg.basicmath.basicmath.types.OperationResult;

@WebService(targetNamespace = "http://basicmath.sg.co/basicmath/", name = "dividePortType", endpointInterface = "co.sg.basicmath.basicmath.DividePortType")
@XmlSeeAlso({ co.sg.basicmath.basicmath.types.ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@SuppressWarnings("restriction")
public class DividePortTypeImpl implements DividePortType {

	@WebResult(name = "result", targetNamespace = "", partName = "result")
	@WebMethod(action = "http://basicmath.sg.co/basicmath/divideOperation")
	public co.sg.basicmath.basicmath.types.OperationResult divideOperation(
			@WebParam(partName = "operand", name = "operand", targetNamespace = "") co.sg.basicmath.basicmath.types.MathOperands operand) {
		OperationResult result = new OperationResult();
		result.setNumber1(2);
		return result;
	}

}
