package data;

public class Tasks {

    private String[] listWords;

    public Tasks(String[] list) {
        this.listWords = list;
    }

    public void showWordsWithSpecificLength(int len ) {
        int numWords = 0;
        for (int i = 0; i < this.listWords.length ; i++) {
            int temp = this.listWords[i].length();
            if(temp == len) { numWords++; };
        }
        System.out.println("The number of words with length: " + len + " is: " + numWords);
        System.out.println();
    }

    public void showNewTable(int index) {
        String[] list = this.createTableOfIndex(index);
        System.out.println("New array contains " + index + " words:");
        for (int i = 0; i < index; i++)
        { System.out.println((i+1) + ": " + list[i]); }
        System.out.println();
    }

    public String[] createTableOfIndex (int index) {
        String[] newList = new String[index];
        for(int i = 0; i < index; i++)
        { newList[i] = this.listWords[i]; }
        return newList;
    }
}




