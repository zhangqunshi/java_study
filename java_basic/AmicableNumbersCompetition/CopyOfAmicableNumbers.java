import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * ����һ�Բ���ͬ���������������һ����������Լ����proper
 * divisors��֮�͵��ڵڶ����������ҷ�֮��Ȼ����ô���������ɳ�֮Ϊһ�ԡ�����������amicable numbers���� <br>
 * ʾ����220, 284 <br>
 * 220=2^2*5*11 (1+2+4+5+10+11+20+22+44+55+110 = 284) <br>
 * 284=2^2*71 (1+2+4+71+142 = 220) <br>
 * �뿼��һ����Ȼ���ĸ�Լ��֮�����������ı��ʣ��� R(n)�� �����������ͬ����Ȼ���ı�����ȣ���ô����������Ϊһ�ԡ��׺�������friendly
 * numbers����
 * 
 * @author kris
 * 
 */
public class CopyOfAmicableNumbers {

	static int startNum;
	static int endNum;

	/**
	 * ������
	 */
	static class AmicableNumber extends Thread {
		public void run() {
			HashMap<Integer, Integer> numSum = new HashMap<Integer, Integer>();

			// ���������������Լ��(proper divisors)֮��
			for (int i = startNum; i <= endNum; i++) {
				int sum = 0;
				for (int k = 1; k <= i / 2; k++) {
					if ((i % k) == 0) {
						sum += k;
					}
				}
				numSum.put(i, sum);
			}

			// �õ�����������
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
					System.out.println(key1 + "��" + value1 + "��������");
				}
			}
		}
	}

	/**
	 * �׺���
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
						System.out.println(x[j] + " �� " + x[i] + " ���׺���");
					}
				}
			}

		}
	}

	/**
	 * ͨ����˼����׺���
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
						System.out.println(a[i] + " �� " + a[j] + " ���׺���");
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
