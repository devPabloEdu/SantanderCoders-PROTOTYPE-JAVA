public class TesteBotaoPrototype {
    public static void main(String[] args) {
       Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO AZUL");
        System.out.println(botaoAzul);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO AMARELO");
        System.out.println(botaoAmarelo);
    }
}
