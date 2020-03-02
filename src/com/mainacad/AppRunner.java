package com.mainacad;

import com.mainacad.model.User;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AppRunner {

    public static void main(String[] args) {

        User user = new User(1, "login123456", "pass", "fname", "lname");
        User user2 = new User(1, "login123", "pass", "fname", "lname");


        Field[] fields = user.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Class superUserClass = user.getClass().getSuperclass();
        Field[] sFields = superUserClass.getDeclaredFields();
        for (Field field : sFields) {
            System.out.println(field.getName());
        }

        User user3 = user.clone();


        final String sql = "SELECT ...";

        String sql2 = "INSERT ...";
        sql2 += " SOMETHING";

        final List<Integer> ids = new ArrayList<>();


        List<Integer> ids2 = new ArrayList<>();

        try {
            Class<User> type = User.class;
            Field field = type.getDeclaredField("login");
            field.setAccessible(true);
            try {
                System.out.println(field.get(user));
                System.out.println(field.get(user2));
                System.out.println(field.get(user3));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

//            System.out.println(field);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        if (user.getClass().getName().equals("com.mainacad.model.User")) {
            System.out.println("true");
        }

        if (user.getClass().getSimpleName().equals("User")) {
            System.out.println("true");
        }

        if (user.getClass().equals(User.class)) {
            System.out.println("true");
        }

        if (user instanceof User) {
            System.out.println("true");
        }


    }
}
