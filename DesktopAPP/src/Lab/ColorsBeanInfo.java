package Lab;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ColorsBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor colorName = new PropertyDescriptor("colorName", Colors.class);
            PropertyDescriptor colorCode = new PropertyDescriptor("colorCode", Colors.class);
            return new PropertyDescriptor[] { colorName, colorCode };
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
