package collection.treeset;


import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private final TreeSet<Member> TreeSet;

    public MemberTreeSet(){
        TreeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member){
        TreeSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = TreeSet.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                TreeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + " 번호가 존재하지 않습니다. ");
        return false;

    }

    public void showAllMember(){

        for (Member member :
                TreeSet) {
            System.out.println(member);
        }
        System.out.println();
    }

}
