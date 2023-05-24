package ru.netology.SergQA.StatsProject.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int salesVolume(long[] sales) {
        int total = 0;
        for (long s : sales) {
            total += s;
        }
        return total;
    }

    public int averagePrice(long[] sales) {
        int aver = salesVolume(sales) / 12;

        return aver;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int lowMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averagePrice(sales)) {
                lowMonth += 1;
            }
        }

        return lowMonth;
    }

    public int aboveAverage(long[] sales) {
        int aboveMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averagePrice(sales)) {
                aboveMonth += 1;
            }
        }

        return aboveMonth;
    }

}
