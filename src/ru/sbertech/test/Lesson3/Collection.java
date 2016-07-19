package ru.sbertech.test.Lesson3;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
public class Collection {
    /**
     * Created by svetlanashmalko on 19.07.16.
     */
    public static class Person implements Comparable <Person>{
        Long id;
        String name;
        String phoneNumber;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Person(Long id, String name, String phoneNumber) {
            this.id = id;
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "Person(id="+this.getId()+";name = " + this.getName() + ";phoneNumber = " + this.getPhoneNumber();
        }

        @Override
        public boolean equals(Object obj) {
            return this.getId().equals(((Person)obj).getId());
        }

        @Override
        public int compareTo(Person o) {
            return this.getPhoneNumber().compareTo(o.getPhoneNumber());
        }

    /*
        @Override
        public int hashCode(){
            return (this.getId() + this.getName() + this.getPhoneNumber()).hashCode();
        }
        */
    }
}
