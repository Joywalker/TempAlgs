import HuffmanCoding.HuffmanCodeHelper;
import HuffmanCoding.HuffmanNode;
import HuffmanCoding.StringParser;

import java.util.PriorityQueue;

/**
 * Created by Joywalker on 5/5/2017.
 */
public class Main {

    public static void main(String []args)
    {
        StringParser stringParser = new StringParser("Mississippi");
        HuffmanCodeHelper huffmanHelper = new HuffmanCodeHelper(stringParser);
        HuffmanNode rootNode = huffmanHelper.getRootNode();
        PriorityQueue<HuffmanNode> tree = huffmanHelper.getQueue();
    }
}

