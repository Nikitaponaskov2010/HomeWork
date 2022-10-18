package Home_Work011022.Task3;

import java.util.Objects;

public class Point {

    double  fieldX;
    double  fieldY;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.fieldX, fieldX) == 0 && Double.compare(point.fieldY, fieldY) == 0;
    }

    @Override
    public String toString() {
        return "Point:" +
                "fieldX=" + fieldX +
                ", fieldY=" + fieldY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldX, fieldY);
    }

}


