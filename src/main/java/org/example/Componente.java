package org.example;

abstract class Componente {
    protected IMediador dialogo;

    public Componente(IMediador dialogo) {
        this.dialogo = dialogo;
    }

    public void clicar() {
        dialogo.notificar(this, "clicado");
    }
    public void pressionarTecla() {
        dialogo.notificar(this, "tecla pressionada");
    }
}
