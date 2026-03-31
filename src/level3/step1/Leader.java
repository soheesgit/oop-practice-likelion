package level3.step1;

public class Leader extends Member {

    public Leader(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "대표";
    }

    @Override
    public void doTask() {
        System.out.println(getName() + "님은 운영 현황을 파악하고 방향을 조율합니다.");
    }

    public void doTalking() {
        System.out.println(getName() + "님은 외부와 소통합니다.");
    }

    public void doLead() {
        System.out.println(getName() + "님은 운영진 회의를 이끌어갑니다.");
    }
}