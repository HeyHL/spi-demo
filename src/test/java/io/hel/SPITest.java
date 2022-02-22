package io.hel;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * helei
 * 2022/2/22 10:16
 * description:
 */
@SuppressWarnings("all")
public class SPITest {
    public static void main(String[] args) {
        ServiceLoader<Search> serviceLoader = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Search search = iterator.next();
            System.out.println(search.search("hello"));
        }

        ServiceLoader<SayHello> sayHellos = ServiceLoader.load(SayHello.class);
        Iterator<SayHello> sayHelloIterator = sayHellos.iterator();
        while (sayHelloIterator.hasNext()) {
            SayHello sayHello = sayHelloIterator.next();
            System.out.println(sayHello.sayHello());
        }
    }
}
