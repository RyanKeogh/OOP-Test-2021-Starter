

public class Note {
    private char notes;
    private int duration;


   

    public Note(char notes, int duration)
    {
        this.notes=notes;
        this.duration=duration;
    }
    

    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }



    public char getNotes() {
        return notes;
    }


    public void setNotes(char notes) {
        this.notes = notes;
    }


    public int getDuration() {
        return duration;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }

    
    
}
