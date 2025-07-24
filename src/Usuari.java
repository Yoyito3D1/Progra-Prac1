
//Programador 1: Jon Jordi Salvadó Pérez
//Programador 2: Nil Monfort Vila

import java.util.*;

public class Usuari {
	private String alies, títol, tema, dataPublicació;
	private int durada, numVisualitzacions, numGuardats, numLikes;
	public static int llindar = 50;
	
	/**
	 *
	 * Constructor
	 *
	 * @param alies, títol, tema, dataPublicació, durada
	 */
	public Usuari(String alies, String títol, String tema, String dataPublicació, int durada) {
		this.alies = alies;
		this.títol = títol;
		this.tema = tema;
		this.dataPublicació = dataPublicació;
		this.durada = durada;
		this.numVisualitzacions = 0;
		this.numGuardats = 0;
		this.numLikes = 0;
	}
	
	/**
	 *
	 * Mètode getter pels paràmetres.
	 * 
	 * @param
	 * @return tema
	 */
	public String getTema() {
		return tema;
	}

	/**
	 *
	 * Mètode setter pels paràmetres.
	 * 
	 * @param tema
	 * @return 
	 */
	public void setTema(String tema) {
		this.tema = tema;
	}

	/**
	 *
	 * Mètode getter pels paràmetres
	 * 
	 * @param
	 * @return alies
	 */
	public String getAlies() {
		return alies;
	}

	/**
	 *
	 * Mètode getter pels paràmetres
	 * 
	 * @param
	 * @return titol
	 */
	public String getTítol() {
		return títol;
	}
	
	/**
	 *
	 * Mètode getter pels paràmetres
	 * 
	 * @param
	 * @return dataPublicació
	 */
	public String getDataPublicació() {
		return dataPublicació;
	}
	
	/**
	 *
	 * Mètode getter pels paràmetres
	 * 
	 * @param
	 * @return durada
	 */
	public int getDurada() {
		return durada;
	}

	/**
	 *
	 * Mètode getter pels paràmetres
	 * 
	 * @param
	 * @return numVisualitzacions
	 */
	public int getNumVisualitzacions() {
		return numVisualitzacions;
	}
	
	/**
	 *
	 * Mètode getter pels paràmetres
	 * 
	 * @param
	 * @return numGuardats
	 */
	public int getNumGuardats() {
		return numGuardats;
	}

	/**
	 *
	 * Mètode getter pels paràmetres
	 * 
	 * @param
	 * @return numGuardats
	 */
	public int getNumLikes() {
		return numLikes;
	}

	/**
	 *
	 * Funció per modificar el numVisualitzacions
	 * 
	 * @param increment
	 * @return 
	 */
	public void incrementarVisites(int increment) {
		this.numVisualitzacions = increment;
	}
		
	/**
	 *
	 * Funció per modificar el incrementarGuardats
	 * 
	 * @param increment
	 * @return 
	 */
	public void incrementarGuardats(int increment) {
		this.numGuardats = increment;
	}
	
	/**
	 *
	 * Funció per modificar el incrementarlikes
	 * 
	 * @param increment
	 * @return 
	 */
	public void incrementarlikes(int increment) {
		this.numLikes = increment;
	}
	
	/**
	 *
	 * Funció per crear una copia d'un usuari
	 * 
	 * @param tip
	 * @return usercopia
	 */
	public Usuari copia(Usuari tip) {
    	Usuari usercopia = new Usuari(alies, títol, tema, dataPublicació, durada);
    	usercopia.incrementarGuardats(tip.getNumGuardats());
    	usercopia.incrementarlikes(tip.getNumLikes());
    	usercopia.incrementarVisites(tip.getNumVisualitzacions());
    	return usercopia;
	}

	/**
	 *
	 * Mètode toString
	 * 
	 * @param 
	 * @return string
	 */
	public String toString() {
		return ("TIP => Àlies: " + alies + "| Títol: " + títol + "| Tema: " + tema + "| Data:" + dataPublicació + "| Durada: " + durada + "| Número de views: " + numVisualitzacions + "| Número de guardats:" + numGuardats + "| Número de likes:" + numLikes + "");
	}
	
