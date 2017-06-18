/**
  方法是从main函数开始，一步步执行。不是所有方法都要执行。
*/
class Method3 {
	
	public int fun1(int x) {
		return x + 1;
	}
	
	public int fun2(int x) {
		int y = fun1(x + 1);
		y = y + 1;
		return y;
	}
	
	public int fun3(int x) {
		int y = fun1(x + 1);
		y = y + 1;
		return y;
	}
	
	public static void main(String[] args) {
		Method3 m = new Method3();
		
		int y = m.fun3(1);
		System.out.println("y=" + y);
	}
	
	
}