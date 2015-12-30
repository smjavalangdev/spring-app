
package sm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Main implements CommandLineRunner {
    
    private static final Logger log = LoggerFactory.getLogger(sm.services.Main.class);

    /**
     * ## The Random String Generator
     *
     * This method doesn't do much, except for generating a random string. It:
     *
     *  * Generates a random string at a given length, `length` * Uses only
     * characters in the range given by `from` and `to`.
     *
     * Example:
     *
     * ```java randomString(new Random(), 'a', 'z', 10); ```
     *
     * @param r the random number generator
     * @param from the first character in the character range, inclusive
     * @param to the last character in the character range, inclusive
     * @param length the length of the generated string
     * @return the generated string of length `length`
     */
    @Autowired
    private HelloWorldService hwService;
    
    @Override
    public void run(String... args) {
        log.info("Running Spring Boot Application.");
        log.info(hwService.getHelloMessage());
    }
    
    public static void main(String[] args) throws Exception {
        
        SpringApplication springApp = new SpringApplication(Main.class);
        springApp.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        SpringApplication.run(Main.class, args);
        
    }
    
}
