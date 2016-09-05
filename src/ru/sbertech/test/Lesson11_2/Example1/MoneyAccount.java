package ru.sbertech.test.Lesson11_2.Example1;

import static java.lang.Thread.sleep;

public final class MoneyAccount {

    /**
     * Так как это денежный счет, он будет 1 для всех наших пользователей (смотреть "Singleton Pattern")
     * Переменная instance хранит ссылку на единственный экземпляр этого класса
     */
    private static MoneyAccount instance;

    /**
     * Количество денег на счете
     */
    private Integer account;

    /**
     * Инициализации счета. Указываем сколько у нас денег в самом начале
     *

     * Замечание: Конструктор имеет приватную область видимости, так как мы должны гарантировать
     * что объект MoneyAccount в нашей системе будет существовать в единственном экземпляре
     */
    private MoneyAccount() {
        account = 10;
    }

    /**
     * Возвращает ссылку на наш денежный счет. При первом обращении создает единственный экземпляр счета.
     *
     * @return Ссылка на MoneyAccount
     */
    public static MoneyAccount getInstance() {
        if (instance == null) {
            instance = new MoneyAccount();
        }
        return instance;
    }

    /**
     * Снимает указанное количество денег со счета.
     *
     * @param amount Сколько денег снимаем
     */
    public void cache(final int amount) {
        account -= amount;
    }

    /**
     * Показывает сколкьо сейчас денег на счете
     *
     * @return Кол-во денег
     */
    public Integer getAccount() {
        return account;
    }


    /**
     * =======================================================
     * Ниже объявим класс, ктороый будет выполнять функции банкомата
     * =======================================================
     */

    /**
     * Это собственно банкомат. Его функциональность заключается в том, что
     * он должен будет списывать деньги со счета и выдывать их пользователю
     *

     * Замечание: Банкомат у нашем случае реализаует интерфейс Runnable, что позволит нам
     * вынести его работу в отдельный поток
     */
    static final class CachePoint extends Thread {

        /**
         * Ссылка на наш счет. Мы будем использовать ее для синхронного предоставления дотсупа к счету
         */
        private static final MoneyAccount moneyAccount = MoneyAccount.getInstance();

        /**
         * Номер банкомата
         */
        private Integer id;

        /**
         * Имя владельца банковской карты
         */
        private String userName;

        /**
         * Кол-во денег которое мы хотим снять
         */
        private Integer cacheAmount;

        /**
         * Устанавливает кол-во денег для снятия
         *
         * @param cacheAmount Кол-во денег
         */
        public void setCacheAmount(final Integer cacheAmount) {
            this.cacheAmount = cacheAmount;
        }

        /**
         * Устанавливает имя владельца карты
         *
         * @param name Имя
         */
        public void setUserName(final String name) {
            this.userName = name;
        }

        /**
         * Устанавливает номер банкомата
         *
         * @param id Номер
         */
        public void setId(final Integer id) {
            this.id = id;
        }


        /**
         * {inherited_doc}
         */
        @Override
        public void run() {
            synchronized (moneyAccount) {
                //сохраняем текущее значение счета
                final int previousAccountValue = MoneyAccount.getInstance().getAccount();

                //если на счете денег меньше, чем запрашивают, говорим что денег мало и не даем ничего
                if (previousAccountValue < cacheAmount) {
                    System.out.println(userName + " не смог снять деньги. Недостаточно средств");
                    return;
                }
                //списываем указанную сумму
                MoneyAccount.getInstance().cache(cacheAmount);


                //формируем сообщение об успешной транзакции
                final StringBuilder message = new StringBuilder();
                message.append("Произведено снятие средств пользоваталем ");
                message.append(userName);
                message.append(" с банкомата ");
                message.append(id);
                message.append(" на сумму ");
                message.append(cacheAmount);
                message.append(". Остаток на счете до снятия:  ");
                message.append(previousAccountValue);
                message.append(", после снятия: ");
                message.append(MoneyAccount.getInstance().getAccount());

                //спасаем мир от всесущего зла ^^
                System.out.println(message);
            }
        }
    }



    public static void main(String[] args) throws InterruptedException {
        /**
         * Пример с исправными банкоматами
         */
        System.out.println("Ситуация №1. Мы используем исправные банкоматы");
        CachePoint point1 = new CachePoint();
        point1.setId(1);
        point1.setCacheAmount(5);
        point1.setUserName("Вася");

        CachePoint point2 = new CachePoint();
        point2.setId(2);
        point2.setCacheAmount(5);
        point2.setUserName("Петя");

        CachePoint point3 = new CachePoint();
        point3.setId(3);
        point3.setCacheAmount(5);
        point3.setUserName("Джо");

        point1.start();
        point2.start();
        point3.start();

        //подождем 100 мс. пока все потоки сделают своё дело
        sleep(100);



    }

}