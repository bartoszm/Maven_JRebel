package org.nugae.maven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.logging.SimpleFormatter;

/**
 * User: bartosz.michalik@gmail.com
 * Date: 22.08.13
 * Time: 10:15
 */
@Service("age service")
public class AgeService implements SimpleService {
    @Value("${greeter.name}")
    private String name;
    @Value("32.0")
    private Double age;

    @Override
    public String doMagic() {
        return MessageFormat.format("{0} is {1} years old", name, age);
    }
}
