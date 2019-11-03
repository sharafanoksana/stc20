/**
 * @author Sharafan Oksana
 * @date 03.11.2019
 * @package stc20.sharafanoksana.tasc01
 */
package stc20.sharafanoksana.tasc01;

public class Main {
    public static void main(String[] args) {

        // вызов класса, генерирующего NPE
        ProcessingNPE pNPE = new ProcessingNPE();

        // вызов класса, генерирующего ArrayIndexOutOfBoundsException
        ProcessingArrayBoundException pArrayBoundException = new ProcessingArrayBoundException();

        // вызов класса, генерирующего MyException
        ProcessingMyException pME = new ProcessingMyException();
    }
}

