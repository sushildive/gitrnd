package co.sg.client;

import co.sg.basicmath.basicmath.DividePortType;
import co.sg.basicmath.basicmath.DividePortTypeImplService;
import co.sg.basicmath.basicmath.types.MathOperands;

public class Bootstrap {
	public static void main(String[] args) {
		DividePortTypeImplService mathOperationsServiceSOAP = new DividePortTypeImplService();
		DividePortType dividePortType = mathOperationsServiceSOAP.getDividePortTypePort();
		MathOperands mo = new MathOperands();
		mo.setNumber1(1);
		mo.setNumber2(2);
		dividePortType.divideOperation(new MathOperands());
	}
}
