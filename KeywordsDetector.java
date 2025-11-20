public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {      
        for (int i = 0; i < sentences.length; i++) { // Run over all the sentences.
            boolean isPrinted = false;
            for (int j = 0; j < keywords.length; j++) { // Check for every word at the keywords array if it exists in the sentence.
                if (hasKeyword(sentences[i], keywords[j]) == true && isPrinted == false) {
                    System.out.println(sentences[i]);
                    isPrinted = true;
                }
                
            }
        }  
    }

    /** A function that check if a keyword exists in a sentence. */
    public static boolean hasKeyword(String sentence, String keyword) {
        sentence = sentence.toLowerCase();
        keyword = keyword.toLowerCase();
        if (sentence.contains(keyword) == true) { // If the sentence contains the keyword, return true.
            return true;
        }
        return false;
    }
}
