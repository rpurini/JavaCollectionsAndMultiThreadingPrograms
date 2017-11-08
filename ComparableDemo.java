//Comparable Demo
//to check compareTo() method
//Comparable(I) from java.lang package
class ComparableDemo{
	public static void main(String [] args){
		System.out.println("A".compareTo("B"));//-ve
		System.out.println("B".compareTo("A"));//+ve
		System.out.println("A".compareTo("A"));//0
		System.out.println("Raja".compareTo("Raaj"));//+ve
		System.out.println("Raaj".compareTo("Raj"));//-ve
	}
}