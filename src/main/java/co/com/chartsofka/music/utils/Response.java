package co.com.chartsofka.music.utils;


public class Response {


    public Boolean error;
    public String message;

    public Object data;

    public Response() {
        error = false;
        message = "";
        data = null;
    }

    public void restart() {
        error = false;
        message = "";
        data = null;
    }
}