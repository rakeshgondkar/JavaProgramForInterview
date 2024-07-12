package stringPrograms;

public class CountOfWords {
	
	public void countWords(String str) {
		str = str.toLowerCase();
		String words[] = str.split(" ");
		int count=0;
		System.out.println("Duplicate words in given string is: ");
		for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;    
                    //Set words[j] to 0 to avoid printing visited word    
                    words[j] = "0";    
                }    
            }    
                
            //Displays the duplicate word if count is greater than 1    
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }    
	}
	
	public static void main(String[] args) {
		CountOfWords w = new CountOfWords();
		w.countWords("Apple is Apple fruit");
	}

}
