import javax.swing.SwingUtilities;
import java.awt.Component;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class TitlesFrame extends JFrame 
{
    
    /** 
     * @return 
     * разрешение консольного окна, оглавление, вызов TitlesPanel с передачей в него значений
     */
    public TitlesFrame() {
        this.initUI();
    }
    
    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(31));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }
    
    
    /** 
     * @param Runnable(
     * main
     */
    public static void main(final String[] args) { /** ddd */
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }
}
