package stc20.sharafanoksana.tasc03;

public class SortBuble implements Sortable {
    Person[] people;
    public SortBuble(Person[] people) {
        this.people = people;
    }
    //Отсортируем массив строк через пузырьковую сортировку по полу.
    @Override
    public Person[] sort(Person[] people) {
        for (int j = 0; j < people.length; j++) {
            for (int i = j + 1; i < people.length; i++) {
                if (people[i].getSex(people[i]) == Sex.MAN) {
                    toSwap(j,i);
                }
            }
            System.out.println(people[j].getName(people[j])+" "+ people[j].getAge(people[j])+" "+ people[j].getSex(people[j]));
        }
        return people;
    }

    public Person[] sortAge(Person[] people) {
        for (int j = people.length-1; j >=1; j--) {
            for (int i = 0; i < j; i++) {
                if(people[i].getAge(people[i]) < people[i+1].getAge(people[i+1])){
                    toSwap(i, i+1);
                }
            }
            System.out.println(people[j].getName(people[j])+" "+ people[j].getAge(people[j])+" "+ people[j].getSex(people[j]));
        }
        return people;
    }

    public Person[] sortName (Person [] people){
        for (int j = people.length-1; j >=1; j--) {
            for (int i = 0; i < j; i++) {
                if(people[i].getName(people[i]).charAt(i) < people[i+1].getName(people[i+1]).charAt(i+1)){
                    toSwap(i, i+1);
                }
            }
            System.out.println(people[j].getName(people[j])+" "+ people[j].getAge(people[j])+" "+ people[j].getSex(people[j]));
        }
        return people;
    }

    private void toSwap(int first, int second){

        Person temp = people[first];
        people[first] = people[second];
        people[second] = temp;
    }



}



