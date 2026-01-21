/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastttt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class FacebookoAuth {
       // Replace these with your Facebook App credentials
    //private static final String CLIENT_ID = "1182701540691282"; // your App ID
    //private static final String CLIENT_SECRET = "f57db4b7a025fd45349e09bda8012592"; // your App Secret
    private static final String REDIRECT_URI = "http://localhost:8080/fbcallback";

    /**
     * Returns the URL to open the Facebook login page.
     */
    public static String getAuthUrl() throws Exception {
        return "https://www.facebook.com/v19.0/dialog/oauth"
                + "?client_id=" + CLIENT_ID
                + "&redirect_uri=" + URLEncoder.encode(REDIRECT_URI, "UTF-8")
                + "&response_type=code"
                + "&scope=email,public_profile";
    }

    /**
     * Exchanges the authorization code for an access token.
     * @param code The code received from the Facebook redirect
     * @return true if successful, false otherwise
     */
    public static boolean exchangeCodeForToken(String code) {
        try {
            String tokenUrl = "https://graph.facebook.com/v19.0/oauth/access_token"
                    + "?client_id=" + CLIENT_ID
                    + "&redirect_uri=" + URLEncoder.encode(REDIRECT_URI, "UTF-8")
                    + "&client_secret=" + CLIENT_SECRET
                    + "&code=" + URLEncoder.encode(code, "UTF-8");

            URL url = new URL(tokenUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Facebook token exchange failed. HTTP " + responseCode);
                return false;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();

            System.out.println("Facebook token response: " + response);
            // TODO: Parse JSON to get access_token if needed
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
