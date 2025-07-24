public class AppUsuari {

	public static void main(String[] args) {
		
		Usuari tip1, tip2, tip3, tip4, tip5;
		
		// Aquí inicilaitzarem els 5 tips amb tots els seus valors pertinents per a que que es puguin fer servir per a les proves
		tip1 = new Usuari("Nil", "Importar un projecte a Eclipse", "Laboratori 01" , "10/09/2021", 120);
		tip1.incrementarVisites(2256);   
		tip1.incrementarGuardats(1540);
		tip1.incrementarlikes(1450);
		
		tip2 = new Usuari("Jordi", "Exportar un projecte d’Eclipse", "Laboratori 02" , "20/8/2021", 40);
		tip2.incrementarVisites(1600);
		tip2.incrementarGuardats(187);
		tip2.incrementarlikes(500);
		
		tip3 = new Usuari("Andre", "Primers passos amb el debug", "Laboratori 03" , "4/10/2021", 185);
		tip3.incrementarVisites(650);
		tip3.incrementarGuardats(450);
		tip3.incrementarlikes(420);
		
		tip4 = new Usuari("Carles", "Dubte amb el this", "Laboratori 04" , "28/09/2021", 50);
		tip4.incrementarVisites(5400);
		tip4.incrementarGuardats(440);
		tip4.incrementarlikes(2000);
		
		tip5 = new Usuari("Ana", "Problema obrint l'eclipse", "Laboratori 00" , "1/09/2021", 200);
		tip5.incrementarVisites(870);
		tip5.incrementarGuardats(600);
		tip5.incrementarlikes(400);
		
		// Com a decissió de disseny hem decidit deixar la crida de les funcions estàtiques 
		// com es veu a continuació per tal de que vostè pugui comprovar que ficant la combinació 
		// de tips que vulgui funcinarà addientment
		
		// Us dels getters i setter
		validarGetTema(tip2);
		validarSetTema(tip2);
		validarGetAlies(tip2);
		validarGetTitol(tip2);
		validarGetDataPublicacio(tip2);
		validarGetDurada(tip2);
		validarGetNumVisualitzacions(tip2);
		validarGetNumGuardats(tip2);
		validarGetNumLikes(tip2);
		
		// Us del to string 
		validarToString(tip1);
		// Us de la funció copia
		validarCopia(tip1);
		// Us de la funció ratioComputation
		validarRatioComputation(tip2);
		// Us de la funció tipUtil
		validarTipUtil(tip5);
		// Us de la funció comparaTip
		validarComparaTip(tip3, tip4);
		// Us de la funció comparaTipDurada
		validarComparaTipDurada(tip4, tip2);
		// Us de la funció viewsMitja
		validarViewsMitja(tip3);
		// Us de la funció canviLlindar
		validarCanviLlindar(tip4, 20);
	}


    /**
	 * Mètode estàtic que valida el Getter del tema del tip.
	 *
	 * @param tip
	 */
	public static void validarGetTema(Usuari tip) {
		System.out.println(tip.getTema());
	}

    /**
	 * Mètode estàtic que valida el Setter del tema del tip.
	 *
	 * @param tip
	 */
	public static void validarSetTema(Usuari tip) {
		tip.setTema("Prova de tema");
		System.out.println(tip.getTema());
	}
	
    /**
	 * Mètode estàtic que valida el Getter del alies del tip.
	 * 
	 * @param tip
	 */
	public static void validarGetAlies(Usuari tip) {
		System.out.println(tip.getAlies());
	}

    /**
	 * Mètode estàtic que valida el Getter del títol del tip.
	 *
	 * @param tip
	 */
	public static void validarGetTitol(Usuari tip) {
		System.out.println(tip.getTítol());
	}

    /**
	 * Mètode estàtic que valida el Getter de la data de publicació  del tip.
	 * 
	 * @param tip
	 */
	public static void validarGetDataPublicacio(Usuari tip) {
		System.out.println(tip.getDataPublicació());
	}

    /**
	 * Mètode estàtic que valida el Getter de la durada del tip.
	 * 
	 * @param tip
	 */
	public static void validarGetDurada(Usuari tip) {
		System.out.println(tip.getDurada());
	}

    /**
	 * Mètode estàtic que valida el Getter del número de visualitzacions del tip.
	 * 
	 * @param tip
	 */
	public static void validarGetNumVisualitzacions(Usuari tip) {
		System.out.println(tip.getNumVisualitzacions());
	}

    /**
	 * Mètode estàtic que valida el Getter del número de guardats del tip.
	 * 
	 * @param tip
	 */
	public static void validarGetNumGuardats(Usuari tip) {
		System.out.println(tip.getNumGuardats());
	}

    /**
	 * Mètode estàtic que valida el Getter del número de likes del tip.
	 * 
	 * @param tip
	 */
	public static void validarGetNumLikes(Usuari tip) {
		System.out.println(tip.getNumLikes());
	}

	
	/**
	 * Mètode estàtic que imprimeix per pantalla una copia del tip.
	 * 
	 * @param tip
	 */
	public static void validarCopia(Usuari tip) {
		System.out.println(tip.copia(tip));
	}
	
	/**
	 * Mètode estàtic que fa servir la funció toString per imprimir les dades d'un tip.
	 * 
	 * @param tip
	 */
	public static void validarToString(Usuari tip) {
		System.out.println(tip.toString());
	}
	
	/**
	 * Mètode estàtic que calcula el ratio de visites / vegades guardat d'un tip
	 * 
	 * @param tip
	 */
	public static void validarRatioComputation(Usuari tip) {
		System.out.println("El ratio (visites / vegades guardat) del tip és de: " + tip.ratioComputation());
	}
	
	/**
	 * Mètode estàtic que ens indica si un tip és útil o no.
	 * 
	 * @param tip
	 */
	public static void validarTipUtil(Usuari tip) {
		if(tip.tipUtil() == true) System.out.println("El tip és útil");
		else System.out.println("El tip és inútil");
	}
	
	/**
	 * Mètode estàtic que fa servir la funció toString per imprimir les daades d'un tip
	 * 
	 * @param t1, t2
	 */
	public static void validarComparaTip(Usuari t1, Usuari t2) {
		if(t1.comparaTip(t2) == true) System.out.println("El primer tip ha estat guardat més vegades que el segon");
		else if(t1.comparaTip(t2) == false) System.out.println("El segon tip ha esta guardat més vegades que el primer");
		else System.out.println("Els 2 tips han estat guardats el mateix nombre de vegades");
	}
	
	/**
	 * Mètode estàtic que retorna una copia del tip que més durada té.
	 * 
	 * @param t1, t2
	 */
	public static void validarComparaTipDurada(Usuari t1, Usuari t2) {
		System.out.println("El mètode amb més durada és aquest: " + t1.comparaTipDurada(t2));
	}
	
	/**
	 * Mètode estàtic que retorna la mitjana de visites/dia d'un tip o -1 en cas de que la data sigui anterior.
	 * 
	 * @param tip
	 */
	public static void validarViewsMitja(Usuari tip) {
		if(tip.viewsMitja() == -1) System.out.println("Data incorrecte, es anterior a la de la publucació del vídeo");
		else System.out.println("La mitjana de visites per dia és de: " + tip.viewsMitja());
	}
	
	/**
	 * Mètode estàtic que ens indica si un tip està ben valorat.
	 * 
	 * @param tip
	 */
	public static void validarBenValorat(Usuari tip) {
		if(tip.benValorat() == true) System.out.println("El tip està ben valorat");
		else System.out.println("El tip no està ben valorat");
	}
	
	/**
	 * Mètode estàtic que serveix per canviar el llindar.
	 * 
	 * @param tip, llindar
	 */
	public static void validarCanviLlindar(Usuari tip, int llindar) {
		if(tip.canviLlindar(llindar) == true) System.out.println("El llindar ha sigut substituit correctament");
		else System.out.println("Valor de llindar incorrecte, el llindar serà 50");
	}
}



