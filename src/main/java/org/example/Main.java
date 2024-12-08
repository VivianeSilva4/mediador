package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DialogoAutenticacao mediador = new DialogoAutenticacao();

        CaixaDeSelecao loginOuRegistro = new CaixaDeSelecao(mediador);
        CaixaDeTexto loginUsuario = new CaixaDeTexto(mediador);
        CaixaDeTexto loginSenha = new CaixaDeTexto(mediador);
        CaixaDeTexto registroUsuario = new CaixaDeTexto(mediador);
        CaixaDeTexto registroSenha = new CaixaDeTexto(mediador);
        CaixaDeTexto registroEmail = new CaixaDeTexto(mediador);
        Botao botao = new Botao(mediador);
        Botao botaoCancelar = new Botao(mediador);

        loginOuRegistro.marcar();
        botaoCancelar.pressionarTecla();
    }
}