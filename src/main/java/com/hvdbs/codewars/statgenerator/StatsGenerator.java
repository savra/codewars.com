package com.hvdbs.codewars.statgenerator;

import com.hvdbs.codewars.statgenerator.enums.Difficulty;
import lombok.Builder;
import lombok.Data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StatsGenerator {
    private static final String PACKAGE_NAME = "com.hvdbs.codewars.javatask";
    private static final String SOLUTION_BASE_URL = "https://github.com/savra/codewars.com/tree/master/src/main/java/com/hvdbs/codewars/javatask/";

    public static void generate() {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("README.md"), StandardOpenOption.TRUNCATE_EXISTING)) {

            bufferedWriter.append("# codewars.com solutions");
            bufferedWriter.newLine();
            bufferedWriter.append("![image](https://www.codewars.com/users/savra/badges/large)");
            bufferedWriter.newLine();
            bufferedWriter.append("### ## Solving problems on codewars.com");
            bufferedWriter.newLine();
            bufferedWriter.append("### Solutions by difficulty");

            List<OutputCodewarsFormat> solutions = findSolutions(PACKAGE_NAME);

            Map<Difficulty, List<OutputCodewarsFormat>> difficultyListMap = solutions.stream()
                    .collect(Collectors.groupingBy(OutputCodewarsFormat::getDifficulty));

            for (Difficulty difficulty : difficultyListMap.keySet()) {
                bufferedWriter.newLine();
                bufferedWriter.append("<details>");
                bufferedWriter.newLine();
                bufferedWriter.append("<summary>").append(String.valueOf(difficulty)).append("</summary>");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.append("|Name|Problem|Solution|");
                bufferedWriter.newLine();
                bufferedWriter.append("|---|---|---|");
                bufferedWriter.newLine();

                for (OutputCodewarsFormat outputGeeksForGeeksFormat : difficultyListMap.get(difficulty)) {
                    bufferedWriter.append("|")
                            .append(outputGeeksForGeeksFormat.getName())
                            .append("|")
                            .append("<a href='").append(outputGeeksForGeeksFormat.getProblemUrl()).append("'>").append(outputGeeksForGeeksFormat.getName()).append("</a>")
                            .append("|")
                            .append("<a href='").append(outputGeeksForGeeksFormat.getSolutionUrl()).append("'>").append(outputGeeksForGeeksFormat.getName()).append("</a>")
                            .append("|");
                    bufferedWriter.newLine();
                }
                bufferedWriter.append("</details>");
            }
        } catch (IOException ignored) {}
    }

    private static List<OutputCodewarsFormat> findSolutions(String packageName) {
        List<OutputCodewarsFormat> solutionsList = new ArrayList<>();

        try (InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(packageName.replace('.', '/'))) {
            if (inputStream == null) {
                return solutionsList;
            }

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
                solutionsList = bufferedReader.lines()
                        .map(solution -> {
                            String className = packageName + "." + solution.substring(0, solution.lastIndexOf('.'));

                            try {
                                CodewarsInfo geeksForGeeksInfo = Class.forName(className).getAnnotation(CodewarsInfo.class);

                                if (geeksForGeeksInfo != null) {
                                    return OutputCodewarsFormat.builder()
                                            .difficulty(geeksForGeeksInfo.difficulty())
                                            .name(geeksForGeeksInfo.name())
                                            .problemUrl(geeksForGeeksInfo.url())
                                            .solutionUrl(SOLUTION_BASE_URL + solution.replace("class", "java"))
                                            .build();
                                }

                                return null;
                            } catch (ClassNotFoundException e) {
                                return null;
                            }
                        })
                        .filter(Predicate.not(Objects::isNull))
                        .collect(Collectors.toList());
            }
        } catch (IOException e) {
            return solutionsList;
        }

        return solutionsList;
    }

    @Builder
    @Data
    private static final class OutputCodewarsFormat {
        private String name;
        private String problemUrl;
        private String solutionUrl;
        private Difficulty difficulty;
    }
}
