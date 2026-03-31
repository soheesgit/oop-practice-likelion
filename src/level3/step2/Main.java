package level3.step2;

public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[4];
        members[0] = new BabyLion("김사자");
        members[1] = new Staff("운영진");
        members[2] = new Leader("박리더");
        members[3] = new BabyLion("이사자");

        ClubManager clubManager = new ClubManager();
        clubManager.startActivities(members);
        clubManager.submitAssignments(members);
    }
}
