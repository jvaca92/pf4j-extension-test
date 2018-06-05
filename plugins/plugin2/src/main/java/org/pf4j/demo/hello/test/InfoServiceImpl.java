package org.pf4j.demo.hello.test;

import org.pf4j.Extension;

@Extension
public class InfoServiceImpl implements InfoService {
    @Override
    public String getInfo() {
        return "TEST";
    }
}
