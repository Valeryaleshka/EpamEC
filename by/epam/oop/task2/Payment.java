package by.epam.oop.task2;

import java.util.Arrays;

public class Payment {

    private ObjectClass [] objects = new ObjectClass[0];

    public Payment() {
    }

    public void addToCart(ObjectClass object){

            objects = Arrays.copyOf(objects,objects.length+1);
            objects[objects.length-1]=object;

    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (ObjectClass objectNew : objects
        ) {
            totalPrice+=objectNew.getPrice();

        }
        return  totalPrice;
    }

    public ObjectClass[] getObjects() {
        return objects;
    }

    public ObjectClass getObject(int i){
        return objects[i];
    }





    public static class ObjectClass {

        private String objectName;
        private double price;

        public ObjectClass(String objectName, double price) {
            this.objectName = objectName;
            this.price = price;
        }

        public String getObjectName() {
            return objectName;
        }

        public void setObjectName(String objectName) {
            this.objectName = objectName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
