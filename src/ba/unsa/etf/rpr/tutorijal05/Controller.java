package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {
    private enum Operator {ADD, SUB, MUL, DIV, MOD, EQU};
    private SimpleStringProperty number;

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
    }

    public void btn8(ActionEvent actionEvent) {
    }

    public void btn6(ActionEvent actionEvent) {
    }

    public void btn9(ActionEvent actionEvent) {
    }

    public void btn4(ActionEvent actionEvent) {
    }

    public void btn5(ActionEvent actionEvent) {
    }

    public void btn1(ActionEvent actionEvent) {
    }

    public void btn2(ActionEvent actionEvent) {
    }

    public void btn3(ActionEvent actionEvent) {
    }

    public void btn0(ActionEvent actionEvent) {
    }
}
