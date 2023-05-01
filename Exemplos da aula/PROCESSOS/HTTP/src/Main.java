package HTTP.src;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(new URI("https://www.uol.com.br")).GET().build();
        CompletableFuture<HttpResponse<String>> resp = client.sendAsync(request, BodyHandlers.ofString());
        resp.thenAccept((HttpResponse<String> s) -> System.out.println(s.body()));
        while(true);
    }
}
