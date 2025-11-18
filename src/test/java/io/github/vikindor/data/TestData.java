package io.github.vikindor.data;

import io.github.vikindor.models.IsbnModel;
import io.github.vikindor.models.LoginBodyModel;

import java.util.List;

public class TestData {
    protected static String userName = System.getProperty("userName", "Vik123456");
    protected static String userPassword = System.getProperty("userPassword", "Vik123456#");

    public static final LoginBodyModel AUTH_DATA = new LoginBodyModel(userName, userPassword);

    public static final String BOOK_ISBN = "9781491904244"; // Book: "You Don't Know JS"

    public static final List<IsbnModel> BOOKS_LIST = List.of(new IsbnModel(BOOK_ISBN));
}
