public class pupils extends head {
    protected int Grade = 8;
    protected String GradeStr = "";

    public void setGrade(int grade) {
        switch (grade) {
            case 8:
                GradeStr = "восьмиклассник";
                break;
            case 9:
                GradeStr = "девятиклассник";
                break;
            case 10:
                GradeStr = "десятиклассник";
                break;
            case 11:
                GradeStr = "одиннадацитиклассник";
                break;
        }
    }

    public String getGradeStr() {
        return GradeStr;
    }

    @Override
    void meow(){
        System.out.println("Я " + GradeStr + ". Мне "+ age+ ". Пойдем курить!");
    }
}
