package Equacao2g;

import java.lang.Math;

public class EqX1X2 extends Equacao {
    private double x1;
    private double x2;

    // #region Getters e Setters
    public double getCalculaX1() {
        return x1;
    }

    public void setCalculaX1(double x1) {
        this.x1 = x1;
    }

    public double getCalculaX2() {
        return x2;
    }

    public void setCalculaX2(double x2) {
        this.x2 = x2;
    }
    // #endregion

    // #region Regras de Negócios

    public double calculaX1(Delta n) {
        x1 = (-(n.getNB()) + Math.sqrt(n.getDelta())) / (2 * n.getNA());
        return x1;
    }

    public double calculaX2(Delta n) {
        x2 = (-(n.getNB()) - Math.sqrt(n.getDelta())) / (2 * n.getNA());
        return x2;
    }
    // #endregion
}
