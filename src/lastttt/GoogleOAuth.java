package lastttt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class GoogleOAuth {

    private static final String CLIENT_ID =
            "824988333578-1estne2qmrtco8abio0ejqd2b37i3oer.apps.googleusercontent.com";

     //⚠️ Replace this with your real client secret
    private static final String CLIENT_SECRET = "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";

    private static final String REDIRECT_URI =
            "http://localhost:8080/callback";

    public static String getAuthUrl() throws Exception {
        return "https://accounts.google.com/o/oauth2/v2/auth"
                + "?client_id=" + CLIENT_ID
                + "&redirect_uri=" + URLEncoder.encode(REDIRECT_URI, "UTF-8")
                + "&response_type=code"
                + "&scope=" + URLEncoder.encode("email profile", "UTF-8")
                + "&access_type=offline"
                + "&prompt=select_account";
    }

    public static boolean exchangeCodeForToken(String code) {
        try {
            URL url = new URL("https://oauth2.googleapis.com/token");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            String params =
                    "code=" + URLEncoder.encode(code, "UTF-8") +
                    "&client_id=" + URLEncoder.encode(CLIENT_ID, "UTF-8") +
                    "&client_secret=" + URLEncoder.encode(CLIENT_SECRET, "UTF-8") +
                    "&redirect_uri=" + URLEncoder.encode(REDIRECT_URI, "UTF-8") +
                    "&grant_type=authorization_code";

            try (OutputStream os = conn.getOutputStream()) {
                os.write(params.getBytes());
            }

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Token exchange failed. HTTP " + responseCode);
                return false;
            }

            BufferedReader br =
                    new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            br.close();
            System.out.println("Token response: " + response);

            // TODO: Parse JSON and store access_token if needed
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}