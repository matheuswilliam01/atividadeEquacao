package Equacao2g;

import java.lang.Math;

public class Delta extends Equacao {
    private double delta;

    // #region Getters e Setters
    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
    // #endregion

    // #region Regras de Negócios
    public void calculaDelta() {
        delta = Math.pow(super.getNB(), 2) - (4 * super.getNA() * super.getNC());
    }

    public void validaEquacao() {
        if (super.getNA() == 0) {
            System.out.println("Coeficiente angular nulo, logo não é uma equação do segundo grau.");
            System.out.println("Verifique se a != 0 e tente novamente!");
            System.exit(0);
        }
    }

    public void validaParabola() {
        if (this.getDelta() < 0) {
            System.out.println("Não possui valores reais para formar uma parábola!");
            System.exit(0);
        }
    }
    // #endregion
}
