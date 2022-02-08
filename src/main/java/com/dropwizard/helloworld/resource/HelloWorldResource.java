
/**
 *
 */
package com.dropwizard.helloworld.resource;

import com.dropwizard.helloworld.Player;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.URL;


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
                "<CENTER><IMG SRC=\"https://upload.wikimedia.org/wikipedia/commons/d/da/The_Parthenon_in_Athens.jpg\" ALIGN=\"TOP\"> </CENTER>\n" +
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
                "Send me mail at <a href=\"mailto:wharris1597@gmail.com\">\n" +
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

        String newHTML = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Learning HTML with External CSS</h2>\n" +
                "<p class=\"blue\">This is a blue color paragraph</p>\n" +
                "<p class=\"red\">This is a red color paragraph</p>\n" +
                "<p class=\"green\">This is a green color paragraph</p>\n" +
                "</body>\n" +
                "</html>  ";
        return newHTML;

    }

}
