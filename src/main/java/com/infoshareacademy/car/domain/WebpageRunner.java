package com.infoshareacademy.car.domain;

import com.infoshareacademy.car.domain.model.Webpage;
import com.infoshareacademy.hibernate.SessionFactoryProvider;

public class WebpageRunner {

    private void saveWebpage(){
        Webpage webpage = new Webpage();
        webpage.setAddress("Malinowska Street");
        new WebpageRepository().saveWebpage(webpage);
    }

    private Webpage findWebpage() {
        return new WebpageRepository().findWebpageById(1l);
    }

    public static void main(String[] args) {
        WebpageRunner webpageRunner = new WebpageRunner();
        webpageRunner.saveWebpage();

        Webpage webpage = webpageRunner.findWebpage();
        System.out.println(webpage.toString());

        SessionFactoryProvider.getSessionFactory().close();
    }
}
