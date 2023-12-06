package GroupProject;

public class QuestionAnswer {
    private String qText;
    private String imgPath;
    private String rAnswer;
    private String wAnswer1;
    private String wAnswer2;
    private String wAnswer3;

    public QuestionAnswer(String qText, String imgPath, String rAnswer, String wAnswer1, String wAnswer2,
                          String wAnswer3) {
        setqText(qText);
        setImgPath(imgPath);
        setrAnswer(rAnswer);
        setwAnswer1(wAnswer1);
        setwAnswer2(wAnswer2);
        setwAnswer3(wAnswer3);
    }

    public String getqText() {
        return qText;
    }
    public void setqText(String qText) {
        this.qText = qText;
    }

    public String getImgPath() {
        return imgPath;
    }
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getrAnswer() {
        return rAnswer;
    }
    public void setrAnswer(String rAnswer) {
        this.rAnswer = rAnswer;
    }

    public String getwAnswer1() {
        return wAnswer1;
    }
    public void setwAnswer1(String wAnswer1) {
        this.wAnswer1 = wAnswer1;
    }

    public String getwAnswer2() {
        return wAnswer2;
    }
    public void setwAnswer2(String wAnswer2) {
        this.wAnswer2 = wAnswer2;
    }

    public String getwAnswer3() {
        return wAnswer3;
    }
    public void setwAnswer3(String wAnswer3) {
        this.wAnswer3 = wAnswer3;
    }
}