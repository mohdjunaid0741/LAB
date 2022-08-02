public class VandC {
    public static void main(String[] args) {
        int vowel =0;
        int consonant  = 0;
        String str = "We are making a java program";
        str = str.toLowerCase();

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
               vowel++;
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                consonant++;
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);

    }
}