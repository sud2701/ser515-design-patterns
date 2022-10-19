import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductList {

	private Product[] product;

	private ReminderVisitor reminderVisitor;

	ArrayList<Product> prodList;


	ProductList(){
		prodList=new ArrayList<>();
	}

	public void getProductList() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("ProductInfo.txt"));
		String s=br.readLine();
		int temptype=-1;
		while(s!=null){
			String[] words=s.split(":");
			if(words[0].equals("Meat")){
				temptype=0;
			}
			else if(words[0].equals("Produce")){
				temptype=1;
			}
			else{
				System.out.println("Invalid Product Type occurred : "+words[0]);
				System.out.println("Unable to proceed forward");
				System.exit(-1);
			}
			prodList.add(new Product(temptype,words[1]));
		}
	}

    public Object createIterator() {

		return this.prodList.iterator();
    }
}
