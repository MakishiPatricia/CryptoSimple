package service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import dao.FavotitosDAO;
import model.moeda;

public class MoedaService {

    private static String URL_PATH = "https://economia.awesomeapi.com.br/json/last/BTC-BRL";

    /**
     * @return
     */
    public RespostaAPI execute() {

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL_PATH))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            return gson.fromJson(response.body(), RespostaAPI.class);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
            // TODO: handle exception
        }

    }

    public static void main(String[] args) {

        MoedaService service = new MoedaService();
        RespostaAPI resposta = service.execute();

        if (resposta != null && resposta.getBTCBRL() != null) {

            System.out.println("Nome: " + resposta.getBTCBRL().getName());
            System.out.println("Preço (bid): " + resposta.getBTCBRL().getBid());

        } else {
            System.out.println("Erro ao buscar dados da API.");
        }

        // 1. Pegar a resposta que veio da API
        NomePreco banco = resposta.getBTCBRL();

        // 2. Criar o objeto moeda e preencher os dados que vieram da API
        moeda m = new moeda();
        m.setNome(banco.getName());
        m.setPreco(Double.parseDouble(banco.getBid()));

        // 3. Chamar o seu DAO para salvar a moeda no banco
        new FavotitosDAO().salvarMoeda(m);

        System.out.println(">>> Dados gravados no MySQL com sucesso!");




    }


}
