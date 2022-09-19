package corejava_package;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package assignment2;

class State {
	void state() {
		System.out.println("karnataka");
	}


}
class City extends State{
	void city() {
		System.out.println("Bangalore");
	}
}
class Dist extends City{
	void dist() {
		System.out.println("Bangalore Urban");
	}
		public static void main(String [] args) {
			Dist dt = new Dist();
			dt.dist();
			dt.city();
			dt.state();

		}
}
