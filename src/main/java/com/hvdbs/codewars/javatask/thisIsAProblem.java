package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "\"this\" is a problem",
        url = "https://www.codewars.com/kata/547c71fdc5b2b38db1000098"
)
public class thisIsAProblem {
    public class NameMe {
        public String firstName;
        public String lastName;
        public String fullName;

        public NameMe(String first, String last) {
            this.firstName = first;
            this.lastName = last;
            this.fullName = first + " " + last;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFullName() {
            return fullName;
        }
    }
}
