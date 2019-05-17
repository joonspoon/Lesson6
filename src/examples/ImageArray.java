package examples;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class ImageArray {

	public static void main(String[] args) {

		ImageViewer imageViewer = new ImageViewer("Amongst The Tales Of Life.jpeg");
		
		int[][][] imageAsArray = convertToArray(imageViewer.getImage());
		
		// 1. Print the RGB value for each pixel in the image.
		
		// 2. Remove all the blue and green from the image.
		
		// 3. Convert to black & white.
		
		// [optional] Post a manipulated photo of yourself to Slack.
		
		
		imageViewer.setImage(convertToImage(imageAsArray));
		
		imageViewer.show();
		
	}

	private static int[][][] convertToArray(BufferedImage image) {
		int[][][] imageAsArray = new int[image.getWidth()][image.getHeight()][3];

		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				Color pixelColor = new Color(image.getRGB(i, j));
				imageAsArray[i][j][0] = pixelColor.getRed();
				imageAsArray[i][j][1] = 0;
				imageAsArray[i][j][2] = 0;
			}
		}
		return imageAsArray;

	}

	private static BufferedImage convertToImage(int[][][] imageAsArray) {

		BufferedImage buff = new BufferedImage(imageAsArray.length, imageAsArray[0].length, BufferedImage.TYPE_INT_RGB);
		for (int x = 0; x < imageAsArray.length; x++) {
			for (int y = 0; y < imageAsArray[0].length; y++) {
				Color color = new Color(imageAsArray[x][y][0], imageAsArray[x][y][1], imageAsArray[x][y][2]);
				int rgb = color.getRGB();
				buff.setRGB(x, y, rgb);
			}
		}
		return buff;
	}
}