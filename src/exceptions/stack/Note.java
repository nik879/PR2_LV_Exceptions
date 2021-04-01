package exceptions.stack;

import java.time.LocalDate;

public class Note {
    private LocalDate date;
    private String title;
    private String description;

    public Note(LocalDate date, String title, String description) {
        this.date = date;
        this.title = title;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Note{" +
                "date=" + date +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
