package proxy;

import service.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Proxyfactory {
    Service targent;

    public Proxyfactory(Service targent){
        this.targent=targent;
    }
    public Object aengt(){
        return Proxy.newProxyInstance(targent.getClass().getClassLoader(), targent.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("出场时间。。。");
                System.out.println("出场地点。。。");
                Object invoke = method.invoke(targent, args);
                System.out.println("出场费用。。。");
                return invoke;
            }
        });
    }
}
