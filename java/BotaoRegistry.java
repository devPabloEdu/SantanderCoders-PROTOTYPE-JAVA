import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {

    private static BotaoRegistry botaoRegistry;

    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static{
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.FINA);
        REGISTRY.put("BOTAO AMARELO", botaoAmarelo);

        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("vermelho");
        botaoVermelho.setAltura(50);
        botaoVermelho.setLargura(150);
        botaoVermelho.setTipoBorda(TipoBordaEnum.GROSSA);
        REGISTRY.put("BOTAO VERMELHO", botaoVermelho);


        Botao botaoAzul = new Botao();
        botaoAzul.setCor("azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);
        REGISTRY.put("BOTAO AZUL", botaoAzul);

    }

    public static BotaoRegistry getInstance(){
        if(Objects.isNull(botaoRegistry)){
            botaoRegistry = new BotaoRegistry();
            return botaoRegistry;
        }
        return  botaoRegistry;
    }

    public static Botao getBotao(String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

}
