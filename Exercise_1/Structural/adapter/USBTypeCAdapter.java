package Exercise_1.Structural.adapter;

// The adapter implements the PowerSocket interface and uses MicroUSBCharger to charge the device
public class USBTypeCAdapter implements PowerSocket {
    private MicroUSBCharger microUSBCharger;

    public USBTypeCAdapter(MicroUSBCharger microUSBCharger) {
        this.microUSBCharger = microUSBCharger;
    }

    @Override
    public void charge() {
        // Adapt the incompatible interface by using MicroUSBCharger inside the adapter
        microUSBCharger.chargeWithMicroUSB();
        System.out.println("Adapter converts it to USB Type-C.");
    }
}