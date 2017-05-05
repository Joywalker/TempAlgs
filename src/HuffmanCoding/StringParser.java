package HuffmanCoding;

import java.util.ArrayList;

/**
 * Created by Joywalker on 4/9/2017.
 */
public class StringParser {

    private ArrayList<Character> charList;
    private String message;
    int[] charFrequency;
    char[] charMessage;


    public StringParser(String message){
        this.message = message;
        charList = new ArrayList<Character>();
        charMessage = this.message.toCharArray();
        PopulateList();
        charFrequency = new int[charList.size()];
        countFrequency();

    }

    private void PopulateList()
    {
        //add chars to list
        for (int i=0 ; i < charMessage.length ; i++)
        {
            if(!(charList.contains((charMessage[i]))))
                charList.add(charMessage[i]);
        }
    }

    //freq array

    private void setZeroFrequency()
    {
        for(int i = 0; i< charFrequency.length; i++)
        {
            charFrequency[i] = 0;
        }
    }
    private void countFrequency()
    {
        setZeroFrequency();
        for(int i =0; i < charList.size(); i++) {
            char value = charList.get(i);
            for (int j = 0; j < charMessage.length; j++) {
                if (value == charMessage[j]) {
                    charFrequency[i]++;
                }
            }
        }
        }

    public int[] getCharFrequency()
    {
        return charFrequency;
    }

    public ArrayList<Character> getCharList(){
        return charList;
    }
}
