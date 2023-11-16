class Test{
	public double go(double x,double y){
		double b=Math.pow(x,y);
		System.out.println("power is:"+b);
		return b;
	}
	public static void main(String args[]){
		Test ob=new Test();
		double i=ob.go(2.0,3.0);
		System.out.println("power is:"+i);
	}
}

//Output

power is:8.0
power is:8.0
