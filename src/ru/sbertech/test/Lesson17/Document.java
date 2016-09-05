package ru.sbertech.test.Lesson17;

/**
 * Created by Student on 05.09.2016.
 */
public class Document {
    private Client clientA;
private String user;
    public Client getClientA() {
        return clientA;
    }

    public void setClientA(Client clientA) {
        this.clientA = clientA;
    }

    public Account getAccA() {
        return accA;
    }

    public void setAccA(Account accA) {
        this.accA = accA;
    }

    public Client getClientB() {
        return clientB;
    }

    public void setClientB(Client clientB) {
        this.clientB = clientB;
    }

    public Account getAccB() {
        return accB;
    }

    public void setAccB(Account accB) {
        this.accB = accB;
    }

    public Long getSumma() {
        return summa;
    }

    public void setSumma(Long summa) {
        this.summa = summa;
    }

    private Account accA;
    private Client clientB;
    private Account accB;
    private Long summa;


    public void print(){
        System.out.println("summa"+ summa);
    }
    public void printUserInfo(){
        System.out.println("Document user"+user);
    }
    public void savetoDB(){
        System.out.println("save in DB ");
    }
}
