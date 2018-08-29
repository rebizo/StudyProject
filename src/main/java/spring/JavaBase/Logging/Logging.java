package spring.JavaBase.Logging;

import java.util.logging.*;

public class Logging {

        private static void configureLogging() {

            final Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
            loggerA.setLevel(Level.ALL);

            final Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
            loggerB.setLevel(Level.WARNING);


            final Logger loggerC = Logger.getLogger("org.stepic.java");
            loggerC.setLevel(Level.ALL);
            loggerC.setUseParentHandlers(false);

            Handler handlerC = new ConsoleHandler();
            handlerC.setLevel(Level.ALL);
            handlerC.setFormatter(new XMLFormatter());
            loggerC.addHandler(handlerC);

        }

        public static void main(String[] args) {
            configureLogging();
        }
}