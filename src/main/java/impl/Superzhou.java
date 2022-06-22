package impl;

import service.Service;

public class Superzhou implements Service {
    @Override
    public void sing() {
        System.out.println("我是周润发，我在唱歌");
    }
}
