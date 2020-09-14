public class Calculator {
    Double operandOne;
    String operation;
    Double operandTwo;
    Double result;






    public Calculator (){
    }





    public void setOperandOne(Double operandOne) {
        this.operandOne = operandOne;
    }

    public Double getOperandOne(){
        return this.operandOne;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation(){
        return this.operation;
    }

    public void setOperandTwo(Double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public Double getOperandTwo(){
        return this.operandTwo;
    }
    

    public void performOperation() {
        if (operation.equals("+")) {
			result = operandOne + operandTwo;
		}
		else if (operation.equals("-")) {
			result = operandOne - operandTwo;
		}
    }

    public void getResults() {
        System.out.println(result);
    }

}