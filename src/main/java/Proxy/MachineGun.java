package Proxy;

public class MachineGun implements Gun{
    private final Gun gun;

    public MachineGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void shoot() {
        int AMMO = 10; // For example let it be 10
        for (int i = 0; i < AMMO; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gun.shoot();
        }
    }
}
