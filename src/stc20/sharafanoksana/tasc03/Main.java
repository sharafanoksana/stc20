package stc20.sharafanoksana.tasc03;

public class Main {
    public static void main(String[] args) {
        int countPerson = 100;
        Person[] people = new Person[countPerson];
        // Заполнение массива объектами класса Person
        for (int i = 0; i<countPerson; i++ ) {
            people[i] = new Person();
        }
        SortBuble sortBuble = new SortBuble(people);
        //sortBuble.sort(people);
//        sortBuble.sortAge(people);
        sortBuble.sortName(people);
    }
}
/*
                    if(people[i].getAge(people[j]) < people[i].getAge(people[j+1])){
                        Person temp1 = people[j];
                        people[j] = people[i];
                        people[i] = temp1;
                    }
 */