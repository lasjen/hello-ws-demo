package no.right;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ResourceConfig config = new ResourceConfig();
        config.packages("no/right");
        ServletHolder servlet = new ServletHolder(new ServletContainer(config));


        Server server = new Server(2222);
        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/*");


        try {
            server.start();
            server.join();
        } catch (Exception e){
            // do noting
        }

        finally {
            server.destroy();
        }

        System.out.println( "Hello World!" );
    }
}
