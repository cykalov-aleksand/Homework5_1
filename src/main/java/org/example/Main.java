package org.example;
public class Main{
    public static void method(String string, int number)throws NullPointerException,IllegalArgumentException{
        System.out.println("Первая буква строки string - "+string.charAt(0));
        if(number<=0){
            throw new IllegalArgumentException("Значение number в method должно быть больше 0");
        }
    }
    public static void main(String[] args){
        int number1=-5;
        int number2=1;
        String string="Школа";
        try{
            Main.method(string,number1);
            System.out.println("number1/number2="+number1/number2);
        }catch(IllegalArgumentException|NullPointerException|ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Программа окончена");
        }
    }
}