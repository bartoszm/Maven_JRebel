package org.nugae.main;

import org.nugae.maven.Executor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * User: bartosz.michalik@gmail.com
 * Date: 21.08.13
 * Time: 22:11
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        while(true) {
            Executor exe = ctx.getBean(Executor.class);

            exe.run();
            TimeUnit.SECONDS.sleep(3);

        }
    }
}
