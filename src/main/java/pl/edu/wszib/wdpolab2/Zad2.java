package pl.edu.wszib.wdpolab2;

public class Zad2 {
    public static class Punkt{
        private double x;
        private double y;

        public Punkt(double x, double y){
            this.x = x;
            this.y = y;
        }

        public void przesunX(double value){
            this.x += value;
        }

        public void przesunY(double value){
            this.y += value;
        }

        public void przesunX(int value){
            this.x += value;
        }

        public void przesunY(int value){
            this.y += value;
        }

    }
}
