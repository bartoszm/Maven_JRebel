package org.nugae.maven;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * User: bartosz.michalik@gmail.com
 * Date: 21.08.13
 * Time: 22:32
 */
@Service("dateService")
public class DateService implements SimpleService {
    @Override
    public String doMagic() {
        return new Date().toString();
    }
}
