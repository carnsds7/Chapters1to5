package geoquiz.dcprojects.com.geoquiz;

public class Question {

    private int mTextresId;
    private boolean mAnswerTrue;

    public Question(int mTextresId, boolean mAnswerTrue) {
        this.mTextresId = mTextresId;
        this.mAnswerTrue = mAnswerTrue;
    }

    public int getTextresId() {
        return mTextresId;
    }

    public void setTextresId(int mTextresId) {
        this.mTextresId = mTextresId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }
}
