package org.example;

public class DialogoAutenticacao implements IMediador {
    private String titulo;
    private CaixaDeSelecao loginOuRegistroChkBx;
    private CaixaDeTexto loginUsuario, loginSenha;
    private CaixaDeTexto registroUsuario, registroSenha, registroEmail;
    private Botao botao, botaoCancelar;

    public DialogoAutenticacao() {
        loginOuRegistroChkBx = new CaixaDeSelecao(this);
        loginUsuario = new CaixaDeTexto(this);
        loginSenha = new CaixaDeTexto(this);
        registroUsuario = new CaixaDeTexto(this);
        registroSenha = new CaixaDeTexto(this);
        registroEmail = new CaixaDeTexto(this);
        botao = new Botao(this);
        botaoCancelar = new Botao(this);
    }
    public void notificar(Componente remetente, String evento) {
        System.out.println("Notificação recebida. Remetente: " +
                remetente.getClass().getSimpleName() + ", Evento: " + evento);

        if (remetente == loginOuRegistroChkBx && evento.equals("check")) {
            if (loginOuRegistroChkBx.estaMarcado()) {
                titulo = "Login";
                System.out.println("Título alterado para: " + titulo);
            } else {
                titulo = "Registrar";
                System.out.println("Título alterado para: " + titulo);
            }
        }
        if (remetente == botao && evento.equals("click")) {
            if (loginOuRegistroChkBx.estaMarcado()) {
                boolean encontrado = false;
                if (!encontrado) {
                    System.out.println("Usuário não encontrado. Mostrando mensagem de erro.");
                }
            } else {
                System.out.println("Registrando novo usuário.");
            }
        }
    }
}
