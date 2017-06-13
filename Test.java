public class Test {
	public static void showCointaintsZero(List list){
		ContainsZero ao = new ContainsZero();
		list.traverseAndApply(ao);
		System.out.println(ao.counter);
	}
	
	public static void showposSum(List list){
		SumPositive ao = new SumPositive();
		list.traverseAndApply(ao);
		System.out.println(ao.sum);
	}
	
	public static void main(String [ ] args){
		List l = new List();
		
		l.add(4);
		l.add(-4);
		l.add(6);
		l.add(0);
		l.add(-3);
		l.add(8);
		l.add(-33);
		l.add(0);
		l.add(7);
		l.add(3);
		l.add(0);
		l.add(1);
		l.add("hallo");
		
		showCointaintsZero(l);
		showposSum(l);
	}
}