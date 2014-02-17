import com.appspot.xebia_gae.startingpoint.Startingpoint;
import com.appspot.xebia_gae.startingpoint.model.WelcomeMsg;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.io.IOException;

public class CallApiTester {


    public static void main(String args[]) throws IOException {

        // Set up the HTTP transport and JSON factory
        HttpTransport httpTransport = new NetHttpTransport();
        JsonFactory jsonFactory = new JacksonFactory();


        Startingpoint.Builder builder = new Startingpoint.Builder(httpTransport, jsonFactory, null);
//        builder.setRootUrl("http://localhost:8080/_ah/api/");
        builder.setRootUrl("https://yawyl-api-dot-xebia-gae.appspot.com/_ah/api/");
//        builder.setRootUrl("https://xebia-gae.appspot.com/_ah/api/");
        Startingpoint service = builder.build();
        WelcomeMsg welcomeMsg = service.welcomeWithName("test").execute();
        System.out.println(welcomeMsg.getMessage());

//        service.greetings().authed().execute()

    }

}
