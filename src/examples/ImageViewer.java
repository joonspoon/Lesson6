package examples;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageViewer extends JPanel {

	private BufferedImage image;
	private String imageName;

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public ImageViewer(String imageName) {
		this.imageName = imageName;
		loadImage();
	}

	public void show() {
		createUI();
	}

	private void loadImage() {
		String imageFile = "resource/" + imageName;
		try {
			image = ImageIO.read(new File(imageFile));

		} catch (IOException e) {
			System.err.print("Could not load image: " + imageFile);
		}
	}

	private void createUI() {
		JFrame frame = new JFrame(imageName);
		frame.add(this);
		setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}

}
