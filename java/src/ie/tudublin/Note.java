

public class Note {
    private char note;
    private int duration;


    public Note()
    {

    }

    

    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }



    public char getNote() {
        return note;
    }


    public void setNote(char note) {
        this.note = note;
    }


    public int getDuration() {
        return duration;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }

    
    
}
