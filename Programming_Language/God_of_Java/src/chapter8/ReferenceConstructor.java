package chapter8;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmin");
        MemberDTO dto3 = new MemberDTO("Sangmin", "01039482019");
        MemberDTO dto4 = new MemberDTO("Sangmin", "01039482019", "god@godofjava.com");
    }
}
