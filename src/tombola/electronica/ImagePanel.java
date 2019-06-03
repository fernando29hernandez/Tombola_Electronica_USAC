/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombola.electronica;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
   private static final long serialVersionUID = 1L;
   private BufferedImage image;

   public ImagePanel(BufferedImage image) {
      this.image = image;
   }

   public BufferedImage getImage() {
      return image;
   }

   public void paint(Graphics g) {
      g.drawImage(image, 0, 0, this);
   }

   public void loadOriginalImage(File file) {
      try {
         image = ImageIO.read(file);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

  

   public void convertToGrayscale() {
      if (image == null)
         return;
      for (int i = 0; i < image.getHeight(); i++) {
         for (int j = 0; j < image.getWidth(); j++) {
            Color imageColor = new Color(image.getRGB(j, i));
            int rgb = (int) (imageColor.getRed() * 0.299)
               + (int) (imageColor.getGreen() * 0.587)
               + (int) (imageColor.getBlue() * 0.114);
            Color newColor = new Color(rgb, rgb, rgb);
            image.setRGB(j, i, newColor.getRGB());
         }
      }
   }
}