package book.thread.pool;

/**
 * ��������Ľӿ���
 */
public interface Task {

	/**
	 * ִ������
	 * @throws Exception ִ�й����п��ܳ��ֵ��쳣
	 */
	public void perform() throws Exception;
}
