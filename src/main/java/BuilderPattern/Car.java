package BuilderPattern;

public class Car {
        private String model;
        private String color;
        private int year;

        private Car(CarBuilder builder) {
            this.model = builder.model;
            this.color = builder.color;
            this.year = builder.year;
        }
        @Override
        public String toString() {
            return "Car [Model=" + model + ", Color=" + color + ", Year=" + year + "]";
        }
        public static class CarBuilder {
            private String model;
            private String color;
            private int year;

            public CarBuilder setModel(String model) {
                this.model = model;
                return this;
            }

            public CarBuilder setColor(String color) {
                this.color = color;
                return this;
            }

            public CarBuilder setYear(int year) {
                this.year = year;
                return this;
            }

            public Car build() {
                return new Car(this);
            }
        }
    }
