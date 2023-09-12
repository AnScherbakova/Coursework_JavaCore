import exception.DescriptionIsNotSpecifiedException;
import exception.RepeatabilityIsNotSelectedException;
import exception.TitleIsNotSpecifiedException;

import java.time.LocalDate;

public class Yearly extends Task {
    public Yearly(String title, String description, String typeOfTask, LocalDate dateTask, Repeatability signRepeatability) throws RepeatabilityIsNotSelectedException, TitleIsNotSpecifiedException, DescriptionIsNotSpecifiedException {
        super(title, description, typeOfTask, dateTask, signRepeatability);
    }

    @Override
    public boolean getNextDate(LocalDate finishDate) {
        LocalDate startDate = getDateTask();
        while (startDate.isBefore(finishDate)) {
            if (startDate.equals(finishDate)) {
                return true;
            }
            startDate = startDate.plusYears(1);
        }
        return false;
    }
}

