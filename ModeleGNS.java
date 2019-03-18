public class ModeleGNS {

	private List<Tournoi> lesTournois = new ArrayList<Tournoi>() ;

	public ModeleGNS() {
		super();
		this.peupler() ;
	}
	
	public List<Tournoi> getLesTournois() {
		return this.lesTournois ;
	}

	public void setLesTournois( List<Tournoi> lesTournois ) {
		this.lesTournois = lesTournois;
	}

	
	private int genererNouveauNumero(){
		
		// Exercice 6 - Votre code ici
		
		return -1 ;
	}
	
	public int addTournoi(Tournoi evt){
		
		// Exercice 7 - Votre code ici
		
		return -1 ;
	}
	
	public Promo getTournoi( int numero ){
		
		// Exercice 5 - Votre code ici
				
		return null ;
	}
	
	public boolean delTournoi( int numero ){		
		
		// Exercice 8 - Votre code ici
		
		return false ;
	}
	
	public List<Tournoi> getTournoisAVenir(){
		List<Tournoi> tournoisAVenir = new ArrayList<Tournoi>() ;
		
		// Exercice 2 - Votre code ici
		
		return tournoisAVenir ;
	}
	
	public List<Tournoi> getTournoisEnCours(){
		List<Tournoi> tournoisEnCours= new ArrayList<Tournoi>() ;
		
		// Exercice 3 - Votre code ici
		
		return tournoisEnCours ;
	}
	
	public List<Tournoi> getTournoisPasses(){
		List<Tournoi> tournoisPasses = new ArrayList<Tournoi>() ;
		
		// Exercice 4 - Votre code ici
		
		return tournoisPasses ;
	}
	
	public void afficherTournois(){
		// Exercice 1 - Votre code ici
	}
	
	private void peupler(){
		
		
		LocalDate.of()
		
		this.lesTournois.add( new Tournoi( 101 , LocalDate.of(2019,3,15) , LocalDate.of(2019,3,18) ) ) ;
		this.lesTournois.add( new Tournoi( 102 , LocalDate.of(2019,3,17) , LocalDate.of(2019,3,18) ) ) ;
		this.lesTournois.add( new Tournoi( 103 , LocalDate.of(2019,3,18) , LocalDate.of(2019,3,19) ) ) ;
		this.lesTournois.add( new Tournoi( 104 , LocalDate.of(2019,3,19) , LocalDate.of(2019,3,20) ) ) ;
		this.lesTournois.add( new Tournoi( 105 , LocalDate.of(2019,3,20) , LocalDate.of(2019,3,22) ) ) ;
		this.lesTournois.add( new Tournoi( 106 , LocalDate.of(2019,3,22) , LocalDate.of(2019,3,25) ) ) ;
		this.lesTournois.add( new Tournoi( 107 , LocalDate.of(2019,3,22) , LocalDate.of(2019,3,31) ) ) ;
		this.lesTournois.add( new Tournoi( 115 , LocalDate.of(2019,3,22) , LocalDate.of(2019,4,1) ) ) ;
		this.lesTournois.add( new Tournoi( 117 , LocalDate.of(2019,3,22) , LocalDate.of(2019,4,1) ) ) ;
		this.lesTournois.add( new Tournoi( 120 , LocalDate.of(2019,3,22) , LocalDate.of(2019,4,2) ) ) ;
		this.lesTournois.add( new Tournoi( 121 , LocalDate.of(2019,4,27) , LocalDate.of(2019,4,30) ) ) ;
		this.lesTournois.add( new Tournoi( 122 , LocalDate.of(2019,4,20) , LocalDate.of(2019,7,1) ) ) ;
		this.lesTournois.add( new Tournoi( 125 , LocalDate.of(2019,5,3) , LocalDate.of(2019,7,1) ) ) ;
	}
	
}
