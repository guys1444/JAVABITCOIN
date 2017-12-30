import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     *
     *  demestrating block chain technology - 
     *  
     *  - blockchain pricepels - 
     *  
     *  By design, the blockchain is a decentralized technology.
     *  A global network of computers uses blockchain technology to jointly manage the database that records Bitcoin transactions. 
     *  That is, Bitcoin is managed by its network, and not any one central authority.
     *  
        Hash = digital signature = idenet
        genesis block = first block in chain
        

        Each block will have:

            List of transactions
            Previous Hash

            Hash

     */

    public static void main(String[] args) { 
	
	    Scanner scanner = new Scanner(System.in);
	    
		int cash_amount = scanner.nextInt();
		System.out.println("Transaction Amount of Genesis Block In BitCoins Equals To: " + cash_amount + " (Scret Information) ");
		
		String info_string1 = String.format("%s%d%s","a person sent ", cash_amount, " bitcoins to x");
        
		
	    String[] genesisTransactions = {info_string1};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"guy sent 10 bitcoin to person", "person sent 10 bitcoin to starbuck"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"guy sent 20 bitcoin to my mom"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        String[] block4Transactions = {"guy sent 100 bitcoin to my mom"};
        Block block4 = new Block(block3.getBlockHash(), block4Transactions);
        
        String[] block5Transactions = {"guy sent 1 bitcoin to my dad"};
        Block block5 = new Block(block4.getBlockHash(), block5Transactions);
        
        String[] block6Transactions = {"guy sent 10 bitcoin to my dad"};
        Block block6 = new Block(block5.getBlockHash(), block6Transactions);
        
        String[] block7Transactions = {"guy sent 11 bitcoin to my dad"};
        Block block7 = new Block(block6.getBlockHash(), block7Transactions);
        
        String[] block8Transactions = {"guy sent 12 bitcoin to my dad"};
        Block block8 = new Block(block7.getBlockHash(), block8Transactions);
        
        String[] block9Transactions = {"guy sent 13 bitcoin to my dad"};
        Block block9 = new Block(block8.getBlockHash(), block9Transactions);
        
        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());
        
        System.out.println("Hash of block 4:");
        System.out.println(block4.getBlockHash());
        
        System.out.println("Hash of block 5:");
        System.out.println(block5.getBlockHash());

        System.out.println("Hash of block 6:");
        System.out.println(block5.getBlockHash());
        
        System.out.println("Hash of block 7:");
        System.out.println(block5.getBlockHash());
        
        System.out.println("Hash of block 8:");
        System.out.println(block5.getBlockHash());
        
        System.out.println("Hash of block 9:");
        System.out.println(block5.getBlockHash());

    }


}