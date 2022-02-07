
/**
 *
 */
package com.dropwizard.helloworld.resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dropwizard.helloworld.Player;
import com.dropwizard.helloworld.resources.HelloWorldResource;



/**
 * @author wharr
 *
 */
@Path ("hello")
public class HelloWorldResource {
    @GET
    @Produces (MediaType.TEXT_PLAIN)
    public String getGreeting () {
        Player newPlayer = Player.getPlayerInstance();
        String newPlayerInfo = newPlayer.toString();
        return newPlayerInfo;

    }

}
