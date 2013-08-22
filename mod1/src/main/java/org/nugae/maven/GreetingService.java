package org.nugae.maven;

import org.springframework.stereotype.Service;

/**
 * User: bartosz.michalik@gmail.com
 * Date: 21.08.13
 * Time: 22:09
 */
@Service("greeting")
class GreetingService implements SimpleService {
    @Override
    public String doMagic() {
        return "hello";
    }
}
