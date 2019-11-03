package stc20.sharafanoksana.tasc03;

import java.util.Random;

enum Sex {MAN, WOMAN};
public class Person {
    private int age;
    private Sex sex;
    private String name;

    public Person() {
        this.age = generateAge();
        this.sex = generateSex();
        this.name = generateName();
    }

    public int getAge(Person person) {
        return this.age;
    }

    public Sex getSex(Person person) {
        return this.sex;
    }

    public String getName(Person person) {
        return this.name;
    }

    /**
     * метод генерирует воздраст
     * @return age - возвращает сгенирированное число от 0-100
     */
    private int generateAge() {
        Random rAge = new Random();
        age = rAge.nextInt(101);
        return age;
    }

    /**
     * метод генерирует пол персоны
     * @return значение enum Sex
     */
    private Sex generateSex(){
        Random rSex = new Random();
        boolean bSex = rSex.nextBoolean();
        if (true != bSex) {
            return this.sex= Sex.WOMAN;
        }
        else {this.sex = Sex.MAN;}
        return this.sex;
    }

    /**
     * метод генерирует имя персоны
     * @return строку имени
     */

    private String generateName(){
        Random generator = new Random();
        int nameLenght = generator.nextInt(8);
        String alphabet = "абвгдежзклмнопрстуфхцчшщьыэюя";
        int lenAlphabet = alphabet.length();
        StringBuilder sb = new StringBuilder(nameLenght);
        // к nameLenght прибавляет 2 для создания имен в диапазоне от 2 - 10  букв
        for (int i = 0; i < nameLenght + 2 ; i++) {
            int randomIdx = generator.nextInt(lenAlphabet);
            char letter = alphabet.charAt(randomIdx);
            sb.append(letter);
        }
        return sb.toString();
    }
}
/*
Отсортируем массив строк через пузырьковую сортировку.


String[] poem = { "Мы", "везём", "с", "собой", "кота" };

for (int j = 0; j < poem.length; j++) {
	for (int i = j + 1; i < poem.length; i++) {
		if (poem[i].compareTo(poem[j]) < 0) {
			String temp = poem[j];
			poem[j] = poem[i];
			poem[i] = temp;
		}
	}
	System.out.println(poem[j]);
}
 */
