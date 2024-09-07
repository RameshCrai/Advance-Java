package Lab;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Colors {
    private String colorName;
    private int colorCode;
    private PropertyChangeSupport support;

    public Colors() {
        support = new PropertyChangeSupport(this);
    }

    // Getter for colorName
    public String getColorName() {
        return colorName;
    }

    // Setter for colorName
    public void setColorName(String colorName) {
        String oldColorName = this.colorName;
        this.colorName = colorName;
        support.firePropertyChange("colorName", oldColorName, colorName);
    }

    // Getter for colorCode
    public int getColorCode() {
        return colorCode;
    }

    // Setter for colorCode
    public void setColorCode(int colorCode) {
        int oldColorCode = this.colorCode;
        this.colorCode = colorCode;
        support.firePropertyChange("colorCode", oldColorCode, colorCode);
    }

    // Add a property change listener
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    // Remove a property change listener
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}

