package src.lotr;

/**
 *  Interface - IRepository
 *  Description - Interface for all API operations. Client app will use this interface to access API.
 *  Implemented By - LordOfTheRingAPI class
 */
public interface IRepository {

    String getAllMovies();
    String getMovieById(String movieId);
    String getMovieQuoteByMovieId(String movieId);
    String getAllMovieQuotes();
    String getMovieQuotesByQuoteId(String quoteId);
}
