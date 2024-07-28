public class BuilderPatternTest {
    public static void main(String[] args) {
     
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD").build();
        System.out.println(basicComputer);

       
        Computer highEndComputer = new Computer.Builder("Intel i7", "16GB", "512GB SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        System.out.println(highEndComputer);

  
        Computer bluetoothComputer = new Computer.Builder("Intel i3", "4GB", "128GB SSD")
                .setBluetoothEnabled(true)
                .build();
        System.out.println(bluetoothComputer);
    }
}

// Output
// Computer [CPU=Intel i5, RAM=8GB, storage=256GB SSD, isGraphicsCardEnabled=false, isBluetoothEnabled=false]
// Computer [CPU=Intel i7, RAM=16GB, storage=512GB SSD, isGraphicsCardEnabled=true, isBluetoothEnabled=true]
// Computer [CPU=Intel i3, RAM=4GB, storage=128GB SSD, isGraphicsCardEnabled=false, isBluetoothEnabled=true]