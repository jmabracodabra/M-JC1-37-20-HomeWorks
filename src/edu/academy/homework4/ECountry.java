package edu.academy.homework4;

public enum ECountry implements ICountry {
    BELARUS(207.600, 10_300_500), RUSSIA(17_075.200, 143_420_300),
    ESTONIA(45.226, 1_332_900), SPAIN(504.782, 40_341_500),
    ITALY(301.230, 58_103_000), GREECE(131.940, 10_668_400),
    NORWAY(324.220, 4_593_000), PORTUGAL(92.391, 10_566_200),
    THAILAND(514.000, 65_444_400), AUSTRIA(83.858, 8_184_700);

    private double area;
    private int population;

    ECountry(double area, int population) {
        this.area = area;
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public static ECountry valueOfIgnoreCase(String countryName) {
        return valueOf(countryName.toUpperCase());
    }

    public String toString() {
        return name();
    }


}
