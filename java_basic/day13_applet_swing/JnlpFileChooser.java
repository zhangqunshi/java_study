import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;

import javax.jnlp.FileContents;
import javax.jnlp.FileOpenService;
import javax.jnlp.FileSaveService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JnlpFileChooser extends JFrame {

	JTextField fileName = new JTextField();
	JButton open = new JButton("Open");
	JButton save = new JButton("Save");

	JEditorPane ep = new JEditorPane();
	JScrollPane jsp = new JScrollPane();
	FileContents fileContents;

	public JnlpFileChooser() {
		JPanel p = new JPanel();
		open.addActionListener(new OpenL());
		p.add(open);
		save.addActionListener(new SaveL());
		p.add(save);
		jsp.getViewport().add(ep);
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		fileName.setEditable(false);
		p = new JPanel();
		p.setLayout(new GridLayout(2, 1));
		p.add(fileName);
		add(p, BorderLayout.NORTH);
		ep.setContentType("text");
		save.setEnabled(false);
	}

	class OpenL implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			FileOpenService fs = null;
			try {
				fs = (FileOpenService) ServiceManager
						.lookup("javax.jnlp.FileOpenService");
			} catch (UnavailableServiceException e) {
				throw new RuntimeException(e);
			}
			if (fs != null) {
				try {
					fileContents = fs.openFileDialog(".", new String[] { "txt",
							"*" });
					if (fileContents == null)
						return;

					fileName.setText(fileContents.getName());
					ep.read(fileContents.getInputStream(), null);

				} catch (Exception e) {
					throw new RuntimeException(e);
				}
				save.setEnabled(true);
			}

		}
	}

	class SaveL implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			FileSaveService fs = null;
			try {
				fs = (FileSaveService) ServiceManager
						.lookup("javax.jnlp.FileSaveService");
			} catch (UnavailableServiceException e) {
				throw new RuntimeException(e);
			}
			if (fs != null) {
				try {
					fileContents = fs.saveFileDialog(".",
							new String[] { "txt" }, new ByteArrayInputStream(ep
									.getText().getBytes()), fileContents
									.getName());
					if (fileContents == null)
						return;

					fileName.setText(fileContents.getName());
					ep.read(fileContents.getInputStream(), null);

				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}

		}

	}

	public static void main(String[] args) {
		JnlpFileChooser fc = new JnlpFileChooser();
		fc.setSize(400, 300);
		fc.setVisible(true);

	}

}
