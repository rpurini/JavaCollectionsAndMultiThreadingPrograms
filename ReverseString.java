//print reverse string using for loop
/*1. using for loop
  2. using recursive mechanism
  3. using StringBuffer class
  */
class ReverseString{
	public static void main(String[] args){
		String str="javapurini";
		String reverse="";
		for(int i=str.length()-1; i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Using for loop:: Reverse of "+str+" is "+ reverse);
		
		//using StringBuffer class
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Using StringBuffer class::Reverse of "+str+" is "+ sb.reverse());
	}
}