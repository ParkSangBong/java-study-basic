package exception;

public class IDFormatTest {

    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if (userID == null){
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        }
        else if (userID.length() < 8 || userID.length() >20){
            throw new IDFormatException("아이디는 8자에서 20자 사이어야합니다.");
        }
        this.userID = userID;
    }

    public static void main(String[] args) {

        IDFormatTest idTest = new IDFormatTest();

        String myID = null;

        try {
            idTest.setUserID(myID);
        } catch (IDFormatException e) {
            System.out.println(e);
        }

        myID = "123456";

        try {
            idTest.setUserID(myID);
        } catch (IDFormatException e) {
            System.out.println(e);
        }

    }

}
