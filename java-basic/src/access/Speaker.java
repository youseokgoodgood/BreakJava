package access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가 할 수 없습니다. 최대 음량 입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가 합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량:"+ volume);
    }
}
