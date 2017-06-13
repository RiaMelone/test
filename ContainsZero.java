public class ContainsZero implements ActionObject{
	int counter = 0;
	public void action(Node n){
		if(n.data instanceof Integer){
			if(((Integer)n.data).intValue() == 0) counter++;
		}
	}
}
