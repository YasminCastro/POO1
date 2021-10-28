
public class Test_C {
	
	public static void main (String[] args) {
		
		Teclado tec = new Teclado("RedDragon", "Branco");
		Webcam cam = new Webcam("logitec", "3");
		Pc pc = new Pc("Yasmin", tec, cam);
		
		
		System.out.println(pc.toString());
		

	}
	
	
	}

