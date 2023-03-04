package com.namek.OcCustomizat.controller;

import com.namek.OcCustomizat.model.User;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

@RestController
public class userController {

    private static final String GetMeUrl = "https://api.openclassrooms.com/me";
    @GetMapping("/me")

    public User Me() throws IOException {
        //to do method
        return null;
    }

    @PostMapping("/me")
    public String updateProfile(final User user) {
        //to do method
        return "";
    }
}
