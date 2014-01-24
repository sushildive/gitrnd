package co.sg.client;

import co.sg.basicmath.basicmath.DividePortType;
import co.sg.basicmath.basicmath.MathOperationsServiceSOAP;
import co.sg.basicmath.basicmath_types.MathOperands;

public class Bootstrap {
	public static void main(String[] args) {
		MathOperationsServiceSOAP mathOperationsServiceSOAP = new MathOperationsServiceSOAP();
		DividePortType dividePortType = mathOperationsServiceSOAP.getMathOperationPortSOAP();
		MathOperands mo = new MathOperands();
		mo.setNumber1(1);
		mo.setNumber2(2);
		dividePortType.divideOperation(new MathOperands());
	}
}
