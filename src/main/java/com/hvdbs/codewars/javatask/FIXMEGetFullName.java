package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "FIXME: Get Full Name",
        url = "https://www.codewars.com/kata/597c684822bc9388f600010f"
)
public class FIXMEGetFullName {
    private String firstName;
    private String lastName;

    public FIXMEGetFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        String result = "";

        if (!firstName.isEmpty()) {
            result += firstName;

            if (!lastName.isEmpty()) {
                result += " " + lastName;
            }
        } else if (!lastName.isEmpty()) {
            result += lastName;
        }

        return result;
    }
}