	/**
	 * Funció per a calcular el ratio del número de vizualitzacions amb el de
	 * guardats
	 * 
	 * @param
	 * @return ratio
	 */
	public float ratioComputation() {
		float ratio = (((float)numVisualitzacions / numGuardats));
		return ratio;
	}
	
	/**
	 * Funció per a catalogar un tip com a útil o no útil.
	 * 
	 * @param
	 * @return util
	 */
	public boolean tipUtil() {
		int numGuardats = this.getNumGuardats();
		int numLikes = this.getNumLikes();
		boolean util = false;
		if (numGuardats > numLikes) util = true;
		return util;
	}
	
	/**
	 * Funció que compara un tip amb un altre (passat per paràmetre) i que indica si
	 * el tip actual, sobre el que es crida el mètode, ha estat més vegades guardat
	 * que l’altre (el que es rep per paràmetre). El mètode retornarà un booleà.
	 * 
	 * @param tip
	 * @return primerMesGran
	 */
	public boolean comparaTip(Usuari tip) {
		boolean primerMesGran = false;
		int nSaved1 = this.getNumGuardats();
		int nSaved2 = tip.getNumGuardats();
		if(nSaved1 > nSaved2) primerMesGran = true;
		return primerMesGran;
	}
	
	/**
	 * Mètode que compara un tip amb un altre (passat per paràmetre) i retorna una
	 * còpia de la instància del tip de més durada. Si la durada és la mateixa, el
	 * mètode retorna ‘null'.
	 * 
	 * @param tip
	 * @return tipFinal
	 */
	public Usuari comparaTipDurada(Usuari tip) {
		int durada1 = this.getDurada();
		int durada2 = tip.getDurada();
		Usuari tipFinal = null;
		if(durada1 > durada2) tipFinal = this.copia(this);
		else if (durada1 < durada2) tipFinal = tip.copia(tip);
		return tipFinal;
	}
	
	/**
	 * Mètode que rep per paràmetre la data del dia en què estem i ens calcula la
	 * mitja de visualitzacions diàries (número de visualitzacions/número de dies
	 * que porta publicat el tip). Si la data que es rep per paràmetre és anterior a
	 * la de publicació del tip, el mètode retorna -1.
	 * 
	 * @param
	 * @return diferencia
	 */
	public int viewsMitja() {
		String dataInici = this.getDataPublicació();
		int visites = this.getNumVisualitzacions(), diferencia;
		
        String[] values = dataInici.split("/");
        int dia = Integer.parseInt(values[0]);
        int mes = Integer.parseInt(values[1]);
        int any = Integer.parseInt(values[2]);
        
        Calendar inici = Calendar.getInstance();
        inici.set(any, mes-1, dia);
        
        Calendar actual = Calendar.getInstance();
        
        long fiMS = actual.getTimeInMillis();
		long iniciMS = inici.getTimeInMillis();
		
		int dies = (int) ((fiMS - iniciMS) / (1000*60*60*24));
		if(dies < 0) diferencia = -1;
		else diferencia = (visites / dies);
		
		return diferencia;
	}
	
	/**
	 * Mètode que guarda el llindar que consideria si un tip està ben valorat
	 * (proporció de likes sobre les visualitzacions és almenys del 50%).
	 * Fes també un mètode que comprovi si un tip
	 * actual està o no ben valorat.
	 * 
	 * @param
	 * @return ratio
	 */
	public boolean benValorat() {
		float numVisualitzacions = this.getNumVisualitzacions();
		float numLikes = this.getNumLikes();
		boolean ratio = false;
		if(((numLikes/numVisualitzacions)*100) > (llindar)) ratio = true;
		return ratio;
	}
	
	/**
	 * Mètode que permet canviar el valor de la proporció per considerar si un tip
	 * està ben valorat pot canviar, en una rang de 40 a 100.
	 * 
	 * @param llindar
	 * @return canviRealitzat
	 */
	public boolean canviLlindar(int llindar) {
		boolean canviRealitzat = false;
		if((llindar >= 40) && (llindar <= 100)) {
			canviRealitzat = true;
			Usuari.llindar = llindar;
		}
		return canviRealitzat;
	}
}

