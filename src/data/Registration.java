package data;

public class Registration {

    public static void registration(String login,String password, String confirmPassword){
        try
        {
            if(login.length() > 20) {
                throw new WrongLoginException("Длина логина должна быть меньше 20 символов");
            }
            else if(login.contains(" ")){
                    throw new WrongLoginException("Логин содержит пробелы");
                }


            if(password.length() > 20) {
                throw new WrongLoginException("Длина Пароль должна быть меньше 20 символов");
            }
            else if(password.contains(" ")){
                throw new WrongLoginException("Пароль содержит пробелы");
            }
            else if(! (password.contains("0") || password.contains("1") || password.contains("2") || password.contains("3")
                    || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7")
                    || password.contains("8") || password.contains("9"))){
                throw new WrongLoginException("Пароль должен содержать хотя бы 1 цифру");
            }

           else if(!password.equals(confirmPassword)){
               throw new WrongPasswordException("Пароли не совпадают");
            }
        }

        catch(WrongLoginException | WrongPasswordException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
