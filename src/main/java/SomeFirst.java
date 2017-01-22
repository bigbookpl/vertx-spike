import io.vertx.core.AbstractVerticle;

/**
 * Created by bigbook on 20.03.16.
 */
import io.vertx.core.AbstractVerticle;
import io.vertx.example.util.Runner;
import io.vertx.ext.web.Router;


    public class Server extends AbstractVerticle {

        // Convenience method so you can run it in your IDE
        public static void main(String[] args) {
            Runner.runExample(Server.class);
        }

        @Override
        public void start() throws Exception {

            Router router = Router.router(vertx);

            router.route().handler(routingContext -> {
                routingContext.response().putHeader("content-type", "text/html").end("Hello World!");
            });

            vertx.createHttpServer().requestHandler(router::accept).listen(8080);
        }
    }
}
