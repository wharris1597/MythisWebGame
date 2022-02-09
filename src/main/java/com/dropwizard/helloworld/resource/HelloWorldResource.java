
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

        String bootstrapHTML = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "    <head>\n" +
                "        <meta charset=\"utf-8\" />\n" +
                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n" +
                "        <meta name=\"description\" content=\"\" />\n" +
                "        <meta name=\"author\" content=\"\" />\n" +
                "        <title>Grayscale - Start Bootstrap Theme</title>\n" +
                "        <link rel=\"icon\" type=\"image/x-icon\" href=\"https://rawgithubusercontent.com/wharris1597/MythisWebGame/master/src/main/resources/assets/favicon.ico\" />\n" +
                "        <!-- Font Awesome icons (free version)-->\n" +
                "        <script src=\"https://use.fontawesome.com/releases/v5.15.4/js/all.js\" crossorigin=\"anonymous\"></script>\n" +
                "        <!-- Google fonts-->\n" +
                "        <link href=\"https://fonts.googleapis.com/css?family=Varela+Round\" rel=\"stylesheet\" />\n" +
                "        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\" />\n" +
                "        <!-- Core theme CSS (includes Bootstrap)-->\n" +
                "        <link href=\"https://rawgithubusercontent.com/wharris1597/MythisWebGame/master/src/main/resources/css/styles.css\" rel=\"stylesheet\" />\n" +
                "    </head>\n" +
                "    <body id=\"page-top\">\n" +
                "        <!-- Navigation-->\n" +
                "        <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\" id=\"mainNav\">\n" +
                "            <div class=\"container px-4 px-lg-5\">\n" +
                "                <a class=\"navbar-brand\" href=\"#page-top\">Start Bootstrap</a>\n" +
                "                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "                    Menu\n" +
                "                    <i class=\"fas fa-bars\"></i>\n" +
                "                </button>\n" +
                "                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n" +
                "                    <ul class=\"navbar-nav ms-auto\">\n" +
                "                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#about\">About</a></li>\n" +
                "                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#projects\">Projects</a></li>\n" +
                "                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#signup\">Contact</a></li>\n" +
                "                    </ul>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </nav>\n" +
                "        <!-- Masthead-->\n" +
                "        <header class=\"masthead\">\n" +
                "            <div class=\"container px-4 px-lg-5 d-flex h-100 align-items-center justify-content-center\">\n" +
                "                <div class=\"d-flex justify-content-center\">\n" +
                "                    <div class=\"text-center\">\n" +
                "                        <h1 class=\"mx-auto my-0 text-uppercase\">Grayscale</h1>\n" +
                "                        <h2 class=\"text-white-50 mx-auto mt-2 mb-5\">A free, responsive, one page Bootstrap theme created by Start Bootstrap.</h2>\n" +
                "                        <a class=\"btn btn-primary\" href=\"#about\">Get Started</a>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </header>\n" +
                "        <!-- About-->\n" +
                "        <section class=\"about-section text-center\" id=\"about\">\n" +
                "            <div class=\"container px-4 px-lg-5\">\n" +
                "                <div class=\"row gx-4 gx-lg-5 justify-content-center\">\n" +
                "                    <div class=\"col-lg-8\">\n" +
                "                        <h2 class=\"text-white mb-4\">Built with Bootstrap 5</h2>\n" +
                "                        <p class=\"text-white-50\">\n" +
                "                            Grayscale is a free Bootstrap theme created by Start Bootstrap. It can be yours right now, simply download the template on\n" +
                "                            <a href=\"https://startbootstrap.com/theme/grayscale/\">the preview page.</a>\n" +
                "                            The theme is open source, and you can use it for any purpose, personal or commercial.\n" +
                "                        </p>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <img class=\"img-fluid\" src=\"https://github.com/wharris1597/MythisWebGame/blob/master/src/main/resources/assets/img/ipad.png?raw=true\" alt=\"...\" />\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <!-- Projects-->\n" +
                "        <section class=\"projects-section bg-light\" id=\"projects\">\n" +
                "            <div class=\"container px-4 px-lg-5\">\n" +
                "                <!-- Featured Project Row-->\n" +
                "                <div class=\"row gx-0 mb-4 mb-lg-5 align-items-center\">\n" +
                "                    <div class=\"col-xl-8 col-lg-7\"><img class=\"img-fluid mb-3 mb-lg-0\" src=\"https://github.com/wharris1597/MythisWebGame/blob/master/src/main/resources/assets/img/bg-masthead.jpg?raw=true\" alt=\"...\" /></div>\n" +
                "                    <div class=\"col-xl-4 col-lg-5\">\n" +
                "                        <div class=\"featured-text text-center text-lg-left\">\n" +
                "                            <h4>Shoreline</h4>\n" +
                "                            <p class=\"text-black-50 mb-0\">Grayscale is open source and MIT licensed. This means you can use it for any project - even commercial projects! Download it, customize it, and publish your website!</p>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <!-- Project One Row-->\n" +
                "                <div class=\"row gx-0 mb-5 mb-lg-0 justify-content-center\">\n" +
                "                    <div class=\"col-lg-6\"><img class=\"img-fluid\" src=\"https://github.com/wharris1597/MythisWebGame/blob/master/src/main/resources/assets/img/demo-image-01.jpg?raw=true\" alt=\"...\" /></div>\n" +
                "                    <div class=\"col-lg-6\">\n" +
                "                        <div class=\"bg-black text-center h-100 project\">\n" +
                "                            <div class=\"d-flex h-100\">\n" +
                "                                <div class=\"project-text w-100 my-auto text-center text-lg-left\">\n" +
                "                                    <h4 class=\"text-white\">Misty</h4>\n" +
                "                                    <p class=\"mb-0 text-white-50\">An example of where you can put an image of a project, or anything else, along with a description.</p>\n" +
                "                                    <hr class=\"d-none d-lg-block mb-0 ms-0\" />\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <!-- Project Two Row-->\n" +
                "                <div class=\"row gx-0 justify-content-center\">\n" +
                "                    <div class=\"col-lg-6\"><img class=\"img-fluid\" src=\"https://github.com/wharris1597/MythisWebGame/blob/master/src/main/resources/assets/img/demo-image-02.jpg?raw=true\" alt=\"...\" /></div>\n" +
                "                    <div class=\"col-lg-6 order-lg-first\">\n" +
                "                        <div class=\"bg-black text-center h-100 project\">\n" +
                "                            <div class=\"d-flex h-100\">\n" +
                "                                <div class=\"project-text w-100 my-auto text-center text-lg-right\">\n" +
                "                                    <h4 class=\"text-white\">Mountains</h4>\n" +
                "                                    <p class=\"mb-0 text-white-50\">Another example of a project with its respective description. These sections work well responsively as well, try this theme on a small screen!</p>\n" +
                "                                    <hr class=\"d-none d-lg-block mb-0 me-0\" />\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <!-- Signup-->\n" +
                "        <section class=\"signup-section\" id=\"signup\">\n" +
                "            <div class=\"container px-4 px-lg-5\">\n" +
                "                <div class=\"row gx-4 gx-lg-5\">\n" +
                "                    <div class=\"col-md-10 col-lg-8 mx-auto text-center\">\n" +
                "                        <i class=\"far fa-paper-plane fa-2x mb-2 text-white\"></i>\n" +
                "                        <h2 class=\"text-white mb-5\">Subscribe to receive updates!</h2>\n" +
                "                        <!-- * * * * * * * * * * * * * * *-->\n" +
                "                        <!-- * * SB Forms Contact Form * *-->\n" +
                "                        <!-- * * * * * * * * * * * * * * *-->\n" +
                "                        <!-- This form is pre-integrated with SB Forms.-->\n" +
                "                        <!-- To make this form functional, sign up at-->\n" +
                "                        <!-- https://startbootstrap.com/solution/contact-forms-->\n" +
                "                        <!-- to get an API token!-->\n" +
                "                        <form class=\"form-signup\" id=\"contactForm\" data-sb-form-api-token=\"API_TOKEN\">\n" +
                "                            <!-- Email address input-->\n" +
                "                            <div class=\"row input-group-newsletter\">\n" +
                "                                <div class=\"col\"><input class=\"form-control\" id=\"emailAddress\" type=\"email\" placeholder=\"Enter email address...\" aria-label=\"Enter email address...\" data-sb-validations=\"required,email\" /></div>\n" +
                "                                <div class=\"col-auto\"><button class=\"btn btn-primary disabled\" id=\"submitButton\" type=\"submit\">Notify Me!</button></div>\n" +
                "                            </div>\n" +
                "                            <div class=\"invalid-feedback mt-2\" data-sb-feedback=\"emailAddress:required\">An email is required.</div>\n" +
                "                            <div class=\"invalid-feedback mt-2\" data-sb-feedback=\"emailAddress:email\">Email is not valid.</div>\n" +
                "                            <!-- Submit success message-->\n" +
                "                            <!---->\n" +
                "                            <!-- This is what your users will see when the form-->\n" +
                "                            <!-- has successfully submitted-->\n" +
                "                            <div class=\"d-none\" id=\"submitSuccessMessage\">\n" +
                "                                <div class=\"text-center mb-3 mt-2 text-white\">\n" +
                "                                    <div class=\"fw-bolder\">Form submission successful!</div>\n" +
                "                                    To activate this form, sign up at\n" +
                "                                    <br />\n" +
                "                                    <a href=\"https://startbootstrap.com/solution/contact-forms\">https://startbootstrap.com/solution/contact-forms</a>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <!-- Submit error message-->\n" +
                "                            <!---->\n" +
                "                            <!-- This is what your users will see when there is-->\n" +
                "                            <!-- an error submitting the form-->\n" +
                "                            <div class=\"d-none\" id=\"submitErrorMessage\"><div class=\"text-center text-danger mb-3 mt-2\">Error sending message!</div></div>\n" +
                "                        </form>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <!-- Contact-->\n" +
                "        <section class=\"contact-section bg-black\">\n" +
                "            <div class=\"container px-4 px-lg-5\">\n" +
                "                <div class=\"row gx-4 gx-lg-5\">\n" +
                "                    <div class=\"col-md-4 mb-3 mb-md-0\">\n" +
                "                        <div class=\"card py-4 h-100\">\n" +
                "                            <div class=\"card-body text-center\">\n" +
                "                                <i class=\"fas fa-map-marked-alt text-primary mb-2\"></i>\n" +
                "                                <h4 class=\"text-uppercase m-0\">Address</h4>\n" +
                "                                <hr class=\"my-4 mx-auto\" />\n" +
                "                                <div class=\"small text-black-50\">4923 Market Street, Orlando FL</div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-md-4 mb-3 mb-md-0\">\n" +
                "                        <div class=\"card py-4 h-100\">\n" +
                "                            <div class=\"card-body text-center\">\n" +
                "                                <i class=\"fas fa-envelope text-primary mb-2\"></i>\n" +
                "                                <h4 class=\"text-uppercase m-0\">Email</h4>\n" +
                "                                <hr class=\"my-4 mx-auto\" />\n" +
                "                                <div class=\"small text-black-50\"><a href=\"#!\">hello@yourdomain.com</a></div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-md-4 mb-3 mb-md-0\">\n" +
                "                        <div class=\"card py-4 h-100\">\n" +
                "                            <div class=\"card-body text-center\">\n" +
                "                                <i class=\"fas fa-mobile-alt text-primary mb-2\"></i>\n" +
                "                                <h4 class=\"text-uppercase m-0\">Phone</h4>\n" +
                "                                <hr class=\"my-4 mx-auto\" />\n" +
                "                                <div class=\"small text-black-50\">+1 (555) 902-8832</div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"social d-flex justify-content-center\">\n" +
                "                    <a class=\"mx-2\" href=\"#!\"><i class=\"fab fa-twitter\"></i></a>\n" +
                "                    <a class=\"mx-2\" href=\"#!\"><i class=\"fab fa-facebook-f\"></i></a>\n" +
                "                    <a class=\"mx-2\" href=\"#!\"><i class=\"fab fa-github\"></i></a>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <!-- Footer-->\n" +
                "        <footer class=\"footer bg-black small text-center text-white-50\"><div class=\"container px-4 px-lg-5\">Copyright &copy; Your Website 2021</div></footer>\n" +
                "        <!-- Bootstrap core JS-->\n" +
                "        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n" +
                "        <!-- Core theme JS-->\n" +
                "        <script src=\"https://rawgithubusercontent.com/wharris1597/MythisWebGame/master/src/main/resources/js/scripts.js\"></script>\n" +
                "        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\n" +
                "        <!-- * *                               SB Forms JS                               * *-->\n" +
                "        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->\n" +
                "        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\n" +
                "        <script src=\"https://cdn.startbootstrap.com/sb-forms-latest.js\"></script>\n" +
                "    </body>\n" +
                "</html>\n";




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
                "\n" +
                "</head>\n" +
                "<style>\n" +
                "    body {background-color: powderblue;}\n" +
                "    h1   {color: blue;}\n" +
                "    p    {color: red;}\n" +
                "</style>\n" +
                "<body>\n" +
                "<h2>Learning HTML with External CSS</h2>\n" +
                "<p class=\"blue\">This is a blue color paragraph</p>\n" +
                "<p class=\"red\">This is a red color paragraph</p>\n" +
                "<p class=\"green\">This is a green color paragraph</p>\n" +
                "</body>\n" +
                "</html>";

        String newHTML2 = "<HTML>\n" +
                "\n" +
                "<HEAD>\n" +
                "\n" +
                "    <TITLE>Mythis Web Game</TITLE>\n" +
                "\n" +
                "</HEAD>\n" +
                "<style>\n" +
                "    body {background-color: powderblue;}\n" +
                "    h1   {color: blue;}\n" +
                "    p    {color: red;}\n" +
                "</style>\n" +
                "\n" +
                "<BODY BGCOLOR=\"FFFFFF\">\n" +
                "\n" +
                "<CENTER><IMG SRC=\"https://github.com/wharris1597/MythisWebGame/blob/master/src/main/resources/parthimage.jpg?raw=true\" ALIGN=\"BOTTOM\"> </CENTER>\n" +
                "\n" +
                "<HR>\n" +
                "\n" +
                "<a href=\"https://www.williamharris.dev\">williamharris.dev</a>\n" +
                "\n" +
                "is a link to my website!\n" +
                "\n" +
                "<H1>Mythis</H1>\n" +
                "\n" +
                "<H2>Thank you for playing!</H2>\n" +
                "\n" +
                "Send me mail at <a href=\"mailto:wharris1597@gmail.com\">\n" +
                "\n" +
                "wharris1597@gmail.com</a>.\n" +
                "\n" + "<P> </B>" +
                newPlayerInfo +
                "\n" +
                "<P> <B>Above are your player's stats.</B>\n" +
                "\n" +
                "    <BR> <B><I>Some information will be included here at some point...</I></B>\n" +
                "\n" +
                "<HR>\n" +
                "\n" +
                "</BODY>\n" +
                "\n" +
                "</HTML>";
        return newHTML2;

    }

}
