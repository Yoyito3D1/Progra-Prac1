
//Programador 1: Jon Jordi Salvad� P�rez
//Programador 2: Nil Monfort Vila

import java.util.*;

public class Usuari {
	private String alies, t�tol, tema, dataPublicaci�;
	private int durada, numVisualitzacions, numGuardats, numLikes;
	public static int llindar = 50;
	
	/**
	 *
	 * Constructor
	 *
	 * @param alies, t�tol, tema, dataPublicaci�, durada
	 */
	public Usuari(String alies, String t�tol, String tema, String dataPublicaci�, int durada) {
		this.alies = alies;
		this.t�tol = t�tol;
		this.tema = tema;
		this.dataPublicaci� = dataPublicaci�;
		this.durada = durada;
		this.numVisualitzacions = 0;
		this.numGuardats = 0;
		this.numLikes = 0;
	}
	
	/**
	 *
	 * M�tode getter pels par�metres.
	 * 
	 * @param
	 * @return tema
	 */
	public String getTema() {
		return tema;
	}

	/**
	 *
	 * M�tode setter pels par�metres.
	 * 
	 * @param tema
	 * @return 
	 */
	public void setTema(String tema) {
		this.tema = tema;
	}

	/**
	 *
	 * M�tode getter pels par�metres
	 * 
	 * @param
	 * @return alies
	 */
	public String getAlies() {
		return alies;
	}

	/**
	 *
	 * M�tode getter pels par�metres
	 * 
	 * @param
	 * @return titol
	 */
	public String getT�tol() {
		return t�tol;
	}
	
	/**
	 *
	 * M�tode getter pels par�metres
	 * 
	 * @param
	 * @return dataPublicaci�
	 */
	public String getDataPublicaci�() {
		return dataPublicaci�;
	}
	
	/**
	 *
	 * M�tode getter pels par�metres
	 * 
	 * @param
	 * @return durada
	 */
	public int getDurada() {
		return durada;
	}

	/**
	 *
	 * M�tode getter pels par�metres
	 * 
	 * @param
	 * @return numVisualitzacions
	 */
	public int getNumVisualitzacions() {
		return numVisualitzacions;
	}
	
	/**
	 *
	 * M�tode getter pels par�metres
	 * 
	 * @param
	 * @return numGuardats
	 */
	public int getNumGuardats() {
		return numGuardats;
	}

	/**
	 *
	 * M�tode getter pels par�metres
	 * 
	 * @param
	 * @return numGuardats
	 */
	public int getNumLikes() {
		return numLikes;
	}

	/**
	 *
	 * Funci� per modificar el numVisualitzacions
	 * 
	 * @param increment
	 * @return 
	 */
	public void incrementarVisites(int increment) {
		this.numVisualitzacions = increment;
	}
		
	/**
	 *
	 * Funci� per modificar el incrementarGuardats
	 * 
	 * @param increment
	 * @return 
	 */
	public void incrementarGuardats(int increment) {
		this.numGuardats = increment;
	}
	
	/**
	 *
	 * Funci� per modificar el incrementarlikes
	 * 
	 * @param increment
	 * @return 
	 */
	public void incrementarlikes(int increment) {
		this.numLikes = increment;
	}
	
	/**
	 *
	 * Funci� per crear una copia d'un usuari
	 * 
	 * @param tip
	 * @return usercopia
	 */
	public Usuari copia(Usuari tip) {
    	Usuari usercopia = new Usuari(alies, t�tol, tema, dataPublicaci�, durada);
    	usercopia.incrementarGuardats(tip.getNumGuardats());
    	usercopia.incrementarlikes(tip.getNumLikes());
    	usercopia.incrementarVisites(tip.getNumVisualitzacions());
    	return usercopia;
	}

	/**
	 *
	 * M�tode toString
	 * 
	 * @param 
	 * @return string
	 */
	public String toString() {
		return ("TIP => �lies: " + alies + "| T�tol: " + t�tol + "| Tema: " + tema + "| Data:" + dataPublicaci� + "| Durada: " + durada + "| N�mero de views: " + numVisualitzacions + "| N�mero de guardats:" + numGuardats + "| N�mero de likes:" + numLikes + "");
	}
	
	/**
	 * Funci� per a calcular el ratio del n�mero de vizualitzacions amb el de
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
	 * Funci� per a catalogar un tip com a �til o no �til.
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
	 * Funci� que compara un tip amb un altre (passat per par�metre) i que indica si
	 * el tip actual, sobre el que es crida el m�tode, ha estat m�s vegades guardat
	 * que l�altre (el que es rep per par�metre). El m�tode retornar� un boole�.
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
	 * M�tode que compara un tip amb un altre (passat per par�metre) i retorna una
	 * c�pia de la inst�ncia del tip de m�s durada. Si la durada �s la mateixa, el
	 * m�tode retorna �null'.
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
	 * M�tode que rep per par�metre la data del dia en qu� estem i ens calcula la
	 * mitja de visualitzacions di�ries (n�mero de visualitzacions/n�mero de dies
	 * que porta publicat el tip). Si la data que es rep per par�metre �s anterior a
	 * la de publicaci� del tip, el m�tode retorna -1.
	 * 
	 * @param
	 * @return diferencia
	 */
	public int viewsMitja() {
		String dataInici = this.getDataPublicaci�();
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
	 * M�tode que guarda el llindar que consideria si un tip est� ben valorat
	 * (proporci� de likes sobre les visualitzacions �s almenys del 50%).
	 * Fes tamb� un m�tode que comprovi si un tip
	 * actual est� o no ben valorat.
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
	 * M�tode que permet canviar el valor de la proporci� per considerar si un tip
	 * est� ben valorat pot canviar, en una rang de 40 a 100.
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

