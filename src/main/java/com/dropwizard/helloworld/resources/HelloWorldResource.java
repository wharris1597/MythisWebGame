
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
    @Produces (MediaType.TEXT_HTML)
    public String getGreeting () {
        Player newPlayer = Player.getPlayerInstance();
        String newPlayerInfo = newPlayer.toString();
        String HTML = "<HTML>\n" +
                "\n" +
                "<HEAD>\n" +
                "\n" +
                "<TITLE>Mythis Game</TITLE>\n" +
                "\n" +
                "</HEAD>\n" +
                "\n" +
                "<BODY BGCOLOR=\"FFFFFF\">\n" +
                "\n" +
                "<CENTER><IMG SRC=\"clouds.jpg\" ALIGN=\"BOTTOM\"> </CENTER>\n" +
                "\n" +
                "<HR>\n" +
                "\n" +
                "<a href=\"https://williamharris.dev/\">My Website!!</a>\n" +
                "\n" +
                "is a link to another nifty site\n" +
                "\n" +
                "<H1>Mythis Game</H1>\n" +
                "\n" +
                "<H2>New Player Info</H2>\n" +
                "\n" +
                "Send me mail at <a href=\"mailto:support@yourcompany.com\">\n" +
                "\n" +
                "wharris1597@gmail.com</a>.\n" +
                "\n" + "<P> </B>" +
                newPlayerInfo +
                "\n" +
                "<P> <B>Above are your player's stats.</B>\n" +
                "\n" +
                "<BR> <B><I>These reset after each page load.</I></B>\n" +
                "\n" +
                "<HR>\n" +
                "\n" +
                "</BODY>\n" +
                "\n" +
                "</HTML>";
        return HTML;

    }

}
