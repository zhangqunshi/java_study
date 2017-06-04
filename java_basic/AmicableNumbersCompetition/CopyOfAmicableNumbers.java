import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * 对于一对不相同的整数，如果其中一个整数的正约数（proper
 * divisors）之和等于第二个整数，且反之亦然，那么这对整数便可称之为一对“相亲数”（amicable numbers）。 <br>
 * 示例：220, 284 <br>
 * 220=2^2*5*11 (1+2+4+5+10+11+20+22+44+55+110 = 284) <br>
 * 284=2^2*71 (1+2+4+71+142 = 220) <br>
 * 请考虑一个自然数的各约数之和与该数本身的比率，即 R(n)。 如果两个不相同的自然数的比率相等，那么这样的数称为一对“亲和数”（friendly
 * numbers）。
 * 
 * @author kris
 * 
 */
public class CopyOfAmicableNumbers {

	static int startNum;
	static int endNum;

	/**
	 * 相亲数
	 */
	static class AmicableNumber extends Thread {
		public void run() {
			HashMap<Integer, Integer> numSum = new HashMap<Integer, Integer>();

			// 计算出所有数的正约数(proper divisors)之和
			for (int i = startNum; i <= endNum; i++) {
				int sum = 0;
				for (int k = 1; k <= i / 2; k++) {
					if ((i % k) == 0) {
						sum += k;
					}
				}
				numSum.put(i, sum);
			}

			// 得到所有相亲数
			ArrayList<Integer> list = new ArrayList<Integer>();
			Iterator<Integer> it = numSum.keySet().iterator();
			while (it.hasNext()) {
				Integer key1 = it.next();
				Integer value1 = numSum.get(key1);
				Integer value2 = numSum.get(value1);

				if ((value2 != null) && (key1.intValue() == value2.intValue())
						&& (key1.intValue() != value1.intValue())
						&& !list.contains(key1)) {
					list.add(value1);
					System.out.println(key1 + "和" + value1 + "是相亲数");
				}
			}
		}
	}

	/**
	 * 亲和数
	 */
	static class FriendlyNumber extends Thread {
		public void run() {
			int len = endNum - startNum + 1;

			int[] a = new int[len];
			int[] b = new int[len];

			for (int i = startNum, j = 0; i <= endNum; i++) {
				int sum = 0;
				for (int k = 1; k <= i / 2; k++) {
					if ((i % k) == 0) {
						sum += k;
					}
				}
				a[j] = i;
				b[j] = sum + i;
				j++;
			}

			int[] x = new int[a.length];

			for (int i = 0; i < a.length; i++) {
				x[i] = a[i];
			}

			for (int i = 0; i < a.length; i++) {
				for (int k = 2; k <= a[i];) {
					if (a[i] == 1 || b[i] == 1)
						break;
					if (a[i] % k == 0 && b[i] % k == 0) {
						a[i] = a[i] / k;
						b[i] = b[i] / k;
						continue;
					}
					k++;
				}
				for (int j = 0; j < b.length; j++) {
					if (a[j] == a[i] && b[j] == b[i] && i != j) {
						System.out.println(x[j] + " 和 " + x[i] + " 是亲和数");
					}
				}
			}

		}
	}

	/**
	 * 通过相乘计算亲和数
	 * 
	 * @author kris
	 * 
	 */
	class FriendlyNumber2 extends Thread {
		public void run() {
			int len = endNum - startNum + 1;

			int[] a = new int[len];
			int[] b = new int[len];

			for (int i = startNum, j = 0; i <= endNum; i++) {
				int sum = 0;
				for (int k = 1; k <= i / 2; k++) {
					if ((i % k) == 0) {
						sum += k;
					}
				}
				a[j] = i;
				b[j] = sum + i;
				j++;
			}

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if ((a[i] * b[j]) == (a[j] * b[i]) && i != j)
						System.out.println(a[i] + " 和 " + a[j] + " 是亲和数");
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("===Main===");

		startNum = Integer.parseInt(args[0]);
		endNum = Integer.parseInt(args[1]);

		new AmicableNumber().start();
		new FriendlyNumber().start();

	}

}
