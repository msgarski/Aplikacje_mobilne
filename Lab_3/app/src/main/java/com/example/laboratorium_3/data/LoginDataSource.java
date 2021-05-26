package com.example.laboratorium_3.data;

import android.widget.Toast;

import com.example.laboratorium_3.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {
    private static final String[] DUMMY_CREDENTIALS = new String[]
            {
                    "garski@wp.pl:12345"
            };

    public Result<LoggedInUser> login(String username, String password) {

        try {

            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Robert Górski");
            for (String credential : DUMMY_CREDENTIALS)
            {
                String[] pieces = credential.split(":");

                if (pieces[0].equals(username))
                {
                    System.out.println("jestem po udanym porównaniu username: " + username);
                    if(pieces[1].equals(password)){
                        System.out.println("jestem po udanym porównaniu password: " + password);
                        return new Result.Success<>(fakeUser);
                    }
                }
            }
            //return new Result.Success<>(fakeUser);
            return new Result.Error(new IOException("Error logging in"));


        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}