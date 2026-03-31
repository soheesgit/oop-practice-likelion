package level3.step2;

public class BabyLion extends Member {

    public BabyLion(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "아기사자";
    }


    @Override
    public void doTask() {
        System.out.println(getName() + "님은 세션을 듣고 학습합니다.");
    }

    public void doHomework() {
        System.out.println(getName() + "님은 과제를 열심히 풉니다.");
    }

    public void doSession() {
        System.out.println(getName() + "님은 세션을 발표합니다.");
    }
}