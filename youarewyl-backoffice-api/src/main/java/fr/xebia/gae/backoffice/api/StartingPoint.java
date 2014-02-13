package fr.xebia.gae.backoffice.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import fr.xebia.gae.backoffice.api.model.WelcomeMsg;


@Api(
        name = "startingpoint",
        version = "v1"
)
public class StartingPoint {

    @ApiMethod(name = "welcome", httpMethod = "get")
    public WelcomeMsg getWelcome() {
        return new WelcomeMsg();
    }

}
