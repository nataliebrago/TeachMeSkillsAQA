import data.Phone;

import static data.Registration.registration;

public class Main {
    public static void main(String[] args) {
        doTaskOne();
        doTaskTwo();
    }

    private static void doTaskOne(){
        Phone phoneOne = new Phone(" 8 029 333 33 33","XIOMI", "135g");
        Phone phoneTwo = new Phone(" 8 029 222 22 22","SAMSUNG", "150g");
        Phone phoneThree = new Phone(" 8 029 111 11 11","NOKIA", "120g");

        phoneOne.receiveCall("Alex");
        System.out.println("Номер : " + phoneOne.getNumber());
        phoneTwo.receiveCall("Nika");
        System.out.println("Номер : " + phoneTwo.getNumber());
        phoneThree.receiveCall("Nata");
        System.out.println("Номер : " + phoneThree.getNumber());

        phoneOne.receiveCall("Alex"," 8 029 333 33 33");
        phoneTwo.receiveCall("Nika"," 8 029 222 22 22");
        phoneThree.receiveCall("Nata"," 8 029 111 11 11");

        phoneOne.sendMessage("8 029 333 33 33","8 029 222 22 22","8 029 111 11 11");
        System.out.println();
    }

    private static void doTaskTwo(){
        registration("123412312312311111111","",""); //больше 20 символов
        registration("123412312312311111 1","",""); //содержит пробел

        registration("12341231231231111111","ABasdasdadasdaaa234234aa","ABasdasdadasdaaaaaaa"); //больше 20 символов
        registration("12341231231231111111","ABasdasdadasdaaaaaa","ABasdasdadasdaaaaaaa"); //пароли ндолжен содержать цифры
        registration("12341231231231111111","ABasdasdadasdaaaaaa1","ABasdasdadasdaaaaaaa"); //пароли не совпадают

    }
}