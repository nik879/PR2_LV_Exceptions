package exceptions.stack;

import java.util.Arrays;

public class Stack {
    private int maxsize;
    private int index=-1;
    Note[] notes ;

    @Override
    public String toString() {
        return "Stack{" +
                "maxsize=" + maxsize +
                ", index=" + index +
                ", notes=" + Arrays.toString(notes) +
                '}';
    }

    public Note[] getNotes() {
        return notes;
    }

    public Stack(int maxsize) {
        this.maxsize = maxsize;
        this.notes = new Note[maxsize];
    }

    public void push(Note note) throws StackfullException{
        if (index == notes.length - 1) {
            throw new StackfullException("The max. capacity of the stack is " + notes.length);
        }

        notes[++index] = note;

    }
    public void pop() throws StackEmptyException {
        if(index == -1) {
            throw new StackEmptyException("There are no more Notes to pop from the stack");
        }

        notes[index--] = null;

    }
}
