package ru.sbertech.test.Lesson6;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 28.07.2016.
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> loggedList = (List<String>) Proxy.newProxyInstance(
                list.getClass().getClassLoader(),
                list.getClass().getInterfaces(),
                new InvocationHandlerImpl(list));
        loggedList.add("first");
        System.out.println(loggedList.get(0));
        System.out.println(loggedList.remove(0));
        System.out.println(loggedList.size());


        /*try {
            Field f = C.class.getDeclaredField("str");
            f.setAccessible(true);
            System.out.println(f);
            if(f.isAnnotationPresent(ValidLength.class)){
                System.out.println("Есть аннотация " + ValidLength.class.getTypeName());
                ValidLength vLen = f.getAnnotation(ValidLength.class);
                if(vLen.value() != ((String) f.get(C.class.newInstance())).length()){
                    System.out.println("Внимание, длина некорректна!");
                } else {
                    System.out.println("Все ок");
                };
            }
        } catch (Exception nsfe){
            System.out.println("Нет!");
        }*/

        /*try{
            Method m = I.class.getMethod("someMethod", String.class);
            //m.setAccessible(true);
            m.invoke(C.class.newInstance(),"test");*/

            /*Field f = C.class.getDeclaredField("str");
            f.setAccessible(true);
            C c = new C();
            System.out.println(f.get(c));
            f.set(c,"second");
            System.out.println(f.get(c));
            c.someMethod("test");
        } catch (Exception e){
            System.out.println("Нет такого!");
        }*/


    }
}