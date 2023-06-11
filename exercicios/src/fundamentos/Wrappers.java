package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		//byte
		
		Byte b = 100;
		Short s = 1000;
		
//		Integer i = Integer.parseInt(entrada.next());
		Integer i = 10000;  // Int
		
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 2);
		System.out.println(l/3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';  // Char
		System.out.println(c.toString());
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		
	}
}
