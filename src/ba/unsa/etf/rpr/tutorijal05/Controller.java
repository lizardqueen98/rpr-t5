package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

import static java.lang.Math.round;

public class Controller
{
    private enum Operator {PLUS, MINUS, MNOZENJE, DIJELJENJE, JEDNAKO, MOD};
    private SimpleStringProperty number;
    private Operator operator = Operator.JEDNAKO;
    private double result = 0;
    private boolean unesen=false;
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
        if(unesen){
            numberProperty().setValue("");
            unesen=false;
        }
        else if((getNumber().equals("0") && !num.equals("."))) {
            numberProperty().setValue(num);
            return;
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
                result /= operand;
                break;
            case MOD:
                result %= operand;
                break;
        }

        numberProperty().setValue(String.valueOf(result));
        operator = o;
        unesen=true;
    }

    public void btnDot(ActionEvent actionEvent) {
        staviBroj(".");
    }

    public void btnEquals(ActionEvent actionEvent) {
        racun(Operator.JEDNAKO);
    }

    public void btnDiv(ActionEvent actionEvent) {
        racun(Operator.DIJELJENJE);
    }

    public void btnAdd(ActionEvent actionEvent) {
        racun(Operator.PLUS);
    }

    public void btnMod(ActionEvent actionEvent) {
        racun(Operator.MOD);
    }

    public void btnMul(ActionEvent actionEvent) {
        racun(Operator.MNOZENJE);
    }

    public void btnSub(ActionEvent actionEvent) {
        racun(Operator.MINUS);
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
