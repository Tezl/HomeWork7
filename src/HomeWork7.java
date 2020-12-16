public class HomeWork7 {

    public static class Util {


        public static double getDistance(int x1, int y1, int x2, int y2) {

            x1 = 7;
            x2 = 3;
            y1 = 8;
            y2 = 2;

            int a = x2 - x1;
            int b = a * a; // a^2
            int c = y2 - y1;
            int d = c * c; // c ^2

            int e = (b) + (d); // - (x2-x1)^2 + (y2-y1)^2

            Math.sqrt(e); //извлекает из выше перечисленного корень

// выше - формула √(x2-x1)^2 + (y2-y1)^2

            System.out.println("расстояние между точками = " + e);

            return Math.sqrt(e);
        }

    }
}
