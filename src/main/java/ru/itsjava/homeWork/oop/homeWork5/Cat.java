package ru.itsjava.homeWork.oop.homeWork5;

public class Cat {

    private String nickname;       // Кличка
    private final int age;         // Возраст
    private final Boolean isMale;  // Пол
    private final String color;


    public Cat(String nickname, int age, String color, Boolean isMale) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
        this.isMale = isMale;
    }

    @Override
    public boolean equals(Object o) {
        // Проверка, являются ли равными ссылки входящего экземпляра объекта и экземпляра, на котором вызывается equals()
        // Если ссылки равны, то возвращаем true
        if (this == o) return true;
        // 1. Проверка является ли null ссылка входящего экземпляра объекта
        // 2. Проверка, является входящий объект и объект, на котором вызывается equals() экземплярами одного и того же класса
        // Если хотя бы одно из условий выполняется, возвращаем false
        if (o == null || getClass() != o.getClass()) return false;

        // Явное приведение типа ссылки входящего экземпляра объекта к типу Cat.
        // Буквально: создаём новую переменную cat класса Cat и передаём в неё ссылку на объект "о"
        // Не смотря на то, что выше мы уже проверили, являются ли сравниваемые объекты экземплярами одного и того же класса, нам нужно ещё получить доступ к полям объекта Cat
        // а для этого необходимо привести переменную "о" к типу переменной Cat (так называемый даункастинг)
        Cat cat = (Cat) o;

        // Проверка на равернство значений полей сравниваемых объектов
        // Если значение поля age не совпадают, возвращаем false
        if (age != cat.age) return false;
        // Если значение поля nickname не совпадают, возвращаем false и т.п.
        // Почему-то тут при использовании конструктора автоматически создались три разные конструкции != и !.equals().
        // Видимо для строк и boolean необходимы дополнительные проверки.
        // Этот equals() реализован в String.java и сравнивает строки входящего объекта и объекта на котором вызывается.
        if (!nickname.equals(cat.nickname)) return false;
        // Этот equals() реализован в Boolean.java и сравнивает boolean входящего объекта и объекта на котором вызывается.
        if (!isMale.equals(cat.isMale)) return false;
        // Если все предыдущие значение равны, возвращаем результат равенства значений последнего поля
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        // Объявляем переменную result типа int и присваиваем ей значение, которое вернёт нам hashCode() вызванный на поле nickname данного экземпляра
        // этот hashCode() переопределён в String.java и возвращает значение типа int в зависимости от строкового значения, на котором он вызывался
        // одна и та же строка вернёт одно и то же значение int
        int result = nickname.hashCode();
        // Присваиваем переменной result новое значение, которое состоит из константы 31 умноженной на текущее значение result плюс значение hashCode() вызванного на поле isMale данного экземпляра
        // этот hashCode() переопределён в Boolean.java и возвращает значение типа int в зависимости от boolean значения, на котором он вызывался
        // Это значение либо 1231, либо 1237.
        result = 31 * result + isMale.hashCode();
        // Возвращаем значение переменной result
        return result;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", color='" + color + '\'' +
                '}';
    }
}


