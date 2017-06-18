class Method5 {
	
	public int fun1(int x) {
		return x + 1;
	}
	
	public int fun2(int x) {
		int y = fun1(x + 1);
		y = y + 1;
		return y;
	}
	
	public int fun3(int x) {
		System.out.println("--14---" + x);
		int y = fun1(x + 1);
		System.out.println("--16---" + y);
		y = fun2(x + 1);
		System.out.println("--18---" + y);
		return y;
	}
	
	public static void main(String[] args) {
		Method5 m = new Method5();
		
		int y = m.fun3(1);
		System.out.println("y=" + y);
	}
	
	
}