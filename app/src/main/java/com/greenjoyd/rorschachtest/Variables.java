package com.greenjoyd.rorschachtest;

import java.sql.Array;

public class Variables {
    //Оценки по содержанию
    private static int human = 0;
    private static int animal = 0;
    private static int fantasy = 0;
    private static int item = 0;
    //Формальные оценки
    private static int whole = 0;  //целый
    private static int color = 0;  //цветной
    private static int detail = 0;  //детали
    private static int form = 0;  //форма
    private static int movement = 0;//движение


    public static void addHuman() {
        human++;
    }

    public static void addWhole() {
        whole++;
    }

    public static void addColor() {
        color++;
    }

    public static void addDetail() {
        detail++;
    }

    public static void addForm() {
        form++;
    }

    public static void addMovement() {
        movement++;
    }

    public static void addAnimal() {
        animal++;
    }

    public static void addItem() {
        item++;
    }

    public static void addFantasy() {
        fantasy++;
    }

    public static void showHuman() {
        System.out.println(human);
    }

    public static void Restart(){
        human =0;
        fantasy = 0;
        animal = 0;
        item = 0;

        whole = 0;
        color = 0;
        detail = 0;
        form = 0;
        movement = 0;
    }

    public static int MaxContain() {
        int result = 0;
        if ((human >= animal) && (human >= fantasy) && (human >= item)) {
            result = 1;
        } else if ((animal > human) && (animal >= fantasy) && (animal >= item)) {
            result = 2;
        } else if ((fantasy > human) && (fantasy > animal) && (fantasy >= item)) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }

    public static void Show(){
        System.out.println(human);
        System.out.println(animal);
        System.out.println(fantasy);
        System.out.println(item);
        System.out.println("line");
        System.out.println(whole);
        System.out.println(color);
        System.out.println(detail);
        System.out.println(form);
        System.out.println(movement);
    }
    public static int MaxFormal(){
        int result =0;
        if((whole>=color)&&(whole>=detail)&&(whole>=form)&&(whole>=movement)){
            result=1;
        }else if((color>whole)&&(color>=detail)&&(color>=form)&&(color>=movement)){
            result=2;
        }else if((detail>whole)&&(detail>color)&&(detail>=form)&&(detail>=movement)){
            result=3;
        }else if((form>whole)&&(form>color)&&(form>detail)&&(form>=movement)){
            result=4;
        }else {
            result=5;
        }
        return result;
    }
}
