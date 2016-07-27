package ru.sbertech.test.Lesson5;

class Ok implements  AutoCloseable {
    private String message;

    public Ok(String message) {
        this.message = message;
        System.out.println("I'm created " + message);
    }

    @Override
    public void close() throws Exception {
        System.out.println("All resources are free?? " + message);
    }
}

class FailCreated implements  AutoCloseable {
    private String message;

    public FailCreated(String message) {
        this.message = message;
        System.out.println("I'm creating " + message);
        throw new NullPointerException();
    }

    @Override
    public void close() throws Exception {
        System.err.println("All resources are free?? " + message);
    }
}

class FailClose implements  AutoCloseable {
    private String message;

    public FailClose(String message) {
        this.message = message;
        System.out.println("I'm creating " + message);
    }

    @Override
    public void close() throws Exception {
        throw new NullPointerException();
    }
}

class MyAutocloseable {
    public static void main(String[] args) {
        /*try (Ok x = new Ok("x");
             Ok y = new Ok("y");
        ) {
            System.out.println("Business logic");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try (FailClose x = new FailClose("x");
             FailClose y = new FailClose("y")) {
            throw new Error();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}