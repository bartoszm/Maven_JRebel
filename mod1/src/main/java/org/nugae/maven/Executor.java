package org.nugae.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * User: bartosz.michalik@gmail.com
 * Date: 21.08.13
 * Time: 22:12
 */
@Service("executor")
public class Executor {
    private static final Logger LOG = LoggerFactory.getLogger(Executor.class);

    private Set<SimpleService> services;

    public void run() {
        LOG.debug("there are {} services", services.size());
        for (SimpleService service : services) {
            try {
                LOG.info(service.doMagic());
            } catch(Exception e) {
                LOG.error("error", e);
            }
        }
    }

    @Autowired
    public void setServices(Set<SimpleService> services) {
        this.services = services;
    }
}
