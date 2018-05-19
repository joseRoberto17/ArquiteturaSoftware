package Adapter;
import java.util.Iterator;
import java.util.Map;
public class Testar {
	
	public static void main(String[] args) {

		Object[][] pares = new String[][] { { "Sun", "IBM", "FSF", "Berkley", "Microsoft", "Apple" }, { "Solaris", "OS/2", "GNU/Linux", "BSD", "Windows", "MacOS" } };

		@SuppressWarnings("rawtypes")
		Map mapa = new Exercicio_4_1_Mapa(pares);

		for (@SuppressWarnings("rawtypes")
		Iterator iter = mapa.entrySet().iterator(); iter.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}

}
