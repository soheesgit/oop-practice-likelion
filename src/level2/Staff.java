package level2;

import level1.Member;

public class Staff extends Member {

    public Staff(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "운영진";
    }

    @Override
    public void doTask() {
        System.out.println(getName() + "님은 세션 자료를 준비하고 발표를 진행합니다.");
    }

    public void doNotice() {
        System.out.println(getName() + "님은 아기사자들에게 카카오톡 공지를 합니다.");
    }

    public void doMeeting() {
        System.out.println(getName() + "님은 멋사 운영을 위한 회의를 진행합니다.");
    }
    // 운영진 회의하기
}