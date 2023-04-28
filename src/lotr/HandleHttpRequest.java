package src.lotr;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
/**
 *  Class : HandleHttpRequest
 *  Description : This class handles HTTP Get request and returns JSON result
 *  Author : Avinash Patil              Date : 27th Apr 2023
 */
public class HandleHttpRequest implements IHttpRequest {

    /** Method : handleGetRequest
     *  Description : Method handles HTTP Get request call to given path.
     * @param path - API endpoint
     * @return : It returns JSON based response.
     */
    public String handleGetRequest(String path){
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String response = HandleHttpRequest.executeGet(httpClient, path);
            System.out.println(response);
            return response;
        } catch (IOException | URISyntaxException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Description - Creates & Executes HTTP Get call.
     * @param httpClient
     * @param path
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    private static String executeGet(CloseableHttpClient httpClient, String path) throws IOException, URISyntaxException {
        URI uri = new URI(Constants.BASE_URL + path);
        HttpGet httpGet = new HttpGet(uri);
        addAuthTokenHeader(httpGet);
        return executeRequest(httpClient, httpGet);
    }

    /** Method - addAuthTokenHeader
     * Description - This method adds auth token to the HTTP header.
     * @param httpRequest
     */
    private static void addAuthTokenHeader(HttpRequestBase httpRequest) {
        httpRequest.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + Constants.AUTH_TOKEN);
    }

    private static String executeRequest(CloseableHttpClient httpClient, HttpRequestBase httpRequest) throws ClientProtocolException, IOException {
        try (CloseableHttpResponse httpResponse = httpClient.execute(httpRequest)) {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                return EntityUtils.toString(entity, StandardCharsets.UTF_8);
            }
        }
        return null;
    }
}
