public class Computer {
    
    private String CPU;
    private String RAM;
    private String storage;

   
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

   
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage 
                + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled 
                + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }

    
    public static class Builder {
        
        private String CPU;
        private String RAM;
        private String storage;

        
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

       
        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        
        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

      
        public Computer build() {
            return new Computer(this);
        }
    }
}
