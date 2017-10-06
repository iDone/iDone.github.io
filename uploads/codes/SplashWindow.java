/*
 * Decompiled with CFR 0_121.
 */
package com.xk72.charles.gui;

import com.xk72.charles.WNzU;
import com.xk72.charles.gui.SplashWindow$2;
import com.xk72.charles.gui.SplashWindow$SplashComponent;
import com.xk72.charles.gui.VmMD;
import com.xk72.charles.gui.sniY;
import com.xk72.util.wsvr;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JRootPane;
import javax.swing.JWindow;
import javax.swing.KeyStroke;

public class SplashWindow
extends JWindow {
    private Image bg;
    private int bgWidth;
    private int bgHeight;
    private String status;
    private int delay;
    protected final MediaTracker tracker;

    public SplashWindow() {
        this.tracker = new MediaTracker(this);
        this.OjEP();
    }

    public SplashWindow(Frame frame) {
        super(frame);
        this.tracker = new MediaTracker(this);
        this.OjEP();
    }

    public SplashWindow(Window window) {
        super(window);
        this.tracker = new MediaTracker(this);
        this.OjEP();
    }

    public static void main(String[] object) {
        object = new SplashWindow();
        object.showRegistrationStatus();
        object.setCloseable();
    }

    private void OjEP() {
        this.bg = Toolkit.getDefaultToolkit().getImage(SplashWindow.class.getResource("/splash.png"));
        this.loadImage(this.bg);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add((Component)new SplashWindow$SplashComponent(this), "Center");
        this.resize();
    }

    public void setCloseable() {
        this.getContentPane().addMouseListener(new VmMD(this));
        this.getRootPane().getInputMap(2).put(KeyStroke.getKeyStroke("ESCAPE"), "escape");
        this.getRootPane().getActionMap().put("escape", new SplashWindow$2(this));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void loadImage(Image image) {
        MediaTracker mediaTracker = this.tracker;
        synchronized (mediaTracker) {
            this.tracker.addImage(image, 0);
            try {
                this.tracker.waitForID(0, 0);
            }
            catch (InterruptedException interruptedException) {}
            this.tracker.statusID(0, false);
            this.tracker.removeImage(image, 0);
            this.bgWidth = image.getWidth(null);
            this.bgHeight = image.getHeight(null);
            return;
        }
    }

    protected void resize() {
        int n = this.bgWidth;
        int n2 = this.bgHeight;
        this.setSize(n, n2);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dimension.width / 2 - n / 2, dimension.height / 2 - n2 / 2);
    }

    public void showStatus(String string) {
        this.status = string;
        this.repaint();
    }

    public void showSharewareStatus() {
        this.showStatus("This is a 30 day trial version. If you continue using Charles you must\npurchase a license. Please see the Help menu for details.");
    }

    public void close() {
        this.setVisible(false);
        this.dispose();
    }

    public static void OjEP(Window window, Runnable runnable) {
        window = new SplashWindow(window);
        window.showSharewareStatus();
        window.setDelay(5);
        window.setVisible(true);
        wsvr.OjEP(new sniY((SplashWindow)window, runnable));
    }

    public void executeDelay() {
        this.repaint();
        while (this.getDelay() > 0) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException interruptedException) {}
            this.setDelay(this.getDelay() - 1);
            this.repaint();
        }
    }

    public void showRegistrationStatus() {
        if (WNzU.OjEP()) {
            this.showStatus("Registered to: " + WNzU.DZZn());
            return;
        }
        this.showSharewareStatus();
    }

    public int getDelay() {
        return this.delay;
    }

    public void setDelay(int n) {
        this.delay = n;
    }

    static /* synthetic */ Image OjEP(SplashWindow splashWindow) {
        return splashWindow.bg;
    }

    static /* synthetic */ int wfpb(SplashWindow splashWindow) {
        return splashWindow.bgWidth;
    }

    static /* synthetic */ int DZZn(SplashWindow splashWindow) {
        return splashWindow.bgHeight;
    }

    static /* synthetic */ String TVrM(SplashWindow splashWindow) {
        return splashWindow.status;
    }

    static /* synthetic */ int LSiK(SplashWindow splashWindow) {
        return splashWindow.delay;
    }
}

