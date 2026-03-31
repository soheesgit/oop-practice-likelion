package level3.step1;

public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[3];
        members[0] = new BabyLion("김사자");
        members[1] = new Staff("운영진");
        members[2] = new Leader("박리더");

        IfElseClubManager ifElseClubManager = new IfElseClubManager();
        ifElseClubManager.startActivities(members);
        ifElseClubManager.submitAssignments(members);
    }
}
