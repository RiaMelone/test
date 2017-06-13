public class SumPositive implements ActionObject{
	int sum = 0;
	public void action(Node n){
		if(n.data instanceof Integer){
			int tmp = ((Integer)n.data).intValue();
			if(tmp >= 0) sum += tmp;
		}
	}
}
