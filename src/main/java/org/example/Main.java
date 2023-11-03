package org.example;

import org.example.Pacadge.Task_internal_class;
import org.example.Pacadge.Task_internal_class_two;

public class Main {
    public static void main(String[] args) {

        Task_internal_class orange = new Task_internal_class();// Вывод внутрениго класса
        Task_internal_class.Juice juice = orange.new Juice();
        orange.squuzeJuice();
        juice.flow();

        Task_internal_class_two peugeot = new Task_internal_class_two("Peugeot", 120,40);
//        // Мы создали объект велосипеда. Создали два его «подобъекта» — руль и сиденье.
//        Подняли сиденье повыше для удобства — и поехали: катимся и рулим, куда надо! :)
//        Нужные нам методы вызываются у нужных объектов. Все просто и удобно.
        Task_internal_class_two.HandleBar handleBar = peugeot.new HandleBar();
        Task_internal_class_two.Seat seat = peugeot.new Seat();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();
        seat.getSeatParam();
    }
}