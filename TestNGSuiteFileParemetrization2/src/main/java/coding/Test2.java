package coding;

import java.util.HashMap;

public class Test2 {
	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("name", "steve");
		hash.put("Id", "USA");
		System.out.println(hash);
		//{name=steve, Id=USA}
		System.out.println(hash.get("name"));
		System.out.println(hash.get("Id"));
		System.out.println(hash.get("ID2")); //null
	}

}
