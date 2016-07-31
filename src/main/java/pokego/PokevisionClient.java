package pokego;

import org.glassfish.jersey.jackson.JacksonFeature;
import pokego.PokeVisionResponse.Pokemon;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class PokevisionClient {

    List<String> lastIds = new ArrayList<>();

    public List<Pokemon> findByLatLgn(double lat, double lgn, double radius) {
        List<Pokemon> pokemons = fetchFromPokevision(lat, lgn).stream()
                .filter(pokemon ->
                        calcDistance(lat, lgn, pokemon.getLatitude(), pokemon.getLongitude()) < radius && // 半径以内
                                !lastIds.contains(pokemon.getId()) // 初出
                )
                .collect(Collectors.toList());

        lastIds.clear();
        pokemons.forEach(pokemon -> lastIds.add(pokemon.getId()));

        return pokemons;
    }

    private List<Pokemon> fetchFromPokevision(double lat, double lgn) {
        Client client = ClientBuilder.newBuilder()
                .register(JacksonFeature.class)
                .build();
        Response jsonResponse = client
                .target("https://pokevision.com/map/data/" + lat + "/" + lgn)
                .request(MediaType.APPLICATION_JSON).get();
        return jsonResponse.readEntity(PokeVisionResponse.class).getPokemons();
    }

    private double calcDistance(double lat1, double lgn1, double lat2, double lgn2) {
        double r = 6378137; // 赤道半径[m]
        // 地点1
        lat1 = lat1 * PI / 180;
        lgn1 = lgn1 * PI / 180;
        // 地点2
        lat2 = lat2 * PI / 180;
        lgn2 = lgn2 * PI / 180;
        // 2点間の距離[m]
        return r * acos(sin(lat1) * sin(lat2) + cos(lat1) * cos(lat2) * cos(lgn2 - lgn1));
    }

}
