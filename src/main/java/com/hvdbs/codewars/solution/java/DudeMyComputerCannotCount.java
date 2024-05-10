package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.SIX,
        name = "Dude, my computer cannot count!",
        url = "https://www.codewars.com/kata/58fa9898dfec0ef150000014"
)
public class DudeMyComputerCannotCount {
    private long counter;
    private Map<String, Long> visitorCount = new HashMap<>();

    public synchronized void visit(String name) {
        counter++;
        Long oldCount = visitorCount.get(name);
        long newCount = 1L;
        if (oldCount != null) {
            newCount += oldCount;
        }
        visitorCount.put(name, newCount);
    }

    public long totalVisits() {
        return counter;
    }

    public long visitsBy(String name) {
        return visitorCount.getOrDefault(name, 0L);
    }
}
