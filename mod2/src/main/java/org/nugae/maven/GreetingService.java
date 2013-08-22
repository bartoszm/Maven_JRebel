package org.nugae.maven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * User: bartosz.michalik@gmail.com
 * Date: 21.08.13
 * Time: 22:09
 */
@Service("greeting")
class GreetingService implements SimpleService {

    @Value("${greeter.name}")
    private String name;

    @Override
    public String doMagic() {
        return "hello " + name;
    }


}
