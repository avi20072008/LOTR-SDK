package src.lotr;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *  Class : src.main.java.LordOfTheRingAPI
 *  Description : This class has different API methods to return LOTR related information
 *  Author : Avinash Patil              Date : 27th Apr 2023
 */

public class LordOfTheRingAPI implements IRepository{
        private HandleHttpRequest _handler;
        public LordOfTheRingAPI(){
            this._handler = new HandleHttpRequest();
        }

        /** Method : getAllMovies
         *  Description : API to return all LOTR movies
         *  @input : No inputs required
         *  @return : It returns JSON based response.
         */
        public String getAllMovies(){

            return _handler.handleGetRequest("/movie");
        }

        /** Method : getMovieById
         *  Description : API to return a movie by given Movie ID
         *  @input : Movie Id
         *  @return : It returns JSON based response.
         */
        public String getMovieById(String movieId){

            return _handler.handleGetRequest("/movie/" + movieId);
        }

        /** Method : getMovieQuoteByMovieId
         *  Description : API to return a movie quote by given Movie ID
         *  @input : Movie Id
         *  @return : It returns JSON based response.
         */
        public String getMovieQuoteByMovieId(String movieId){
            return _handler.handleGetRequest("/movie/" + movieId + "/quote");
        }

        /** Method : getAllMovieQuotes
         *  Description : API to return all LOTR movie quotes
         *  @input : None
         *  @return : It returns JSON based response.
         */
        public String getAllMovieQuotes(){

            return _handler.handleGetRequest("/quote/");
        }

        /** Method : getMovieQuotesByQuoteId
         *  Description : API to return a movie quote by given Quote ID
         *  @input : Quote Id
         *  @return : It returns JSON based response.
         */
        public String getMovieQuotesByQuoteId(String quoteId) {

            return _handler.handleGetRequest("/quote/" + quoteId);
        }

}
