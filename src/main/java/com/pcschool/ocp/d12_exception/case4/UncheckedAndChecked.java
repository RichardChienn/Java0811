package com.pcschool.ocp.d12_exception.case4;

public class UncheckedAndChecked {

    public static void main(String[] args) {
            a(0);
            b(0);
            try {
            c(0);
        } catch (ArithmeticException e) {
                System.out.printf("main 自行處理數學錯誤 %s\n",e);
        }
            try {
            d(0);
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
            
            
    }

    public static void a( int d) {
            int x = 10;
            try {
                    int result = x/d;
                    System.out.println(result);
        } catch (ArithmeticException e) {
                System.out.println("分母不可為0");
        }
    }

    public static void b(int d) {
            int x =10;
            if(d==0){
                System.out.println("分母不可為0");
               return;
            }
            int result = x /d;
            System.out.println(result);
            
    }
    public static void c(int d) {
         int x = 10;
         int result = x /d;
         System.out.println(result);
    }
    
    
    
    public static void d(int d) throws Exception {
         int x = 10;
         if(d == 0){
             //自己建立一個錯誤物件
             Exception e = new Exception("d說: 分母不可為0");
             throw e;
         }
    }
}

