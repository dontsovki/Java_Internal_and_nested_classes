package org.example.Pacadge;

public class Task_internal_class_two {
    private String model;
    private int weight;
    private int seatPostDiameter;

    public Task_internal_class_two(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public class HandleBar {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {

            System.out.println("Руль влево!");
        }
    }

    public class Seat {

        public void up() {

            System.out.println("Сиденье поднято выше!");
        }

        public void down() {

            System.out.println("Сиденье опущено ниже!");
        }
        public void getSeatParam() { // У объекта внутреннего класса есть доступ к переменным «внешнего» класса.

            System.out.println("Параметр сиденья: диаметр подседельного штыря = " + Task_internal_class_two.this.seatPostDiameter);
        }
    }

}
