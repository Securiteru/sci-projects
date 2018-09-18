package people;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private boolean hasPark;
    private String name;
    private double yearsOfExperience;


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
    public int compare(Employee o1, Employee o2) {
        if (o1.getYearsOfExperience() == o2.getYearsOfExperience()) {
            return 0;
        }

        if (o1.getYearsOfExperience() > o2.getYearsOfExperience()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (isHasPark() != employee.isHasPark()) return false;
        if (Double.compare(employee.getYearsOfExperience(), getYearsOfExperience()) != 0) return false;
        return getName() != null ? getName().equals(employee.getName()) : employee.getName() == null;
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
        return "Employee{" +
                "hasPark=" + hasPark +
                ", name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

}
