package agh.cs.lab2;

public class CarSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Position position1 = new Position(1,2);
		System.out.println(position1);
		Position position2 = new Position(-2,1);
		System.out.println(position2);
		System.out.println(position1.add(position2));
		
		MapDirection x = MapDirection.North;
		System.out.println(x.toString());
		System.out.println(x.next());
		System.out.println(x.previous());
	}

}
