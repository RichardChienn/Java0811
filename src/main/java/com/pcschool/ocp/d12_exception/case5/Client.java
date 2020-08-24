
package com.pcschool.ocp.d12_exception.case5;




public class Client {
    public static void main(String[] args) {
        accessLogin();
    }
    public static void accessLogin(){
        LoginService service =  LoginService.getInstance();
        String username = "John";
        String password = "1234";
        boolean check;
        try {
            check = service.login(username , password);
             System.out.println(check);
        } catch (LoginException ex) {
            System.out.println(ex);
            ex.how2do();
        }
       
    }
    
}
