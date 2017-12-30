import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Guy Suckerman on 2017-010-28.
 */
public class Block {

	/**
	 * creating Block calld Hash
	 */
    private int previousHash;
    private String[] transactions;

    private int blockHash;
	private int cash_amount;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;


    	/**
    	 * arrays of block objects
    	 */
        
        Object[] contens = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contens);

    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}