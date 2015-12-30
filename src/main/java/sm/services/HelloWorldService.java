/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sm.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 *
 * @author smdeveloper
 */
@Component
public class HelloWorldService {
    
    @Value("${name:World}")
    private String name;
    
    public String getHelloMessage() {
        return "Hello " + this.name;
    }
    
}
