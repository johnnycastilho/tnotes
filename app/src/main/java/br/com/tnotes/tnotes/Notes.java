package br.com.tnotes.tnotes;


public class Notes {

    private String title;
    private String date;
    private String content;
    private int label;


    public Notes(String title,String date,int label) {
        this.title = title;
        this.date = date;
        this.label = label;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public int getLabelColor() {
        return label;
    }

}
