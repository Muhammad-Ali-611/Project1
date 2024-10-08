package OnlineCourior;

public class Courier {
        private double price;
        private String status;
        private String packageDetails;
        private String deliveryAddress;
        private String pickupAddress;
        private int senderId;
        private int courierId;
        public int getCourierId() {
                return courierId;
        }

        public void setCourierId(int courierId) {
                this.courierId = courierId;
        }


        public int getSenderId() {
                return senderId;
        }

        public void setSenderId(int senderId) {
                this.senderId = senderId;
        }

        public String getPickupAddress() {
                return pickupAddress;
        }

        public void setPickupAddress(String pickupAddress) {
                this.pickupAddress = pickupAddress;
        }

        public String getDeliveryAddress() {
                return deliveryAddress;
        }

        public void setDeliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
        }

        public String getPackageDetails() {
                return packageDetails;
        }

        public void setPackageDetails(String packageDetails) {
                this.packageDetails = packageDetails;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }


        // Getters and Setters
    }


