/**
 * @author Sharafan Oksana
 * @date 03.11.2019
 * @package stc20.sharafanoksana.tasc01
 */
package stc20.sharafanoksana.tasc01;

/**
 * Класс пользовательского MyException наследуется от Exception
 */
public class MyException extends Exception {
    public MyException() {
        super("Вызван свой вариант ошибки через оператор throw");
    }
}
