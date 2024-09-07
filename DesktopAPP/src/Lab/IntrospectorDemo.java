package Lab;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class IntrospectorDemo {
    public static void main(String[] args) {
        try {
            // Obtain bean info for Colors class
            BeanInfo beanInfo = Introspector.getBeanInfo(Colors.class);

            // Get property descriptors
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            System.out.println("Properties of Colors Bean:");
            for (PropertyDescriptor pd : propertyDescriptors) {
                System.out.println("Property Name: " + pd.getName());
                System.out.println("Property Type: " + pd.getPropertyType());
                System.out.println("Readable: " + pd.getReadMethod());
                System.out.println("Writable: " + pd.getWriteMethod());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
