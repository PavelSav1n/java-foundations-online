package ru.itsjava.experiments.voenmeh.parsers;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        AuthorParserRu authorParserRu = new AuthorParserRu();
        // Номер журнала
        int articleNum = 9;
        // Открываем файл, который будем парсить
        File file = new File("src/main/resources/voenmeh/2/en/2-" + articleNum);

        authorParserRu.parser(file);
    }
}
