package polimorfismo.src.apps;

public class FacebookMensseger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem pelo facebook");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo facebook");
	}
    /* public void enviarMensagem( {
        //primeiro confirmar se esta conectado a internet
        validarConectadoInternet();

        System.out.println("Enviando mensagem facebook");

        //depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();


    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem facebook");
    }

    //métodos privadas, visíveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    } */
}
