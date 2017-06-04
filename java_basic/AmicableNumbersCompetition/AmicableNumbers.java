import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Intel�Ķ��̱߳���-�������ļ���
 * http://softwarecontests-zho.intel.com/threadingchallenge
 * 
 * @author kris
 */
public class AmicableNumbers {

	static int startNum;
	static int endNum;

	/**
	 * �������߳�
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
			
			System.out.println("===Finish to populate Amicable Number===");
		}
	}

	/**
	 * �׺����߳�
	 */
	static class FriendlyNumber extends Thread {
		public void run() {
			int len = endNum - startNum + 1;

			int[] num = new int[len];
			int[] sums = new int[len];
			int[] oldNum = new int[len]; // �����ʼ����

			// ���㹫Լ��֮��
			for (int i = startNum, j = 0; i <= endNum; i++) {
				int sum = 0;
				for (int k = 1; k <= i / 2; k++) {
					if ((i % k) == 0) {
						sum += k;
					}
				}
				num[j] = i; // �ѱ��������������a������
				oldNum[j] = i;
				sums[j] = sum + i; // �ѹ�Լ���ĺͱ�����b������
				j++;
			}

			for (int i = 0; i < num.length; i++) {

				// ����Լ�ֽ��
				for (int k = 2; k <= num[i];) {
					if (num[i] == 1 || sums[i] == 1) {
						break;
					}
					if ((num[i] % k == 0) && (sums[i] % k == 0)) {
						num[i] = num[i] / k;
						sums[i] = sums[i] / k;
						continue;
					}
					k++;
				}

				for (int j = 0; j < sums.length; j++) {
					if (num[j] == num[i] && sums[j] == sums[i] && i != j) {
						System.out.println(oldNum[j] + " �� " + oldNum[i]
								+ " ���׺���");
					}
				}
			}
			
			System.out.println("===Finish to populate Friendly Number===");

		}
	}

	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("===Program START===");

		if (args == null || args.length != 2) {
			System.out.println("Usage: java AmicableNumbers <num1> <num2>");
			return;
		}

		startNum = Integer.parseInt(args[0]);
		endNum = Integer.parseInt(args[1]);

		if (startNum > endNum) {
			System.out.println("Error: the <num1> should less than <num2>");
			return;
		}

		new AmicableNumber().start();
		new FriendlyNumber().start();
		
	}

}
