package org.example;

public class CaixaDeSelecao extends Componente{
    private boolean marcado;

    public CaixaDeSelecao(IMediador dialogo) {
        super(dialogo);
    }

    public void marcar() {
        this.marcado = !this.marcado;
        dialogo.notificar(this, "marcado");
    }

    public boolean estaMarcado() {
        return marcado;
    }
}
