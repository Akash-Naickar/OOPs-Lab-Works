interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    String brand;

    public SmartPhone(String brand) {
        this.brand = brand;
    }

    public void takePhoto() {
        System.out.println(brand + " is taking a photo.");
    }

    public void playMusic() {
        System.out.println(brand + " is playing music.");
    }

    void makeCall(String contact) {
        System.out.println("Calling " + contact + "...");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Samsung");

        myPhone.takePhoto();
        myPhone.playMusic();
        myPhone.makeCall("A");
    }
}
