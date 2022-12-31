package coding;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		System.out.println(list); //[]
		System.out.println(list.size()); //0
		list.add("steve"); 
		list.add("simon");
		list.add("smith");
		//[steve, simon, smith]
		System.out.println(list);
	}

}
