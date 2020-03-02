package com.mainacad;

import com.mainacad.model.User;

import java.lang.reflect.Field;

public class AppRunner {
    public static void main(String[] args) {

        User user = new User(1, "login123456", "pass", "fname", "lname");
        User user2 = new User(1, "login123", "pass", "fname", "lname");


//        Field[] fields = user.getClass().getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
//
//        Class superUserClass = user.getClass().getSuperclass();
//        Field[] sFields = superUserClass.getDeclaredFields();
//        for (Field field : sFields) {
//            System.out.println(field.getName());
//        }

        try {
            Class<User> type = User.class;
            Field field = type.getDeclaredField("login");
            field.setAccessible(true);
            try {
                System.out.println(field.get(user));
                System.out.println(field.get(user2));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

//            System.out.println(field);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
