package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Basic subclasses - Adam and Eve",
        url = "https://www.codewars.com/kata/547274e24481cfc469000416"
)
public class BasicSubclassesAdamAndEve {
    public Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }


    class Man extends Human {

    }

    class Woman extends Human {

    }

    class Human {

    }
}
