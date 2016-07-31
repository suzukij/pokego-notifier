package pokego;

import lombok.extern.slf4j.Slf4j;
import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackMessage;
import pokego.PokeVisionResponse.Pokemon;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Main {

    PokevisionClient pokevisionClient = new PokevisionClient();

    public static void main(String[] args) {
        Main main = new Main();
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> main.run(), 0, 30, TimeUnit.SECONDS);
    }

    private void run() {
        double lat = 35.682104948, lgn = 139.764804507; // 東京駅

        List<Pokemon> pokemons = pokevisionClient.findByLatLgn(lat, lgn, 50d);
        sendSlackMessages(pokemons);
        log.info("{}件 {}", pokemons.size(), pokemons);
    }

    private static void sendSlackMessages(List<Pokemon> pokemons) {
        SlackApi api = new SlackApi("https://hooks.slack.com/services/xxxxx/xxxx/xxxx");
        pokemons.forEach(pokemon -> {
            String text = String.format("%d:%dまで捕獲可能 <%s|POKÉVISIONリンク> <!channel>",
                    pokemon.getExpiration().getHour(), pokemon.getExpiration().getMinute(), pokemon.getPokevisionUrl());
            SlackMessage message = new SlackMessage();
            message.setChannel("#suzuki_test");
            message.setUsername(pokemon.getName());
            message.setIcon(pokemon.getIconUrl());
            message.setText(text);
            api.call(message);
        });
    }

}
