package packagegetter;

public class MathEquation {

	private double leftVal;
	private double rightVal;
	private char opCode;
	private double result;

	public void MathEquation(char opCode) {
		this.opCode = opCode;
	}

	public void MathEquation(char opCode, double leftVal, double rigthVal) {
		this.opCode = opCode;
		// this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}

	public void rightVal(char setVal, double leftVal, double rirghtVal) {
		return;
	}

	public double getLeftVal() {
		return leftVal;
	}

	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}

	public double getRightVal() {
		return rightVal;
	}

	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}

	public char getOpCode() {
		return opCode;
	}

	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}

	public double grtResult() {
		return result;
	}

	public void execute() {
		switch (this.opCode) {
		case 'a':
			this.result = leftVal + rightVal;
			break;
		case 's':
			result = leftVal - rightVal;
			break;
		case 'm':
			result = leftVal * rightVal;
			break;
		case 'd':
			this.result = leftVal / rightVal;

			deafault: result = 0;

		}
	}

	public String getResult() {

		return null;
	}

}
