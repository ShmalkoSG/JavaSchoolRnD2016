package ru.sbertech.test.Lesson7;

/**
 * Created by Student on 01.08.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception{

        /*System.out.println("1");
        try{
            Person person = (Person) Main.class.getClassLoader().loadClass("ru.sbertech.test.lesson7.Person").newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("2");*/

        /*URLClassLoader urlClassLoader = new URLClassLoader(new URL[] {new URL ("file:/J:/lecture7/person.jar")}, null);
        Class <?> persClazz = urlClassLoader.loadClass("ru.sbt.bvv.lecture7.Person34");
        Method mm = persClazz.getDeclaredMethod("info");
        Object ob = persClazz.newInstance();
        mm.invoke(ob);*/

       // URLClassLoader urlClassLoader = new URLClassLoader(new URL[] {new URL ("file:/J:/lecture7/Person.jar")});

        Calculator calculator = new CalculatorImpl();
        calculator.calc();

       // Class <?> calcClazz = urlClassLoader.loadClass("ru.sbt.bvv.lecture7.CalculatorImpl");
     //   ((Calculator)calcClazz.newInstance()).calc();
    }
}
