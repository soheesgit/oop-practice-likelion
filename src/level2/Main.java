package level2;

public class Main {
    public static void main(String[] args) {
        BabyLion babyLion = new BabyLion("철수");
        Staff staff = new Staff("영희");
        Leader leader = new Leader("민석");

        System.out.println(babyLion.getName() + " / 역할: " + babyLion.getRole());
        babyLion.doTask();
        babyLion.doHomework();
        babyLion.doSession();
        System.out.println();

        System.out.println(staff.getName() + " / 역할: " + staff.getRole());
        staff.doTask();
        staff.doNotice();
        staff.doMeeting();
        System.out.println();

        System.out.println(leader.getName() + " / 역할: " + leader.getRole());
        leader.doTask();
        leader.doTalking();
        leader.doLead();
    }
}