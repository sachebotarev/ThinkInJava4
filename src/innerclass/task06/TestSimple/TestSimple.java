package innerclass.task06.TestSimple;

import innerclass.task06.classpackage.SimpleClass;
import innerclass.task06.interfacepackage.SimpleInterface;

/**
 * Задача №6, Глава 10, Внутрениие классы, стр. 295
 * В третьем пакете создайте производный класс; внутри метода верните
 * объект защищенного внутреннего класса, преобразованный в интерфейс.
 */

public class TestSimple extends SimpleClass{

	  public SimpleInterface getSimpleInterface(){
	        return new Inner();
	    }

}
