package com.es.falm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EquiposEnum {
	
	RealMadrid("RMA",2),
	Barcelona("BAR",2),
	AtleticoMadrid("ATM",2),
	Sevilla("SEV",3),
	Getafe("GET",3),
	Villarreal("VIL",3),
	RealSociedad("RSO",3),
	Valencia("VAL",3),
	Granada("GRA",3),
	AthleticBilbao("ATH",3),
	Osasuna("OSA",3),
	Levante("LEV",3),
	Betis("BET",3),
	Alaves("ALA",3),
	Valladolid("VLL",3),
	Celta("CEL",3),
	Eibar("EIB",3),
	Mallorca("MLL",3),
	Leganes("LEG",3),
	Espanyol("ESP",3);
	
	private String nombreCorto;
	private int numeroMaximoJugadores;
	
	public static String getEnumByString(String code){
	      
		for(EquiposEnum e : EquiposEnum.values()){
	            if(e.nombreCorto.equals(code)) {
	            	return e.name();
	            }
	        }
	    return null;
	}
	
}


