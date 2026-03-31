package level3.step1;

public class IfElseClubManager {

    public void startActivities(Member[] members) {
        for (Member member : members) {
            System.out.print(member.getName() + " / 역할: " + member.getRole() + " ");

            if (member instanceof BabyLion) {
                System.out.println(member.getName() + "님은 세션을 듣고 학습합니다.");
            } else if (member instanceof Staff) {
                System.out.println(member.getName() + "님은 세션 자료를 준비하고 발표를 진행합니다.");
            } else if (member instanceof Leader) {
                System.out.println(member.getName() + "님은 운영 현황을 파악하고 방향을 조율합니다.");
            }

            System.out.println("-------------------");
        }
    }

    public void submitAssignments(Member[] members) {
        for (Member member : members) {
            if (member instanceof BabyLion) {
                member.submitAssignment();
            }
        }
    }
}
