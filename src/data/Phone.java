package data;

public class Phone {

    private String number;
    private String model;
    private String weight;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, String weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone() {
    }

    public void receiveCall(String incomeName){
        System.out.println("\nЗвонит : "+ incomeName);
    }

    public void receiveCall(String incomeName,String incomeNumber){
        System.out.println("\nЗвонит : "+ incomeName + "\nНомер : " + incomeNumber);
    }

    public void sendMessage(String...incomeNumber){
        System.out.println("\nНомера для отправки сообщенй : ");
        for(int i = 0; i < incomeNumber.length; i++){
            System.out.print(incomeNumber[i] + "\n");
        }
    }

    public String getNumber() {
        return number;
    }
}
