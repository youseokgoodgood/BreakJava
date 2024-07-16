package oop1;

public class MusicPlayer {

    /*
    * 해당 클래스를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다.
    * 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 제공하는 것을 캡슐화임
    * 
    * */
    
    int volume = 0;
    boolean isOn = false;

     void on() {
        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

     void off() {
        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료 합니다.");
    }

     void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

     void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

     void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
