package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void addPoster() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли.Мировой тур");
        manager.addPoster("Номер один");
        manager.addPoster("7 психопатов");
        manager.addPoster("Диктатор");

//       Poster poster1 = new Poster("Бладшот");
//       Poster poster2 = new Poster("Вперед");
//       Poster poster3 = new Poster("Отель Белград");
//       Poster poster4 = new Poster("Джентельмены");
//       Poster poster5 = new Poster("Человек-невидимка");
//       Poster poster6 = new Poster("Тролли.Мировой тур");
//       Poster poster7 = new Poster("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли.Мировой тур", "Номер один", "7 психопатов", "Диктатор"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void fiveLimitPoster() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли.Мировой тур");
        manager.addPoster("Номер один");
        manager.addPoster("7 психопатов");
        manager.addPoster("Диктатор");

        String[] expected = {"Диктатор", "7 психопатов", "Номер один", "Тролли.Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void maxLimitPoster() {
        PosterManager manager = new PosterManager(9);

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли.Мировой тур");
        manager.addPoster("Номер один");
        manager.addPoster("7 психопатов");
        manager.addPoster("Диктатор");

        String[] expected = {"Диктатор", "7 психопатов", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void minLimitPoster() {
        PosterManager manager = new PosterManager(1);

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли.Мировой тур");
        manager.addPoster("Номер один");
        manager.addPoster("7 психопатов");
        manager.addPoster("Диктатор");

        String[] expected = {"Диктатор"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void minminLimitPoster() {
        PosterManager manager = new PosterManager(10);

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли.Мировой тур");
        manager.addPoster("Номер один");
        manager.addPoster("7 психопатов");
        manager.addPoster("Диктатор");

        String[] expected = {"Диктатор", "7 психопатов", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
