import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        my_dict.put("G","C");
        my_dict.put("C","G");
        my_dict.put("T","A");
        my_dict.put("A","U");
        for(int i=0; i<dnaStrand.length(); i++)
            {
                Character c = dnaStrand.charAt(i);
                rnaStrand+=my_dict.get(String.valueOf(c));
            }
        return rnaStrand;
    }

}
