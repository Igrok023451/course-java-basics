package com.rakovets.course.java.core.practice.array;

/**
 * Разработать программу для электронного дневника, которая работает с отметками только по одному предмету.
 *
 * @author Dmitry Rakovets
 */
class Task01 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[] marks = {1, 2, 3, 4, 5, 6};

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }

    /**
     * Возвращает средне арифметическую отметку с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double sum = 0.0;
        for (int i = 0; i < marks.length; i++) {
           sum += marks[i];
        }
        return (double) Math.round(100.0 * sum / marks.length) / 100.0;
    }

    /**
     * Возвращает минимальную отметку.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (min > marks[i] ) {
                min = marks[i];
            }
        }
        return min;
    }

    /**
     * Возвращает максимальную отметку.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (max < marks[i] ) {
                max = marks[i];
            }
        }
        return max;
    }
}