package a20_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionEx {
	//String데이터만 슬수있는 제네릭 /  컬렉션을 상속 받는 것들
	private Collection<String> collection;
	private ArrayList<String> arrayList;
	private HashSet<String> hashSet;
	//map은 컬렉션상속 x
	private HashMap<String, String> hashMap;
}
