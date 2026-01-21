package lastttt;

import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.CountDownLatch;

public class LocalServer {

    private static boolean started = false;
    private static String authCode = null;
    private static CountDownLatch latch;

    public static String startServerAndWaitForCode() throws Exception {
        if (!started) {
            started = true;
            latch = new CountDownLatch(1);

            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

            // Google callback
            server.createContext("/callback", exchange -> {
                URI requestURI = exchange.getRequestURI();
                String query = requestURI.getQuery(); // code=XXXX&scope=...

                if (query != null && query.contains("code=")) {
                    for (String param : query.split("&")) {
                        if (param.startsWith("code=")) {
                            authCode = param.substring("code=".length());
                            break;
                        }
                    }
                }

                String response = "Google login successful! You may close this tab.";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();

                latch.countDown();
            });

            // Facebook callback (kept for later use)
                // Facebook callback
server.createContext("/fbcallback", exchange -> {
    // Extract "code" from query
    String query = exchange.getRequestURI().getQuery(); // code=XXXX&state=...
    if (query != null && query.contains("code=")) {
        for (String param : query.split("&")) {
            if (param.startsWith("code=")) {
                authCode = param.substring("code=".length());
                break;
            }
        }
    }

    String response = "Facebook login successful! You may close this tab.";
    exchange.sendResponseHeaders(200, response.length());
    OutputStream os = exchange.getResponseBody();
    os.write(response.getBytes());
    os.close();

    latch.countDown();
});


            server.start();
        }

        // WAIT until Google redirects back
        latch.await();
        return authCode;
    }
}