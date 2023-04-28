package src.lotr;

/**
 *  Interface - IHttpRequest
 *  Description - Interface to process HTTP get request.
 *  Implemented By - HandleHttpRequest class
 */
public interface IHttpRequest {
     String handleGetRequest(String endpoint);
}
