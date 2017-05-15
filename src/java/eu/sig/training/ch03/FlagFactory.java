package eu.sig.training.ch03;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eu.sig.training.ch03.flags.*;

public class FlagFactory {
	
	private static Map<Nationality, GeneralFlag> Flags = new HashMap<Nationality, GeneralFlag>();
	
	static {
		Flags.put(Nationality.DUTCH, new DutchFlag());
		Flags.put(Nationality.GERMAN, new GermanFlag());
	}

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
    	GeneralFlag flag = Flags.get( nationality );
    	flag = flag != null ? flag : new UnknownFlag();
    	
    	return flag.getColors();
    }
    // end::getFlag[]

}