public class Calculator {
    Double operandOne;
    String operation;
    Double operandTwo;






    public Calculator (){
    }





    public String performOperation() {
        return this.getOperandOne() + this.getOperation() + this.getOperandTwo();
    }

    public String getResults() {
        return this.performOperation();
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
        if (this.operation = "+"){
            return add();
        }
        else if (this.operation = "-") {
            return subtract();
        }
        else if (this.operation = "*" || this.operation = "x"){
            return multiply();
        }
        else if (this.operation = "/") {
            return divide();
        }
    }

    public void setOperandTwo(Double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public Double getOperandTwo(){
        return this.operandTwo;
    }
    
}