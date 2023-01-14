package ru.itsjava.homeWork.oop.homeWork1;

public class Lion {

    // Поля (final) -- значит что имя не будет изменяться.
    // Инициализируем параметр, который передаём в () при создании объекта
    // Это "поля" класса, то есть свойства объекта
    private String name;
    private String sirname;


    // Конструктор -- метод по созданию объекта
    // Если нет конструктора, то он принимается по умолчанию.
    // Вот такой:
    public Lion() {
        //По идее тут по умолчанию тут ничего нет
        //System.out.println("Конструктор по умолчанию");
    }

    // Конструктор от двух аргументов
    public Lion(String inputName, String inputSurname) {
        this.name = inputName;
        this.sirname = inputSurname;

    }

    // Методы
    public void sayR() {
        System.out.println(name + " " + sirname + " RRRR!");
    }
}
