package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom Dia X".replace("X", "Rocha");
		System.out.println(y);
	}
}
