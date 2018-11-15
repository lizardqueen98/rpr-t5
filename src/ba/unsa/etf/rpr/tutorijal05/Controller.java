package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {
    private enum Operator {PLUS, MINUS, MNOZENJE, DIJELJENJE, JEDNAKO, MOD};
    private SimpleStringProperty number;
    private Operator operator = Operator.JEDNAKO;
    private double result = 0;
    public Controller() {
        number = new SimpleStringProperty();
        number.set("0");
    }
    public SimpleStringProperty numberProperty() {
        return number;
    }
    public String getNumber() {
        return number.get();
    }
    private void staviBroj(String num) {

        if((getNumber().equals("0") && !num.equals("."))) {
            numberProperty().setValue(num);
        }

        numberProperty().setValue(getNumber().concat(num));
    }
    private void racun(Operator o) {
        double operand = Double.valueOf(getNumber());

        switch (operator) {
            case JEDNAKO:
                result = operand;
                break;
            case PLUS:
                result += operand;
                break;
            case MINUS:
                result -= operand;
                break;
            case MNOZENJE:
                result*= operand;
                break;
            case DIJELJENJE:
                //Err
                result /= operand;
                break;
            case MOD:
                //Err
                result %= operand;
                break;
        }

        numberProperty().setValue("" + result);
        //oClear = true;
        operator = o;
    }

    public void btnDot(ActionEvent actionEvent) {
    }

    public void btnEquals(ActionEvent actionEvent) {
    }

    public void btnDiv(ActionEvent actionEvent) {
    }

    public void btnAdd(ActionEvent actionEvent) {
    }

    public void btnMod(ActionEvent actionEvent) {
    }

    public void btnMul(ActionEvent actionEvent) {
    }

    public void btnSub(ActionEvent actionEvent) {
    }

    public void btn7(ActionEvent actionEvent) {
        staviBroj("7");
    }

    public void btn8(ActionEvent actionEvent) {
        staviBroj("8");
    }

    public void btn6(ActionEvent actionEvent) {
        staviBroj("6");
    }

    public void btn9(ActionEvent actionEvent) {
        staviBroj("9");
    }

    public void btn4(ActionEvent actionEvent) {
        staviBroj("4");
    }

    public void btn5(ActionEvent actionEvent) {
        staviBroj("5");
    }

    public void btn1(ActionEvent actionEvent) {
        staviBroj("1");
    }

    public void btn2(ActionEvent actionEvent) {
        staviBroj("2");
    }

    public void btn3(ActionEvent actionEvent) {
        staviBroj("3");
    }

    public void btn0(ActionEvent actionEvent) {
        staviBroj("0");

    }
}
