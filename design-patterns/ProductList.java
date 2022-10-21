import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
@SuppressWarnings(value="all")
public class ProductList extends ArrayList{

	private Product[] product;

	private ReminderVisitor reminderVisitor;




	ProductList(){
	}



	public void getProductList() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("ProductInfo.txt"));
		String s;
		int temptype=-1;
		while((s=br.readLine())!=null){
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
			this.add(new Product(temptype,words[1]));
		}
	}



	public void accept(NodeVisitor nv){
		System.out.println("Accept Method in Product List");
	}

}
