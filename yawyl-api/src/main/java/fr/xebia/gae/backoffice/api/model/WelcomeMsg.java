package fr.xebia.gae.backoffice.api.model;


public class WelcomeMsg {

    private String message = "welcome";

    public WelcomeMsg() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
