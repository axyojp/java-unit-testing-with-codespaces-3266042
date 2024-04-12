public class HairSalon {

    private String[] openingDays = { "Monday", "Tuesday" };

    // This method should return the openingDays array.
    public String[] getOpeningDays() {
        return openingDays;
    }

    // This method should return true if the weekday passed in is present in the
    // openingDays array.
    // If not it should return false. If the String passed in does not end in the
    // letters "day",
    // it should throw an IllegalArgumentException with a message explaining that
    // only weekdays are valid.
    public boolean isOpen(String weekDay) {
        boolean isFound = false;

        if (!weekDay.endsWith("day")) {
            throw new IllegalArgumentException("only weekdays are valid");
        }

        for (String str : this.openingDays) {
            if (str.equals(weekDay)) {
                isFound = true;
                break;
            }
        }

        return isFound;
    }

}
