package tduv;

public class Person {

    public static void main(String[] args) {
        Person artem = new Person("Artem", "imcool");
        artem.displayPerson();
        artem.account.displayAccount();
    }

    String name;
    Account account;

    Person (String name, String password){
        this.name = name;
        account = new Account(password);
    }
    public void displayPerson(){
        System.out.println("Person Name:" + name + " " +"Password:" + account.password);
    }

    public class Account {
        public String password;

        Account (String pass){
            this.password = pass;
        }
        public void displayAccount(){
            System.out.println("Account Login:" + Person.this.name + " " +"Password:" + password);
        }
    }
}
