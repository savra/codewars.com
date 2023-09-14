package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "FIXME: Run, Runner!",
        url = "https://www.codewars.com/kata/596b2b9d9e2fbd7811000046"
)
public class FIXMERunRunner {
    private static class Logan5 implements Runnable {
        public void run() {
            System.out.println("Hello from Logan5");
            //ThreadUtil.method1();
        }
    }

    private static class Jessica6 implements Runnable {
        public void run() {
            System.out.println("Hello from Jessica6");
            //ThreadUtil.method2();
        }
    }

    public static void runRunners() {
        new Thread(new Logan5()).start();
        new Thread(new Jessica6()).start();
    }
}
