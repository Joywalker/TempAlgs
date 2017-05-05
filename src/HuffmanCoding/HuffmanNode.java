package HuffmanCoding;

/**
 * Created by Joywalker on 4/14/2017.
 */
public class HuffmanNode implements Comparable<HuffmanNode>
{
    public int freq;
    public char chValue;
    public HuffmanNode left;
    public HuffmanNode right;

    /*
      Constructor of the HuffmanNode
     */
    HuffmanNode(char chValue,int freq,HuffmanNode left, HuffmanNode right)
    {
        this.freq = freq;
        this.chValue = chValue;
        this.left = left;
        this.right = right;
    }

    public boolean isNodeLeaf()
    {
      return (left == null && right == null );
    }

    // Extendable method
    public int compareTo(HuffmanNode that)
    {
        return this.freq - that.freq;
    }

}