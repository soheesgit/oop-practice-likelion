package level3.step2;

public abstract class Member {

    private final String name;
    private boolean assignmentSubmitted;

    public Member(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name이 입력되지 않았습니다.");
        }
        this.name = name;
        this.assignmentSubmitted = false;
    }

    public String getName() {
        return name;
    }

    public boolean isAssignmentSubmitted() {
        return assignmentSubmitted;
    }

    public void submitAssignment() {
        if (isAssignmentSubmitted()) {
            System.out.println(getName() + "님은 이미 과제를 제출했습니다.");
        } else {
            this.assignmentSubmitted = true;
            System.out.println(getName() + "님이 과제를 제출했습니다.");
        }
    }

    public abstract String getRole();
    public abstract void doTask();

}