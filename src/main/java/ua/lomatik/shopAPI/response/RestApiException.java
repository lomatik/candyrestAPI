package ua.lomatik.shopAPI.response;

public class RestApiException extends RuntimeException{
    public RestApiException(String message) {
        super(message);
    }

}
