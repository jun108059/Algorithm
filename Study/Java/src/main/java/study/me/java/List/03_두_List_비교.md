두 개의 리스트에 대한 값 비교 방법에 대해 알아보자.

1. containsAll()메소드를 사용하는 방법
2. Arrays.equals()메소드를 사용
3. ArrayList를 Collection으로 변환 후 removeAll()메소드를 사용하는 방법
4. contains()메소드와 for문을 사용하여 2개의 리스트 값을 하나하나 비교하는 방법


### containsAll()

두 개의 리스트가 같은지 여부 : containsAll()메소드를 사용하여 비교가 가능하며, 리턴값은 boolean타입이다.

```java
import java.util.ArrayList;

public class listComparisonExample {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("A");
		listA.add("B");
		listA.add("C");
		System.out.println("list A : "+ listA.toString());
		 
		ArrayList<String> listB = new ArrayList<String>(); 
		listB.add("C");
		listB.add("D");
		listB.add("E");
		System.out.println("list B : "+ listB.toString());
		
		//2개의 리스트 값이 같은지 비교
		listA.containsAll(listB);
		System.out.println("list A 와 list B 비교 : "+listA.containsAll(listB));

	}

}
/* 실행결과
list A : [A, B, C]
List B : [C, D, E]
*/
```

### Arrays.equals()

두번째 방법 : Arrays.equals()메소드를 사용, 리스트를 배열(Array)로 형변환필요

```java
import java.util.ArrayList;
import java.util.Arrays;

public class listComparisonExample {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("A");
		listA.add("B");
		System.out.println("list A : "+ listA.toString());
		 
		ArrayList<String> listB = new ArrayList<String>(); 
		listB.add("A");
		listB.add("B");
		System.out.println("list B : "+ listB.toString());
        
		//2개의 리스트 값이 같은지 비교
		boolean result = Arrays.equals(listA.toArray(),listB.toArray());
		System.out.println("list A 와 list B 비교 : "+result);
		
	}

}
```

만약,  두 개의 리스트 중 하나를 순서를 바꿔서 추가한 경우 서로 같지않음으로 리턴된다. 같은 값으로 비교가 필요한 경우 Collections.sort() 메소드를 사용하여 두개의 배열을 오름차순으로 정렬 후 비교하면 true값을 리턴한다.

```java
import java.util.ArrayList;
import java.util.Arrays;

public class listComparisonExample {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("A");
		listA.add("B");
		System.out.println("list A : "+ listA.toString());
		 
		ArrayList<String> listB = new ArrayList<String>(); 
		listB.add("B");
		listB.add("A");
		System.out.println("list B : "+ listB.toString());
		
		//2개의 리스트 값이 같은지 비교
		boolean result = Arrays.equals(listA.toArray(),listB.toArray());
		System.out.println("list A 와 list B 비교 : "+result);
        
        //Collections.sort(listA);
        //Collections.sort(listB); 
		 
	}

}
```

### removeAll()

세번째 방법 : ArrayList를 Collection으로 변환 후 removeAll()메소드를 사용하는 방법이다.  Collection으로 변환 후 removeAll()를 실행 후 출력결과를 보면 중복되지 않은 값만 출력하게 된다.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class listComparisonExample {

	public static void main(String[] args) {
		
		Collection<String> listA = new ArrayList(Arrays.asList("A", "B", "C"));
        Collection<String> listB = new ArrayList(Arrays.asList("A", "B", "C", "D"));

		//Collection으로 형변환 후 리스트에 담기
	    List<String> targetList1 = new ArrayList<String>(listA);
	    List<String> targetList2 = new ArrayList<String>(listB);

	    //각각 비교 대상 리스트 값 모두 제거
	    targetList1.removeAll( listB );
	    targetList2.removeAll( listA );

	    System.out.println("list A : "+ targetList1.toString() );
	    System.out.println("list B : "+ targetList2.toString() );
	}

}
```

리스트 A와 리스트 B를 비교했을 때 리스트A를 기준으로 했을 경우 B와 중복되지않은 값은 없다.

반대로 리스트B를 기준으로 했을 경우, 중복된 값은 제거후 남은 "D"값만 출력되었다.

### contains()

네번째 방법 : contains()메소드와 for문을 사용하여 2개의 리스트 값을 하나하나 비교하는 방법이다. 이 방법은 비추한다. 이렇게 까지하며 특정 값을 찾을 경우가 아니라면 말이다.

```java
import java.util.ArrayList;

public class listComparisonExample {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("A");
		listA.add("B");
		listA.add("C");
		//System.out.println("list A : "+ listA.toString());
		 
		ArrayList<String> listB = new ArrayList<String>(); 
		listB.add("A");
		listB.add("B");
		listB.add("D");
		listB.add("F");
		//System.out.println("list B : "+ listB.toString());
		
		for(String a : listA) {
			boolean isEquals = false;
			for(String b : listB) {
				if(a.equals(b)) isEquals = true; 
			}
			
			if(isEquals) System.out.println("list A와  list B의 값과 일치 하는 문자열 : "+ a);
			else System.out.println("list A와  list B의 값과 일치 하지 않는 문자열 : "+ a);
		}

	}

}
```

list A를 기준으로 비교한 결과 값의 출력결과는 다음과 같다.

### Reference

https://ddolcat.tistory.com/513