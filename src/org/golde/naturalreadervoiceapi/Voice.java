package org.golde.naturalreadervoiceapi;

public class Voice {

	private static final String ACA = "aca";
	private static final String MAC = "mac";
	private static final String ATT = "att";
	
	public final int r;
	public final int l = 0;
	public final String v;
	
	private Voice(int r, String v) {
		this.r = r;
		this.v = v;
	}
	
	public static class English {
		
		public static class US {
			public static final Voice Sharon = new Voice(21, ACA);
			public static final Voice Amanda = new Voice(1, MAC);
			public static final Voice Tracy = new Voice(16, ACA);
			public static final Voice Ryan = new Voice(12, ACA);
			public static final Voice Tim = new Voice(0, MAC);
			public static final Voice Mike = new Voice(1, ATT);
			public static final Voice Rod = new Voice(20, ACA);
			//public static final Voice Gabriella //Encrypted
		}
		
		public static class UK {
			//public static final Voice Gabriel //Encrypted
			public static final Voice Rachel = new Voice(11, ACA);
			public static final Voice Peter = new Voice(10, ACA);
			public static final Voice Graham = new Voice(4, ACA);
			public static final Voice Selene = new Voice(4, MAC);
			public static final Voice Darren = new Voice(3, MAC);
			//public static final Voice Grace //Encrypted
			public static final Voice Charles = new Voice(2, ATT);
			public static final Voice Audrey = new Voice(3, ATT);
			
		}
		
	}
	
	public static class Spanish {
		
		public static class Spain {
			//public static final Voice Anna //Encrypted
			public static final Voice Rosa = new Voice(20, ATT);
			public static final Voice Alberto = new Voice(19, ATT);
			public static final Voice Paula = new Voice(7, MAC);
		}
		
		public static class Mexico {
			public static final Voice Diego = new Voice(5, MAC);
			public static final Voice Camila = new Voice(6, MAC);
		}
		
		public static class Castilian {
			public static final Voice Joanquin = new Voice(8, MAC);
		}
		
		public static class US {
			//public static final Voice Mariana //Encrypted
		}
		
	}
	
	public static class French {
		
		//ublic static final Voice Sophia //Encrypted
		public static final Voice Alain = new Voice(7, ATT);
		public static final Voice Juliette = new Voice(8, ATT);
		public static final Voice Bruno = new Voice(1, ACA);
		public static final Voice Alice = new Voice(0, ACA);
		
		public static class Canada {
			public static final Voice Emmanuel = new Voice(9, MAC);
			public static final Voice Marie = new Voice(10, MAC);
			public static final Voice Louice = new Voice(22, ACA);
		}
		
	}
	
	public static class German {
		//public static final Voice Mia //Encrypted
		public static final Voice Reiner = new Voice(5, ATT);
		public static final Voice Klara = new Voice(6, ATT);
		public static final Voice Klaus = new Voice(7, ACA);
		public static final Voice Sarah = new Voice(14, ACA);
		public static final Voice Bertha = new Voice(11, MAC);
		public static final Voice Jakob = new Voice(12, MAC);
	}
	
	public static class Italian {
		//public static final Voice Sofia //Encrypted
		public static final Voice Vittorio = new Voice(15, ACA);
		public static final Voice Chiara = new Voice(2, ACA);
		public static final Voice Mario = new Voice(13, MAC);
		public static final Voice Valentina = new Voice(14, MAC);
	}
	
	public static class Portuguese {
		
		public static class Brazil {
			//public static final Voice Carolina //Encrypted
			public static final Voice Renata = new Voice(16, MAC);
		}
		
		public static class Portugal {
			public static final Voice Celia = new Voice(21, ACA);
			public static final Voice Andrea = new Voice(18, MAC);
			public static final Voice Julieta = new Voice(17, MAC);
		}
		
	}
	
	public static class Swedish {
		public static final Voice Emma = new Voice(24, ACA);
		public static final Voice Erik = new Voice(25, ACA);
		public static final Voice Gus = new Voice(20, MAC);
		public static final Voice Maja = new Voice(19, MAC);
	}
	
	public static class Dutch {
		//public static final Voice Nargreet //Encrypted
		public static final Voice Anika = new Voice(21, MAC);
		public static final Voice Markus = new Voice(22, MAC);
	}
	
}