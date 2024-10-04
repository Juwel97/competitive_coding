package Remove_Occurence_Of_Specific_Character;

public class RemoveCharacterOccurrence {

    public static void main(String[] args) {

        String phase = " This is the land of opportunities";

        // Remove occurrence of 'i' in the above string.
        String ch = "i";

        // Method 1 : Using in build replace function of String class.
        phase = phase.replaceAll(ch, "");
        System.out.println(phase);

        //----------------------------------------------------

        phase = " This is the land of opportunities";
        // Method 2 : Using self written function
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < phase.length() ; i++) {
             if(phase.charAt(i) == 'i' || phase.charAt(i) == 'I') {

             }
             else {
                 sb.append(phase.charAt(i));
             }
        }
        System.out.println(sb.toString());
    }
}


