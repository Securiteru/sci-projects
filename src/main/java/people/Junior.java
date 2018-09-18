package people;

import java.util.Comparator;

public class Junior extends Employee implements Comparator<Employee> {
    private boolean hasPark;
    private String name;
    private double yearsOfExperience;

    public Junior(boolean hasPark, String name, double yearsOfExperience) {
        this.hasPark = hasPark;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isHasPark() {
        return hasPark;
    }

    public void setHasPark(boolean hasPark) {
        this.hasPark = hasPark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Junior)) return false;

        Junior junior = (Junior) o;

        if (isHasPark() != junior.isHasPark()) return false;
        if (Double.compare(junior.getYearsOfExperience(), getYearsOfExperience()) != 0) return false;
        return getName() != null ? getName().equals(junior.getName()) : junior.getName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (isHasPark() ? 1 : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        temp = Double.doubleToLongBits(getYearsOfExperience());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Junior{" +
                "hasPark=" + hasPark +
                ", name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
