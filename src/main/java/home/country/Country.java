package home.country;

import java.util.concurrent.atomic.AtomicLong;

public class Country
{
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private int population;
    private int size;
    private int meanage;

    public Country(String name, int population, int size, int meanage) {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.population = population;
        this.size = size;
        this.meanage = meanage;
    }

    public Country(Country toClone) {
        this.id = toClone.getId();
        this.name = toClone.getName();
        this.population = toClone.getPopulation();
        this.size = toClone.getSize();
        this.meanage = toClone.getMeanage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMeanage() {
        return meanage;
    }

    public void setMeanage(int meanage) {
        this.meanage = meanage;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", name='" + name + '\'' + ", population=" + population + ", size=" + size + ", meanage=" + meanage + '}';
    }
}
