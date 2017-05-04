package HuffmanCoding;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Vector;

/**
 * Created by Joywalker on 4/9/2017.
 */
public class HuffmanCodeHelper {
    private Vector<HuffmanNode> nodesVector;
    private int[] tempCharFrequency;
    private ArrayList<Character> tempCharList;
    private String codedMessage;
    private PriorityQueue<HuffmanNode> PQ;
    private HuffmanNode rootNode;
    private int size;

    public HuffmanCodeHelper(StringParser object) {
        tempCharFrequency = object.getCharFrequency();
        tempCharList = object.getCharList();
        nodesVector = new Vector<HuffmanNode>();
        PQ = new PriorityQueue<HuffmanNode>();
        CreateNodesVector();
        createTree();
    }

    private void CreateNodesVector() {
        assert (tempCharFrequency != null && tempCharFrequency != null);
        for (int i = 0; i < tempCharList.size(); i++) {
            HuffmanNode newNode = new HuffmanNode(tempCharList.get(i), tempCharFrequency[i], null, null);
            nodesVector.add(newNode);
        }
    }

    public Vector<HuffmanNode> getNodesVector() {
        return nodesVector;
    }

    public void SortVector() {
        //to be reviewed
        HuffmanNode aux = null;
        for (int i = 0; i < nodesVector.size(); i++) {
            for (int j = 1; j < nodesVector.size() - 1; j++) {
                if (nodesVector.get(j).freq > nodesVector.get(i).freq) {
                    aux = nodesVector.get(i);
                    nodesVector.set(i, nodesVector.get(j));
                    nodesVector.set(j, aux);
                }
            }
        }
    }
    public String getSize() {return String.valueOf(nodesVector.size() + size);}
    private HuffmanNode createTree()
    {
        for(int i = 0; i < nodesVector.size(); i++) { PQ.add(nodesVector.get(i));}
        while(PQ.size() > 1)
        {
            HuffmanNode firstPop = PQ.poll();
            HuffmanNode secondPop = PQ.poll();
            HuffmanNode parentNode = new HuffmanNode('\0',firstPop.freq+secondPop.freq,firstPop,secondPop);
            PQ.offer(parentNode);

        }
        rootNode = PQ.peek();
        return rootNode;
    }
    public HuffmanNode getRootNode(){return rootNode;}
    public PriorityQueue<HuffmanNode> getQueue() {
        assert (PQ.size() != 0);
        return PQ;
    }
}

